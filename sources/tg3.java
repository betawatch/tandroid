// default package

import android.graphics.Point;
import android.graphics.RectF;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class tg3 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ gk7 e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ TLObject h;

    public /* synthetic */ tg3(cj3 cj3Var, TLRPC.Chat chat, long j, boolean z, TLRPC.User user, boolean z2) {
        this.e = cj3Var;
        this.f = chat;
        this.c = j;
        this.b = z;
        this.h = user;
        this.d = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLObject tLObject = this.h;
        TLObject tLObject2 = this.f;
        gk7 gk7Var = this.e;
        switch (b) {
            case 0:
                cj3 cj3Var = (cj3) gk7Var;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j = this.c;
                boolean z = this.b;
                if (chat == null) {
                    cj3Var.getMessagesController().T(0, j, z);
                    if (user != null && user.bot && this.d) {
                        cj3Var.getMessagesController().t(user.id);
                    }
                } else if (hc2.r0(chat)) {
                    cj3Var.getMessagesController().T(0, j, z);
                } else {
                    cj3Var.getMessagesController().c0(-j, cj3Var.getMessagesController().V1(Long.valueOf(cj3Var.getUserConfig().e())), null, z, z);
                }
                cj3Var.getMessagesController().F(cj3Var.Y2);
                break;
            default:
                t7b t7bVar = (t7b) gk7Var;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z2 = this.b;
                long j2 = this.c;
                if (!z2) {
                    t76.N = t76.g(t7bVar.b, t7bVar.c, storyItem, j2, storyItem.id, z2, inputGroupCall, true, this.d);
                }
                o7b o7bVar = t7bVar.G;
                if (o7bVar != null) {
                    o7bVar.f(false);
                }
                t7bVar.G = null;
                t7bVar.K = false;
                RectF rectF = t7bVar.I;
                Point point = gl.q;
                rectF.set(0.0f, 0.0f, point.x, point.y);
                t7bVar.H = gl.L(8.0f);
                t7bVar.o(true);
                d S = LaunchActivity.S();
                storyItem.dialogId = j2;
                storyItem.justUploaded = true;
                S.getOrCreateStoryViewer().J(t7bVar.b, storyItem, null);
                kk7.f(t7bVar.c).k(kk7.F2, Long.valueOf(inputGroupCall.id));
                break;
        }
    }

    public /* synthetic */ tg3(t7b t7bVar, boolean z, TL_stories.StoryItem storyItem, long j, TLRPC.InputGroupCall inputGroupCall, boolean z2) {
        this.e = t7bVar;
        this.b = z;
        this.f = storyItem;
        this.c = j;
        this.h = inputGroupCall;
        this.d = z2;
    }
}
