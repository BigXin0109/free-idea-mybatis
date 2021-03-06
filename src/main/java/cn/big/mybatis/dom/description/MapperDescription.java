package cn.big.mybatis.dom.description;

import cn.big.mybatis.util.DomUtils;
import com.intellij.openapi.module.Module;
import com.intellij.psi.xml.XmlFile;
import com.intellij.util.xml.DomFileDescription;
import cn.big.mybatis.dom.model.Mapper;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @author yanglin
 */
public class MapperDescription extends DomFileDescription<Mapper> {

	public MapperDescription() {
		super(Mapper.class, "mapper");
	}

	@Override
	public boolean isMyFile(@NotNull XmlFile file, @Nullable Module module) {
		return DomUtils.isMybatisFile(file);
	}

}
