/*
 *  Copyright 2012 Brian R Lee
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package fakedatamaker.contact.address.type;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum USStreetType {
	ALLEY {
		@Override
		public String value() {
			return "Alley";
		}

		@Override
		public String abbrValue() {
			return "Aly";
		}
	},
	ANNEX {
		@Override
		public String value() {
			return "Annex";
		}

		@Override
		public String abbrValue() {
			return "Anx";
		}
	},
	ARCADE {
		@Override
		public String value() {
			return "Arcade";
		}

		@Override
		public String abbrValue() {
			return "Arc";
		}
	},
	AVENUE {
		@Override
		public String value() {
			return "Avenue";
		}

		@Override
		public String abbrValue() {
			return "Ave";
		}
	},
	BAYOU {
		@Override
		public String value() {
			return "Bayou";
		}

		@Override
		public String abbrValue() {
			return "Byu";
		}
	},
	BEACH {
		@Override
		public String value() {
			return "Beach";
		}

		@Override
		public String abbrValue() {
			return "Bch";
		}
	},
	BOULEVARD {
		@Override
		public String value() {
			return "Boulevard";
		}

		@Override
		public String abbrValue() {
			return "Blvd";
		}
	},
	BRANCH {
		@Override
		public String value() {
			return "Branch";
		}

		@Override
		public String abbrValue() {
			return "Br";
		}
	},
	BRIDGE {
		@Override
		public String value() {
			return "Bridge";
		}

		@Override
		public String abbrValue() {
			return "Brg";
		}
	},
	BROOK {
		@Override
		public String value() {
			return "Brook";
		}

		@Override
		public String abbrValue() {
			return "Brk";
		}
	},
	BROOKS {
		@Override
		public String value() {
			return "Brooks";
		}

		@Override
		public String abbrValue() {
			return "Brks";
		}
	},
	BURG {
		@Override
		public String value() {
			return "Burg";
		}

		@Override
		public String abbrValue() {
			return "Bg";
		}
	},
	BURGS {
		@Override
		public String value() {
			return "Burgs";
		}

		@Override
		public String abbrValue() {
			return "Bgs";
		}
	},
	BYPASS {
		@Override
		public String value() {
			return "Bypass";
		}

		@Override
		public String abbrValue() {
			return "Byp";
		}
	},
	CAMP {
		@Override
		public String value() {
			return "Camp";
		}

		@Override
		public String abbrValue() {
			return "Cp";
		}
	},
	CANYON {
		@Override
		public String value() {
			return "Canyon";
		}

		@Override
		public String abbrValue() {
			return "Cyn";
		}
	},
	CAPE {
		@Override
		public String value() {
			return "Cape";
		}

		@Override
		public String abbrValue() {
			return "Cpe";
		}
	},
	CAUSEWAY {
		@Override
		public String value() {
			return "Causeway";
		}

		@Override
		public String abbrValue() {
			return "Cswy";
		}
	},
	CENTER {
		@Override
		public String value() {
			return "Center";
		}

		@Override
		public String abbrValue() {
			return "Ctr";
		}
	},
	CENTERS {
		@Override
		public String value() {
			return "Centers";
		}

		@Override
		public String abbrValue() {
			return "Ctrs";
		}
	},
	CIRCLE {
		@Override
		public String value() {
			return "Circle";
		}

		@Override
		public String abbrValue() {
			return "Cir";
		}
	},
	CIRCLES {
		@Override
		public String value() {
			return "Circles";
		}

		@Override
		public String abbrValue() {
			return "Cirs";
		}
	},
	CLIFF {
		@Override
		public String value() {
			return "Cliff";
		}

		@Override
		public String abbrValue() {
			return "Clf";
		}
	},
	CLIFFS {
		@Override
		public String value() {
			return "Cliffs";
		}

		@Override
		public String abbrValue() {
			return "Clfs";
		}
	},
	CLUB {
		@Override
		public String value() {
			return "Club";
		}

		@Override
		public String abbrValue() {
			return "Clb";
		}
	},
	COMMON {
		@Override
		public String value() {
			return "Common";
		}

		@Override
		public String abbrValue() {
			return "Cmn";
		}
	},
	COMMONS {
		@Override
		public String value() {
			return "Commons";
		}

		@Override
		public String abbrValue() {
			return "Cmns";
		}
	},
	CORNER {
		@Override
		public String value() {
			return "Corner";
		}

		@Override
		public String abbrValue() {
			return "Cor";
		}
	},
	CORNERS {
		@Override
		public String value() {
			return "Corners";
		}

		@Override
		public String abbrValue() {
			return "Cors";
		}
	},
	COURSE {
		@Override
		public String value() {
			return "Course";
		}

		@Override
		public String abbrValue() {
			return "Crse";
		}
	},
	COURT {
		@Override
		public String value() {
			return "Court";
		}

		@Override
		public String abbrValue() {
			return "Ct";
		}
	},
	COURTS {
		@Override
		public String value() {
			return "Courts";
		}

		@Override
		public String abbrValue() {
			return "Cts";
		}
	},
	COVE {
		@Override
		public String value() {
			return "Cove";
		}

		@Override
		public String abbrValue() {
			return "Cv";
		}
	},
	COVES {
		@Override
		public String value() {
			return "Coves";
		}

		@Override
		public String abbrValue() {
			return "Cvs";
		}
	},
	CREEK {
		@Override
		public String value() {
			return "Creek";
		}

		@Override
		public String abbrValue() {
			return "Crk";
		}
	},
	CRESCENT {
		@Override
		public String value() {
			return "Crescent";
		}

		@Override
		public String abbrValue() {
			return "Cres";
		}
	},
	CREST {
		@Override
		public String value() {
			return "Crest";
		}

		@Override
		public String abbrValue() {
			return "Cres";
		}
	},
	CROSSING {
		@Override
		public String value() {
			return "Crossing";
		}

		@Override
		public String abbrValue() {
			return "Xing";
		}
	},
	CROSSROAD {
		@Override
		public String value() {
			return "Crossroad";
		}

		@Override
		public String abbrValue() {
			return "Xrd";
		}
	},
	CROSSROADS {
		@Override
		public String value() {
			return "Crossroads";
		}

		@Override
		public String abbrValue() {
			return "Xrds";
		}
	},
	CURVE {
		@Override
		public String value() {
			return "Curve";
		}

		@Override
		public String abbrValue() {
			return "Curv";
		}
	},
	DALE {
		@Override
		public String value() {
			return "Dale";
		}

		@Override
		public String abbrValue() {
			return "Dl";
		}
	},
	DAM {
		@Override
		public String value() {
			return "Dam";
		}

		@Override
		public String abbrValue() {
			return "Dm";
		}
	},
	DIVIDE {
		@Override
		public String value() {
			return "Divide";
		}

		@Override
		public String abbrValue() {
			return "Dv";
		}
	},
	DRIVE {
		@Override
		public String value() {
			return "Drive";
		}

		@Override
		public String abbrValue() {
			return "Dr";
		}
	},
	DRIVES {
		@Override
		public String value() {
			return "Drives";
		}

		@Override
		public String abbrValue() {
			return "Drs";
		}
	},
	ESTATE {
		@Override
		public String value() {
			return "Estate";
		}

		@Override
		public String abbrValue() {
			return "Est";
		}
	},
	ESTATES {
		@Override
		public String value() {
			return "Estates";
		}

		@Override
		public String abbrValue() {
			return "Ests";
		}
	},
	EXPRESSWAY {
		@Override
		public String value() {
			return "Expressway";
		}

		@Override
		public String abbrValue() {
			return "Expy";
		}
	},
	EXTENSION {
		@Override
		public String value() {
			return "Extension";
		}

		@Override
		public String abbrValue() {
			return "Ext";
		}
	},
	EXTENSIONS {
		@Override
		public String value() {
			return "Extensions";
		}

		@Override
		public String abbrValue() {
			return "Exts";
		}
	},
	FALLS {
		@Override
		public String value() {
			return "Falls";
		}

		@Override
		public String abbrValue() {
			return "Fls";
		}
	},
	FALL {
		@Override
		public String value() {
			return "Fall";
		}

		@Override
		public String abbrValue() {
			return "Fall";
		}
	},
	FERRY {
		@Override
		public String value() {
			return "Ferry";
		}

		@Override
		public String abbrValue() {
			return "Fry";
		}
	},
	FIELD {
		@Override
		public String value() {
			return "Field";
		}

		@Override
		public String abbrValue() {
			return "Fld";
		}
	},
	FIELDS {
		@Override
		public String value() {
			return "Fields";
		}

		@Override
		public String abbrValue() {
			return "Flds";
		}
	},
	FLAT {
		@Override
		public String value() {
			return "Flat";
		}

		@Override
		public String abbrValue() {
			return "Flt";
		}
	},
	FLATS {
		@Override
		public String value() {
			return "Flats";
		}

		@Override
		public String abbrValue() {
			return "Flts";
		}
	},
	FORD {
		@Override
		public String value() {
			return "Ford";
		}

		@Override
		public String abbrValue() {
			return "Frd";
		}
	},
	FORDS {
		@Override
		public String value() {
			return "Fords";
		}

		@Override
		public String abbrValue() {
			return "Frds";
		}
	},
	FOREST {
		@Override
		public String value() {
			return "Forest";
		}

		@Override
		public String abbrValue() {
			return "Frst";
		}
	},
	FORGE {
		@Override
		public String value() {
			return "Forge";
		}

		@Override
		public String abbrValue() {
			return "Frg";
		}
	},
	FORGES {
		@Override
		public String value() {
			return "Forges";
		}

		@Override
		public String abbrValue() {
			return "Frgs";
		}
	},
	FORKS {
		@Override
		public String value() {
			return "Forks";
		}

		@Override
		public String abbrValue() {
			return "Frks";
		}
	},
	FORK {
		@Override
		public String value() {
			return "Fork";
		}

		@Override
		public String abbrValue() {
			return "Frk";
		}
	},
	FORT {
		@Override
		public String value() {
			return "Fort";
		}

		@Override
		public String abbrValue() {
			return "Ft";
		}
	},
	FREEWAY {
		@Override
		public String value() {
			return "Freeway";
		}

		@Override
		public String abbrValue() {
			return "Fwy";
		}
	},
	GARDEN {
		@Override
		public String value() {
			return "Garden";
		}

		@Override
		public String abbrValue() {
			return "Gdn";
		}
	},
	GARDENS {
		@Override
		public String value() {
			return "Gardens";
		}

		@Override
		public String abbrValue() {
			return "Gdns";
		}
	},
	GATEWAY {
		@Override
		public String value() {
			return "Gateway";
		}

		@Override
		public String abbrValue() {
			return "Gtwy";
		}
	},
	GLEN {
		@Override
		public String value() {
			return "Glen";
		}

		@Override
		public String abbrValue() {
			return "Gln";
		}
	},
	GLENS {
		@Override
		public String value() {
			return "Glens";
		}

		@Override
		public String abbrValue() {
			return "Glns";
		}
	},
	GREEN {
		@Override
		public String value() {
			return "Green";
		}

		@Override
		public String abbrValue() {
			return "Grn";
		}
	},
	GREENS {
		@Override
		public String value() {
			return "Greens";
		}

		@Override
		public String abbrValue() {
			return "Grns";
		}
	},
	GROVE {
		@Override
		public String value() {
			return "Grove";
		}

		@Override
		public String abbrValue() {
			return "Grv";
		}
	},
	GROVES {
		@Override
		public String value() {
			return "Groves";
		}

		@Override
		public String abbrValue() {
			return "Grvs";
		}
	},
	HARBOR {
		@Override
		public String value() {
			return "Harbor";
		}
		
		@Override
		public String abbrValue() {
			return "Hbr";
		}
	},
	HARBORS {
		@Override
		public String value() {
			return "Harbors";
		}
		
		@Override
		public String abbrValue() {
			return "Hbrs";
		}
	},
	HAVEN {
		@Override
		public String value() {
			return "Haven";
		}
		
		@Override
		public String abbrValue() {
			return "Hvn";
		}
	},
	HEIGHTS {
		@Override
		public String value() {
			return "Heights";
		}
		
		@Override
		public String abbrValue() {
			return "Hts";
		}
	},
	HIGHWAY {
		@Override
		public String value() {
			return "Highway";
		}
		
		@Override
		public String abbrValue() {
			return "Hwy";
		}
	},
	HILL {
		@Override
		public String value() {
			return "Hill";
		}

		@Override
		public String abbrValue() {
			return "Hl";
		}
	},
	HILLS {
		@Override
		public String value() {
			return "Hills";
		}

		@Override
		public String abbrValue() {
			return "Hls";
		}
	},
	HOLLOW {
		@Override
		public String value() {
			return "Hollow";
		}

		@Override
		public String abbrValue() {
			return "Holw";
		}
	},
	INLET {
		@Override
		public String value() {
			return "Inlet";
		}

		@Override
		public String abbrValue() {
			return "Inlt";
		}
	},
	ISLAND {
		@Override
		public String value() {
			return "Island";
		}

		@Override
		public String abbrValue() {
			return "Is";
		}
	},
	ISLANDS {
		@Override
		public String value() {
			return "Islands";
		}

		@Override
		public String abbrValue() {
			return "Iss";
		}
	},
	ISLE {
		@Override
		public String value() {
			return "Isle";
		}

		@Override
		public String abbrValue() {
			return "Isle";
		}
	},
	JUNCTION {
		@Override
		public String value() {
			return "Junction";
		}

		@Override
		public String abbrValue() {
			return "Jct";
		}
	},
	JUNCTIONS {
		@Override
		public String value() {
			return "Junctions";
		}

		@Override
		public String abbrValue() {
			return "Jcts";
		}
	},
	KEY {
		@Override
		public String value() {
			return "Key";
		}

		@Override
		public String abbrValue() {
			return "Ky";
		}
	},
	KEYS {
		@Override
		public String value() {
			return "Keys";
		}

		@Override
		public String abbrValue() {
			return "Kys";
		}
	},
	KNOLL {
		@Override
		public String value() {
			return "Knoll";
		}

		@Override
		public String abbrValue() {
			return "Knl";
		}
	},
	KNOLLS {
		@Override
		public String value() {
			return "Knolls";
		}

		@Override
		public String abbrValue() {
			return "Knls";
		}
	},
	LAKE {
		@Override
		public String value() {
			return "Lake";
		}

		@Override
		public String abbrValue() {
			return "Lk";
		}
	},
	LAKES {
		@Override
		public String value() {
			return "Lakes";
		}

		@Override
		public String abbrValue() {
			return "Lks";
		}
	},
	LAND {
		@Override
		public String value() {
			return "Land";
		}

		@Override
		public String abbrValue() {
			return "Land";
		}
	},
	LANDING {
		@Override
		public String value() {
			return "Landing";
		}

		@Override
		public String abbrValue() {
			return "Lndg";
		}
	},
	LANE {
		@Override
		public String value() {
			return "Lane";
		}

		@Override
		public String abbrValue() {
			return "Ln";
		}
	},
	LIGHT {
		@Override
		public String value() {
			return "Light";
		}

		@Override
		public String abbrValue() {
			return "Lgt";
		}
	},
	LIGHTS {
		@Override
		public String value() {
			return "Lights";
		}

		@Override
		public String abbrValue() {
			return "Lgts";
		}
	},
	LOAF {
		@Override
		public String value() {
			return "Loaf";
		}

		@Override
		public String abbrValue() {
			return "Lf";
		}
	},
	LOCK {
		@Override
		public String value() {
			return "Lock";
		}

		@Override
		public String abbrValue() {
			return "Lck";
		}
	},
	LOCKS {
		@Override
		public String value() {
			return "Locks";
		}

		@Override
		public String abbrValue() {
			return "Lcks";
		}
	},
	LODGE {
		@Override
		public String value() {
			return "Lodge";
		}

		@Override
		public String abbrValue() {
			return "Ldg";
		}
	},
	LOOP {
		@Override
		public String value() {
			return "Loop";
		}

		@Override
		public String abbrValue() {
			return "Loop";
		}
	},
	MALL {
		@Override
		public String value() {
			return "Mall";
		}

		@Override
		public String abbrValue() {
			return "Mall";
		}
	},
	MANOR {
		@Override
		public String value() {
			return "Manor";
		}

		@Override
		public String abbrValue() {
			return "Mnr";
		}
	},
	MANORS {
		@Override
		public String value() {
			return "Manors";
		}

		@Override
		public String abbrValue() {
			return "Mnrs";
		}
	},
	MEADOW {
		@Override
		public String value() {
			return "Meadow";
		}

		@Override
		public String abbrValue() {
			return "Mdw";
		}
	},
	MEADOWS {
		@Override
		public String value() {
			return "Meadows";
		}

		@Override
		public String abbrValue() {
			return "Mdws";
		}
	},
	MEWS {
		@Override
		public String value() {
			return "Mews";
		}

		@Override
		public String abbrValue() {
			return "Mews";
		}
	},
	MILL {
		@Override
		public String value() {
			return "Mill";
		}

		@Override
		public String abbrValue() {
			return "Ml";
		}
	},
	MILLS {
		@Override
		public String value() {
			return "Mills";
		}

		@Override
		public String abbrValue() {
			return "Mls";
		}
	},
	MISSION  {
		@Override
		public String value() {
			return "Mission";
		}

		@Override
		public String abbrValue() {
			return "Msn";
		}
	},
	MOTORWAY  {
		@Override
		public String value() {
			return "Motorway";
		}

		@Override
		public String abbrValue() {
			return "Mtwy";
		}
	},
	MOUNT  {
		@Override
		public String value() {
			return "Mount";
		}

		@Override
		public String abbrValue() {
			return "Mt";
		}
	},
	MOUNTAIN  {
		@Override
		public String value() {
			return "Mountain";
		}

		@Override
		public String abbrValue() {
			return "Mtn";
		}
	},
	MOUNTAINS  {
		@Override
		public String value() {
			return "Mountains";
		}

		@Override
		public String abbrValue() {
			return "Mtns";
		}
	},
	NECK  {
		@Override
		public String value() {
			return "Neck";
		}

		@Override
		public String abbrValue() {
			return "Nck";
		}
	},
	ORCHARD  {
		@Override
		public String value() {
			return "Orchard";
		}

		@Override
		public String abbrValue() {
			return "Orch";
		}
	},
	OVAL  {
		@Override
		public String value() {
			return "Oval";
		}

		@Override
		public String abbrValue() {
			return "Oval";
		}
	},
	OVERPASS  {
		@Override
		public String value() {
			return "Overpass";
		}

		@Override
		public String abbrValue() {
			return "Opas";
		}
	},
	PARK {
		@Override
		public String value() {
			return "Park";
		}

		@Override
		public String abbrValue() {
			return "Park";
		}
	},
	PARKS {
		@Override
		public String value() {
			return "Parks";
		}

		@Override
		public String abbrValue() {
			return "Park";
		}
	},
	PARKWAY {
		@Override
		public String value() {
			return "Parkway";
		}

		@Override
		public String abbrValue() {
			return "Pkwy";
		}
	},
	PARKWAYS {
		@Override
		public String value() {
			return "Parkways";
		}

		@Override
		public String abbrValue() {
			return "Pkwy";
		}
	},
	PASS {
		@Override
		public String value() {
			return "Pass";
		}

		@Override
		public String abbrValue() {
			return "Pass";
		}
	},
	PASSAGE {
		@Override
		public String value() {
			return "Passage";
		}

		@Override
		public String abbrValue() {
			return "Psge";
		}
	},
	PATH {
		@Override
		public String value() {
			return "Path";
		}

		@Override
		public String abbrValue() {
			return "Path";
		}
	},
	PIKE {
		@Override
		public String value() {
			return "Pike";
		}

		@Override
		public String abbrValue() {
			return "Pike";
		}
	},
	PINE {
		@Override
		public String value() {
			return "Pine";
		}

		@Override
		public String abbrValue() {
			return "Pne";
		}
	},
	PINES {
		@Override
		public String value() {
			return "Pines";
		}

		@Override
		public String abbrValue() {
			return "Pnes";
		}
	},
	PLACE {
		@Override
		public String value() {
			return "Place";
		}

		@Override
		public String abbrValue() {
			return "Pl";
		}
	},
	PLAIN {
		@Override
		public String value() {
			return "Plain";
		}

		@Override
		public String abbrValue() {
			return "Pln";
		}
	},
	PLAINS {
		@Override
		public String value() {
			return "Plains";
		}

		@Override
		public String abbrValue() {
			return "Plns";
		}
	},
	PLAZA {
		@Override
		public String value() {
			return "Plaza";
		}

		@Override
		public String abbrValue() {
			return "Plz";
		}
	},
	POINT {
		@Override
		public String value() {
			return "Point";
		}

		@Override
		public String abbrValue() {
			return "Pt";
		}
	},
	POINTS {
		@Override
		public String value() {
			return "Points";
		}

		@Override
		public String abbrValue() {
			return "Pts";
		}
	},
	PORT {
		@Override
		public String value() {
			return "Port";
		}

		@Override
		public String abbrValue() {
			return "Prt";
		}
	},
	PORTS {
		@Override
		public String value() {
			return "Ports";
		}

		@Override
		public String abbrValue() {
			return "Prts";
		}
	},
	PRAIRIE {
		@Override
		public String value() {
			return "Prairie";
		}

		@Override
		public String abbrValue() {
			return "Pr";
		}
	},
	RADIAL {
		@Override
		public String value() {
			return "Radial";
		}

		@Override
		public String abbrValue() {
			return "Radl";
		}
	},
	RAMP {
		@Override
		public String value() {
			return "Ramp";
		}

		@Override
		public String abbrValue() {
			return "Ramp";
		}
	},
	RANCH {
		@Override
		public String value() {
			return "Ranch";
		}

		@Override
		public String abbrValue() {
			return "Rnch";
		}
	},
	RAPID {
		@Override
		public String value() {
			return "Rapid";
		}

		@Override
		public String abbrValue() {
			return "Rpd";
		}
	},
	RAPIDS {
		@Override
		public String value() {
			return "Rapids";
		}

		@Override
		public String abbrValue() {
			return "Rpds";
		}
	},
	REST {
		@Override
		public String value() {
			return "Rest";
		}

		@Override
		public String abbrValue() {
			return "Rst";
		}
	},
	RIDGE {
		@Override
		public String value() {
			return "Ridge";
		}

		@Override
		public String abbrValue() {
			return "Rdg";
		}
	},
	RIDGES {
		@Override
		public String value() {
			return "Ridges";
		}

		@Override
		public String abbrValue() {
			return "Rdgs";
		}
	},
	RIVER {
		@Override
		public String value() {
			return "River";
		}

		@Override
		public String abbrValue() {
			return "Riv";
		}
	},
	ROAD {
		@Override
		public String value() {
			return "Road";
		}

		@Override
		public String abbrValue() {
			return "Rd";
		}
	},
	ROADS {
		@Override
		public String value() {
			return "Roads";
		}

		@Override
		public String abbrValue() {
			return "Rds";
		}
	},
	ROUTE {
		@Override
		public String value() {
			return "Route";
		}

		@Override
		public String abbrValue() {
			return "Rte";
		}
	},
	ROW {
		@Override
		public String value() {
			return "Row";
		}

		@Override
		public String abbrValue() {
			return "Row";
		}
	},
	RUE {
		@Override
		public String value() {
			return "Rue";
		}

		@Override
		public String abbrValue() {
			return "Rue";
		}
	},
	RUN {
		@Override
		public String value() {
			return "Run";
		}

		@Override
		public String abbrValue() {
			return "Run";
		}
	},
	SHOAL {
		@Override
		public String value() {
			return "Shoal";
		}

		@Override
		public String abbrValue() {
			return "Shl";
		}
	},
	SHOALS {
		@Override
		public String value() {
			return "Shoals";
		}

		@Override
		public String abbrValue() {
			return "Shls";
		}
	},
	SHORE {
		@Override
		public String value() {
			return "Shore";
		}

		@Override
		public String abbrValue() {
			return "Shr";
		}
	},
	SHORES {
		@Override
		public String value() {
			return "Shores";
		}

		@Override
		public String abbrValue() {
			return "Shrs";
		}
	},
	SKYWAY {
		@Override
		public String value() {
			return "Skyway";
		}

		@Override
		public String abbrValue() {
			return "Skwy";
		}
	},
	SPRING {
		@Override
		public String value() {
			return "Spring";
		}

		@Override
		public String abbrValue() {
			return "Spg";
		}
	},
	SPRINGS {
		@Override
		public String value() {
			return "Springs";
		}

		@Override
		public String abbrValue() {
			return "Spgs";
		}
	},
	SPUR {
		@Override
		public String value() {
			return "Spur";
		}

		@Override
		public String abbrValue() {
			return "Spur";
		}
	},
	SPURS {
		@Override
		public String value() {
			return "Spurs";
		}

		@Override
		public String abbrValue() {
			return "Spurs";
		}
	},
	SQUARE {
		@Override
		public String value() {
			return "Square";
		}

		@Override
		public String abbrValue() {
			return "Sq";
		}
	},
	SQUARES {
		@Override
		public String value() {
			return "Squares";
		}

		@Override
		public String abbrValue() {
			return "Sqs";
		}
	},
	STATION {
		@Override
		public String value() {
			return "Station";
		}

		@Override
		public String abbrValue() {
			return "Sta";
		}
	},
	STRAVENUE {
		@Override
		public String value() {
			return "Stravenue";
		}

		@Override
		public String abbrValue() {
			return "Stra";
		}
	},
	STREAM {
		@Override
		public String value() {
			return "Stream";
		}

		@Override
		public String abbrValue() {
			return "Strm";
		}
	},
	STREET {
		@Override
		public String value() {
			return "Street";
		}

		@Override
		public String abbrValue() {
			return "St";
		}
	},
	STREETS {
		@Override
		public String value() {
			return "Streets";
		}

		@Override
		public String abbrValue() {
			return "Sts";
		}
	},
	SUMMIT {
		@Override
		public String value() {
			return "Summit";
		}

		@Override
		public String abbrValue() {
			return "Smt";
		}
	},
	TERRACE {
		@Override
		public String value() {
			return "Terrace";
		}

		@Override
		public String abbrValue() {
			return "Ter";
		}
	},
	THROUGHWAY {
		@Override
		public String value() {
			return "Throughway";
		}

		@Override
		public String abbrValue() {
			return "Trwy";
		}
	},
	TRACE {
		@Override
		public String value() {
			return "Trace";
		}

		@Override
		public String abbrValue() {
			return "Trce";
		}
	},
	TRACK {
		@Override
		public String value() {
			return "Track";
		}

		@Override
		public String abbrValue() {
			return "Trak";
		}
	},
	TRAFFICWAY {
		@Override
		public String value() {
			return "Trafficway";
		}

		@Override
		public String abbrValue() {
			return "Trfy";
		}
	},
	TRAIL {
		@Override
		public String value() {
			return "Trail";
		}

		@Override
		public String abbrValue() {
			return "Trfy";
		}
	},
	TRAILER {
		@Override
		public String value() {
			return "Trailer";
		}

		@Override
		public String abbrValue() {
			return "Trlr";
		}
	},
	TUNNEL {
		@Override
		public String value() {
			return "Tunnel";
		}

		@Override
		public String abbrValue() {
			return "Tunl";
		}
	},
	TURNPIKE {
		@Override
		public String value() {
			return "Turnpike";
		}

		@Override
		public String abbrValue() {
			return "Tunl";
		}
	},
	UNDERPASS {
		@Override
		public String value() {
			return "Underpass";
		}

		@Override
		public String abbrValue() {
			return "Upas";
		}
	},
	UNION {
		@Override
		public String value() {
			return "Union";
		}

		@Override
		public String abbrValue() {
			return "Un";
		}
	},
	UNIONS {
		@Override
		public String value() {
			return "Unions";
		}

		@Override
		public String abbrValue() {
			return "Uns";
		}
	},
	VALLEY {
		@Override
		public String value() {
			return "Valley";
		}

		@Override
		public String abbrValue() {
			return "Vly";
		}
	},
	VALLEYS {
		@Override
		public String value() {
			return "Valleys";
		}

		@Override
		public String abbrValue() {
			return "Vlys";
		}
	},
	VIADUCT {
		@Override
		public String value() {
			return "Viaduct";
		}

		@Override
		public String abbrValue() {
			return "Via";
		}
	},
	VIEW {
		@Override
		public String value() {
			return "View";
		}

		@Override
		public String abbrValue() {
			return "Vw";
		}
	},
	VIEWS {
		@Override
		public String value() {
			return "Views";
		}

		@Override
		public String abbrValue() {
			return "Vws";
		}
	},
	VILLAGE {
		@Override
		public String value() {
			return "Village";
		}

		@Override
		public String abbrValue() {
			return "Vlg";
		}
	},
	VILLAGES {
		@Override
		public String value() {
			return "Villages";
		}

		@Override
		public String abbrValue() {
			return "Vlgs";
		}
	},
	VILLE {
		@Override
		public String value() {
			return "Ville";
		}

		@Override
		public String abbrValue() {
			return "Vl";
		}
	},
	VISTA {
		@Override
		public String value() {
			return "Vista";
		}

		@Override
		public String abbrValue() {
			return "Vis";
		}
	},
	WALK {
		@Override
		public String value() {
			return "Walk";
		}

		@Override
		public String abbrValue() {
			return "Walk";
		}
	},
	WALKS {
		@Override
		public String value() {
			return "Walks";
		}

		@Override
		public String abbrValue() {
			return "Walks";
		}
	},
	WALL {
		@Override
		public String value() {
			return "Wall";
		}

		@Override
		public String abbrValue() {
			return "Wall";
		}
	},
	WAY {
		@Override
		public String value() {
			return "Way";
		}

		@Override
		public String abbrValue() {
			return "Way";
		}
	},
	WAYS {
		@Override
		public String value() {
			return "Ways";
		}

		@Override
		public String abbrValue() {
			return "Ways";
		}
	};

	private static final List<USStreetType> VALUES = Collections
			.unmodifiableList(Arrays.asList(values()));

	private static final int SIZE = VALUES.size();
	private static final Random RANDOM = new Random();

	public abstract String value();

	public abstract String abbrValue();

	public static USStreetType randomStreetType() {
		return VALUES.get(RANDOM.nextInt(SIZE));
	}
}