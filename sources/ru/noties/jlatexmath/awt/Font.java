package ru.noties.jlatexmath.awt;

import android.graphics.Typeface;
import java.io.InputStream;
import java.util.Locale;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public class Font {
    public static final int BOLD = 1;
    public static final int ITALIC = 2;
    public static final int PLAIN = 0;
    private float size;
    private int style;
    private final Typeface typeface;

    public Font(String str, int i3, int i10) {
        this(createTypeface(str, i3), i3, i10);
    }

    private static Typeface applyStyle(Typeface typeface, int i3) {
        if ((typeface.isBold() | (typeface.isItalic() ? 2 : false)) != i3) {
            return Typeface.create(typeface, ((i3 & 1) != 0 ? 1 : 0) | ((i3 & 2) != 0 ? 2 : 0));
        }
        return typeface;
    }

    @Deprecated
    public static Font createFont(int i3, InputStream inputStream) {
        return null;
    }

    private static Typeface createTypeface(String str, int i3) {
        Typeface create = Typeface.create(str.toLowerCase(Locale.US), toAndroidStyle(i3));
        return create == null ? Typeface.DEFAULT : create;
    }

    private static int toAndroidStyle(int i3) {
        if (i3 == 0) {
            return 0;
        }
        return ((i3 & 1) != 0 ? 1 : 0) | ((i3 & 2) != 0 ? 2 : 0);
    }

    public Font deriveFont(int i3) {
        return new Font(this.typeface, i3, this.size);
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

    private Font(Typeface typeface, int i3, float f10) {
        this.typeface = applyStyle(typeface, i3);
        this.style = i3;
        this.size = f10;
    }

    public static Font createFont(Typeface typeface, float f10) {
        return new Font(typeface, 0, f10);
    }
}
