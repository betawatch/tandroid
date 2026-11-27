// default package

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xg3 implements s69, t69, og4, fd, ry4, nr7, sy4, rea, h69 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uj3 b;

    public /* synthetic */ xg3(uj3 uj3Var, byte b) {
        this.a = b;
        this.b = uj3Var;
    }

    @Override // s69
    public final boolean C(View view) {
        byte b = this.a;
        return false;
    }

    @Override // nr7
    public final l2d S(View view, l2d l2dVar) {
        uj3 uj3Var = this.b;
        uj3Var.w.j(l2dVar);
        mq5 H0 = hl.H0(l2dVar, false);
        uj3Var.l4 = H0.b;
        uj3Var.m4 = H0.d;
        int i = l2dVar.a.f(8).d;
        if (uj3Var.n4 != i) {
            uj3Var.n4 = i;
            uj3Var.fragmentView.requestLayout();
        }
        uj3Var.G0.setPadding(0, uj3Var.l4, 0, 0);
        uj3Var.u5();
        for (UndoView undoView : uj3Var.z0) {
            if (undoView != null) {
                int i2 = uj3Var.m4 + uj3Var.o4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i2) {
                    marginLayoutParams.bottomMargin = i2;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        li3 li3Var = uj3Var.H3;
        if (li3Var != null) {
            ihc.b(li3Var, l2dVar);
        }
        return l2d.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b A[SYNTHETIC] */
    @Override // s69
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(float f, float f2, int i, View view) {
        TLRPC.Chat chat;
        byte b = this.a;
        uj3 uj3Var = this.b;
        switch (b) {
            case 0:
                b8c G = uj3Var.D0.m0.G(i);
                Object obj = G != null ? G.H : null;
                if (!(obj instanceof TLRPC.Chat)) {
                    if (obj instanceof r47) {
                        r47 r47Var = (r47) obj;
                        Bundle bundle = new Bundle();
                        long B0 = r47.B0(r47Var.k);
                        TLRPC.Message message = r47Var.k;
                        if (B0 >= 0) {
                            bundle.putLong("user_id", r47.B0(message));
                        } else {
                            bundle.putLong("chat_id", -r47.B0(message));
                        }
                        bundle.putInt("message_id", r47Var.e1());
                        zu1 zu1Var = new zu1(bundle);
                        uj3.C3(zu1Var, r47Var);
                        uj3Var.presentFragment(zu1Var);
                        break;
                    }
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("chat_id", ((TLRPC.Chat) obj).id);
                    zu1 zu1Var2 = new zu1(bundle2);
                    ix9 ix9Var = uj3Var.D0.m0;
                    ix9Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    while (true) {
                        i++;
                        if (i >= ix9Var.E.size()) {
                            zu1Var2.Qb = arrayList;
                            uj3Var.presentFragment(zu1Var2);
                            break;
                        } else {
                            b8c G2 = ix9Var.G(i);
                            if (G2 != null) {
                                Object obj2 = G2.H;
                                if (obj2 instanceof TLRPC.Chat) {
                                    chat = (TLRPC.Chat) obj2;
                                    if (chat == null) {
                                        arrayList.add(chat);
                                    }
                                }
                            }
                            chat = null;
                            if (chat == null) {
                            }
                        }
                    }
                }
                break;
            case 1:
                uj3Var.M3(i);
                break;
            default:
                Object I = uj3Var.D0.e0.I(i);
                if (!(I instanceof TLRPC.TL_sponsoredPeer)) {
                    if (view instanceof bv8) {
                        bv8 bv8Var = (bv8) view;
                        if (bv8Var.p0) {
                            uj3Var.i5(bv8Var.getDialogId(), view);
                            break;
                        }
                    }
                    int i2 = uj3Var.T0;
                    bj3 bj3Var = uj3Var.D0;
                    if (i2 != 10) {
                        uj3Var.C4(view, i, bj3Var.e0);
                        break;
                    } else {
                        gw9 gw9Var = bj3Var.b0;
                        uj3Var.D4(view, i, f, bj3Var.e0);
                        break;
                    }
                } else {
                    TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) I;
                    uj3Var.presentFragment(zu1.ha(wf3.n(tL_sponsoredPeer.peer)));
                    gx9 gx9Var = uj3Var.D0.e0;
                    gx9Var.getClass();
                    TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
                    tL_messages_clickSponsoredMessage.random_id = tL_sponsoredPeer.random_id;
                    ConnectionsManager.getInstance(gx9Var.t0).sendRequest(tL_messages_clickSponsoredMessage, null);
                    break;
                }
        }
    }

    @Override // t69
    public final boolean e(int i, View view) {
        this.b.N3(i);
        return false;
    }

    @Override // h69
    public final void f() {
        uj3 uj3Var = this.b;
        uj3Var.R = true;
        uj3Var.fragmentView.invalidate();
    }

    public final void g(int i) {
        bi3 bi3Var = this.b.D1;
        if (bi3Var == null) {
            return;
        }
        if (i == 0) {
            bi3Var.R0(true);
        } else {
            bi3Var.n2(true, false);
        }
    }

    @Override // sy4
    public final int h() {
        return this.b.getThemedColor(aob.d6);
    }

    public final void i(boolean z, ArrayList arrayList, ArrayList arrayList2, boolean z2) {
        this.b.t5(z, arrayList, arrayList2, z2, true);
    }

    @Override // ry4
    public final void k(int i) {
        this.b.D3(i);
    }

    @Override // s69
    public final void u(View view, float f, float f2) {
        byte b = this.a;
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        uj3 uj3Var = this.b;
        switch (b) {
            case 5:
                uj3Var.g4();
                break;
            case 6:
            case 7:
            default:
                uj3Var.getMessagesController().g2();
                uj3Var.A3(false);
                break;
            case 8:
                Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
                intent.setPackage("com.miui.securitycenter");
                intent.putExtra("extra_package_uid", Process.myUid());
                intent.putExtra("extra_pkgname", a.b.getPackageName());
                try {
                    try {
                        uj3Var.getParentActivity().startActivity(intent);
                        break;
                    } catch (Exception unused) {
                        Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent2.setData(Uri.parse("package:" + a.b.getPackageName()));
                        uj3Var.getParentActivity().startActivity(intent2);
                        return;
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 9:
                Intent intent3 = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent3.setData(Uri.parse("package:" + a.b.getPackageName()));
                try {
                    uj3Var.getParentActivity().startActivity(intent3);
                    break;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
        }
    }

    private final void a(View view, float f, float f2) {
    }

    private final void b(View view, float f, float f2) {
    }

    private final void c(View view, float f, float f2) {
    }
}
