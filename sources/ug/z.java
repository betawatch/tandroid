package ug;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.Pair;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.pc;
import org.telegram.messenger.v3;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.nb;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        int i7 = this.a;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                ((k0) obj2).z1((HashMap) obj);
                break;
            case 1:
                t1 t1Var = (t1) obj2;
                boolean e10 = pc.e(131072);
                if (t1Var.e != e10) {
                    t1Var.e = e10;
                    t1Var.invalidate();
                    break;
                }
                break;
            case 2:
                vh.g.e1((vh.g) obj2, (Pair) obj);
                break;
            case 3:
                fj fjVar = (fj) obj2;
                TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                TLRPC.MessageMedia messageMedia = fjVar.k.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaGiveawayResults) {
                    TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = (TLRPC.TL_messageMediaGiveawayResults) messageMedia;
                    tL_messageMediaGiveaway = new TLRPC.TL_messageMediaGiveaway();
                    tL_messageMediaGiveaway.prize_description = tL_messageMediaGiveawayResults.prize_description;
                    tL_messageMediaGiveaway.months = tL_messageMediaGiveawayResults.months;
                    tL_messageMediaGiveaway.quantity = tL_messageMediaGiveawayResults.winners_count + tL_messageMediaGiveawayResults.unclaimed_count;
                    tL_messageMediaGiveaway.only_new_subscribers = tL_messageMediaGiveawayResults.only_new_subscribers;
                    tL_messageMediaGiveaway.until_date = tL_messageMediaGiveawayResults.until_date;
                    if ((tL_messageMediaGiveawayResults.flags & 32) != 0) {
                        tL_messageMediaGiveaway.flags |= 32;
                        tL_messageMediaGiveaway.stars = tL_messageMediaGiveawayResults.stars;
                    }
                } else {
                    tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) messageMedia;
                }
                TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway2 = tL_messageMediaGiveaway;
                long j3 = 1000 * fjVar.k.date;
                g2 Q = LaunchActivity.Q();
                if (Q != null) {
                    String b10 = wg.h.b(fjVar);
                    TLRPC.Chat O0 = mp.u1(i10.t0).O0(Long.valueOf(-fjVar.Z0()));
                    boolean z10 = O0 != null && v3.V(O0);
                    nb nbVar = new nb(Q.getParentActivity(), Q.getResourceProvider());
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        nbVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                        nbVar.b.setText(gd.N0(2131753368, null));
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                        if (((TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo).participating) {
                            nbVar.c(R.raw.forward, 30, 30, new String[0]);
                            nbVar.b.setText(gd.N0(2131753366, null));
                        } else {
                            nbVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                            nbVar.b.setText(gd.N0(2131753367, null));
                        }
                    }
                    nbVar.b.setSingleLine(false);
                    nbVar.b.setMaxLines(2);
                    dc dcVar = new dc(Q.getParentActivity(), Q.getResourceProvider(), true);
                    dcVar.e(gd.N0(2131748817, null));
                    dcVar.b = new ai.e(payments_giveawayinfo, z10, b10, j3, tL_messageMediaGiveaway2, Q);
                    nbVar.setButton(dcVar);
                    fc.g(Q, nbVar, 2750).j();
                    break;
                }
                break;
            case 4:
                wg.p0 p0Var = (wg.p0) obj2;
                p0Var.W1.setLoading(false);
                wg.h.j(p0Var.getContext(), (TLRPC.TL_error) obj);
                break;
            case 5:
                wh.h hVar = (wh.h) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Matrix matrix = hVar.L;
                if (!hVar.U) {
                    hVar.J = bitmap;
                    Bitmap bitmap2 = hVar.J;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    hVar.K = new BitmapShader(bitmap2, tileMode, tileMode);
                    Paint paint = new Paint(2);
                    hVar.M = paint;
                    paint.setShader(hVar.K);
                    ColorMatrix colorMatrix = new ColorMatrix();
                    org.telegram.messenger.g0.i(colorMatrix, n6.I.q() ? 0.08f : 1.25f);
                    org.telegram.messenger.g0.h(colorMatrix, n6.I.q() ? 0.02f : -0.15f);
                    hVar.M.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    matrix.reset();
                    matrix.setScale(15.0f, 15.0f);
                    hVar.K.setLocalMatrix(matrix);
                    break;
                } else {
                    hVar.J.recycle();
                    break;
                }
            case 6:
                HashMap hashMap = ((xg.b) obj2).x;
                hashMap.clear();
                hashMap.putAll((HashMap) obj);
                break;
            case 7:
                ((xg.e) obj2).F((TLObject) obj);
                break;
            default:
                HashMap hashMap2 = ((xg.h) obj2).r;
                hashMap2.clear();
                hashMap2.putAll((HashMap) obj);
                break;
        }
    }
}
