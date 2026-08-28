package ru.noties.jlatexmath.awt;

import android.graphics.Typeface;
import java.io.InputStream;
import java.util.Locale;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public class Font {
    public static final int BOLD = 1;
    public static final int ITALIC = 2;
    public static final int PLAIN = 0;
    private float size;
    private int style;
    private final Typeface typeface;

    public Font(String str, int i9, int i10) {
        this(createTypeface(str, i9), i9, i10);
    }

    private static Typeface applyStyle(Typeface typeface, int i9) {
        if (((typeface.isBold() ? 1 : 0) | (typeface.isItalic() ? 2 : 0)) != i9) {
            return Typeface.create(typeface, ((i9 & 1) != 0 ? 1 : 0) | ((i9 & 2) != 0 ? 2 : 0));
        }
        return typeface;
    }

    @Deprecated
    public static Font createFont(int i9, InputStream inputStream) {
        return null;
    }

    private static Typeface createTypeface(String str, int i9) {
        Typeface create = Typeface.create(str.toLowerCase(Locale.US), toAndroidStyle(i9));
        return create == null ? Typeface.DEFAULT : create;
    }

    private static int toAndroidStyle(int i9) {
        if (i9 == 0) {
            return 0;
        }
        return ((i9 & 1) != 0 ? 1 : 0) | ((i9 & 2) != 0 ? 2 : 0);
    }

    public Font deriveFont(int i9) {
        return new Font(this.typeface, i9, this.size);
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

    private Font(Typeface typeface, int i9, float f10) {
        this.typeface = applyStyle(typeface, i9);
        this.style = i9;
        this.size = f10;
    }

    public static Font createFont(Typeface typeface, float f10) {
        return new Font(typeface, 0, f10);
    }
}
