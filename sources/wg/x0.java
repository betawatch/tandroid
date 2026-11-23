package wg;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Components.x60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
import ug.u1;
import wg.a0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x0(int i7, Object obj, Object obj2) {
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
                d1 d1Var = (d1) obj2;
                ArrayList arrayList = (ArrayList) obj;
                HashSet hashSet = d1Var.c2;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj3 = arrayList.get(i10);
                    i10++;
                    Long l10 = (Long) obj3;
                    l10.getClass();
                    hashSet.remove(l10);
                    d1Var.i2.remove(l10);
                }
                d1Var.e1();
                d1Var.V1.b(true, hashSet, new w0(d1Var, 5), null);
                d1Var.m1(true, true);
                d1Var.f1();
                break;
            case 1:
                final d1 d1Var2 = (d1) obj2;
                final TLRPC.User user = (TLRPC.User) obj;
                x60 G = x60.G(d1Var2.c, d1Var2.J0, (View) view.getParent());
                G.c(R.drawable.profile_discuss, gd.N0(2131745405, null), new Runnable() { // from class: wg.a1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                TLRPC.User user2 = user;
                                if (user2 != null) {
                                    g2 g2Var = d1Var2.s1;
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
                                    g2 g2Var2 = d1Var2.s1;
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
                G.c(R.drawable.msg_openprofile, gd.N0(2131747592, null), new Runnable() { // from class: wg.a1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                TLRPC.User user2 = user;
                                if (user2 != null) {
                                    g2 g2Var = d1Var2.s1;
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
                                    g2 g2Var2 = d1Var2.s1;
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
                    ((a0) eVar).r.dismiss();
                    break;
                } else if (!aVar.a.R) {
                    aVar.b(true);
                    String str = eVar.h;
                    w10 w10Var = new w10() { // from class: xg.d
                        @Override // org.telegram.messenger.w10
                        public final void a(Object obj4) {
                            switch (i10) {
                                case 0:
                                    aVar.b(false);
                                    a0 a0Var = (a0) eVar;
                                    g0.h3(new u1(a0Var, 9), 200L);
                                    a0Var.r.dismiss();
                                    break;
                                default:
                                    aVar.b(false);
                                    e eVar2 = eVar;
                                    wg.h.c((TLRPC.TL_error) obj4, eVar2.n, eVar2.c, new c(eVar2, 1));
                                    break;
                            }
                        }
                    };
                    w10 w10Var2 = new w10() { // from class: xg.d
                        @Override // org.telegram.messenger.w10
                        public final void a(Object obj4) {
                            switch (i11) {
                                case 0:
                                    aVar.b(false);
                                    a0 a0Var = (a0) eVar;
                                    g0.h3(new u1(a0Var, 9), 200L);
                                    a0Var.r.dismiss();
                                    break;
                                default:
                                    aVar.b(false);
                                    e eVar2 = eVar;
                                    wg.h.c((TLRPC.TL_error) obj4, eVar2.n, eVar2.c, new c(eVar2, 1));
                                    break;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10.t0);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new n(w10Var2, w10Var, i10), 2);
                    break;
                }
                break;
            case 3:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                yg.f fVar = ((yg.g) obj2).w;
                if (fVar != null) {
                    z zVar = ((t) fVar).a;
                    zVar.Y1.remove(chat);
                    zVar.l1(true, true);
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
