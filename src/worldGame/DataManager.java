package worldGame;


import java.util.ArrayList;
import java.util.HashMap;

public class DataManager {

    public static ArrayList<Country> generateCountriesArray() {
        ArrayList<Country> countries = new ArrayList<>();

        countries.add(new Country("Afghanistan", "Asia", "Kabul", 652_230, 42_647_492, false, 0.65, new Currency("؋", "Afghan Afghani")));
        countries.add(new Country("Albania", "Europe", "Tirana", 28_748, 2_811_655, false, 0.70, new Currency("L", "Albanian Lek")));
        countries.add(new Country("Algeria", "Africa", "Algiers", 2_381_741, 46_814_308, false, 0.68, new Currency("د.ج", "Algerian Dinar")));
        countries.add(new Country("Andorra", "Europe", "Andorra la Vella", 468, 77_265, false, 0.75, new Currency("€", "Euro")));
        countries.add(new Country("Angola", "Africa", "Luanda", 1_246_700, 37_885_849, false, 0.60, new Currency("Kz", "Angolan Kwanza")));
        countries.add(new Country("Antigua and Barbuda", "North America", "St. John's", 442, 93_219, true, 0.70, new Currency("$", "East Caribbean Dollar")));
        countries.add(new Country("Argentina", "South America", "Buenos Aires", 2_780_400, 45_696_159, false, 0.74, new Currency("$", "Argentine Peso")));
        countries.add(new Country("Armenia", "Asia", "Yerevan", 29_743, 2_943_393, false, 0.70, new Currency("֏", "Armenian Dram")));
        countries.add(new Country("Australia", "Oceania", "Canberra", 7_692_024, 26_451_124, true, 0.78, new Currency("$", "Australian Dollar")));
        countries.add(new Country("Austria", "Europe", "Vienna", 83_871, 9_130_429, false, 0.72, new Currency("€", "Euro")));
        countries.add(new Country("Azerbaijan", "Asia", "Baku", 86_600, 10_318_207, false, 0.68, new Currency("₼", "Azerbaijani Manat")));
        countries.add(new Country("Bahamas", "North America", "Nassau", 13_943, 400_516, true, 0.70, new Currency("$", "Bahamian Dollar")));
        countries.add(new Country("Bahrain", "Asia", "Manama", 765, 1_569_666, true, 0.75, new Currency(".د.ب", "Bahraini Dinar")));
        countries.add(new Country("Bangladesh", "Asia", "Dhaka", 147_570, 173_562_364, false, 0.65, new Currency("৳", "Bangladeshi Taka")));
        countries.add(new Country("Barbados", "North America", "Bridgetown", 430, 287_371, true, 0.70, new Currency("$", "Barbadian Dollar")));
        countries.add(new Country("Belarus", "Europe", "Minsk", 207_600, 9_115_680, false, 0.70, new Currency("Br", "Belarusian Ruble")));
        countries.add(new Country("Belgium", "Europe", "Brussels", 30_528, 11_712_893, false, 0.72, new Currency("€", "Euro")));
        countries.add(new Country("Belize", "North America", "Belmopan", 22_966, 441_471, false, 0.65, new Currency("$", "Belize Dollar")));
        countries.add(new Country("Benin", "Africa", "Porto-Novo", 112_622, 14_111_034, false, 0.60, new Currency("CFA", "West African CFA Franc")));
        countries.add(new Country("Bhutan", "Asia", "Thimphu", 38_394, 786_385, false, 0.65, new Currency("Nu.", "Bhutanese Ngultrum")));
        countries.add(new Country("Bolivia", "South America", "Sucre", 1_098_581, 12_244_159, false, 0.65, new Currency("Bs.", "Bolivian Boliviano")));
        countries.add(new Country("Bosnia and Herzegovina", "Europe", "Sarajevo", 51_197, 3_185_073, false, 0.70, new Currency("KM", "Bosnia and Herzegovina Convertible Mark")));
        countries.add(new Country("Botswana", "Africa", "Gaborone", 581_730, 2_480_244, false, 0.65, new Currency("P", "Botswana Pula")));
        countries.add(new Country("Brazil", "South America", "Brasília", 8_515_767, 211_998_573, false, 0.70, new Currency("R$", "Brazilian Real")));
        countries.add(new Country("Brunei", "Asia", "Bandar Seri Begawan", 5_765, 460_345, true, 0.75, new Currency("$", "Brunei Dollar")));
        countries.add(new Country("Bulgaria", "Europe", "Sofia", 110_879, 6_795_803, false, 0.70, new Currency("лв", "Bulgarian Lev")));
        countries.add(new Country("Burkina Faso", "Africa", "Ouagadougou", 272_967, 23_025_776, false, 0.60, new Currency("CFA", "West African CFA Franc")));
        countries.add(new Country("Burundi", "Africa", "Gitega", 27_834, 13_689_450, false, 0.60, new Currency("FBu", "Burundian Franc")));
        countries.add(new Country("Cabo Verde", "Africa", "Praia", 4_033, 522_331, true, 0.70, new Currency("Esc", "Cape Verdean Escudo")));
        countries.add(new Country("Cambodia", "Asia", "Phnom Penh", 181_035, 17_423_880, false, 0.65, new Currency("៛", "Cambodian Riel")));
        countries.add(new Country("Cameroon", "Africa", "Yaoundé", 475_442, 28_372_687, false, 0.60, new Currency("CFA", "Central African CFA Franc")));
        countries.add(new Country("Canada", "North America", "Ottawa", 9_984_670, 39_299_042, false, 0.79, new Currency("$", "Canadian Dollar")));
        countries.add(new Country("Central African Republic", "Africa", "Bangui", 622_984, 5_454_533, false, 0.58, new Currency("CFA", "Central African CFA Franc")));
        countries.add(new Country("Chad", "Africa", "N'Djamena", 1_284_000, 18_128_438, false, 0.58, new Currency("CFA", "Central African CFA Franc")));
        countries.add(new Country("Chile", "South America", "Santiago", 756_102, 19_201_511, false, 0.75, new Currency("$", "Chilean Peso")));
        countries.add(new Country("China", "Asia", "Beijing", 9_596_961, 1_411_778_724, false, 0.75, new Currency("¥", "Chinese Yuan")));
        countries.add(new Country("Colombia", "South America", "Bogotá", 1_141_748, 52_556_363, false, 0.72, new Currency("$", "Colombian Peso")));
        countries.add(new Country("Comoros", "Africa", "Moroni", 2_235, 927_801, true, 0.65, new Currency("CF", "Comorian Franc")));
        countries.add(new Country("Congo, Democratic Republic of the", "Africa", "Kinshasa", 2_344_858, 102_262_400, false, 0.60, new Currency("FC", "Congolese Franc")));
        countries.add(new Country("Congo, Republic of the", "Africa", "Brazzaville", 342_000, 6_206_585, false, 0.62, new Currency("CFA", "Central African CFA Franc")));
        countries.add(new Country("Costa Rica", "North America", "San José", 51_100, 5_387_329, false, 0.76, new Currency("₡", "Costa Rican Colón")));
        countries.add(new Country("Croatia", "Europe", "Zagreb", 56_594, 3_871_833, false, 0.74, new Currency("kn", "Croatian Kuna")));
        countries.add(new Country("Cuba", "North America", "Havana", 109_884, 11_326_616, true, 0.73, new Currency("₱", "Cuban Peso")));
        countries.add(new Country("Cyprus", "Europe", "Nicosia", 9_251, 1_242_153, true, 0.74, new Currency("€", "Euro")));
        countries.add(new Country("Czech Republic", "Europe", "Prague", 78_865, 10_707_839, false, 0.76, new Currency("Kč", "Czech Koruna")));
        countries.add(new Country("Denmark", "Europe", "Copenhagen", 43_094, 5_873_420, false, 0.75, new Currency("kr", "Danish Krone")));
        countries.add(new Country("Djibouti", "Africa", "Djibouti", 23_200, 1_160_388, false, 0.65, new Currency("Fdj", "Djiboutian Franc")));
        countries.add(new Country("Dominica", "North America", "Roseau", 751, 72_341, true, 0.70, new Currency("$", "East Caribbean Dollar")));
        countries.add(new Country("Dominican Republic", "North America", "Santo Domingo", 48_671, 11_244_292, true, 0.73, new Currency("RD$", "Dominican Peso")));
        countries.add(new Country("Ecuador", "South America", "Quito", 283_561, 18_225_432, false, 0.72, new Currency("$", "United States Dollar")));
        countries.add(new Country("Egypt", "Africa", "Cairo", 1_010_408, 111_822_406, false, 0.70, new Currency("£", "Egyptian Pound")));
        countries.add(new Country("El Salvador", "North America", "San Salvador", 21_041, 6_530_357, false, 0.73, new Currency("$", "United States Dollar")));
        countries.add(new Country("Equatorial Guinea", "Africa", "Malabo", 28_051, 1_637_217, true, 0.68, new Currency("CFA", "Central African CFA Franc")));
        countries.add(new Country("Eritrea", "Africa", "Asmara", 117_600, 3_748_901, false, 0.64, new Currency("Nfk", "Eritrean Nakfa")));
        countries.add(new Country("Estonia", "Europe", "Tallinn", 45_227, 1_341_904, false, 0.76, new Currency("€", "Euro")));
        countries.add(new Country("Eswatini", "Africa", "Mbabane", 17_364, 1_193_148, false, 0.63, new Currency("E", "Swazi Lilangeni")));
        countries.add(new Country("Ethiopia", "Africa", "Addis Ababa", 1_104_300, 126_326_374, false, 0.60, new Currency("Br", "Ethiopian Birr")));
        countries.add(new Country("Fiji", "Oceania", "Suva", 18_274, 947_268, true, 0.70, new Currency("$", "Fijian Dollar")));
        countries.add(new Country("Finland", "Europe", "Helsinki", 338_424, 5_546_444, false, 0.75, new Currency("€", "Euro")));
        countries.add(new Country("France", "Europe", "Paris", 551_695, 67_961_681, false, 0.74, new Currency("€", "Euro")));
        countries.add(new Country("Gabon", "Africa", "Libreville", 267_668, 2_438_441, false, 0.65, new Currency("CFA", "Central African CFA Franc")));
        countries.add(new Country("Gambia", "Africa", "Banjul", 11_295, 2_696_147, false, 0.60, new Currency("D", "Gambian Dalasi")));
        countries.add(new Country("Georgia", "Asia", "Tbilisi", 69_700, 3_734_808, false, 0.72, new Currency("₾", "Georgian Lari")));
        countries.add(new Country("Germany", "Europe", "Berlin", 357_022, 83_824_026, false, 0.76, new Currency("€", "Euro")));
        countries.add(new Country("Ghana", "Africa", "Accra", 238_533, 34_097_312, false, 0.61, new Currency("GH₵", "Ghanaian Cedi")));
        countries.add(new Country("Greece", "Europe", "Athens", 131_957, 10_359_449, false, 0.75, new Currency("€", "Euro")));
        countries.add(new Country("Grenada", "North America", "St. George's", 344, 126_618, true, 0.70, new Currency("$", "East Caribbean Dollar")));
        countries.add(new Country("Guatemala", "North America", "Guatemala City", 108_889, 19_149_378, false, 0.67, new Currency("Q", "Guatemalan Quetzal")));
        countries.add(new Country("Guinea", "Africa", "Conakry", 245_857, 14_207_269, false, 0.60, new Currency("FG", "Guinean Franc")));
        countries.add(new Country("Guinea-Bissau", "Africa", "Bissau", 36_125, 2_243_424, false, 0.60, new Currency("CFA", "West African CFA Franc")));
        countries.add(new Country("Guyana", "South America", "Georgetown", 214_969, 812_216, false, 0.67, new Currency("$", "Guyanese Dollar")));
        countries.add(new Country("Haiti", "North America", "Port-au-Prince", 27_750, 11_549_151, true, 0.64, new Currency("G", "Haitian Gourde")));
        countries.add(new Country("Honduras", "North America", "Tegucigalpa", 112_492, 10_374_708, false, 0.66, new Currency("L", "Honduran Lempira")));
        countries.add(new Country("Hungary", "Europe", "Budapest", 93_028, 9_606_259, false, 0.76, new Currency("Ft", "Hungarian Forint")));
        countries.add(new Country("Iceland", "Europe", "Reykjavik", 103_000, 375_645, true, 0.76, new Currency("kr", "Icelandic Krona")));
        countries.add(new Country("India", "Asia", "New Delhi", 3_287_263, 1_428_627_663, false, 0.72, new Currency("₹", "Indian Rupee")));
        countries.add(new Country("Indonesia", "Asia", "Jakarta", 1_904_569, 277_534_122, true, 0.68, new Currency("Rp", "Indonesian Rupiah")));
        countries.add(new Country("Iran", "Asia", "Tehran", 1_648_195, 88_550_570, false, 0.69, new Currency("﷼", "Iranian Rial")));
        countries.add(new Country("Iraq", "Asia", "Baghdad", 437_072, 45_700_305, false, 0.67, new Currency("ع.د", "Iraqi Dinar")));
        countries.add(new Country("Ireland", "Europe", "Dublin", 70_273, 5_354_780, true, 0.77, new Currency("€", "Euro")));
        countries.add(new Country("Israel", "Asia", "Jerusalem", 20_770, 9_273_000, false, 0.75, new Currency("₪", "Israeli New Shekel")));
        countries.add(new Country("Italy", "Europe", "Rome", 301_340, 58_853_482, false, 0.75, new Currency("€", "Euro")));
        countries.add(new Country("Jamaica", "North America", "Kingston", 10_991, 2_746_385, true, 0.68, new Currency("$", "Jamaican Dollar")));
        countries.add(new Country("Japan", "Asia", "Tokyo", 377_975, 124_214_490, true, 0.79, new Currency("¥", "Japanese Yen")));
        countries.add(new Country("Jordan", "Asia", "Amman", 89_342, 11_271_768, false, 0.70, new Currency("د.ا", "Jordanian Dinar")));
        countries.add(new Country("Kazakhstan", "Asia", "Nur-Sultan", 2_724_900, 19_183_014, false, 0.68, new Currency("₸", "Kazakhstani Tenge")));
        countries.add(new Country("Kenya", "Africa", "Nairobi", 580_367, 55_759_361, false, 0.62, new Currency("Sh", "Kenyan Shilling")));
        countries.add(new Country("Kiribati", "Oceania", "South Tarawa", 811, 128_824, true, 0.60, new Currency("$", "Australian Dollar")));
        countries.add(new Country("Korea, North", "Asia", "Pyongyang", 120_540, 26_021_699, false, 0.68, new Currency("₩", "North Korean Won")));
        countries.add(new Country("Korea, South", "Asia", "Seoul", 100_210, 51_967_482, false, 0.76, new Currency("₩", "South Korean Won")));
        countries.add(new Country("Kuwait", "Asia", "Kuwait City", 17_818, 4_682_131, false, 0.74, new Currency("د.ك", "Kuwaiti Dinar")));
        countries.add(new Country("Kyrgyzstan", "Asia", "Bishkek", 199_951, 6_822_009, false, 0.67, new Currency("сом", "Kyrgyzstani Som")));
        countries.add(new Country("Laos", "Asia", "Vientiane", 236_800, 7_888_586, false, 0.66, new Currency("₭", "Lao Kip")));
        countries.add(new Country("Latvia", "Europe", "Riga", 64_573, 1_823_069, false, 0.74, new Currency("€", "Euro")));
        countries.add(new Country("Lebanon", "Asia", "Beirut", 10_452, 5_296_268, false, 0.69, new Currency("ل.ل", "Lebanese Pound")));
        countries.add(new Country("Lesotho", "Africa", "Maseru", 30_355, 2_346_520, false, 0.62, new Currency("L", "Lesotho Loti")));
        countries.add(new Country("Liberia", "Africa", "Monrovia", 111_369, 5_431_329, false, 0.63, new Currency("$", "Liberian Dollar")));
        countries.add(new Country("Libya", "Africa", "Tripoli", 1_759_541, 7_132_786, false, 0.65, new Currency("ل.د", "Libyan Dinar")));
        countries.add(new Country("Liechtenstein", "Europe", "Vaduz", 160, 39_315, false, 0.77, new Currency("CHF", "Swiss Franc")));
        countries.add(new Country("Lithuania", "Europe", "Vilnius", 65_300, 2_694_228, false, 0.74, new Currency("€", "Euro")));
        countries.add(new Country("Luxembourg", "Europe", "Luxembourg City", 2_586, 654_768, false, 0.78, new Currency("€", "Euro")));
        countries.add(new Country("Madagascar", "Africa", "Antananarivo", 587_041, 30_170_155, true, 0.60, new Currency("Ar", "Malagasy Ariary")));
        countries.add(new Country("Malawi", "Africa", "Lilongwe", 118_484, 21_419_828, false, 0.61, new Currency("MK", "Malawian Kwacha")));
        countries.add(new Country("Malaysia", "Asia", "Kuala Lumpur", 330_803, 34_402_866, true, 0.71, new Currency("RM", "Malaysian Ringgit")));
        countries.add(new Country("Maldives", "Asia", "Malé", 300, 563_289, true, 0.70, new Currency("Rf", "Maldivian Rufiyaa")));
        countries.add(new Country("Mali", "Africa", "Bamako", 1_240_192, 23_325_001, false, 0.60, new Currency("CFA", "West African CFA Franc")));
        countries.add(new Country("Malta", "Europe", "Valletta", 316, 537_874, true, 0.75, new Currency("€", "Euro")));
        countries.add(new Country("Marshall Islands", "Oceania", "Majuro", 181, 59_610, true, 0.70, new Currency("$", "United States Dollar")));
        countries.add(new Country("Mauritania", "Africa", "Nouakchott", 1_030_700, 4_657_353, false, 0.61, new Currency("UM", "Mauritanian Ouguiya")));
        countries.add(new Country("Mauritius", "Africa", "Port Louis", 2_040, 1_290_782, true, 0.72, new Currency("₨", "Mauritian Rupee")));
        countries.add(new Country("Mexico", "North America", "Mexico City", 1_964_375, 127_504_125, false, 0.74, new Currency("$", "Mexican Peso")));
        countries.add(new Country("Micronesia", "Oceania", "Palikir", 702, 101_776, true, 0.68, new Currency("$", "United States Dollar")));
        countries.add(new Country("Moldova", "Europe", "Chișinău", 33_846, 2_602_835, false, 0.70, new Currency("L", "Moldovan Leu")));
        countries.add(new Country("Monaco", "Europe", "Monaco", 2, 36_943, false, 0.76, new Currency("€", "Euro")));
        countries.add(new Country("Mongolia", "Asia", "Ulaanbaatar", 1_564_116, 3_472_744, false, 0.65, new Currency("₮", "Mongolian Tögrög")));
        countries.add(new Country("Montenegro", "Europe", "Podgorica", 13_812, 616_673, false, 0.74, new Currency("€", "Euro")));
        countries.add(new Country("Morocco", "Africa", "Rabat", 446_550, 37_664_328, false, 0.66, new Currency("MAD", "Moroccan Dirham")));
        countries.add(new Country("Mozambique", "Africa", "Maputo", 801_590, 33_521_206, false, 0.62, new Currency("MT", "Mozambican Metical")));
        countries.add(new Country("Myanmar", "Asia", "Naypyidaw", 676_578, 55_753_000, false, 0.64, new Currency("K", "Myanmar Kyat")));
        countries.add(new Country("Namibia", "Africa", "Windhoek", 825_615, 2_623_080, false, 0.63, new Currency("$", "Namibian Dollar")));
        countries.add(new Country("Nauru", "Oceania", "Yaren District", 21, 10_834, true, 0.70, new Currency("$", "Australian Dollar")));
        countries.add(new Country("Nepal", "Asia", "Kathmandu", 147_181, 30_034_989, false, 0.65, new Currency("रू", "Nepalese Rupee")));
        countries.add(new Country("Netherlands", "Europe", "Amsterdam", 41_543, 17_757_812, false, 0.76, new Currency("€", "Euro")));
        countries.add(new Country("New Zealand", "Oceania", "Wellington", 268_838, 5_231_536, true, 0.76, new Currency("$", "New Zealand Dollar")));
        countries.add(new Country("Nicaragua", "North America", "Managua", 130_373, 7_002_726, false, 0.66, new Currency("C$", "Nicaraguan Córdoba")));
        countries.add(new Country("Niger", "Africa", "Niamey", 1_267_000, 27_477_833, false, 0.60, new Currency("CFA", "West African CFA Franc")));
        countries.add(new Country("Nigeria", "Africa", "Abuja", 923_769, 218_541_212, false, 0.63, new Currency("₦", "Nigerian Naira")));
        countries.add(new Country("North Macedonia", "Europe", "Skopje", 25_713, 2_081_304, false, 0.70, new Currency("ден", "Macedonian Denar")));
        countries.add(new Country("Norway", "Europe", "Oslo", 385_207, 5_465_630, false, 0.78, new Currency("kr", "Norwegian Krone")));
        countries.add(new Country("Oman", "Asia", "Muscat", 309_500, 4_693_073, false, 0.71, new Currency("ر.ع.", "Omani Rial")));
        countries.add(new Country("Pakistan", "Asia", "Islamabad", 881_913, 241_493_883, false, 0.64, new Currency("₨", "Pakistani Rupee")));
        countries.add(new Country("Palau", "Oceania", "Ngerulmud", 459, 18_169, true, 0.70, new Currency("$", "United States Dollar")));
        countries.add(new Country("Panama", "North America", "Panama City", 75_417, 4_502_615, false, 0.73, new Currency("B/.", "Panamanian Balboa")));
        countries.add(new Country("Papua New Guinea", "Oceania", "Port Moresby", 462_840, 9_718_971, true, 0.66, new Currency("K", "Papua New Guinean Kina")));
        countries.add(new Country("Paraguay", "South America", "Asunción", 406_752, 7_528_561, false, 0.66, new Currency("₲", "Paraguayan Guarani")));
        countries.add(new Country("Peru", "South America", "Lima", 1_285_216, 35_660_761, false, 0.69, new Currency("S/", "Peruvian Sol")));
        countries.add(new Country("Philippines", "Asia", "Manila", 300_000, 114_597_229, true, 0.70, new Currency("₱", "Philippine Peso")));
        countries.add(new Country("Poland", "Europe", "Warsaw", 312_696, 37_694_891, false, 0.73, new Currency("zł", "Polish Zloty")));
        countries.add(new Country("Portugal", "Europe", "Lisbon", 92_090, 10_110_983, false, 0.76, new Currency("€", "Euro")));
        countries.add(new Country("Qatar", "Asia", "Doha", 11_581, 2_972_209, false, 0.77, new Currency("ر.ق", "Qatari Riyal")));
        countries.add(new Country("Romania", "Europe", "Bucharest", 238_391, 18_686_253, false, 0.70, new Currency("lei", "Romanian Leu")));
        countries.add(new Country("Russia", "Europe/Asia", "Moscow", 17_098_242, 145_803_246, false, 0.70, new Currency("₽", "Russian Ruble")));
        countries.add(new Country("Rwanda", "Africa", "Kigali", 26_338, 13_374_616, false, 0.63, new Currency("FRw", "Rwandan Franc")));
        countries.add(new Country("Saint Kitts and Nevis", "North America", "Basseterre", 261, 47_606, true, 0.71, new Currency("$", "East Caribbean Dollar")));
        countries.add(new Country("Saint Lucia", "North America", "Castries", 617, 183_627, true, 0.72, new Currency("$", "East Caribbean Dollar")));
        countries.add(new Country("Saint Vincent and the Grenadines", "North America", "Kingstown", 389, 101_390, true, 0.72, new Currency("$", "East Caribbean Dollar")));
        countries.add(new Country("Samoa", "Oceania", "Apia", 2_842, 205_619, true, 0.70, new Currency("T", "Samoan Tala")));
        countries.add(new Country("San Marino", "Europe", "San Marino", 61, 34_232, false, 0.77, new Currency("€", "Euro")));
        countries.add(new Country("Sao Tome and Principe", "Africa", "São Tomé", 964, 233_948, true, 0.65, new Currency("Db", "São Tomé and Príncipe Dobra")));
        countries.add(new Country("Saudi Arabia", "Asia", "Riyadh", 2_149_690, 36_327_762, false, 0.68, new Currency("ر.س", "Saudi Riyal")));
        countries.add(new Country("Senegal", "Africa", "Dakar", 196_722, 18_153_455, false, 0.64, new Currency("CFA", "West African CFA Franc")));
        countries.add(new Country("Serbia", "Europe", "Belgrade", 88_361, 6_661_774, false, 0.72, new Currency("дин", "Serbian Dinar")));
        countries.add(new Country("Seychelles", "Africa", "Victoria", 455, 102_588, true, 0.70, new Currency("SCR", "Seychellois Rupee")));
        countries.add(new Country("Sierra Leone", "Africa", "Freetown", 71_740, 8_791_092, false, 0.60, new Currency("Le", "Sierra Leonean Leone")));
        countries.add(new Country("Singapore", "Asia", "Singapore", 728, 5_938_601, true, 0.80, new Currency("$", "Singapore Dollar")));
        countries.add(new Country("Slovakia", "Europe", "Bratislava", 49_035, 5_442_725, false, 0.74, new Currency("€", "Euro")));
        countries.add(new Country("Slovenia", "Europe", "Ljubljana", 20_273, 2_107_508, false, 0.75, new Currency("€", "Euro")));
        countries.add(new Country("Solomon Islands", "Oceania", "Honiara", 28_896, 739_903, true, 0.68, new Currency("$", "Solomon Islands Dollar")));
        countries.add(new Country("Somalia", "Africa", "Mogadishu", 637_657, 17_513_546, false, 0.58, new Currency("Sh", "Somali Shilling")));
        countries.add(new Country("South Africa", "Africa", "Pretoria", 1_221_037, 60_564_842, false, 0.68, new Currency("R", "South African Rand")));
        countries.add(new Country("South Sudan", "Africa", "Juba", 619_745, 11_556_231, false, 0.55, new Currency("£", "South Sudanese Pound")));
        countries.add(new Country("Spain", "Europe", "Madrid", 505_992, 46_719_142, false, 0.77, new Currency("€", "Euro")));
        countries.add(new Country("Sri Lanka", "Asia", "Sri Jayawardenepura Kotte", 65_610, 22_554_594, true, 0.72, new Currency("Rs", "Sri Lankan Rupee")));
        countries.add(new Country("Sudan", "Africa", "Khartoum", 1_886_068, 48_109_419, false, 0.60, new Currency("ج.س.", "Sudanese Pound")));
        countries.add(new Country("Suriname", "South America", "Paramaribo", 163_820, 634_470, false, 0.67, new Currency("$", "Surinamese Dollar")));
        countries.add(new Country("Sweden", "Europe", "Stockholm", 450_295, 10_530_751, false, 0.78, new Currency("kr", "Swedish Krona")));
        countries.add(new Country("Switzerland", "Europe", "Bern", 41_290, 8_697_162, false, 0.79, new Currency("CHF", "Swiss Franc")));
        countries.add(new Country("Syria", "Asia", "Damascus", 185_180, 21_826_212, false, 0.63, new Currency("£", "Syrian Pound")));
        countries.add(new Country("Taiwan", "Asia", "Taipei", 36_193, 23_570_000, true, 0.76, new Currency("NT$", "New Taiwan Dollar")));
        countries.add(new Country("Tajikistan", "Asia", "Dushanbe", 143_100, 10_143_201, false, 0.66, new Currency("ЅМ", "Tajikistani Somoni")));
        countries.add(new Country("Tanzania", "Africa", "Dodoma", 947_303, 67_784_321, false, 0.60, new Currency("Sh", "Tanzanian Shilling")));
        countries.add(new Country("Thailand", "Asia", "Bangkok", 513_120, 69_799_978, false, 0.71, new Currency("฿", "Thai Baht")));
        countries.add(new Country("Timor-Leste", "Asia", "Dili", 14_874, 1_356_993, true, 0.65, new Currency("$", "United States Dollar")));
        countries.add(new Country("Togo", "Africa", "Lomé", 56_785, 9_053_570, false, 0.61, new Currency("CFA", "West African CFA Franc")));
        countries.add(new Country("Tonga", "Oceania", "Nuku'alofa", 747, 105_697, true, 0.69, new Currency("T$", "Tongan Paʻanga")));
        countries.add(new Country("Trinidad and Tobago", "North America", "Port of Spain", 5_131, 1_535_164, true, 0.72, new Currency("$", "Trinidad and Tobago Dollar")));
        countries.add(new Country("Tunisia", "Africa", "Tunis", 163_610, 12_280_641, false, 0.68, new Currency("د.ت", "Tunisian Dinar")));
        countries.add(new Country("Turkey", "Asia", "Ankara", 783_356, 87_231_835, false, 0.71, new Currency("₺", "Turkish Lira")));
        countries.add(new Country("Turkmenistan", "Asia", "Ashgabat", 488_100, 6_319_356, false, 0.63, new Currency("m", "Turkmenistan Manat")));
        countries.add(new Country("Tuvalu", "Oceania", "Funafuti", 26, 11_312, true, 0.66, new Currency("$", "Australian Dollar")));
        countries.add(new Country("Uganda", "Africa", "Kampala", 241_038, 48_432_111, false, 0.61, new Currency("Sh", "Ugandan Shilling")));
        countries.add(new Country("Ukraine", "Europe", "Kyiv", 603_500, 36_744_634, false, 0.70, new Currency("₴", "Ukrainian Hryvnia")));
        countries.add(new Country("United Arab Emirates", "Asia", "Abu Dhabi", 83_600, 10_168_350, false, 0.80, new Currency("د.إ", "UAE Dirham")));
        countries.add(new Country("United Kingdom", "Europe", "London", 243_610, 68_187_291, true, 0.77, new Currency("£", "British Pound Sterling")));
        countries.add(new Country("United States", "North America", "Washington, D.C.", 9_525_067, 334_233_854, false, 0.76, new Currency("$", "US Dollar")));
        countries.add(new Country("Uruguay", "South America", "Montevideo", 176_215, 3_491_428, false, 0.72, new Currency("$", "Uruguayan Peso")));
        countries.add(new Country("Uzbekistan", "Asia", "Tashkent", 447_400, 35_774_278, false, 0.68, new Currency("лв", "Uzbekistani Som")));
        countries.add(new Country("Vanuatu", "Oceania", "Port Vila", 12_189, 322_503, true, 0.66, new Currency("Vt", "Vanuatu Vatu")));
        countries.add(new Country("Vatican City", "Europe", "Vatican City", 1, 825, false, 0.95, new Currency("€", "Euro")));
        countries.add(new Country("Venezuela", "South America", "Caracas", 912_050, 30_502_210, false, 0.68, new Currency("Bs.", "Venezuelan Bolívar")));
        countries.add(new Country("Vietnam", "Asia", "Hanoi", 331_212, 99_467_899, false, 0.71, new Currency("₫", "Vietnamese Dong")));
        countries.add(new Country("Yemen", "Asia", "Sana'a", 527_968, 33_052_504, false, 0.61, new Currency("﷼", "Yemeni Rial")));
        countries.add(new Country("Zambia", "Africa", "Lusaka", 752_612, 19_674_796, false, 0.63, new Currency("ZK", "Zambian Kwacha")));
        countries.add(new Country("Zimbabwe", "Africa", "Harare", 390_757, 16_486_951, false, 0.64, new Currency("$", "Zimbabwean Dollar")));


        return countries;
    }

    public static HashMap<String, Double> generateCurrenciesMap() {
        HashMap<String, Double> map = new HashMap<>();

        map.put("$", 1.0);
        map.put("₹", 84.4);
        map.put("€", 0.9);
        map.put("₽", 17.0);
        map.put("₺", 34.37);
        map.put("¥", 153.72);
        map.put("₪", 3.72);

        return map;
    }
}












