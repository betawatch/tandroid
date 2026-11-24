// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class p3b implements RequestDelegate {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p3b(h4b h4bVar, boolean z, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, boolean z2) {
        this.d = h4bVar;
        this.b = z;
        this.e = tL_stories_getAllStories;
        this.c = z2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                gm.c3(new hy6((h4b) obj2, this.b, (TL_stories.TL_stories_getAllStories) obj, tLObject, this.c));
                break;
            default:
                gm.c3(new ea7((TwoStepVerificationActivity) obj2, tL_error, tLObject, this.b, this.c, (Runnable) obj, (byte) 3));
                break;
        }
    }

    public /* synthetic */ p3b(TwoStepVerificationActivity twoStepVerificationActivity, boolean z, boolean z2, Runnable runnable) {
        this.d = twoStepVerificationActivity;
        this.b = z;
        this.c = z2;
        this.e = runnable;
    }
}
