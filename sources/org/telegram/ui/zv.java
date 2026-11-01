package org.telegram.ui;

import android.graphics.Point;
import android.graphics.RectF;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zv implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.messenger.vs e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ TLObject h;

    public /* synthetic */ zv(zx zxVar, TLRPC.Chat chat, long j10, boolean z10, TLRPC.User user, boolean z11) {
        this.e = zxVar;
        this.f = chat;
        this.c = j10;
        this.b = z10;
        this.h = user;
        this.d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        TLObject tLObject = this.h;
        TLObject tLObject2 = this.f;
        org.telegram.messenger.vs vsVar = this.e;
        switch (i10) {
            case 0:
                zx zxVar = (zx) vsVar;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j10 = this.c;
                boolean z10 = this.b;
                if (chat == null) {
                    zxVar.getMessagesController().X(0, j10, z10);
                    if (user != null && user.bot && this.d) {
                        zxVar.getMessagesController().w(user.id);
                    }
                } else if (org.telegram.messenger.w3.r0(chat)) {
                    zxVar.getMessagesController().X(0, j10, z10);
                } else {
                    zxVar.getMessagesController().g0(-j10, zxVar.getMessagesController().Z1(Long.valueOf(zxVar.getUserConfig().e())), null, z10, z10);
                }
                zxVar.getMessagesController().J(zxVar.W2);
                break;
            default:
                vh.o8 o8Var = (vh.o8) vsVar;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z11 = this.b;
                long j11 = this.c;
                if (!z11) {
                    th.s0.W = new th.s0(o8Var.b, o8Var.c, storyItem, j11, storyItem.id, z11, inputGroupCall, true, this.d);
                }
                vh.j8 j8Var = o8Var.F;
                if (j8Var != null) {
                    j8Var.f(false);
                }
                o8Var.F = null;
                o8Var.J = 0;
                RectF rectF = o8Var.H;
                Point point = org.telegram.messenger.i0.q;
                rectF.set(0.0f, 0.0f, point.x, point.y);
                o8Var.G = org.telegram.messenger.i0.L(8.0f);
                o8Var.p(true);
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                storyItem.dialogId = j11;
                storyItem.justUploaded = true;
                T.getOrCreateStoryViewer().U(o8Var.b, storyItem, null);
                org.telegram.messenger.at.f(o8Var.c).k(org.telegram.messenger.at.G2, Long.valueOf(inputGroupCall.id));
                break;
        }
    }

    public /* synthetic */ zv(vh.o8 o8Var, boolean z10, TL_stories.StoryItem storyItem, long j10, TLRPC.InputGroupCall inputGroupCall, boolean z11) {
        this.e = o8Var;
        this.b = z10;
        this.f = storyItem;
        this.c = j10;
        this.h = inputGroupCall;
        this.d = z11;
    }
}
