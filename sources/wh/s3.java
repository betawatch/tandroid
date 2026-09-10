package wh;

import bi.ra;
import bi.rb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.fy0;
import xh.v5;
import zh.d8;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class s3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s3(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new sx0(this.b, tLObject, this.c, 26));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new sx0(this.b, tLObject, this.c, 27));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new fy0(this.b, tLObject, this.c, (Object) tL_error, 25));
                break;
            case 3:
                xh.x3.f1((xh.x3) this.b, (TL_stars.InputSavedStarGift) this.c, tLObject, tL_error);
                break;
            case 4:
                xh.x3.V0((xh.x3) this.b, (org.telegram.ui.ActionBar.d2) this.c, tLObject, tL_error);
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new xh.n1((v5) this.b, tLObject, tL_error, (Utilities.Callback) this.c));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new xh.n1((v5) this.b, tLObject, (Runnable) this.c, 7));
                break;
            case 7:
                zh.t0 t0Var = (zh.t0) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(t0Var.e).processUpdates(updates, false);
                    break;
                }
                break;
            case 8:
                zh.v2 v2Var = (zh.v2) this.b;
                rb rbVar = (rb) this.c;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(v2Var.l.C2).processUpdates((TLRPC.Updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new ra(rbVar, 2));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new xh.n1((zh.s4) this.b, tLObject, (Runnable) this.c, 15));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new zh.r2((zh.w4) this.b, tLObject, (Utilities.Callback) this.c, tL_error, 1));
                break;
            default:
                AndroidUtilities.runOnUIThread(new xh.n1((d8) this.b, tLObject, (TL_stories.TL_stories_getStoriesViews) this.c, 17));
                break;
        }
    }
}
