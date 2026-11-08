package ru.noties.jlatexmath.awt;

import android.graphics.Typeface;
import java.io.InputStream;
import java.util.Locale;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public class Font {
    public static final int BOLD = 1;
    public static final int ITALIC = 2;
    public static final int PLAIN = 0;
    private float size;
    private int style;
    private final Typeface typeface;

    public Font(String str, int i7, int i10) {
        this(createTypeface(str, i7), i7, i10);
    }

    private static Typeface applyStyle(Typeface typeface, int i7) {
        if ((typeface.isBold() | (typeface.isItalic() ? 2 : false)) != i7) {
            return Typeface.create(typeface, ((i7 & 1) != 0 ? 1 : 0) | ((i7 & 2) != 0 ? 2 : 0));
        }
        return typeface;
    }

    @Deprecated
    public static Font createFont(int i7, InputStream inputStream) {
        return null;
    }

    private static Typeface createTypeface(String str, int i7) {
        Typeface create = Typeface.create(str.toLowerCase(Locale.US), toAndroidStyle(i7));
        return create == null ? Typeface.DEFAULT : create;
    }

    private static int toAndroidStyle(int i7) {
        if (i7 == 0) {
            return 0;
        }
        return ((i7 & 1) != 0 ? 1 : 0) | ((i7 & 2) != 0 ? 2 : 0);
    }

    public Font deriveFont(int i7) {
        return new Font(this.typeface, i7, this.size);
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

    private Font(Typeface typeface, int i7, float f10) {
        this.typeface = applyStyle(typeface, i7);
        this.style = i7;
        this.size = f10;
    }

    public static Font createFont(Typeface typeface, float f10) {
        return new Font(typeface, 0, f10);
    }
}
