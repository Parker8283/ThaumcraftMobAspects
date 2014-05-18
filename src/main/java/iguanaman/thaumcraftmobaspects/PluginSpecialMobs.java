package iguanaman.thaumcraftmobaspects;

import java.util.HashSet;

import cpw.mods.fml.common.Loader;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

public class PluginSpecialMobs implements AspectPlugin {

	@Override
	public String[] getRequiredMods()
	{
		return new String[]
		{ "SpecialMobs" };
	}

	@Override
	public HashSet<ThaumcraftEntity> getThaumcraftMobs()
	{
		HashSet<ThaumcraftEntity> mobs = new HashSet<ThaumcraftEntity>();
		AspectList creeperAspects = new AspectList().add(Aspect.PLANT, 2).add(Aspect.FIRE, 2);
		mobs.add(new ThaumcraftEntity("SpecialMobs.ArmorCreeper", creeperAspects.add(Aspect.ARMOR, 1)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.DeathCreeper", creeperAspects.add(Aspect.DEATH, 1)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.DirtCreeper", creeperAspects.add(Aspect.EARTH, 1)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.DoomCreeper", creeperAspects.add(Aspect.ENERGY, 1)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.EnderCreeper", creeperAspects.add(Aspect.ELDRITCH, 1)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.FireCreeper", creeperAspects.add(Aspect.FIRE, 1)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.JumpingCreeper", creeperAspects.add(Aspect.AIR, 1)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.LightningCreeper", creeperAspects.add(Aspect.WEATHER, 1)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.SpecialCreeper", creeperAspects));

		// ENDERMEN
		AspectList endermanAspects = new AspectList().add(Aspect.ELDRITCH, 4).add(Aspect.AIR, 2).add(Aspect.TRAVEL, 2);
		mobs.add(new ThaumcraftEntity("SpecialMobs.AncientEnderman", endermanAspects.add(Aspect.ELDRITCH, 1)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.BlindingEnderman", endermanAspects.add(Aspect.DARKNESS, 1)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.ConfusingEnderman", endermanAspects.add(Aspect.SENSES, 1)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.CursedEnderman", endermanAspects.add(Aspect.SOUL, 1)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.IcyEnderman", endermanAspects.add(Aspect.ICE, 1)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.LightningEnderman", endermanAspects.add(Aspect.WEATHER, 1)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.MirageEnderman", endermanAspects.add(Aspect.VOID, 1)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.SpecialEnderman", endermanAspects));
		mobs.add(new ThaumcraftEntity("SpecialMobs.StrikeEnderman", endermanAspects.add(Aspect.ARMOR, 1)));

		// GHASTS
		AspectList ghastAspects = new AspectList().add(Aspect.UNDEAD, 2).add(Aspect.FIRE, 2);
		mobs.add(new ThaumcraftEntity("SpecialMobs.BabyGhast", new AspectList().add(Aspect.UNDEAD, 1).add(Aspect.FIRE,
				1)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.FighterGhast", ghastAspects));
		mobs.add(new ThaumcraftEntity("SpecialMobs.GhastMount", ghastAspects));
		mobs.add(new ThaumcraftEntity("SpecialMobs.KingGhast", ghastAspects.add(Aspect.UNDEAD, 1).add(Aspect.FIRE, 1)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.QueenGhast", ghastAspects.add(Aspect.UNDEAD, 2).add(Aspect.FIRE, 2)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.SpecialGhast", ghastAspects));

		// SKELETONS
		AspectList skeletonAspects = new AspectList().add(Aspect.UNDEAD, 3).add(Aspect.MAN, 1).add(Aspect.EARTH, 1);
		mobs.add(new ThaumcraftEntity("SpecialMobs.FireSkeleton", skeletonAspects.add(Aspect.FIRE, 1)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.GatlingSkeleton", skeletonAspects.add(Aspect.MECHANISM, 1)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.GiantSkeleton", new AspectList().add(Aspect.UNDEAD, 6)
				.add(Aspect.MAN, 2).add(Aspect.EARTH, 2)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.PoisonSkeleton", skeletonAspects.add(Aspect.POISON, 1)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.QuickSkeleton", skeletonAspects.add(Aspect.MOTION, 1)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.SpecialSkeleton", skeletonAspects));
		mobs.add(new ThaumcraftEntity("SpecialMobs.SpitfireSkeleton", skeletonAspects));
		mobs.add(new ThaumcraftEntity("SpecialMobs.ThiefSkeleton", skeletonAspects.add(Aspect.GREED, 1)));

		// SPIDERS
		AspectList spiderAspects = new AspectList().add(Aspect.BEAST, 3).add(Aspect.ENTROPY, 2);
		mobs.add(new ThaumcraftEntity("SpecialMobs.AngrySpider", spiderAspects.add(Aspect.ENTROPY, 1)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.ArmorSpider", spiderAspects.add(Aspect.ARMOR, 1)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.BabySpider", new AspectList().add(Aspect.BEAST, 1).add(
				Aspect.ENTROPY, 1)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.DesertSpider", spiderAspects.add(Aspect.EARTH, 1)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.FlyingSpider", spiderAspects.add(Aspect.FLIGHT, 1)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.GiantSpider", new AspectList().add(Aspect.BEAST, 4).add(
				Aspect.ENTROPY, 3)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.MotherSpider", spiderAspects.add(Aspect.HEAL, 1)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.PaleSpider", spiderAspects.add(Aspect.POISON, 1)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.PoisonSpider", spiderAspects.add(Aspect.POISON, 1)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.SmallSpider", new AspectList().add(Aspect.BEAST, 2).add(
				Aspect.ENTROPY, 1)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.SpecialSpider", spiderAspects));
		mobs.add(new ThaumcraftEntity("SpecialMobs.SpeedySpider", spiderAspects.add(Aspect.MOTION, 1)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.ToughSpider", spiderAspects.add(Aspect.LIFE, 1)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.WitchSpider", spiderAspects.add(Aspect.MAGIC, 1)));

		// ZOMBIES
		AspectList zombieAspects = new AspectList().add(Aspect.UNDEAD, 2).add(Aspect.MAN, 1).add(Aspect.EARTH, 1);
		mobs.add(new ThaumcraftEntity("SpecialMobs.FireZombie", zombieAspects.add(Aspect.FIRE, 1)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.FishingZombie", zombieAspects.add(Aspect.TOOL, 1)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.GiantZombie", new AspectList().add(Aspect.UNDEAD, 4)
				.add(Aspect.MAN, 2).add(Aspect.EARTH, 2)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.HungryZombie", zombieAspects.add(Aspect.HUNGER, 1)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.PlagueZombie", zombieAspects.add(Aspect.POISON, 1)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.SpecialZombie", zombieAspects));
		mobs.add(new ThaumcraftEntity("SpecialMobs.SteveZombie", zombieAspects.add(Aspect.MAN, 1)));

		// ZOMBIE PIGMEN
		AspectList zombiePigmanAspects = new AspectList().add(Aspect.UNDEAD, 4).add(Aspect.FIRE, 2);
		mobs.add(new ThaumcraftEntity("SpecialMobs.AngryZombiePigman", zombiePigmanAspects.add(Aspect.ENTROPY, 1)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.ChargingZombiePigman", zombiePigmanAspects.add(Aspect.ENERGY, 1)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.FishingZombiePigman", zombiePigmanAspects.add(Aspect.TOOL, 1)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.GiantZombiePigman", new AspectList().add(Aspect.UNDEAD, 6).add(
				Aspect.FIRE, 3)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.HungryZombiePigman", zombiePigmanAspects.add(Aspect.HUNGER, 1)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.JumpingZombiePigman", zombiePigmanAspects.add(Aspect.AIR, 1)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.PlagueZombiePigman", zombiePigmanAspects.add(Aspect.POISON, 1)));
		mobs.add(new ThaumcraftEntity("SpecialMobs.SpecialZombiePigman", zombiePigmanAspects));
		return mobs;
	}

	public static AspectList creatureAspects(int size, Aspect... aspects)
	{
		return ThaumcraftMobAspects.creatureAspects(size, aspects);
	}

}
