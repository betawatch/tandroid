// default package

import android.net.Uri;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class uq3 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yq3 b;

    public /* synthetic */ uq3(yq3 yq3Var, byte b) {
        this.a = b;
        this.b = yq3Var;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        yq3 yq3Var = this.b;
        switch (b) {
            case 0:
                Float f = (Float) obj;
                xq3 xq3Var = yq3Var.n;
                if (xq3Var != null) {
                    xq3Var.setProgress(f.floatValue());
                    break;
                }
                break;
            case 1:
                Uri uri = (Uri) obj;
                if (yq3Var.c && yq3Var.r != null) {
                    yq3Var.n.b(R.raw.ic_save_to_gallery, 3500, jb6.N0("VideoSavedHint"));
                    yq3Var.c = false;
                    yq3Var.d();
                    yq3Var.w = uri;
                    break;
                }
                break;
            default:
                Uri uri2 = (Uri) obj;
                yq3Var.c = false;
                yq3Var.d();
                xq3 xq3Var2 = yq3Var.n;
                if (xq3Var2 != null) {
                    xq3Var2.a();
                    yq3Var.n = null;
                }
                xq3 xq3Var3 = new xq3(yq3Var.getContext());
                yq3Var.n = xq3Var3;
                xq3Var3.b(R.raw.ic_save_to_gallery, 2500, jb6.N0("PhotoSavedHint"));
                yq3Var.b.addView(yq3Var.n);
                yq3Var.w = uri2;
                break;
        }
    }
}
