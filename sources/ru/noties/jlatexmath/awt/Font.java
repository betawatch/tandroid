package ru.noties.jlatexmath.awt;

import android.graphics.Typeface;
import java.io.InputStream;
import java.util.Locale;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
        if ((typeface.isBold() | (typeface.isItalic() ? 2 : false)) != i10) {
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

    private Font(Typeface typeface, int i10, float f7) {
        this.typeface = applyStyle(typeface, i10);
        this.style = i10;
        this.size = f7;
    }

    public static Font createFont(Typeface typeface, float f7) {
        return new Font(typeface, 0, f7);
    }
}
