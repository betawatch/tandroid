package qh;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class h5 {
    public TextureView a;
    public dg.h0 b;
    public eg.p1 c;
    public boolean d;
    public int e;
    public int f;
    public boolean g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.a;
        if (textureView2 == textureView) {
            return;
        }
        if (textureView2 != null) {
            ViewParent parent = textureView2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.a);
            }
            this.a = null;
        }
        this.d = false;
        this.a = textureView;
        dg.h0 h0Var = this.b;
        if (h0Var != null) {
            h0Var.run(textureView);
        }
    }
}
