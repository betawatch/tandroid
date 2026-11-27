// default package

import android.content.ClipData;
import android.view.ContentInfo;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class zv2 implements aw2 {
    public final ContentInfo a;

    public zv2(ContentInfo contentInfo) {
        contentInfo.getClass();
        this.a = contentInfo;
    }

    @Override // aw2
    public final int a() {
        return this.a.getFlags();
    }

    @Override // aw2
    public final ClipData b() {
        return this.a.getClip();
    }

    @Override // aw2
    public final ContentInfo e() {
        return this.a;
    }

    @Override // aw2
    public final int f() {
        return this.a.getSource();
    }

    public final String toString() {
        return "ContentInfoCompat{" + this.a + "}";
    }
}
