package works.ryo.app.mandarinvocabulary

import java.util.*

class VocabBook {
    // Properties - characteristics of the objects
    val vocabs = arrayOf(
            "....的話	.... Dehuà",
            "...還是...	... Háishì...",
            "安靜	ānjìng",
            "八顆蘋果	bā kē píngguǒ",
            "把＋object＋action	bǎ +object+action",
            "半夜	bànyè",
            "別墅	biéshù",
            "冰箱	bīngxiāng",
            "玻璃	bōlí",
            "茶水間	cháshuǐ jiān",
            "吵	Chǎo",
            "沖繩	chōngshéng",
            "出來	chūlái",
            "出去	chūqù",
            "出租車	chūzū chē",
            "廚房	chúfáng",
            "廚房	chúfáng",
            "窗戶	chuānghù",
            "吹	chuī",
            "大拇指	dà mǔzhǐ",
            "單板	dān bǎn",
            "彈	dàn",
            "彈吉他	tán jítā",
            "彈三線	dàn sānxiàn",
            "地下室	dìxiàshì",
            "第三格	dì sān gé",
            "丟	diū",
            "丟到地上	diū dào dìshàng",
            "冬天	dōngtiān",
            "冬天吹北風	dōngtiān chuī běifēng",
            "動物	dòngwù",
            "毒	dú",
            "蹲	dūn",
            "俄羅斯	Èluósī",
            "飯廳	fàntīng",
            "房間	fángjiān",
            "房子	fángzi",
            "房子	fángzi",
            "放	fàng",
            "放下來	fàngxià lái",
            "伏特加	fútèjiā",
            "附近	fùjìn",
            "高速鐵路	gāosù tiělù",
            "高鐵	gāotiě",
            "高中	gāozhōng",
            "格	gé",
            "隔音	géyīn",
            "根	gēn",
            "公尺	gōng chǐ",
            "公寓	gōngyù",
            "古漢語	gǔ hànyǔ",
            "跪	guì",
            "國中	guózhōng",
            "過來	guòlái",
            "過去	guòqù",
            "漢字	hànzì",
            "合板	hébǎn",
            "後面	hòumiàn",
            "後退	hòutuì",
            "壞掉了	huài diàole",
            "回來	huílái",
            "回去	huíqù",
            "火車	huǒchē",
            "或是...	Huò shì...",
            "吉他	jítā",
            "計程車	jìchéngchē",
            "家人	jiārén",
            "肩膀	jiānbǎng",
            "撿	jiǎn",
            "撿起來	jiǎn qǐlái",
            "腳	jiǎo",
            "金屬	jīnshǔ",
            "進	jìn",
            "進步	jìnbù",
            "進來	jìnlái",
            "進去	jìnqù",
            "進一步	jìnyībù",
            "久	jiǔ",
            "酒	jiǔ",
            "酒精飲料	jiǔjīng yǐnliào",
            "就	jiù",
            "就是	jiùshì",
            "舉	jǔ",
            "舉起來	jǔ qǐlái",
            "舉起手	jǔ qǐ shǒu",
            "舉手	jǔ shǒu",
            "咖啡機	kāfēi jī",
            "咖啡因	kāfēi yīn",
            "烤箱	kǎoxiāng",
            "靠	kào",
            "顆	kē",
            "可愛	kě'ài",
            "可怕	kěpà",
            "客廳	kètīng",
            "快快地	kuài kuài de",
            "快快地站起來	kuài kuài de zhàn qǐlái",
            "快快地轉	kuài kuài de zhuǎn",
            "垃圾	lèsè",
            "垃圾桶	lèsè tǒng",
            "來	lái",
            "蘭姆酒	lán mǔ jiǔ",
            "爛掉了	làn diàole",
            "樂器	yuèqì",
            "李登輝	lǐdēnghuī",
            "裡面	lǐmiàn",
            "兩層樓	liǎng céng lóu",
            "六條絃	liù tiáo xián",
            "馬鈴薯	mǎlíngshǔ",
            "馬鈴薯可以放很久	mǎlíngshǔ kěyǐ fàng hěnjiǔ",
            "馬鈴薯有毒	mǎlíngshǔ yǒudú",
            "買房子	mǎi fángzi",
            "慢慢地	màn màn de",
            "慢慢地跑	màn màn de pǎo",
            "慢慢地轉	màn màn de zhuàn",
            "慢慢地走	màn màn de zǒu",
            "慢慢地坐下	màn màn de zuò xià",
            "芒果沒辦法放很久	mángguǒ méi bànfǎ fàng hěnjiǔ",
            "木頭	mùtou",
            "拿	Ná",
            "哪裡	nǎlǐ",
            "南美洲	nán měizhōu",
            "你坐在椅子上。",
            "怕	pà",
            "怕鬼	pà guǐ",
            "怕黑	pà hēi",
            "怕老鼠	pà lǎoshǔ",
            "怕台灣的公車	pà táiwān de gōngchē",
            "旁邊	pángbiān",
            "跑	pǎo",
            "皮	pí",
            "七星山	qīxīng shān",
            "氣泡水	qìpào shuǐ",
            "前進	qiánjìn",
            "前面	qiánmiàn",
            "請你... （do something)	qǐng nǐ... (Do something)",
            "去	qù",
            "三層樓的房子	sān céng lóu de fángzi",
            "三條線	sāntiáo xiàn",
            "三線	sānxiàn",
            "沙發	shāfā",
            "曬	shài",
            "上床	shàngchuáng",
            "上面	shàng miàn",
            "蛇皮	shé pí",
            "食物/吃的東西	shíwù/chī de dōngxī",
            "食指	shízhǐ",
            "手	shǒu",
            "手指	shǒuzhǐ",
            "刷牙	shuāyá",
            "誰	sheí",
            "水果	shuǐguǒ",
            "水餃	shuǐjiǎo",
            "睡不著	shuì bùzháo",
            "睡覺	Shuìjiào",
            "睡著	shuìzhe",
            "說法	shuōfǎ",
            "塑膠皮	sùjiāo pí",
            "台鐵	tái tiě",
            "台灣鐵路	táiwān tiělù",
            "躺	tǎng",
            "套房	tàofáng",
            "套房有衛浴	tàofáng yǒu wèiyù",
            "條	tiáo",
            "跳	tiào",
            "跳三下	tiào sān xià",
            "跳五下	tiào wǔ xià",
            "通常	Tōngcháng",
            "頭	tóu",
            "透天	tòu tiān",
            "退	tuì",
            "退步	tuìbù",
            "退三步	tuì sān bù",
            "外面	wàimiàn",
            "威士忌	wēishìjì",
            "微波爐	wéibōlú",
            "衛生紙	wèishēngzhǐ",
            "臥室	wòshì",
            "無名指	wúmíngzhǐ",
            "五根香蕉	wǔ gēn xiāngjiāo",
            "洗澡	xǐzǎo",
            "下面	xiàmiàn",
            "夏天	xiàtiān",
            "夏天吹南風	xiàtiān chuī nán fēng",
            "仙人掌	xiānrénzhǎng",
            "先...再...	xiān... Zài...",
            "香草	xiāngcǎo",
            "向	xiàng",
            "向後跑	xiàng hòu pǎo",
            "向後跳	xiànghòu tiào",
            "向後轉	xiànghòu zhuǎn",
            "向後走	xiànghòu zǒu",
            "向前走	xiàng qián zǒu",
            "向前走一步	xiàng qián zǒu yībù",
            "向右轉	xiàng yòu zhuǎn",
            "向右轉一圈	xiàng yòu zhuǎn yī quān",
            "向左跳	xiàng zuǒ tiào",
            "小黃	xiǎo huáng",
            "小指	xiǎozhǐ",
            "行李箱	xínglǐ xiāng",
            "雅房	yǎ fáng",
            "雅房沒有衛浴	yǎ fáng méiyǒu wèiyù",
            "岩里政男	yán lǐ zhèngnán",
            "陽台	yángtái",
            "一包衛生紙	yī bāo wèishēngzhǐ",
            "一張衛生紙	yī zhāng wèishēngzhǐ",
            "椅子	yǐzi",
            "飲料/喝的東西	yǐnliào/hē de dōngxī",
            "右邊	yòubiān",
            "玉山	yùshān",
            "站	zhàn",
            "站起來	zhàn qǐlái",
            "找	zhǎo",
            "真皮	zhēnpí",
            "政府	zhèngfǔ",
            "指出	Zhǐchū",
            "指尖	zhǐ jiān",
            "指尖	zhǐ jiān",
            "紙	zhǐ",
            "中學	zhōngxué",
            "中指	zhōngzhǐ",
            "種	zhǒng",
            "住	Zhù",
            "住在哪裡	zhù zài nǎlǐ",
            "轉	zhuǎn",
            "轉兩圈	zhuǎn liǎng quān",
            "轉一圈	Zhuǎn yī quān",
            "桌子	zhuōzi",
            "自己	zìjǐ",
            "自己人	zìjǐ rén",
            "走	zǒu",
            "走九步	zǒu jiǔ bù",
            "走兩步	zǒu liǎng bù",
            "走七步	zǒu qī bù",
            "走一步	zǒu yíbù",
            "租房子	zū fángzi",
            "租金	zūjīn",
            "最	Zuì",
            "最高	zuìgāo",
            "左邊	zuǒbiān",
            "坐	zuò",
            "坐下	zuò xià",
            "坐在地上	zuò zài dì shàng",
            "坐在球上	zuò zài qiú shàng",
            "坐在沙發上	zuò zài shāfā shàng",
            "坐在椅子上	zuò zài yǐzi shàng",
            "A 還是 B ?	A háishì B?",
            "A 還是 B ?	A háishì B?",
            "....的話	.... Dehuà",
            "...還是...	... Háishì...",
            "Gozilla 到底去哪裡了?	Gozilla dàodǐ qù nǎlǐle?",
            "V得adj	V dé adj",
            "V掉	V diào",
            "或是...	Huò shì...",
            "安靜	ānjìng",
            "一整天	yī zhěng tiān",
            "一整天都站著	yī zhěng tiān dū zhànzhe",
            "一定	yīdìng",
            "烏龜🐢	wūguī 🐢",
            "越來越...	yuè lái yuè...",
            "越來越好	yuè lái yuè hǎo",
            "越來越少	yuè lái yuè shǎo",
            "越來越多	Yuè lái yuè duō",
            "越來越大	yuè lái yuè dà",
            "沖繩	chōngshéng",
            "屋頂	wūdǐng",
            "化學	huàxué",
            "加密貨幣	jiāmì huòbì",
            "科學	kēxué",
            "科學家	kēxuéjiā",
            "火車	huǒchē",
            "過	guò",
            "我的一小步，是人類的一大步	wǒ de yī xiǎo bù, shì rénlèi de yī dà bù",
            "我的工作跟網域有關	wǒ de gōngzuò gēn wǎng yù yǒuguān",
            "臥室	wòshì",
            "雅房	yǎ fáng",
            "雅房沒有衛浴	yǎ fáng méiyǒu wèiyù",
            "嚇死了	xià sǐle",
            "格	gé",
            "隔音	géyīn",
            "幹什麼	Gànshénme",
            "漢字	hànzì",
            "玩得很開心	wán dé hěn kāixīn",
            "岩里政男	yán lǐ zhèngnán",
            "吉他	jítā",
            "吃得慢	chī dé màn",
            "客廳	kètīng",
            "強颱	qiáng tái",
            "熊本	xióngběn",
            "計程車	jìchéngchē",
            "月初	yuèchū",
            "月中	yuè zhōng",
            "月底	yuèdǐ",
            "健身房	jiànshēnfáng",
            "現代	xiàndài",
            "現代的婚禮	xiàndài de hūnlǐ",
            "古漢語	gǔ hànyǔ",
            "跨	kuà",
            "五根香蕉	wǔ gēn xiāngjiāo",
            "語言習得	yǔyán xídé",
            "公寓	gōngyù",
            "高速鐵路	gāosù tiělù",
            "高中	gāozhōng",
            "高鐵	gāotiě",
            "合作	hézuò",
            "合板	hébǎn",
            "根	gēn",
            "刷牙	shuāyá",
            "三線	sānxiàn",
            "三層樓的房子	sān céng lóu de fángzi",
            "三頭牛	sān tóu niú",
            "三匹馬	sān pǐ mǎ",
            "三條線	sāntiáo xiàn",
            "山頂	shāndǐng",
            "市場	shìchǎng",
            "指尖	zhǐ jiān",
            "指尖	zhǐ jiān",
            "死掉	sǐ diào",
            "自己	zìjǐ",
            "自己人	zìjǐ rén",
            "蛇皮	shé pí",
            "主修	zhǔ xiū",
            "主題	zhǔtí",
            "手指	shǒuzhǐ",
            "就	jiù",
            "就是	jiùshì",
            "習慣	xíguàn",
            "住	Zhù",
            "住在哪裡	zhù zài nǎlǐ",
            "重訓	zhòng xùn",
            "重力波	zhònglì bō",
            "出租車	chūzū chē",
            "唱得很好聽	chàng dé hěn hǎotīng",
            "小指	xiǎozhǐ",
            "小黃	xiǎo huáng",
            "上床	shàngchuáng",
            "上傳	shàngchuán",
            "常	cháng",
            "常常	chángcháng",
            "食指	shízhǐ",
            "人類	rénlèi",
            "水餃	shuǐjiǎo",
            "睡著	shuìzhe",
            "睡不著	shuì bùzháo",
            "睡覺	Shuìjiào",
            "世界	shìjiè",
            "世界語	shìjiè yǔ",
            "政府	zhèngfǔ",
            "生馬肉	shēng mǎròu",
            "接機	jiē jī",
            "先...再...	xiān... Zài...",
            "洗澡	xǐzǎo",
            "線上	xiànshàng",
            "全世界	quán shìjiè",
            "租金	zūjīn",
            "租房子	zū fángzi",
            "送	sòng",
            "送機	sòng jī",
            "太空	tàikōng",
            "太空人	tàikōng rén",
            "台灣鐵路	táiwān tiělù",
            "台鐵	tái tiě",
            "大拇指	dà mǔzhǐ",
            "第三格	dì sān gé",
            "中指	zhōngzhǐ",
            "中學	zhōngxué",
            "長得很像	zhǎng dé hěn xiàng",
            "通常	Tōngcháng",
            "通常	tōngcháng",
            "程式	chéngshì",
            "哲學	zhéxué",
            "哲學家	zhéxué jiā",
            "天文物理學家	tiānwén wùlǐ xué jiā",
            "電子書	diànzǐ shū",
            "套房	tàofáng",
            "套房有衛浴	tàofáng yǒu wèiyù",
            "投資	tóuzī",
            "到底	dàodǐ",
            "透天	tòu tiān",
            "頭頂	tóudǐng",
            "動物	dòngwù",
            "南極	nánjí",
            "軟體	ruǎntǐ",
            "年初	niánchū",
            "年中	nián zhōng",
            "年底	niándǐ",
            "把＋object＋action	bǎ +object+action",
            "破掉	pò diào",
            "買房子	mǎi fángzi",
            "八顆蘋果	bā kē píngguǒ",
            "半夜	bànyè",
            "飯廳	fàntīng",
            "不一定	bù yīdìng",
            "物理	wùlǐ",
            "分享	fēnxiǎng",
            "文章	wénzhāng",
            "別墅	biéshù",
            "房間	fángjiān",
            "房子	fángzi",
            "防	fáng",
            "防水	fángshuǐ",
            "防風	fángfēng",
            "防曬	fángshài",
            "防曬乳	fángshài rǔ",
            "北極	běijí",
            "北極熊	běijíxióng",
            "蜜月	mìyuè",
            "民主	mínzhǔ",
            "無名指	wúmíngzhǐ",
            "無聊	wúliáo",
            "目標	mùbiāo",
            "有運動的習慣	yǒu yùndòng de xíguàn",
            "陽台	yángtái",
            "李登輝	lǐdēnghuī",
            "留言	liúyán",
            "了	le",
            "冷凍庫	lěngdòngkù",
            "冷藏室	lěngcáng shì",
            "六條絃	liù tiáo xián",
            "做什麼	zuò shénme",
            "傳統	Chuántǒng",
            "傳統的婚禮	chuántǒng de hūnlǐ",
            "區塊鏈	qū kuài liàn",
            "區塊鏈	qū kuài liàn",
            "單板	dān bǎn",
            "嚴重	yánzhòng",
            "國中	guózhōng",
            "壞掉	huài diào",
            "對... 有興趣	duì...... Yǒu xìngqù",
            "對... 沒興趣	duì... Méi xìngqù",
            "對我比較方便	duì wǒ bǐjiào fāngbiàn",
            "對大家都方便	duì dàjiā dōu fāngbiàn",
            "對你比較方便	duì nǐ bǐjiào fāngbiàn",
            "廣告	guǎnggào",
            "廚房	chúfáng",
            "彈	dàn",
            "彈吉他	dàn jítā",
            "彈三線	dàn sānxiàn",
            "懶惰	lǎnduò",
            "掉	Diào",
            "掉了	diàole",
            "收	shōu",
            "收下	shōu xià",
            "收到了	shōu dàole",
            "收禮物	shōu lǐwù",
            "數位貨幣	shùwèi huòbì",
            "斷交	duànjiāo",
            "條	tiáo",
            "樂器	yuèqì",
            "淹	yān",
            "淹死	yān sǐ",
            "淹水	yān shuǐ",
            "窗戶	chuānghù",
            "經濟學	jīngjì xué",
            "經濟學家	jīngjì xué jiā",
            "跟...無關	gēn... Wúguān",
            "跟...有關	gēn... Yǒuguān",
            "轉系	zhuǎn xì",
            "顆	kē",
            "丟	diū",
            "丟到地上	diū dào dìshàng",
            "丟掉	diū diào",
            "你到底想做什麼?	Nǐ dàodǐ xiǎng zuò shénme?",
            "偷	tōu",
            "吵	Chǎo",
            "咖啡因	kāfēi yīn",
            "撿	jiǎn",
            "撿起來	jiǎn qǐlái",
            "曬	shài",
            "查	chá",
            "每個禮拜四，我們的公司有活動，跟WordPress有關的活動	měi gè lǐbài sì, wǒmen de gōngsī yǒu huódòng, gēn WordPress de yǒuguān de huódòng",
            "溫度	wēndù",
            "說得很清楚	shuō dé hěn qīngchǔ",
            "說法	shuōfǎ",
            "跑得快	pǎo dé kuài")

    // Methods - actions the object can take
    fun getVocab(): String {

        // Randomly select a vocab
        val randomGenerator = Random()
        val randomNumber = randomGenerator.nextInt(vocabs.size)
        return vocabs[randomNumber]

    }
}