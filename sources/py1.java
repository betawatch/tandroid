// default package

import org.telegram.messenger.beta.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class py1 {
    public static final py1 d;
    public static final py1 e;
    public static final /* synthetic */ py1[] f;
    public final oy1 a;
    public final oy1 b;
    public final int c;

    static {
        oy1 oy1Var = oy1.a;
        oy1 oy1Var2 = oy1.b;
        py1 py1Var = new py1("VOICE_TO_VIDEO", 0, oy1Var, oy1Var2, R.raw.voice_and_video);
        d = py1Var;
        oy1 oy1Var3 = oy1.c;
        oy1 oy1Var4 = oy1.d;
        py1 py1Var2 = new py1("STICKER_TO_KEYBOARD", 1, oy1Var3, oy1Var4, R.raw.sticker_to_keyboard);
        oy1 oy1Var5 = oy1.e;
        py1 py1Var3 = new py1("SMILE_TO_KEYBOARD", 2, oy1Var5, oy1Var4, R.raw.smile_to_keyboard);
        py1 py1Var4 = new py1("VIDEO_TO_VOICE", 3, oy1Var2, oy1Var, R.raw.voice_and_video);
        e = py1Var4;
        py1 py1Var5 = new py1("KEYBOARD_TO_STICKER", 4, oy1Var4, oy1Var3, R.raw.keyboard_to_sticker);
        oy1 oy1Var6 = oy1.f;
        f = new py1[]{py1Var, py1Var2, py1Var3, py1Var4, py1Var5, new py1("KEYBOARD_TO_GIF", 5, oy1Var4, oy1Var6, R.raw.keyboard_to_gif), new py1("KEYBOARD_TO_SMILE", 6, oy1Var4, oy1Var5, R.raw.keyboard_to_smile), new py1("GIF_TO_KEYBOARD", 7, oy1Var6, oy1Var4, R.raw.gif_to_keyboard), new py1("GIF_TO_SMILE", 8, oy1Var6, oy1Var5, R.raw.gif_to_smile), new py1("SMILE_TO_GIF", 9, oy1Var5, oy1Var6, R.raw.smile_to_gif), new py1("SMILE_TO_STICKER", 10, oy1Var5, oy1Var3, R.raw.smile_to_sticker), new py1("STICKER_TO_SMILE", 11, oy1Var3, oy1Var5, R.raw.sticker_to_smile)};
    }

    public py1(String str, int i, oy1 oy1Var, oy1 oy1Var2, int i2) {
        this.a = oy1Var;
        this.b = oy1Var2;
        this.c = i2;
    }

    public static py1 valueOf(String str) {
        return (py1) Enum.valueOf(py1.class, str);
    }

    public static py1[] values() {
        return (py1[]) f.clone();
    }
}
