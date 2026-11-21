package wg;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Components.a70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
import v4.p;
import wg.b0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        final int i10 = 0;
        final int i11 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                e1 e1Var = (e1) obj2;
                ArrayList arrayList = (ArrayList) obj;
                HashSet hashSet = e1Var.c2;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj3 = arrayList.get(i10);
                    i10++;
                    Long l10 = (Long) obj3;
                    l10.getClass();
                    hashSet.remove(l10);
                    e1Var.i2.remove(l10);
                }
                e1Var.e1();
                e1Var.V1.b(true, hashSet, new x0(e1Var, 5), null);
                e1Var.m1(true, true);
                e1Var.f1();
                break;
            case 1:
                final e1 e1Var2 = (e1) obj2;
                final TLRPC.User user = (TLRPC.User) obj;
                a70 G = a70.G(e1Var2.c, e1Var2.J0, (View) view.getParent());
                G.c(R.drawable.profile_discuss, gd.N0(2131745405, null), new Runnable() { // from class: wg.b1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                TLRPC.User user2 = user;
                                if (user2 != null) {
                                    g2 g2Var = e1Var2.s1;
                                    if (g2Var != null) {
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("user_id", user2.id);
                                        g2Var.presentFragment(new bn(bundle));
                                        break;
                                    } else {
                                        g2 T = LaunchActivity.T();
                                        e2 e2Var = new e2();
                                        e2Var.a = true;
                                        if (T != null) {
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putLong("user_id", user2.id);
                                            T.showAsSheet(new bn(bundle2), e2Var);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                TLRPC.User user3 = user;
                                if (user3 != null) {
                                    g2 g2Var2 = e1Var2.s1;
                                    if (g2Var2 != null) {
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("user_id", user3.id);
                                        g2Var2.presentFragment(new ProfileActivity(bundle3, null));
                                        break;
                                    } else {
                                        g2 T2 = LaunchActivity.T();
                                        if (T2 != null) {
                                            e2 e2Var2 = new e2();
                                            e2Var2.a = true;
                                            Bundle bundle4 = new Bundle();
                                            bundle4.putLong("user_id", user3.id);
                                            T2.showAsSheet(new ProfileActivity(bundle4, null), e2Var2);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                }, false);
                G.c(R.drawable.msg_openprofile, gd.N0(2131747592, null), new Runnable() { // from class: wg.b1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                TLRPC.User user2 = user;
                                if (user2 != null) {
                                    g2 g2Var = e1Var2.s1;
                                    if (g2Var != null) {
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("user_id", user2.id);
                                        g2Var.presentFragment(new bn(bundle));
                                        break;
                                    } else {
                                        g2 T = LaunchActivity.T();
                                        e2 e2Var = new e2();
                                        e2Var.a = true;
                                        if (T != null) {
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putLong("user_id", user2.id);
                                            T.showAsSheet(new bn(bundle2), e2Var);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                TLRPC.User user3 = user;
                                if (user3 != null) {
                                    g2 g2Var2 = e1Var2.s1;
                                    if (g2Var2 != null) {
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("user_id", user3.id);
                                        g2Var2.presentFragment(new ProfileActivity(bundle3, null));
                                        break;
                                    } else {
                                        g2 T2 = LaunchActivity.T();
                                        if (T2 != null) {
                                            e2 e2Var2 = new e2();
                                            e2Var2.a = true;
                                            Bundle bundle4 = new Bundle();
                                            bundle4.putLong("user_id", user3.id);
                                            T2.showAsSheet(new ProfileActivity(bundle4, null), e2Var2);
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
            case 2:
                final xg.e eVar = (xg.e) obj2;
                final yg.a aVar = (yg.a) obj;
                if (!eVar.d) {
                    ((b0) eVar).r.dismiss();
                    break;
                } else if (!aVar.a.R) {
                    aVar.b(true);
                    String str = eVar.h;
                    x10 x10Var = new x10() { // from class: xg.d
                        @Override // org.telegram.messenger.x10
                        public final void a(Object obj4) {
                            switch (i10) {
                                case 0:
                                    aVar.b(false);
                                    b0 b0Var = (b0) eVar;
                                    g0.h3(new p(b0Var, 8), 200L);
                                    b0Var.r.dismiss();
                                    break;
                                default:
                                    aVar.b(false);
                                    e eVar2 = eVar;
                                    wg.h.c((TLRPC.TL_error) obj4, eVar2.n, eVar2.c, new c(eVar2, 1));
                                    break;
                            }
                        }
                    };
                    x10 x10Var2 = new x10() { // from class: xg.d
                        @Override // org.telegram.messenger.x10
                        public final void a(Object obj4) {
                            switch (i11) {
                                case 0:
                                    aVar.b(false);
                                    b0 b0Var = (b0) eVar;
                                    g0.h3(new p(b0Var, 8), 200L);
                                    b0Var.r.dismiss();
                                    break;
                                default:
                                    aVar.b(false);
                                    e eVar2 = eVar;
                                    wg.h.c((TLRPC.TL_error) obj4, eVar2.n, eVar2.c, new c(eVar2, 1));
                                    break;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(j10.t0);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new n(x10Var2, x10Var, i10), 2);
                    break;
                }
                break;
            case 3:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                yg.f fVar = ((yg.g) obj2).w;
                if (fVar != null) {
                    a0 a0Var = ((u) fVar).a;
                    a0Var.Y1.remove(chat);
                    a0Var.l1(true, true);
                    break;
                }
                break;
            case 4:
                ((ug.z) obj2).a((TLRPC.TL_payments_checkedGiftCode) obj);
                break;
            default:
                ((ug.z) obj2).a((TLRPC.Chat) obj);
                break;
        }
    }
}
