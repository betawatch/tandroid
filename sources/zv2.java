// default package

import android.content.ClipData;
import android.view.ContentInfo;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
