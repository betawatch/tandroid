package ru.noties.jlatexmath.awt;

import android.graphics.Typeface;
import java.io.InputStream;
import java.util.Locale;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public class Font {
    public static final int BOLD = 1;
    public static final int ITALIC = 2;
    public static final int PLAIN = 0;
    private float size;
    private int style;
    private final Typeface typeface;

    public Font(String str, int i10, int i11) {
        this(createTypeface(str, i10), i10, i11);
    }

    private static Typeface applyStyle(Typeface typeface, int i10) {
        if (((typeface.isBold() ? 1 : 0) | (typeface.isItalic() ? 2 : 0)) != i10) {
            return Typeface.create(typeface, ((i10 & 1) != 0 ? 1 : 0) | ((i10 & 2) != 0 ? 2 : 0));
        }
        return typeface;
    }

    @Deprecated
    public static Font createFont(int i10, InputStream inputStream) {
        return null;
    }

    private static Typeface createTypeface(String str, int i10) {
        Typeface create = Typeface.create(str.toLowerCase(Locale.US), toAndroidStyle(i10));
        return create == null ? Typeface.DEFAULT : create;
    }

    private static int toAndroidStyle(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((i10 & 1) != 0 ? 1 : 0) | ((i10 & 2) != 0 ? 2 : 0);
    }

    public Font deriveFont(int i10) {
        return new Font(this.typeface, i10, this.size);
    }

    public boolean isBold() {
        return (this.style & 1) != 0;
    }

    public boolean isItalic() {
        return (this.style & 2) != 0;
    }

    public float size() {
        return this.size;
    }

    public int style() {
        return this.style;
    }

    public Typeface typeface() {
        return this.typeface;
    }

    private Font(Typeface typeface, int i10, float f10) {
        this.typeface = applyStyle(typeface, i10);
        this.style = i10;
        this.size = f10;
    }

    public static Font createFont(Typeface typeface, float f10) {
        return new Font(typeface, 0, f10);
    }
}
