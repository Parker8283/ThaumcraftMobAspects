package iguanaman.thaumcraftmobaspects;

import java.util.HashSet;
import java.util.List;

public interface AspectPlugin {

	public String[] getRequiredMods();

	public HashSet<ThaumcraftEntity> getThaumcraftMobs();
}
