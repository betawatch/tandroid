// default package

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vzb implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vzb(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        gl2 gl2Var;
        final byte b = 1;
        final byte b2 = 0;
        switch (this.a) {
            case 0:
                c0c c0cVar = (c0c) this.b;
                l5c l5cVar = (l5c) this.c;
                c0cVar.f2 = false;
                c0cVar.S0();
                l5cVar.O(true);
                c0cVar.D0();
                break;
            case 1:
                xzb xzbVar = (xzb) this.b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                ImageView imageView = xzbVar.s;
                imageView.animate().rotation(imageView.getRotation() + 180.0f).setDuration(380L).setInterpolator(s33.h).start();
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 2:
                mr1 mr1Var = (mr1) this.b;
                ((m8) this.c).d(true);
                g0c.a(mr1Var.getContext(), mr1Var.d);
                break;
            case 3:
                u41 u41Var = (u41) this.b;
                fx0 fx0Var = (fx0) this.c;
                if (u41Var.J > 0) {
                    gl.B3(3.0f, u41Var, null);
                    pw0.E.a();
                    break;
                } else {
                    fx0Var.dismiss();
                    break;
                }
            case 4:
                UndoView undoView = (UndoView) this.b;
                TLRPC.Message message = (TLRPC.Message) this.c;
                int i = UndoView.j0;
                undoView.d(1, true);
                TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
                tL_payments_getPaymentReceipt.msg_id = message.id;
                d dVar = undoView.s;
                tL_payments_getPaymentReceipt.peer = dVar.getMessagesController().k1(message.peer_id);
                dVar.getConnectionsManager().sendRequest(tL_payments_getPaymentReceipt, new wx9(undoView, (byte) 18), 2);
                break;
            case 5:
                j6c j6cVar = (j6c) this.b;
                File file = (File) this.c;
                Activity W = gl.W(j6cVar.getContext());
                if (W != null) {
                    gl.s2(file, "Telegram.apk", "application/vnd.android.package-archive", W, null, false);
                    j6cVar.dismiss();
                    break;
                }
                break;
            case 6:
                s7c s7cVar = (s7c) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                HashSet hashSet = s7cVar.b2;
                int size = arrayList.size();
                while (b2 < size) {
                    Long l = (Long) arrayList.get(b2);
                    l.getClass();
                    hashSet.remove(l);
                    s7cVar.h2.remove(l);
                    b2++;
                }
                s7cVar.Y0();
                s7cVar.U1.b(true, hashSet, new m7c(s7cVar, (byte) 5), null);
                s7cVar.g1(true, true);
                s7cVar.Z0();
                break;
            case 7:
                final s7c s7cVar2 = (s7c) this.b;
                final TLRPC.User user = (TLRPC.User) this.c;
                cs5 G = cs5.G(s7cVar2.c, s7cVar2.J0, (View) view.getParent());
                G.b(R.drawable.profile_discuss, k96.M0(2131745409, null), new Runnable() { // from class: p7c
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        TLRPC.User user2 = user;
                        s7c s7cVar3 = s7cVar2;
                        switch (b3) {
                            case 0:
                                if (user2 != null) {
                                    d dVar2 = s7cVar3.r1;
                                    if (dVar2 != null) {
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("user_id", user2.id);
                                        dVar2.presentFragment(new mu1(bundle));
                                        break;
                                    } else {
                                        d S = LaunchActivity.S();
                                        ag0 ag0Var = new ag0();
                                        ag0Var.a = true;
                                        if (S != null) {
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putLong("user_id", user2.id);
                                            S.showAsSheet(new mu1(bundle2), ag0Var);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                if (user2 != null) {
                                    d dVar3 = s7cVar3.r1;
                                    if (dVar3 != null) {
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("user_id", user2.id);
                                        dVar3.presentFragment(new ProfileActivity(bundle3, null));
                                        break;
                                    } else {
                                        d S2 = LaunchActivity.S();
                                        if (S2 != null) {
                                            ag0 ag0Var2 = new ag0();
                                            ag0Var2.a = true;
                                            Bundle bundle4 = new Bundle();
                                            bundle4.putLong("user_id", user2.id);
                                            S2.showAsSheet(new ProfileActivity(bundle4, null), ag0Var2);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                }, false);
                G.b(R.drawable.msg_openprofile, k96.M0(2131747593, null), new Runnable() { // from class: p7c
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b;
                        TLRPC.User user2 = user;
                        s7c s7cVar3 = s7cVar2;
                        switch (b3) {
                            case 0:
                                if (user2 != null) {
                                    d dVar2 = s7cVar3.r1;
                                    if (dVar2 != null) {
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("user_id", user2.id);
                                        dVar2.presentFragment(new mu1(bundle));
                                        break;
                                    } else {
                                        d S = LaunchActivity.S();
                                        ag0 ag0Var = new ag0();
                                        ag0Var.a = true;
                                        if (S != null) {
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putLong("user_id", user2.id);
                                            S.showAsSheet(new mu1(bundle2), ag0Var);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                if (user2 != null) {
                                    d dVar3 = s7cVar3.r1;
                                    if (dVar3 != null) {
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("user_id", user2.id);
                                        dVar3.presentFragment(new ProfileActivity(bundle3, null));
                                        break;
                                    } else {
                                        d S2 = LaunchActivity.S();
                                        if (S2 != null) {
                                            ag0 ag0Var2 = new ag0();
                                            ag0Var2.a = true;
                                            Bundle bundle4 = new Bundle();
                                            bundle4.putLong("user_id", user2.id);
                                            S2.showAsSheet(new ProfileActivity(bundle4, null), ag0Var2);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                }, false);
                G.a0();
                break;
            case 8:
                ((VideoAds) this.b).lambda$show$2((VideoAds.CloseDrawable) this.c, view);
                break;
            case 9:
                ((VideoAds) this.b).lambda$show$18((TLRPC.TL_sponsoredMessage) this.c, view);
                break;
            case 10:
                hgc hgcVar = (hgc) this.b;
                Activity activity = (Activity) this.c;
                s7c s7cVar3 = hgcVar.N;
                if (s7cVar3 != null) {
                    s7cVar3.dismiss();
                    hgcVar.N = null;
                }
                s7c s7cVar4 = new s7c(activity, hgcVar.a, new e53());
                TLRPC.User user2 = hgcVar.c;
                long j = user2 != null ? user2.id : 0L;
                TLRPC.User user3 = hgcVar.d;
                long[] jArr = {j, user3 != null ? user3.id : 0L};
                for (int i2 = 0; i2 < 2; i2++) {
                    s7cVar4.s2.add(Long.valueOf(jArr[i2]));
                }
                s7cVar4.f1(false, true);
                s7cVar4.t2 = new np0((byte) 4);
                hgcVar.N = s7cVar4;
                s7cVar4.show();
                break;
            case 11:
                boolean[] zArr = (boolean[]) this.b;
                ag2 ag2Var = (ag2) this.c;
                boolean z = !zArr[0];
                zArr[0] = z;
                ag2Var.c(z, true);
                break;
            case 12:
                xgc xgcVar = (xgc) this.b;
                Context context = (Context) this.c;
                if (context instanceof LaunchActivity) {
                    if (a.x) {
                        Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                        intent.setAction("voip");
                        context.startActivity(intent);
                        break;
                    } else {
                        hgc.n((Activity) context, xgcVar.N);
                        break;
                    }
                }
                break;
            case 13:
                glc glcVar = (glc) this.b;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.c;
                d S = LaunchActivity.S();
                if (S != null) {
                    glcVar.dismiss();
                    ypc ypcVar = new ypc();
                    ypcVar.m0(nftitem);
                    S.presentFragment(ypcVar);
                    break;
                }
                break;
            case 14:
                nk1 nk1Var = (nk1) this.b;
                cj7[] cj7VarArr = (cj7[]) this.c;
                nk1Var.run();
                cj7VarArr[0].dismiss();
                break;
            case 15:
                ag2 ag2Var2 = (ag2) this.b;
                TextView textView = (TextView) this.c;
                ag2Var2.c(!ag2Var2.b(), true);
                textView.setVisibility(ag2Var2.b() ? 0 : 8);
                break;
            default:
                u41 u41Var2 = (u41) this.b;
                int[] iArr = (int[]) this.c;
                if (!u41Var2.R && (gl2Var = xrc.d) != null) {
                    u41Var2.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] f = gl2Var.f();
                        u84 u84Var = new u84(applicationContext, ay4.c);
                        String str = (String) gl2Var.e;
                        x1d x1dVar = u84Var.i;
                        q0e q0eVar = new q0e(x1dVar, str, "/tg-wear-auth/answer", f);
                        x1dVar.b.d(0, q0eVar);
                        wbd.a(q0eVar, pd5.f).addOnSuccessListener(new io9(gl2Var, u41Var2, iArr, (byte) 16)).addOnFailureListener(new vrc(u41Var2, (byte) 0));
                        break;
                    } catch (Exception e) {
                        fa4.g(e, true);
                        u41Var2.setLoading(false);
                    }
                }
                break;
        }
    }
}
