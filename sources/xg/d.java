package xg;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import gi.q1;
import java.util.HashMap;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.t3;
import org.telegram.messenger.u10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.ib;
import org.telegram.ui.Components.yb;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        int i3 = this.a;
        Object obj2 = this.b;
        switch (i3) {
            case 0:
                zi ziVar = (zi) obj2;
                TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                TLRPC.MessageMedia messageMedia = ziVar.k.media;
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
                long j10 = 1000 * ziVar.k.date;
                d2 Q = LaunchActivity.Q();
                if (Q != null) {
                    String b10 = j.b(ziVar);
                    TLRPC.Chat M0 = hp.s1(h10.t0).M0(Long.valueOf(-ziVar.Z0()));
                    boolean z10 = M0 != null && t3.V(M0);
                    ib ibVar = new ib(Q.getParentActivity(), Q.getResourceProvider());
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        ibVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                        ibVar.b.setText(bd.M0(2131753371, null));
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                        if (((TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo).participating) {
                            ibVar.c(R.raw.forward, 30, 30, new String[0]);
                            ibVar.b.setText(bd.M0(2131753369, null));
                        } else {
                            ibVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                            ibVar.b.setText(bd.M0(2131753370, null));
                        }
                    }
                    ibVar.b.setSingleLine(false);
                    ibVar.b.setMaxLines(2);
                    yb ybVar = new yb(Q.getParentActivity(), Q.getResourceProvider(), true);
                    ybVar.e(bd.M0(2131749018, null));
                    ybVar.b = new q1(payments_giveawayinfo, z10, b10, j10, tL_messageMediaGiveaway2, Q);
                    ibVar.setButton(ybVar);
                    ac.g(Q, ibVar, 2750).j();
                    break;
                }
                break;
            case 1:
                q0 q0Var = (q0) obj2;
                q0Var.T1.setLoading(false);
                j.j(q0Var.getContext(), (TLRPC.TL_error) obj);
                break;
            case 2:
                xh.h hVar = (xh.h) obj2;
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
                    org.telegram.messenger.g0.i(colorMatrix, k6.I.q() ? 0.08f : 1.25f);
                    org.telegram.messenger.g0.h(colorMatrix, k6.I.q() ? 0.02f : -0.15f);
                    hVar.M.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    matrix.reset();
                    matrix.setScale(15.0f, 15.0f);
                    hVar.K.setLocalMatrix(matrix);
                    break;
                } else {
                    hVar.J.recycle();
                    break;
                }
            case 3:
                HashMap hashMap = ((yg.b) obj2).x;
                hashMap.clear();
                hashMap.putAll((HashMap) obj);
                break;
            case 4:
                ((yg.e) obj2).F((TLObject) obj);
                break;
            default:
                HashMap hashMap2 = ((yg.h) obj2).r;
                hashMap2.clear();
                hashMap2.putAll((HashMap) obj);
                break;
        }
    }
}
