/* Pandoroid Radio - open source pandora.com client for android
 * Copyright (C) 2011  Andrew Regner <andrew@aregner.com>
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

/* 
 * These keys were extracted from the Pithos source code, credited to ZigZagJoe.
 * 
 * Pithos is released under the GNU GPL v3, Copyright (C) 2010 Kevin Mehall <km@kevinmehall.net>
 */

package com.magicbos.pandora;

public final class PandoraKeys {
	public static final long[] out_key_p = {
		0xD8A1A847L, 0xBCDA04F4L, 0x54684D7BL, 0xCDFD2D53L, 0xADAD96BAL, 0x83F7C7D2L,
		0x97A48912L, 0xA9D594ADL, 0x6B4F3733L, 0x0657C13EL, 0xFCAE0687L, 0x700858E4L,
		0x34601911L, 0x2A9DC589L, 0xE3D08D11L, 0x29B2D6ABL, 0xC9657084L, 0xFB5B9AF0L
	};
	
	public static final long[][] out_key_s = {{
		0x4EE44D9DL, 0xCCEEAB0FL, 0xD86488F6L, 0x25FDD9B7L, 0xB0DE3A97L, 0x66EADF2FL,
		0xC0D3DCA4L, 0xEE72A5FAL, 0x54074DECL, 0xCBAD83ADL, 0x4B1771A3L, 0xD92AE545L,
		0xB5FCE937L, 0x26AD96D9L, 0x5D615D68L, 0xF2994B82L, 0xE668D342L, 0x61051D4CL,
		0xCFB29CA4L, 0x8B421D38L, 0xDA3B4EB9L, 0xD92D6A55L, 0xF7D940C7L, 0x99C4BC83L,
		0xAB896E79L, 0x77C7039BL, 0x1215B24AL, 0x0C0EBC0DL, 0xE9F082B2L, 0x6B7DFE9CL,
		0x4A714E76L, 0x91280D88L, 0xA422A361L, 0x3E674D4AL, 0x6EBC2D42L, 0x6838580BL,
		0xBAE461ABL, 0xE8FEDD17L, 0xEFD6E5E0L, 0x690D3E93L, 0x32FADEB0L, 0x1B99EE04L,
		0xBE9FA7D9L, 0x7997DFC6L, 0xFD1B8025L, 0x667B35D8L, 0x2D909996L, 0xFE487FF0L,
		0x628BCFE1L, 0xA534C620L, 0x6644DEFEL, 0x8BF9236DL, 0xE943DD51L, 0xF4615657L,
		0x605D4F80L, 0x2E02FC45L, 0xD924D2D0L, 0xFD4AB9E3L, 0x5AEB18F0L, 0x7A8D7C92L,
		0x6CA40CA6L, 0xD8AD4139L, 0xCA5E7EC2L, 0x69BE3C59L, 0x554A4DD6L, 0xBA474DD1L,
		0xE113576BL, 0xCB89A6BDL, 0xF366EC0CL, 0x876661ABL, 0xD85E5381L, 0x79A93327L,
		0x5A4E5D92L, 0xE3301F23L, 0xF211DD61L, 0x6F0140D0L, 0xDBA134BFL, 0x3C623008L,
		0xD5FCE976L, 0x6EDE648EL, 0x814CF920L, 0xB38878E1L, 0x6232D49CL, 0x2310373BL,
		0xA8C6EBFCL, 0xCD506842L, 0x62BEF441L, 0x1324C803L, 0x69D1F137L, 0x3907EE67L,
		0x47967932L, 0xC3C3F280L, 0xC4B036B9L, 0x5EC264B4L, 0x9484AA3CL, 0x5FEF9C53L,
		0xC1B9030FL, 0xE86C6BBAL, 0x3AE49DAEL, 0xBBAC421CL, 0x54D06D99L, 0xBA13A2B2L,
		0x3132FA87L, 0x2FDDB5E2L, 0x4B751219L, 0x5B59778FL, 0xEFFA2E62L, 0x3BD56164L,
		0xE7EDFC1DL, 0xCF4D5FDBL, 0xC6310BDAL, 0x0CAE8B8FL, 0x53196C2FL, 0xAC951D1FL,
		0x32FD1D71L, 0x7D9D5956L, 0x2EA62C92L, 0x9FA4A4C8L, 0xE491DC41L, 0x7E5F2507L,
		0x4568300FL, 0xF210AAA8L, 0xB6980949L, 0x017405E7L, 0x5EBF3350L, 0x44B863F6L,
		0xDF96854AL, 0xFA8A8390L, 0x342BDFFAL, 0x93096350L, 0xCD0F0083L, 0xBE295FDDL,
		0x549AA9C9L, 0x8554D31BL, 0x2F2FE138L, 0x30E8C78DL, 0xED603733L, 0x4B47F4C2L,
		0x03D481DCL, 0x8BE4479CL, 0x9A307E98L, 0x73CFC5DCL, 0x71DE3DFBL, 0x55DA2605L,
		0x2CC97898L, 0x13F0CC6FL, 0x5F30FEE1L, 0xF65D36D0L, 0x99D05438L, 0xB6A1DF23L,
		0x2EA6EF9BL, 0x12D3A110L, 0xF1C89B1AL, 0x522BAA1FL, 0xE39AC7B3L, 0xAFC153D1L,
		0x2A565274L, 0x51530B46L, 0x1291387DL, 0x15BC2B63L, 0xA73AD01FL, 0x13EBC4A7L,
		0x849583D7L, 0x4A9E1AE6L, 0x430C9A05L, 0xEB2A78FBL, 0xFA3A817DL, 0x6D1D7AE5L,
		0xB99588F5L, 0x6D2C571BL, 0xF975441CL, 0x1348927DL, 0xB069BDE2L, 0x0771A398L,
		0x4B93EDCCL, 0x3C167223L, 0xC3BBCFDFL, 0x40C406DAL, 0x81C867B1L, 0xEB20C3D2L,
		0x2476ED54L, 0xB581F042L, 0x1160A8B8L, 0xBCA1AD0FL, 0xD8F18C9FL, 0x708BC7C6L,
		0x0579D83CL, 0x29BAA2B8L, 0x45B845EEL, 0xA57F5579L, 0xE52E4A8AL, 0x48365478L,
		0xC6CCBFB4L, 0x2F53D280L, 0x8E1FF972L, 0xF4E02067L, 0x3F878869L, 0x5879FF3CL,
		0x1EDFAB0FL, 0xD4FE52E3L, 0x630AC960L, 0xABD69092L, 0xFAA3BF43L, 0xF1CA3317L,
		0x9CFF48D2L, 0x8FE33F83L, 0x260C1DE3L, 0x89DB0B0BL, 0xF127E1E3L, 0x7DA503FFL,
		0x01C9A821L, 0x30573A67L, 0x8A567A2EL, 0xE47B86CFL, 0xB8709ADEL, 0xB19ADD3AL,
		0x46A37074L, 0x134CE184L, 0x1F73191BL, 0xE22B39F6L, 0xE9D35D3DL, 0x996390AFL,
		0xADBBCCDBL, 0xC9312071L, 0xD442107DL, 0x0B50C70AL, 0xB9B6CC8CL, 0x60A51E0EL,
		0xA1076443L, 0x215F1292L, 0x5A53C644L, 0xEA96EA2EL, 0xE9F3B4BCL, 0xBA5F45D2L,
		0x454B65D6L, 0x2CF04D9CL, 0x05EF1D0FL, 0xCD1ABBEEL, 0xE86697B0L, 0xFB92F164L,
		0xEBEDADBFL, 0x69282B8DL, 0x65C91F0DL, 0x6215AB51L, 0x87E7BDF6L, 0xC663D502L,
		0x6EF4864EL, 0xDC3BDCC9L, 0x97184DBBL, 0xCD315EEDL, 0x64001E09L, 0x6F7DE8CEL,
		0x38435D03L, 0x840B5C82L, 0x23CDBC8AL, 0x7FA0D4FBL
		}, {
		0xEBCBE20DL, 0x09FADAECL, 0x98FF9F63L, 0x16D0DFE1L, 0x54B65FA8L, 0x8C58D07CL,
		0xEAACBEA0L, 0xEA8BC5B7L, 0xD343B8EDL, 0x46D416FCL, 0x0247DCBBL, 0x527CA3F5L,
		0x22DAF183L, 0x6684CF7FL, 0xA2D5D9F6L, 0xC507E43BL, 0x7B368AE6L, 0xFC8179ECL,
		0x47E959C4L, 0xDADF15F2L, 0x92E48145L, 0xD9CFA8B3L, 0x94F209E8L, 0x10F93D6DL,
		0x3BAAF7B5L, 0x9E5009B4L, 0xE7E66FD8L, 0x10F6D58FL, 0x1EAFFF4DL, 0x0423FCE5L,
		0xE860C60AL, 0x7713B2B4L, 0x7C5EEF7EL, 0x430801CFL, 0x46613A77L, 0xFADEC916L,
		0x58AB09B3L, 0xEE05C51FL, 0xD4C6331FL, 0x9BCA1941L, 0x15BF041FL, 0xC3B04E8DL,
		0x6CD037AFL, 0x11C81E53L, 0xB38393DFL, 0xB1D07B52L, 0x067D02F7L, 0xA9E5798BL,
		0x4E5C10A6L, 0x790DD862L, 0xDEA21AD1L, 0x3C0C90BFL, 0xB05D8240L, 0xFEA81F59L,
		0x832F19FFL, 0x17190D1CL, 0x03E07FDCL, 0x43A6AEACL, 0xFE0C8A2EL, 0x216813A6L,
		0xF0428728L, 0xC1D21DCFL, 0x54109ACBL, 0x68FB51BBL, 0x3F5AEE69L, 0x557FEA14L,
		0x07965E16L, 0x58E2A204L, 0x6E765B0CL, 0x3B8D920FL, 0xDD712180L, 0xDD0F67CAL,
		0x37F9D475L, 0x91815CCFL, 0xC31A34BBL, 0x8F710EF2L, 0xF2DA2F82L, 0x2A24931BL,
		0x41CFF29FL, 0x16C9BECFL, 0x1AEB93FBL, 0x090DF533L, 0xC10D27B6L, 0xF7EE2303L,
		0xF82A0ED0L, 0x57031132L, 0x88AFF451L, 0x574A8BFFL, 0xF1ACA4F0L, 0xDD556F49L,
		0x90D7CF52L, 0x4BCA4AA3L, 0xC917557CL, 0x4BB6B151L, 0x52CD8251L, 0x7C7ED836L,
		0x3488ED59L, 0xC50C6A0BL, 0x675413EDL, 0x6368583DL, 0x98B61BAEL, 0x1AF59261L,
		0x46590022L, 0xA4C70187L, 0x4658F3EBL, 0x80A61049L, 0x8F120E7AL, 0xBEAC09D8L,
		0x195ACD49L, 0x6BE1DE45L, 0x6EF1E32DL, 0xB8A4B816L, 0xC18758B8L, 0xCA7AD046L,
		0xD475BFE1L, 0xCC3AB8AFL, 0x45AB9AD7L, 0xC37C62ACL, 0x9AAD7E2EL, 0xB9D87862L,
		0x28F3CD26L, 0xA0577A0EL, 0x75859ECEL, 0x4A6E5B86L, 0xE61E36B3L, 0xA00E0CA4L,
		0x3E2CC99CL, 0x581DF442L, 0xCE40B79BL, 0x17BAB635L, 0x73F1C282L, 0x7C009CE0L,
		0x1A8BBC5AL, 0xBBB87ECDL, 0x162ED0ACL, 0x8DB76F5AL, 0xD5AD1234L, 0xD0D7A773L,
		0x41CBDEFBL, 0x7197AFF4L, 0x5C60E777L, 0x5D9141D4L, 0xF43D5211L, 0xA4F064D9L,
		0x40C13CB3L, 0xE9DE900DL, 0xBF733203L, 0xC00F2E89L, 0x095D476FL, 0x277A825DL,
		0x4B6A61D3L, 0xFF857740L, 0xE34705C0L, 0x65F8372CL, 0x497AC161L, 0x1231CA4AL,
		0xFB385036L, 0x24B36150L, 0x6CB9FA2DL, 0xCBAB3399L, 0x3832629EL, 0x1BB815EEL,
		0x6AAA74C7L, 0x8FFA22B8L, 0x64093F28L, 0x973BBA95L, 0x831A8195L, 0x48B2923DL,
		0x9680C36EL, 0x16BA5344L, 0x1F190542L, 0xBCB0DFCCL, 0xCCC24623L, 0xFA503EADL,
		0x7189956CL, 0x80B3C715L, 0xFA9F4685L, 0x36CF833EL, 0x19A53ADFL, 0xA5A4BD79L,
		0x187ADC8DL, 0x8AEFA6B6L, 0xF64FF62AL, 0x88A590BAL, 0xE30C75BEL, 0xA3BFBCC7L,
		0xAC669722L, 0xC4AEAFF2L, 0x822DC5FAL, 0xAA73C1D5L, 0x422EFD93L, 0x946FE915L,
		0xEF623E46L, 0x24395A31L, 0xF28FF488L, 0xB4D7CA7EL, 0x27703504L, 0x9F390B73L,
		0xA6999558L, 0x8AE04A20L, 0xDD6FE7DBL, 0x55963137L, 0xCFEF70BBL, 0x708CA677L,
		0x804CF78BL, 0xD5AC1CA2L, 0x88D7CCFCL, 0x5FE056DFL, 0x25B390EAL, 0x11550845L,
		0x15A58C0BL, 0x7C3530A3L, 0x24550544L, 0xD395EDD0L, 0xEB046782L, 0x7E3CCE71L,
		0x25A8640CL, 0x96A955DEL, 0x4BF7614EL, 0x3014FD08L, 0xE2AC1E2EL, 0x7D3AB3C3L,
		0xB63CB59CL, 0x9E92D401L, 0x859B2C44L, 0x1F893940L, 0xEE81B9BBL, 0x7F430589L,
		0xAF2CC2ECL, 0x0FA273E2L, 0x3E5C6FAAL, 0xE580E6A9L, 0x64D73FE6L, 0xE7C5A28AL,
		0x99B760BCL, 0xC0FCBA71L, 0xDB521C76L, 0xDBC7C1F8L, 0x4968CF63L, 0xD4928D17L,
		0x6DBBCC5FL, 0x681EB668L, 0xC326CEB9L, 0x7C6B0EBBL, 0xF071C193L, 0x5CC6A08CL,
		0xFA4B95EBL, 0x0BED345DL, 0x16854F61L, 0x22ECDDA9L, 0x77335F2DL, 0xCC016EE5L,
		0x4CE1D7F6L, 0x32B1409BL, 0x2197B046L, 0x73CD94F3L
		}, {
		0x56D997EEL, 0x92FA3097L, 0xA1AF0D9DL, 0x11FCBB9CL, 0xA2673993L, 0x3860F1CEL,
		0xB2B70A39L, 0x5BC90183L, 0xBFA62ADCL, 0x58E257F2L, 0xD221A704L, 0x0A876CE4L,
		0xD7B0FCA9L, 0x80D3D874L, 0x696A6CFDL, 0xB989EFF1L, 0xEAA5F132L, 0xA29ECB5DL,
		0x674B7380L, 0x0BAD725FL, 0x59D55508L, 0x8DB40E2AL, 0x003EBD12L, 0x871AD00EL,
		0x7ACE20A9L, 0xE670BA85L, 0x43D53997L, 0x79461049L, 0x806C102BL, 0xB21337BDL,
		0x791483E8L, 0x6ECA44EAL, 0x959CF50DL, 0x8D87166DL, 0xFA939DF8L, 0xB0E519DEL,
		0x8C069B44L, 0x0A47F71AL, 0x8D7AD1CAL, 0x24E6FEDDL, 0xCEF2173EL, 0xB46A57F1L,
		0x9DD9C775L, 0x549B2E5DL, 0x67A37485L, 0x38F7FC18L, 0xA269F5A1L, 0x1B04F14EL,
		0x4550E006L, 0x8F5E0E14L, 0x5EB9992CL, 0x88D780A5L, 0x334FFA1EL, 0x473A75C1L,
		0x9D96E913L, 0x7DB16188L, 0xE699B708L, 0x88D087FAL, 0x06E44D4EL, 0xCB29E519L,
		0x68529AB8L, 0xBC74B1FDL, 0xDA074140L, 0x557B9936L, 0x80BB557EL, 0x42522D24L,
		0x909E967FL, 0x7D578A28L, 0x7F78EBD7L, 0xB793DC4BL, 0x08498F07L, 0x8A77FC08L,
		0xFFFDA0C1L, 0x2ECA4123L, 0xB63861DCL, 0xD909606EL, 0x29A545E4L, 0xB37539D6L,
		0x292FAC93L, 0xBDC6C4F3L, 0xDAC7CE05L, 0x68201C9DL, 0xE08DC67AL, 0xE0FB0327L,
		0x17554D62L, 0x636D9040L, 0x0612D29FL, 0xAF250475L, 0xB8961740L, 0xBE3E4408L,
		0x3AF166E6L, 0x3B16CC87L, 0x2DC77141L, 0x3C874024L, 0x0E409623L, 0xC7576B7AL,
		0x35CAF7DAL, 0x0AA9AED6L, 0x6C5F2CC0L, 0x23AAB90FL, 0x74A41C51L, 0xDAA1B557L,
		0x412EC422L, 0xD9E55CF0L, 0x7F6A804EL, 0x9256A133L, 0xF3FD2639L, 0x42C9A68AL,
		0xB20588E4L, 0x33339C04L, 0xCB9B9300L, 0xCCA198E9L, 0x849A2FFFL, 0xF2B71118L,
		0xD27C41DFL, 0xF1453CD9L, 0xEB94D640L, 0x9CE6A69EL, 0x1561C1BDL, 0x8A8F7E07L,
		0x1FA3989CL, 0x601C3440L, 0x95DE5ED8L, 0xB2F2AE94L, 0x831BA7C3L, 0x6831E3EDL,
		0x5C5C0BD8L, 0x628A0E89L, 0x2726D7A3L, 0x82B6E434L, 0xB729A5C7L, 0x5AB563C2L,
		0xA4119CE6L, 0x4459E404L, 0x0B3E858AL, 0x080C2DF9L, 0x6EBE3FFBL, 0xC1D64BCEL,
		0xB2C90336L, 0x998AE507L, 0xC152879AL, 0x31B99F23L, 0x37769978L, 0xF5C78668L,
		0x2B954114L, 0x54169F1AL, 0xBF9E6E7DL, 0x41BEBC39L, 0x35BC63BDL, 0x77E91F12L,
		0x89909690L, 0xCB17B79DL, 0xCCBF4A25L, 0x3E5E653EL, 0x3B4531F1L, 0x31AF6109L,
		0x027DC03FL, 0x334AE2A7L, 0x8A685A70L, 0xD82C335DL, 0x7D73C193L, 0xF0311C79L,
		0xE8091EAFL, 0x64B12983L, 0x85CEB9A6L, 0x402AB7C9L, 0xA95E4546L, 0x85CE4FD7L,
		0x21968004L, 0x0846E117L, 0xD290B888L, 0xCE2888FCL, 0xE2F318F1L, 0x89B189DDL,
		0x7A2D73BAL, 0xE28937E5L, 0x6D857435L, 0x8A2F05FAL, 0xA19B966FL, 0x37EF297FL,
		0xC50696F5L, 0xA7C3DE1AL, 0x988D3850L, 0x24007793L, 0xB94C792CL, 0x4DA98736L,
		0xA04EB570L, 0x4AA44F84L, 0x7124E7C6L, 0x13B9026EL, 0x27AC2D15L, 0xFBB9AD93L,
		0x2F94AA1CL, 0x98587A3DL, 0x9C9DB996L, 0x7E3487D5L, 0xA819272CL, 0x32AA5E43L,
		0xE0DB72F5L, 0x4DB4853CL, 0x7350C7ECL, 0xB1626C73L, 0x07130A5FL, 0xC3DAA529L,
		0xD6422735L, 0x8559200DL, 0x1046E85CL, 0x326CFB54L, 0xAD42DB6AL, 0xAE4CC364L,
		0xA49F5718L, 0xF472F8A0L, 0x3C002484L, 0x013067BEL, 0xC88A1317L, 0x4C3C209BL,
		0x7CBB8BB3L, 0x41FB8DAFL, 0x236591B3L, 0xDC974A45L, 0x8639E738L, 0x97C38B19L,
		0xD7FF5725L, 0xE7094458L, 0xF28B223FL, 0xF73C878BL, 0x7F7502D9L, 0x52F7FD09L,
		0x4A661B36L, 0x62814D8EL, 0xBBDD1D16L, 0x002598D9L, 0x56B17A84L, 0x87A331B7L,
		0x6C2898C2L, 0xAFCBA795L, 0x4EFEE9AEL, 0xEAE3A4F1L, 0xC3D4D9CDL, 0x5EFD7C32L,
		0xB1B31E64L, 0x95245686L, 0x21A7DA12L, 0x7155E041L, 0x7362B475L, 0x36486BD5L,
		0xA97E5D7CL, 0x8871303BL, 0x93199D52L, 0x246F919EL, 0x5A581359L, 0x6AE746DDL,
		0x3CA9098CL, 0x56DA5714L, 0xAA0B674AL, 0x08C89A5DL
		}, {
		0x7DD47329L, 0xF270A704L, 0x71BF31DAL, 0x3B57772EL, 0xFBE90F4BL, 0x87FC23F6L,
		0xCF413D71L, 0x4FFEA8ECL, 0xEFBA20C2L, 0xEB53E0C1L, 0xFFE7633EL, 0x854E28E8L,
		0xFBFFE904L, 0x8A7841BEL, 0x94E99960L, 0xA3E69064L, 0x365C57ABL, 0xBEE976CCL,
		0x596B94C2L, 0x8C5E90E2L, 0x074B3C54L, 0x89B5E926L, 0xDF192C71L, 0xAF631D85L,
		0x67A8EDECL, 0x24BE4919L, 0x81EB9C8AL, 0xFDB13471L, 0xEE61A4A1L, 0x1EE368DEL,
		0x8C55C255L, 0xD273A000L, 0x12A24DCDL, 0x22A6708EL, 0x6BB4C19AL, 0xF2599FDEL,
		0xE84B8A95L, 0xDD578159L, 0x1F666F1EL, 0x483BBCE2L, 0x46E340BAL, 0x8B7D6490L,
		0xE65BD77DL, 0xA50F2282L, 0x4B455D23L, 0x9B5D486BL, 0x95CEA1A3L, 0x4B7A484AL,
		0x2E16BE82L, 0x096A8E05L, 0x5494AF5EL, 0x1EBA1525L, 0x84FDB773L, 0xD47CE143L,
		0xC1254007L, 0x1CE4CBBEL, 0x8049402DL, 0x114D7B59L, 0x64D760ADL, 0x6AEECE49L,
		0x83DC9867L, 0x36FF9C28L, 0x6FFB709DL, 0xB22F7301L, 0x6E6CAD92L, 0x0001F394L,
		0xB560CDE7L, 0xEA02FDDAL, 0x40609266L, 0x7F599B81L, 0x1B8FD59AL, 0xA562FF5CL,
		0xA01750C6L, 0x78A35114L, 0x789F8094L, 0xF46594B8L, 0xFF3A12BEL, 0x29DDEB50L,
		0xE3CF5A2CL, 0x8E440B20L, 0xBFBF3DD8L, 0x649DB58AL, 0xC48A8A51L, 0x97F139C3L,
		0x0BB07943L, 0x548C90BDL, 0x8153FCF1L, 0x13098DEFL, 0x812EA492L, 0xFC0AC487L,
		0xC5EAE50AL, 0x7A02481BL, 0xC75279D7L, 0x59CBC149L, 0x6AB39416L, 0x39331E1AL,
		0x233BE50BL, 0x7F09C1BDL, 0xECC11E6EL, 0xA6647D03L, 0x06BD33ADL, 0xD717C795L,
		0xE07E2D67L, 0x2688D40BL, 0xE23E349FL, 0x8C7F559EL, 0x3BA698C2L, 0xEB5FCD3CL,
		0xE94E2DE5L, 0x3C0FE4DFL, 0x55454456L, 0x12731019L, 0x21AF58D7L, 0x2555CE03L,
		0x17BBC647L, 0xF0C66012L, 0xE02D87F8L, 0x340DB0CEL, 0x72A3766FL, 0xE2724C51L,
		0x3636A5FDL, 0xC226C419L, 0x1A5F0464L, 0xA543817BL, 0x0B850A8DL, 0xD5A6F88BL,
		0xCE3715B8L, 0xB73918A2L, 0x6AC92E61L, 0x0FCD43EAL, 0xF559EEDEL, 0x3482C340L,
		0x447D9924L, 0xF95D6EB2L, 0xB22E6C6FL, 0x935740D2L, 0x7C04B228L, 0xB90ABD1AL,
		0x8D9D01C9L, 0x43B63B2DL, 0xE0EBEDACL, 0x7C219604L, 0x8479756FL, 0xB67355FEL,
		0xA056539BL, 0xAF1D5A02L, 0x6660BB07L, 0xD1A0593CL, 0x5AABEF47L, 0x73802FC5L,
		0xAADB5251L, 0x92556CFFL, 0x5BF44BDCL, 0x4DC171CFL, 0x1EE4E879L, 0x516BC896L,
		0xCDBB21EAL, 0xF513BD04L, 0x94267720L, 0x6B29DAC1L, 0x1D778D67L, 0x9625EA42L,
		0x23946BBCL, 0xF23D2E0AL, 0x001C2CFBL, 0xEF121203L, 0x963A0C2BL, 0x1AAE960BL,
		0x13F2D588L, 0xAE6BFEAEL, 0x77424AC8L, 0x1E0B2A9FL, 0x9074C626L, 0x9BCDE764L,
		0xF8539561L, 0xC14A5B05L, 0xD88D9FAEL, 0x2C5C4C67L, 0x2C63BAE5L, 0x99CCF4CBL,
		0x3563CA53L, 0x0CE7A114L, 0xCB8938D3L, 0x7C61537FL, 0xE717A35EL, 0xB69D3832L,
		0xE47931C3L, 0xD5C9D409L, 0x355E0B97L, 0xC60EB27EL, 0xB17978F6L, 0x77CCBCEAL,
		0x85AEFA12L, 0x59DFA376L, 0x36DB61D2L, 0x96832915L, 0xCC4411F3L, 0xB81F1EF9L,
		0x2C54E5E1L, 0xDD3CE944L, 0x02D92E29L, 0x1D4795B1L, 0x27F900B0L, 0x97A516CCL,
		0xA2DB2CC8L, 0x3125B863L, 0xBF44DC77L, 0x211A0226L, 0x3A98AB5FL, 0x2612396EL,
		0xA1BEF080L, 0x708B7433L, 0x5D457230L, 0xED03C4EBL, 0xA84D73AEL, 0x89D5582DL,
		0x95F0C7FAL, 0xEF51B8C9L, 0xF9DCA97DL, 0xCB2E49FDL, 0xC12B4ADDL, 0x611C9AD5L,
		0x35D1D7CEL, 0xA77E13BEL, 0x207C1B88L, 0x0AC289D4L, 0x4B553B81L, 0x4940991AL,
		0x23D9F9D5L, 0xDFD93925L, 0xB924E9D2L, 0xBFA61D10L, 0x861FDF0FL, 0xBBD30811L,
		0x953CE5DAL, 0x92B48334L, 0x5E5B44FCL, 0x5B949533L, 0x31A5D165L, 0x99339641L,
		0x2737671FL, 0x512EB25CL, 0x54408346L, 0xA090A7FEL, 0x1D9CA5F9L, 0x470C19E4L,
		0x720F936EL, 0xA8628453L, 0x364D29CCL, 0x42E472DFL, 0x54949196L, 0x6C7C46EAL,
		0x12797418L, 0x7D775295L, 0xC46A7C32L, 0x69CE8560L
	}};
	
	public static final long[] in_key_p = {
		0x71207091L, 0x64EC5FDFL, 0xA519DC17L, 0x19146AB7L, 0x18DF87E7L, 0x98377B97L,
		0x032887B7L, 0xC7A310D5L, 0xA506E589L, 0xE97346B9L, 0xE3AA5B39L, 0x0261BB1DL,
		0x466DDC6DL, 0xDEF661FFL, 0xCD257710L, 0xE50A5901L, 0x191CFE2EL, 0x16AF68DDL
	};
	
	public static final long[][] in_key_s = {{
		0x53B04195L, 0x34D8664FL, 0x564FA6F9L, 0x943A4261L, 0x43EE3112L, 0x2FBC9B61L,
		0x31C92B2FL, 0x5F23E485L, 0x1D51F5AEL, 0x45589853L, 0xEC79BEF5L, 0x64E56904L,
		0xD2B94FB8L, 0x12ECF786L, 0x39FBB15CL, 0xADC822DFL, 0xF63EB8D0L, 0x707E6E03L,
		0xC9EE963BL, 0xAF4C533BL, 0xB6CA295DL, 0x669EC8F6L, 0x5B2128DAL, 0xCDCC7042L,
		0xECE8EA68L, 0xB6564227L, 0x042D1DE9L, 0xA7BB4D38L, 0x702AF25DL, 0x04218195L,
		0xDA5DBB60L, 0x05776188L, 0xE6FB54D4L, 0xD0D273F3L, 0xF498395CL, 0xD2FFAA63L,
		0x2ECC5F00L, 0x9B785AABL, 0xE88DF10EL, 0x46A5C5A7L, 0xCB05BAF6L, 0x93D07466L,
		0xFD82EB2FL, 0x29C7525CL, 0x88151216L, 0x7FEA6803L, 0x79AF1507L, 0xABEEF999L,
		0x2C338D91L, 0x8BDC112DL, 0xAE639DF1L, 0x3395771DL, 0xE5D05978L, 0x985DFBCEL,
		0x7A33712CL, 0x77EE0800L, 0x6A3235A7L, 0xAD25178AL, 0x5DEAB99CL, 0xA518351EL,
		0xE191C29CL, 0x8F58F7B5L, 0x8F59301AL, 0x230D7717L, 0x36480929L, 0xE7389FA5L,
		0x75101209L, 0xCC80D6EAL, 0x20A77201L, 0xDF34CC7FL, 0xDD0D15ECL, 0xAAD39BD7L,
		0xE148C1C8L, 0x60053D1EL, 0xA765BBAAL, 0x055A807EL, 0x243EF591L, 0x3BC6A318L,
		0x86B4E2A8L, 0x36068D06L, 0x8E38E7EDL, 0xF6EF1C43L, 0x4BC12D1CL, 0xEE5CD4DEL,
		0xA5635E1FL, 0x4EA7103FL, 0xE37CC2D5L, 0xAA24D152L, 0xC10D25A1L, 0xB5A4B1DDL,
		0x38A0E8AFL, 0xC2E96D92L, 0xC537DB8CL, 0xFB00FD39L, 0x96D3E31FL, 0x1587D1D5L,
		0x3D3C6162L, 0x116E9A21L, 0x5E73A15AL, 0xFB1207F6L, 0x205C8CE6L, 0xCD2EB8F4L,
		0xBF2D8E53L, 0xC00799B6L, 0x05AB657AL, 0x5A337660L, 0x13F66753L, 0x769969FFL,
		0x112E9892L, 0xE900968FL, 0xC09E5462L, 0xF83D1DCDL, 0xCE8730EEL, 0xB8A9F537L,
		0x7D4A07F9L, 0xE885BB2AL, 0x6CAE2932L, 0x959FF20BL, 0x266FF5A7L, 0xD2465D75L,
		0x20BA50CDL, 0x3DADB44AL, 0xE72D39EEL, 0x1B3D759EL, 0x4F537258L, 0x0F403950L,
		0xE7F64B2CL, 0xE033D524L, 0x07FF6009L, 0x2C8270B2L, 0x6AA43085L, 0x56659DE5L,
		0x2082EA85L, 0x3D347FABL, 0x2C903DF5L, 0xE7B54B39L, 0xAAD7B6F3L, 0x10BDF5DFL,
		0x9F8405F8L, 0x74635701L, 0xBBC945A3L, 0xEF0F67C2L, 0x8ECFE353L, 0xC47947D4L,
		0xCB638932L, 0xE0DFD27DL, 0x390ECFF3L, 0x329941FFL, 0xB7B8B2E1L, 0x96129843L,
		0x6D487C00L, 0xF7A31803L, 0xEFD5F48DL, 0x144881D4L, 0x82C99F97L, 0x3CA6233CL,
		0x5D81D880L, 0x5452C86EL, 0x92F7424BL, 0x1ABF8230L, 0x2B9D844EL, 0x53151082L,
		0xFFDB3720L, 0x5398D8CEL, 0xD2B1DB66L, 0x637FEEDFL, 0x0C281873L, 0x0D5B080FL,
		0x1CC84819L, 0xA9C6416EL, 0x0CBD6FA2L, 0x5D311F65L, 0x1B10E4AAL, 0x862EFCE7L,
		0xB82B8EA1L, 0x2C6FCB4DL, 0x48197672L, 0x4DE9F5A1L, 0x189A1587L, 0x11B82778L,
		0xDF0620A2L, 0x8F9EB547L, 0x0C42BC08L, 0xEF386B9BL, 0x2882BA91L, 0x5CB16824L,
		0x95B04228L, 0x0A84C744L, 0x4A4F12F1L, 0x3328121DL, 0x099D0C58L, 0x9FFE4330L,
		0x53676878L, 0x0F4BFE6DL, 0xF7F6757AL, 0x849E6A1FL, 0xE7F305AFL, 0xABE5CF0AL,
		0xD4C73D1FL, 0xEC1BA28AL, 0xDF481C60L, 0x3A0169E9L, 0x644F5F06L, 0x74A03899L,
		0x2E1CC42AL, 0xBF181E7AL, 0xBFD031DFL, 0xA8F9BFADL, 0xB08FF9BCL, 0x07F040A6L,
		0x9AA8240DL, 0x936730A6L, 0x4B659CAEL, 0x70792DFFL, 0x50738D93L, 0x2E02F9DFL,
		0x01F6AA81L, 0xAA5557E6L, 0xF5DF588EL, 0x70D3217BL, 0xBFD2CF2CL, 0x6193A8BCL,
		0x4C1D0DADL, 0x8E626F01L, 0x878B8F70L, 0x422B5FECL, 0x77A5D368L, 0x9C5A4A84L,
		0x31260B03L, 0xA00A2738L, 0xFE1A531CL, 0x8D268013L, 0x926D9087L, 0x66CCC472L,
		0xA0E6BC5DL, 0x72B4806CL, 0xD75EC86EL, 0xE2AA9D6CL, 0x5F8DD394L, 0x70C92981L,
		0x32578C75L, 0x2E110E4FL, 0x20F0883FL, 0x505740F5L, 0xD52B76F7L, 0x4C087E4FL,
		0x6D6455EEL, 0x2E9E895FL, 0xD826A8C3L, 0x032152E6L, 0xE3BCD79DL, 0xBA6796AAL,
		0xE1F2CC8DL, 0x61A70735L, 0x581A8A85L, 0xFF4A937FL
		}, {
		0xCBD350B6L, 0x04217557L, 0x0B48BEDEL, 0x87D87806L, 0xE78282F6L, 0x1518E761L,
		0xD0242D75L, 0xFEE8A656L, 0xE1EF119CL, 0x465D0A5FL, 0x8627A798L, 0xB2589459L,
		0x6A8BF4D2L, 0xAEF2E605L, 0x22354462L, 0xA3B5DE00L, 0xC40086BEL, 0xAB4FA4FAL,
		0xD7C782A4L, 0x095003F7L, 0x76550A91L, 0x51D742A6L, 0xE6B1868CL, 0x7A2E891BL,
		0x32C24C32L, 0xB71EB54EL, 0x58F1F230L, 0x2C73427BL, 0x6CAF2DB1L, 0x6E65848BL,
		0x202FCC18L, 0x782E5C7AL, 0xCC37A03BL, 0xE1D9FD4DL, 0xBA8CEBE8L, 0xBA5D7E12L,
		0xE37E60F3L, 0x99CA41AEL, 0xB70F141AL, 0x3399E5E6L, 0x6F168416L, 0xD9FCCDFDL,
		0xE0149EF0L, 0x6632458EL, 0x192C72C2L, 0xBB37A8D4L, 0x4DEB6CFAL, 0x1D65E9BEL,
		0x9F47349DL, 0xB44857CCL, 0xEE4EBB41L, 0x5571F80AL, 0x7060121AL, 0x1863AAE5L,
		0x89E44DA0L, 0xA8AB709BL, 0xC8B0D49EL, 0x7A0A4DADL, 0x53BF4EBDL, 0xF52C4C3CL,
		0x13E00197L, 0xF5C748EAL, 0x01993E7AL, 0xCBEDF34FL, 0xC5A6B7BCL, 0xCEF7AFD4L,
		0xFF554458L, 0xB381FB5FL, 0x13B4B32CL, 0x4E7E2A88L, 0x5015434FL, 0x977B5E72L,
		0x595037D5L, 0xAA9914EEL, 0xE48ECD4AL, 0xB5933128L, 0x819BC797L, 0x1FDA1451L,
		0x7E246FD0L, 0x70AE3F82L, 0x3ABEBFE4L, 0xE89BA94AL, 0x0F8BA57FL, 0xAD2EDFD1L,
		0x71C248D1L, 0xDE31588BL, 0x9058ACB8L, 0x1D811B61L, 0x6A459746L, 0x75698B77L,
		0x06C5291AL, 0xC4FDC707L, 0x3412F7A2L, 0xA11D2CB7L, 0x771C35D9L, 0xFB5252B9L,
		0x8ADCC6BBL, 0xACFDB11FL, 0xA53D102EL, 0x3BDD6B7AL, 0x7242DFBCL, 0x600EAF36L,
		0x55399BD7L, 0x5C52D902L, 0xE6D5A548L, 0xE3599A58L, 0xE98182B0L, 0x748C0C18L,
		0x4B2BEE05L, 0xCC531DD8L, 0xA3231F8CL, 0x8FD29390L, 0xFD8C43FBL, 0x7E221049L,
		0xCD489DEFL, 0x2312C991L, 0x55633208L, 0x3514163FL, 0xAB3BEE59L, 0x77FFAA7BL,
		0x90915A4CL, 0x213FF94AL, 0x3CCD3F06L, 0x574DF4E9L, 0x256EE273L, 0xB9FEE691L,
		0x979A0F80L, 0xFBA4876DL, 0xCA3448B8L, 0x9A05788EL, 0x01817985L, 0xFDC95285L,
		0x64FDABDDL, 0x7E8EFF2EL, 0xC9F8DFB0L, 0x3585290FL, 0xA359E9CDL, 0xE7361ACEL,
		0x0F05DE97L, 0xA84A949FL, 0x816F79D1L, 0x80053F79L, 0xF3ED1531L, 0x0077675EL,
		0xAA407D1CL, 0xA905EC4EL, 0xB5031A49L, 0xF7840308L, 0x1749068CL, 0xE7B994B4L,
		0x7963F746L, 0xF8D6832EL, 0xF2C43B73L, 0x0C858859L, 0x8ACA9FDFL, 0xA980B080L,
		0x2DA83BA8L, 0x88A9E6FEL, 0xA1D65DCAL, 0xB7466978L, 0x1C7579D5L, 0xA3E829E7L,
		0xA038A762L, 0x2E6CFC22L, 0x80A3C2DDL, 0x6FB505A2L, 0x40A809C9L, 0x45A1345AL,
		0xCA1FED04L, 0x623F44F9L, 0xBCECFD8CL, 0xBC1EA3D8L, 0x3CFA9C4EL, 0xC3F84B71L,
		0x245EADC3L, 0x0635934DL, 0xFD115EF2L, 0xE6A29E9DL, 0x3B135A32L, 0x54316287L,
		0x6427B2DDL, 0x9A58AD8AL, 0x18C4F685L, 0x0BCF5559L, 0x1F937C1CL, 0xF7EBADE2L,
		0xBB6D1EFCL, 0x5EC3076EL, 0xB330C228L, 0xFB630B27L, 0xBA582D2DL, 0x6810A8D0L,
		0x93426874L, 0x2CF4EB4DL, 0xBC650CDDL, 0x6DE2A493L, 0x7FE6B0FBL, 0xF251E5DBL,
		0x6F12D6BEL, 0xC6BA7485L, 0x5F419C45L, 0x22B0F07CL, 0x92EDDB3CL, 0xF169D257L,
		0x32663AE2L, 0x04B74EA2L, 0xC8A37378L, 0x0652BC72L, 0xB402FDC7L, 0xDF7F8268L,
		0x44030F03L, 0xAF3FD392L, 0x5491C194L, 0xB85DB9CEL, 0xD651CA8FL, 0x1255050CL,
		0xC29846CAL, 0x4C839D32L, 0x3F5B7E14L, 0x2A877586L, 0xF98A241EL, 0x9E293240L,
		0xA1FDEAAFL, 0x20A30A8CL, 0x1CBD8053L, 0x34F51B81L, 0x2385CD90L, 0x96AA3920L,
		0xF5E2BE30L, 0x49336625L, 0x8D8C7CACL, 0xE218E266L, 0x140AFB4BL, 0xE3716DCEL,
		0xC78D4357L, 0xC7A08538L, 0x012D82CCL, 0xAE079F67L, 0x1FC97F4DL, 0x13B82CF6L,
		0xA450A8F9L, 0x3EF2B891L, 0x37016870L, 0x85837D47L, 0x9E0554B9L, 0x5E250425L,
		0x924D3CF5L, 0x1AA84C00L, 0x27B42F8CL, 0x49023610L, 0xA7B73B7BL, 0x62C8BCFDL,
		0x3631472DL, 0x0E33D2D6L, 0x0A0B4B0AL, 0x6A2556C3L
		}, {
		0xD13723BFL, 0x9414C5A7L, 0x67FFF98AL, 0x01945128L, 0xD037928CL, 0xDEC7C303L,
		0x5EBD36ACL, 0x5C905BCBL, 0x020B6426L, 0xB7C9C54DL, 0x8613F926L, 0x1FEC9118L,
		0x51A1AA61L, 0x16BA1018L, 0x68338FC2L, 0x5542A1EDL, 0x8063E942L, 0x8BAE40A2L,
		0x1C5D6954L, 0xA463AC5DL, 0x3C301ED8L, 0x4F4B860AL, 0x6EE45E7CL, 0xD462EE68L,
		0xDFA82F0EL, 0x763EB7CFL, 0x78335FBCL, 0x95EED064L, 0xFB2F79D6L, 0xECAA236AL,
		0x59459EAEL, 0x233D236AL, 0x4DB2900AL, 0x8B9D5EB4L, 0x0F21ABB6L, 0xFA27F2B1L,
		0xA4A6FA51L, 0x4653FD21L, 0x93E9C526L, 0xCCCB341BL, 0x1F66711AL, 0x68E054BEL,
		0x7204FD43L, 0x689E8AC0L, 0x12302D1BL, 0x96D11239L, 0xB3DA833AL, 0xCA15D14EL,
		0x80D4798BL, 0xB6465C4DL, 0xDAAD50A1L, 0x9FD6B95EL, 0x1B4EFECBL, 0xEA61AA1CL,
		0x18AD77FAL, 0x5A736118L, 0x511A3385L, 0xD5D92A85L, 0xB957043EL, 0xAA3554A6L,
		0xFB571DF0L, 0x305A86FEL, 0x240E4572L, 0x80DEFE96L, 0x2888F5CCL, 0x5272DAE5L,
		0x1A283749L, 0x0DF5E014L, 0x1F6F2F7DL, 0x292C1DC7L, 0xC72ED514L, 0x59E99AE5L,
		0x0C4FDE67L, 0xE30B2643L, 0x24C12F6AL, 0x4C9B0BFCL, 0xA78F1A03L, 0x0036C1DFL,
		0x913B7309L, 0x7FDE5A89L, 0xFFC9D504L, 0x9F7C42DBL, 0x8BE84B2AL, 0x588BBCFAL,
		0x872C26E7L, 0xA3BC8F41L, 0x5B1160B4L, 0x239B30E4L, 0xB2DD5494L, 0xE337530FL,
		0xF113CD33L, 0xEADC8DDFL, 0xFF339D9FL, 0x71F15A7DL, 0x5973E16BL, 0x5A4D3F0AL,
		0x28656238L, 0x0EB676E9L, 0x5533A9A2L, 0x07EAF535L, 0x5C271A91L, 0xDAFA35CFL,
		0x8C0C4E34L, 0xB2D15020L, 0xA9CEAF93L, 0x271157B4L, 0x41B88963L, 0x88EA0624L,
		0x94400C7CL, 0x650DCD70L, 0xBAF8C4DFL, 0x13DC1789L, 0x0040522BL, 0x13E1D0C1L,
		0x80C2C55CL, 0x4C22B92BL, 0xC9BDFD2CL, 0xAB74AB27L, 0xAEAF6AD8L, 0xA2A5E893L,
		0x10A9000DL, 0xDFE44794L, 0xF94F9FA0L, 0xFC7316A5L, 0x7B967375L, 0x0114700DL,
		0xABFC7363L, 0x09CB8915L, 0xB96C9B3AL, 0xE95142BDL, 0x1B632A21L, 0x57A66288L,
		0x80B22AADL, 0xC276DBCCL, 0x8C38D035L, 0xB5AEC8CEL, 0x4150EB32L, 0xE8FE1512L,
		0x184FE503L, 0xC66A57A9L, 0x25992BF4L, 0x746F8100L, 0xC7790E91L, 0xE8988227L,
		0x626C1812L, 0xAA60037CL, 0x43997BEAL, 0x9508A877L, 0x5AE80E46L, 0xDE2758FFL,
		0xF7E89EEEL, 0x0EE387D6L, 0xD763F872L, 0x97D7F238L, 0x910882D5L, 0x6754994BL,
		0x436C7433L, 0x93210B5AL, 0xCC33EBF7L, 0xC530B930L, 0x5DA8B772L, 0x325DEC23L,
		0x4599CC7BL, 0x458591CCL, 0x5A49130AL, 0xB87F80DCL, 0x708208CEL, 0xE4B6033FL,
		0xAFE91366L, 0xCBAB3EF2L, 0x718B84B8L, 0x60859C5EL, 0x50701AECL, 0x05E2CA48L,
		0xB2BFCDB8L, 0xFD47C881L, 0xB18ECC02L, 0xF8AABC72L, 0x0ABD654BL, 0x1A6602C0L,
		0xFFFBCED7L, 0xDA627448L, 0x67E0590AL, 0x3B1952D9L, 0x4C0A32FBL, 0xE9F0507CL,
		0x830699D6L, 0xCF481E29L, 0x3FEC6807L, 0x18CB4E71L, 0x6CAC5839L, 0x592E5FD5L,
		0x1A2B1DA2L, 0xA104840FL, 0xE2B4A352L, 0xAA202DF2L, 0xC1E3D837L, 0x4DA02F3AL,
		0xB8AE3EE2L, 0xBAF2AD8FL, 0x60A0A49CL, 0x03A08BA2L, 0x3C7613FCL, 0xC42B5AA7L,
		0xFB799A04L, 0x3FC12E4FL, 0xE2F8881AL, 0x854B6F93L, 0x732EB662L, 0xF04CB10DL,
		0x3BBDFD40L, 0x9B1F08BDL, 0x679E054CL, 0x5A5C81B9L, 0x42EEF45AL, 0xE1CAC282L,
		0x8E057351L, 0x618F3140L, 0x2B4EB7BEL, 0x7C0B4416L, 0xD67CF521L, 0x61B12968L,
		0x12454732L, 0x09E117B5L, 0x427F05E2L, 0x151256A0L, 0xD4DE1087L, 0x610F2E55L,
		0x0703EDE6L, 0xD984D328L, 0x3F349754L, 0x76E7FB05L, 0x8C339292L, 0x1C7B2C00L,
		0xEAD34339L, 0xEED62B3BL, 0x8AD430DEL, 0x56977BEEL, 0xC73DB96BL, 0x74ECF426L,
		0xEC27F20AL, 0xD250B1B3L, 0xD1DB7436L, 0xBADF98FBL, 0xB5DBF4B7L, 0xC87589C2L,
		0xD634D942L, 0xB5A2FEF4L, 0x7FD6F13BL, 0xB89DA34DL, 0x9FC14AFCL, 0x733563D4L,
		0xCEE0EE6AL, 0x5699CCBEL, 0xD684349CL, 0xFD2CCCECL
		}, {
		0x9CE989E5L, 0x27A0CB56L, 0x02E00928L, 0xABBA6B68L, 0xD721FCCFL, 0xA696A7B7L,
		0x36CE1D63L, 0x9B4287D7L, 0x390743D1L, 0x69F6BB36L, 0x93D521C5L, 0x44D162ADL,
		0xE0070AA9L, 0x5FB59DC6L, 0x19542E39L, 0x26F788BEL, 0x75FE89D6L, 0x0C80CFCBL,
		0x0540DC8CL, 0xFA54F755L, 0xF773FC82L, 0xA35D570AL, 0xC5723322L, 0x25EF7BDEL,
		0x87F8E80AL, 0x946960D7L, 0x1ADBD76BL, 0x750C1AF9L, 0x0360C46BL, 0x8446D2A9L,
		0xC9202B06L, 0x278C843AL, 0x5DA07CCFL, 0x2245D4AAL, 0x93DFF522L, 0x192AAAEFL,
		0x9CDE5DD9L, 0x3D9794C2L, 0xF3E16F90L, 0x36CCC653L, 0xF16949C0L, 0xD8554E88L,
		0x5824EC8EL, 0xE311AAE5L, 0xFDBC7A0DL, 0x10F4AD37L, 0xF468F494L, 0x4E4F819DL,
		0x3F9E57EAL, 0xE43EC4ADL, 0x871F2076L, 0x4ADDB4F1L, 0xE8E299B3L, 0x7C0A1836L,
		0x941F36A1L, 0x35457B0FL, 0x39470AECL, 0x9A5B504BL, 0x4BB2F6F8L, 0xF6DE598BL,
		0x8CFEC07FL, 0x4548D4BFL, 0xD41E0229L, 0x3F2A12F7L, 0x1AF19BD5L, 0x644175B5L,
		0xA4CA85FCL, 0x49276FD6L, 0xF62A4D52L, 0x210A6846L, 0xBB56CCC3L, 0x031158B2L,
		0x4DC62335L, 0x10FFA10EL, 0xF055BCEFL, 0xC5AA7928L, 0x1434F73CL, 0x2A43ECA8L,
		0x842132ACL, 0xD562AD21L, 0xD5CEC47CL, 0x1B691AB0L, 0x42767035L, 0x13BA59C9L,
		0x29AF3D75L, 0xB39E2850L, 0x31D492A5L, 0x7D9E2352L, 0x6AF923E1L, 0x3BE1D419L,
		0x16158A7EL, 0x44EF7376L, 0x2EE3C6C1L, 0x8D352616L, 0x9CB629BAL, 0x6208B9ADL,
		0x0B631F69L, 0x8F571F32L, 0xB0D68B0CL, 0xCDFAD3A0L, 0xC80875FEL, 0x59E9602FL,
		0x51F6B69AL, 0x1D409455L, 0x61FDB55CL, 0xCE3720E3L, 0x137DE790L, 0x8B04FC1BL,
		0xC19CE38AL, 0xB29D90F9L, 0xD3593524L, 0x1627951CL, 0x5C11A5DEL, 0xAF94409BL,
		0xC832B671L, 0x32B72AE3L, 0xBA6BB680L, 0xA12ACF8AL, 0xE4A9D43FL, 0x107B81B9L,
		0x53B1B9D5L, 0x8DA00BB9L, 0x2C148921L, 0x151EC1A6L, 0xD768ECCDL, 0x436855B7L,
		0x8E33A334L, 0xEBB502A1L, 0x2ECCD157L, 0x39F958F6L, 0x9A325E5BL, 0xDAEE53FEL,
		0x0278EC16L, 0xADDE5BFBL, 0x9248885DL, 0x413218E1L, 0x1C63F37EL, 0x4D0C747CL,
		0x9135BAF4L, 0xD86EEEEDL, 0x73D431C5L, 0x28328C16L, 0x6BCF2229L, 0x46DCDB0DL,
		0xDF1A50DCL, 0x9860C3ACL, 0x708CD67DL, 0xF6872403L, 0x522D6E98L, 0xE6CEA50FL,
		0xAAC9DC07L, 0xD5605E8DL, 0xE56E2CA7L, 0x47FD227DL, 0xF8210DDDL, 0x0F3F974CL,
		0x062E6E11L, 0x4EFF4F43L, 0xA61945E3L, 0xED59FF50L, 0x6094DBEDL, 0x70383AE0L,
		0xE2B55F47L, 0x81212B70L, 0xD47B4D3DL, 0x727BFD92L, 0x607A07ECL, 0xEE4AA97BL,
		0xFE9FCC26L, 0xBB2FEEA4L, 0x31C4E4CCL, 0xA06ACF19L, 0xD7A8A983L, 0xC7A038EAL,
		0xBC89CB3CL, 0x58C63BF6L, 0xC60A7E0DL, 0x1DC2A9DFL, 0x5F7C8278L, 0x616B32FAL,
		0x3475A5E2L, 0x608A8F4CL, 0x7EC19DD7L, 0x0CD2C716L, 0xAE46828EL, 0xE53B17FAL,
		0xF5A4AD4DL, 0x0B1290AEL, 0x5C6E74D3L, 0x866D7316L, 0x39054DF1L, 0xA2A818BBL,
		0x42D6C33AL, 0xB6FEC0F2L, 0xA1D3B572L, 0x6F48AD3EL, 0x6144A64AL, 0x7BF86B73L,
		0x0E444BC4L, 0x9AD01D4AL, 0x43C3C4EBL, 0x9D518FCDL, 0x1CE1B720L, 0xAD579F70L,
		0xB2EECB4FL, 0x9502AFC7L, 0xEBC647A0L, 0xB7FA1B5CL, 0x3ACC4F6EL, 0x047E7148L,
		0x496E7AC9L, 0x7F136464L, 0x41C36E76L, 0xCC38CB5EL, 0xB24F9444L, 0x2E95E3B1L,
		0xDE7DE530L, 0xCDCA74C3L, 0x044AA504L, 0xFA4B351FL, 0xFBC33DA2L, 0x14FB5DACL,
		0x179B39C8L, 0xBD4A85E1L, 0x3EFAAD11L, 0x2C2C6F71L, 0xE92A32C4L, 0x76B6C150L,
		0xE1FE212CL, 0xF38FD4CFL, 0x268C35D9L, 0xEDB03308L, 0x7B8E2CB5L, 0xB3706839L,
		0x8144E420L, 0xF6CECF27L, 0x0DE5225DL, 0x5D40CD54L, 0x8B42965CL, 0x7295E976L,
		0x844D6827L, 0x881E23DFL, 0x964A45F1L, 0x528E84E8L, 0x57DA399FL, 0xD7903C7AL,
		0x78B0FEE1L, 0xB8D3A5D7L, 0x2C9A9DE1L, 0x4D73B1FDL, 0xE3558381L, 0x8B0434E1L,
		0xBF918EBCL, 0x7248BC30L, 0xA19E9B98L, 0x128E7B36L
	}};
}

