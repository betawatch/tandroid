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
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.qc;
import org.telegram.messenger.t3;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.vb;
import org.telegram.ui.Components.xb;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class p1 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        int i7 = this.a;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                s1 s1Var = (s1) obj2;
                boolean e10 = qc.e(131072);
                if (s1Var.e != e10) {
                    s1Var.e = e10;
                    s1Var.invalidate();
                    break;
                }
                break;
            case 1:
                vh.h.d1((vh.h) obj2, (Pair) obj);
                break;
            case 2:
                gj gjVar = (gj) obj2;
                TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                TLRPC.MessageMedia messageMedia = gjVar.k.media;
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
                long j3 = 1000 * gjVar.k.date;
                e2 Q = LaunchActivity.Q();
                if (Q != null) {
                    String b10 = wg.h.b(gjVar);
                    TLRPC.Chat M0 = np.s1(m10.t0).M0(Long.valueOf(-gjVar.Z0()));
                    boolean z10 = M0 != null && t3.V(M0);
                    fb fbVar = new fb(Q.getParentActivity(), Q.getResourceProvider());
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        fbVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                        fbVar.b.setText(hd.M0(2131753371, null));
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                        if (((TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo).participating) {
                            fbVar.c(R.raw.forward, 30, 30, new String[0]);
                            fbVar.b.setText(hd.M0(2131753369, null));
                        } else {
                            fbVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                            fbVar.b.setText(hd.M0(2131753370, null));
                        }
                    }
                    fbVar.b.setSingleLine(false);
                    fbVar.b.setMaxLines(2);
                    vb vbVar = new vb(Q.getParentActivity(), Q.getResourceProvider(), true);
                    vbVar.e(hd.M0(2131749010, null));
                    vbVar.b = new ai.j(payments_giveawayinfo, z10, b10, j3, tL_messageMediaGiveaway2, Q);
                    fbVar.setButton(vbVar);
                    xb.g(Q, fbVar, 2750).j();
                    break;
                }
                break;
            case 3:
                wg.o0 o0Var = (wg.o0) obj2;
                o0Var.W1.setLoading(false);
                wg.h.j(o0Var.getContext(), (TLRPC.TL_error) obj);
                break;
            case 4:
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
                    org.telegram.messenger.g0.i(colorMatrix, j6.I.q() ? 0.08f : 1.25f);
                    org.telegram.messenger.g0.h(colorMatrix, j6.I.q() ? 0.02f : -0.15f);
                    hVar.M.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    matrix.reset();
                    matrix.setScale(15.0f, 15.0f);
                    hVar.K.setLocalMatrix(matrix);
                    break;
                } else {
                    hVar.J.recycle();
                    break;
                }
            case 5:
                HashMap hashMap = ((xg.b) obj2).x;
                hashMap.clear();
                hashMap.putAll((HashMap) obj);
                break;
            case 6:
                ((xg.f) obj2).F((TLObject) obj);
                break;
            default:
                HashMap hashMap2 = ((xg.i) obj2).r;
                hashMap2.clear();
                hashMap2.putAll((HashMap) obj);
                break;
        }
    }
}
