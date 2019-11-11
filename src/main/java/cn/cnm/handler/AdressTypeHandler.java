package cn.cnm.handler;

import cn.cnm.pojo.Adress;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author lele
 * @version 1.0
 * @Description
 * @Email 414955507@qq.com
 * @date 2019/11/11 22:24
 */
public class AdressTypeHandler extends BaseTypeHandler<Adress> {
    // 将传入的parameter对象转换为字符串, 存入PreparedStatement的索引i位置
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, Adress parameter, JdbcType jdbcType) throws SQLException {
        // 验证传入对象是否为空
        if (parameter == null) {
            return;
        }
        // 从对象中获取具体数据, 假定规则是以逗号隔开（必须保证拼接和还原规则一致， 不然乱套了）
        StringBuilder builder = new StringBuilder();
        builder.append(parameter.getAdress_name()).append(",");
        builder.append(parameter.getAdress_code());
        // 将参数设置到PreparedStatement中
        ps.setString(i, builder.toString());
    }

    // 使用列名从数据库获取到的字符串还原为原始的对象
    @Override
    public Adress getNullableResult(ResultSet rs, String columnName) throws SQLException {
        // 根据字段名从rs对象中获取字段值, 就是JDBC的ResultSet
        String columnValue = rs.getString(columnName);
        // 先验证值是否有效（是否为空还有是否包含逗号， 不包含就不符合规则）
        if (columnValue == null || columnValue.trim().length() == 0 || !columnValue.contains(",")) {
            return null;
        }
        // 处理字符串
        String[] split = columnValue.trim().split(",");
        String Adress_name = split[0];
        Integer Adress_code = Integer.parseInt(split[1]);

        // 组装一个Address对象
        Adress adress = new Adress(Adress_name, Adress_code);
        return adress;
    }

    // 使用索引从数据库获取到的字符串还原为原始的对象
    @Override
    public Adress getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        // 根据索引从rs对象中获取字段值, 就是JDBC的ResultSet
        String columnValue = rs.getString(columnIndex);
        // 先验证值是否有效（是否为空还有是否包含逗号， 不包含就不符合规则）
        if (columnValue == null || columnValue.trim().length() == 0 || !columnValue.contains(",")) {
            return null;
        }
        // 处理字符串
        String[] split = columnValue.trim().split(",");
        String Adress_name = split[0];
        Integer Adress_code = Integer.parseInt(split[1]);

        // 组装一个Address对象
        Adress adress = new Adress(Adress_name, Adress_code);
        return adress;
    }

    // 使用存储过程取到的字符串还原为原始的对象
    @Override
    public Adress getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        // 根据字段名从rs对象中获取字段值, 就是JDBC的ResultSet
        String columnValue = cs.getString(columnIndex);
        // 先验证值是否有效（是否为空还有是否包含逗号， 不包含就不符合规则）
        if (columnValue == null || columnValue.trim().length() == 0 || !columnValue.contains(",")) {
            return null;
        }
        // 处理字符串
        String[] split = columnValue.trim().split(",");
        String Adress_name = split[0];
        Integer Adress_code = Integer.parseInt(split[1]);

        // 组装一个Address对象
        Adress adress = new Adress(Adress_name, Adress_code);
        return adress;
    }
}
