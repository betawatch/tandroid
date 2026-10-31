package rh;

import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cc;
import org.telegram.ui.aw;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class f5 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ TLObject h;
    public final /* synthetic */ TLObject n;
    public final /* synthetic */ Object r;

    public /* synthetic */ f5(e6 e6Var, boolean[] zArr, TL_stars.StarGift starGift, boolean z10, boolean z11, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, ph.u3 u3Var) {
        this.e = e6Var;
        this.f = zArr;
        this.h = starGift;
        this.b = z10;
        this.d = z11;
        this.c = j10;
        this.n = tL_textWithEntities;
        this.r = u3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int i11;
        TL_stories.StoryItem storyItem;
        TLRPC.InputGroupCall inputGroupCall;
        int i12 = this.a;
        Object obj = this.r;
        TLObject tLObject = this.n;
        TLObject tLObject2 = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        int i13 = 0;
        switch (i12) {
            case 0:
                ((boolean[]) obj2)[0] = true;
                ((e6) obj3).i((TL_stars.StarGift) tLObject2, this.b, this.d, this.c, (TLRPC.TL_textWithEntities) tLObject, (ph.u3) obj);
                break;
            default:
                vh.o8 o8Var = (vh.o8) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                TL_stories.TL_startLive tL_startLive = (TL_stories.TL_startLive) tLObject2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) tLObject;
                vh.d0 d0Var = (vh.d0) obj;
                th.b bVar = o8Var.a;
                int i14 = o8Var.c;
                if (!(tLObject3 instanceof TLRPC.Updates)) {
                    if (tL_error != null) {
                        if (!tL_error.text.startsWith("STORY_LIVE_ALREADY_")) {
                            vh.w6 w6Var = o8Var.q0;
                            if (w6Var != null) {
                                new cc(w6Var.c, bVar).f0(tL_error, true);
                                d0Var.run();
                                break;
                            }
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, o8Var.b, bVar);
                            String L0 = cd.L0(2131748836, null);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                            x1Var.R = L0;
                            x1Var.T = cd.L0(2131748837, null);
                            i0.a.w(null, 2131747847, alertDialog$Builder, null);
                            break;
                        }
                    }
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject3;
                    vp.r1(i14).L3(updates, false);
                    vh.t7 t7Var = o8Var.B0;
                    if (t7Var != null) {
                        t7Var.destroy(true, null);
                    }
                    ArrayList y02 = vp.y0(updates, TL_update.TL_updateStoryID.class);
                    int size = y02.size();
                    int i15 = 0;
                    while (true) {
                        if (i15 < size) {
                            Object obj4 = y02.get(i15);
                            i15++;
                            TL_update.TL_updateStoryID tL_updateStoryID = (TL_update.TL_updateStoryID) obj4;
                            i10 = i13;
                            if (tL_updateStoryID.random_id == tL_startLive.random_id) {
                                i11 = tL_updateStoryID.id;
                            } else {
                                i13 = i10;
                            }
                        } else {
                            i10 = i13;
                            i11 = -1;
                        }
                    }
                    ArrayList y03 = vp.y0(updates, TL_stories.TL_updateStory.class);
                    int size2 = y03.size();
                    int i16 = i10;
                    while (i16 < size2) {
                        Object obj5 = y03.get(i16);
                        i16++;
                        TL_stories.StoryItem storyItem2 = ((TL_stories.TL_updateStory) obj5).story;
                        if (storyItem2 != null && (storyItem2.id == i11 || i11 == -1)) {
                            storyItem = storyItem2;
                            if (storyItem != null) {
                                TLRPC.MessageMedia messageMedia = storyItem.media;
                                if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                                    inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                                    if (inputGroupCall != null) {
                                        th.s0 s0Var = th.s0.W;
                                        if (s0Var != null) {
                                            s0Var.e();
                                            if (th.s0.W != null) {
                                                th.s0.W = null;
                                                zs f7 = zs.f(i14);
                                                Object[] objArr = new Object[1];
                                                objArr[i10] = Long.valueOf(th.s0.W.g());
                                                f7.k(zs.G2, objArr);
                                            }
                                        }
                                        org.telegram.messenger.i0.h3(new aw(o8Var, this.b, storyItem, this.c, inputGroupCall, this.d), 100L);
                                        break;
                                    }
                                }
                            }
                            inputGroupCall = null;
                            if (inputGroupCall != null) {
                            }
                        }
                    }
                    storyItem = null;
                    if (storyItem != null) {
                    }
                    inputGroupCall = null;
                    if (inputGroupCall != null) {
                    }
                }
                break;
        }
    }

    public /* synthetic */ f5(vh.o8 o8Var, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z10, long j10, boolean z11, TLRPC.TL_error tL_error, vh.d0 d0Var) {
        this.e = o8Var;
        this.f = tLObject;
        this.h = tL_startLive;
        this.b = z10;
        this.c = j10;
        this.d = z11;
        this.n = tL_error;
        this.r = d0Var;
    }
}
