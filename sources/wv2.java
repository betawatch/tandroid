// default package

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class wv2 implements xv2 {
    public final ContentInfo.Builder a;

    public wv2(ClipData clipData, int i) {
        this.a = vv2.a(clipData, i);
    }

    @Override // xv2
    public final bw2 build() {
        return new bw2(new zv2(this.a.build()));
    }

    @Override // xv2
    public final void c(Uri uri) {
        this.a.setLinkUri(uri);
    }

    @Override // xv2
    public final void d(int i) {
        this.a.setFlags(i);
    }

    @Override // xv2
    public final void setExtras(Bundle bundle) {
        this.a.setExtras(bundle);
    }
}
