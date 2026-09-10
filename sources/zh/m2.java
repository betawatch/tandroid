package zh;

import android.view.View;
import bi.va;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class m2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v2 b;

    public /* synthetic */ m2(v2 v2Var, int i10) {
        this.a = i10;
        this.b = v2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                a3 a3Var = this.b.l;
                a3.e0(a3Var, a3Var.B1);
                v2 v2Var = a3Var.t1;
                if (v2Var != null) {
                    v2Var.a();
                    break;
                }
                break;
            case 1:
                a3 a3Var2 = this.b.l;
                a3.d0(a3Var2);
                v2 v2Var2 = a3Var2.t1;
                if (v2Var2 != null) {
                    v2Var2.a();
                    break;
                }
                break;
            case 2:
                a3 a3Var3 = this.b.l;
                AndroidUtilities.addToClipboard(a3Var3.O1.e());
                a3.j0(a3Var3);
                v2 v2Var3 = a3Var3.t1;
                if (v2Var3 != null) {
                    v2Var3.a();
                    break;
                }
                break;
            case 3:
                a3 a3Var4 = this.b.l;
                a3Var4.Y0(false);
                v2 v2Var4 = a3Var4.t1;
                if (v2Var4 != null) {
                    v2Var4.a();
                    break;
                }
                break;
            case 4:
                a3 a3Var5 = this.b.l;
                z2 z2Var = a3Var5.O1;
                z2Var.a.translated = false;
                v5 v5Var = MessagesController.getInstance(a3Var5.C2).getStoriesController().k;
                TL_stories.StoryItem storyItem = z2Var.a;
                v5Var.k(storyItem.dialogId, storyItem);
                a3Var5.p0();
                a3Var5.f1(false);
                v2 v2Var5 = a3Var5.t1;
                if (v2Var5 != null) {
                    v2Var5.a();
                    break;
                }
                break;
            case 5:
                v2 v2Var6 = this.b;
                a3 a3Var6 = v2Var6.l;
                z2 z2Var2 = a3Var6.O1;
                z2Var2.a.translated = true;
                a3Var6.p0();
                w2 w2Var = a3Var6.Q1;
                if (w2Var != null) {
                    u7 u7Var = ((l7) w2Var).d;
                    u7Var.Z0 = true;
                    u7Var.P();
                }
                v5 v5Var2 = MessagesController.getInstance(a3Var6.C2).getStoriesController().k;
                TL_stories.StoryItem storyItem2 = z2Var2.a;
                v5Var2.k(storyItem2.dialogId, storyItem2);
                MessagesController.getInstance(a3Var6.C2).getTranslateController().translateStory(z2Var2.a, new va(new p2(v2Var6, 1), System.currentTimeMillis(), 29));
                a3Var6.f1(false);
                a3Var6.h3 = true;
                a3Var6.K0.D(true);
                v2 v2Var7 = a3Var6.t1;
                if (v2Var7 != null) {
                    v2Var7.a();
                    break;
                }
                break;
            case 6:
                a3 a3Var7 = this.b.l;
                h5 h5Var = a3Var7.O1.b;
                if (h5Var != null) {
                    h5Var.a();
                    a3Var7.j1();
                }
                v2 v2Var8 = a3Var7.t1;
                if (v2Var8 != null) {
                    v2Var8.a();
                    break;
                }
                break;
            case 7:
                a3 a3Var8 = this.b.l;
                a3.d0(a3Var8);
                v2 v2Var9 = a3Var8.t1;
                if (v2Var9 != null) {
                    v2Var9.a();
                    break;
                }
                break;
            case 8:
                a3 a3Var9 = this.b.l;
                AndroidUtilities.addToClipboard(a3Var9.O1.e());
                a3.j0(a3Var9);
                v2 v2Var10 = a3Var9.t1;
                if (v2Var10 != null) {
                    v2Var10.a();
                    break;
                }
                break;
            case 9:
                a3 a3Var10 = this.b.l;
                a3Var10.Y0(false);
                v2 v2Var11 = a3Var10.t1;
                if (v2Var11 != null) {
                    v2Var11.a();
                    break;
                }
                break;
            case 10:
                t0 t0Var = t0.W;
                if (t0Var != null && t0Var.n) {
                    long j3 = t0Var.J;
                    boolean z10 = !t0Var.I;
                    t0Var.I = z10;
                    NativeInstance.switchCameraCapturer(j3, z10);
                }
                v2 v2Var12 = this.b.l.t1;
                if (v2Var12 != null) {
                    v2Var12.a();
                    break;
                }
                break;
            case 11:
                this.b.l.D3.b();
                break;
            case 12:
                this.b.l.E3.b();
                break;
            case 13:
                a3 a3Var11 = this.b.l;
                a3.f0(a3Var11);
                v2 v2Var13 = a3Var11.t1;
                if (v2Var13 != null) {
                    v2Var13.a();
                    break;
                }
                break;
            case 14:
                a3 a3Var12 = this.b.l;
                MediaDataController.getInstance(a3Var12.C2).removePeer(a3Var12.B1);
                a3Var12.S1.i0(a3Var12.B1, true, false);
                v2 v2Var14 = a3Var12.t1;
                if (v2Var14 != null) {
                    v2Var14.a();
                    break;
                }
                break;
            default:
                a3 a3Var13 = this.b.l;
                a3.e0(a3Var13, a3Var13.B1);
                v2 v2Var15 = a3Var13.t1;
                if (v2Var15 != null) {
                    v2Var15.a();
                    break;
                }
                break;
        }
    }
}
