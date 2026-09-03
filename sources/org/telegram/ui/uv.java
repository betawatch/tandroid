package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.XiaomiUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uv implements org.telegram.ui.Components.pq0, org.telegram.ui.Components.il0, org.telegram.ui.Components.jl0, l10, org.telegram.ui.ActionBar.c2, r0.o, org.telegram.ui.Components.xk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qy b;

    public /* synthetic */ uv(qy qyVar, int i10) {
        this.a = i10;
        this.b = qyVar;
    }

    @Override // r0.o
    public r0.m1 M0(View view, r0.m1 m1Var) {
        qy qyVar = this.b;
        qyVar.v.i(m1Var);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        qyVar.c4 = defaultWindowInsets.b;
        qyVar.d4 = defaultWindowInsets.d;
        int i10 = m1Var.a.f(8).d;
        if (qyVar.e4 != i10) {
            qyVar.e4 = i10;
            qyVar.fragmentView.requestLayout();
        }
        qyVar.C0.setPadding(0, qyVar.c4, 0, 0);
        qyVar.X4();
        for (UndoView undoView : qyVar.v0) {
            if (undoView != null) {
                int i11 = qyVar.d4 + qyVar.f4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                    marginLayoutParams.bottomMargin = i11;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        lx lxVar = qyVar.C3;
        if (lxVar != null) {
            r0.j0.b(lxVar, m1Var);
        }
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.il0
    public /* synthetic */ boolean Z0(View view) {
        switch (this.a) {
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fa A[SYNTHETIC] */
    @Override // org.telegram.ui.Components.il0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(float f10, float f11, int i10, View view) {
        TLRPC.Chat chat;
        switch (this.a) {
            case 1:
                qy qyVar = this.b;
                org.telegram.ui.Components.i51 G = qyVar.z0.g0.G(i10);
                Object obj = G != null ? G.G : null;
                if (!(obj instanceof TLRPC.Chat)) {
                    if (obj instanceof MessageObject) {
                        MessageObject messageObject = (MessageObject) obj;
                        Bundle bundle = new Bundle();
                        if (messageObject.getDialogId() >= 0) {
                            bundle.putLong("user_id", messageObject.getDialogId());
                        } else {
                            bundle.putLong("chat_id", -messageObject.getDialogId());
                        }
                        bundle.putInt("message_id", messageObject.getId());
                        zn znVar = new zn(bundle);
                        qy.d4(znVar, messageObject);
                        qyVar.presentFragment(znVar);
                        break;
                    }
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("chat_id", ((TLRPC.Chat) obj).id);
                    zn znVar2 = new zn(bundle2);
                    org.telegram.ui.Components.xn0 xn0Var = qyVar.z0.g0;
                    xn0Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    while (true) {
                        i10++;
                        if (i10 >= xn0Var.x.size()) {
                            znVar2.cb = arrayList;
                            qyVar.presentFragment(znVar2);
                            break;
                        } else {
                            org.telegram.ui.Components.i51 G2 = xn0Var.G(i10);
                            if (G2 != null) {
                                Object obj2 = G2.G;
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
            case 2:
                qy qyVar2 = this.b;
                org.telegram.ui.Components.i51 G3 = qyVar2.z0.l0.G(i10);
                Object obj3 = G3 != null ? G3.G : null;
                if (!(obj3 instanceof TLRPC.User)) {
                    if (obj3 instanceof MessageObject) {
                        MessageObject messageObject2 = (MessageObject) obj3;
                        Bundle bundle3 = new Bundle();
                        if (messageObject2.getDialogId() >= 0) {
                            bundle3.putLong("user_id", messageObject2.getDialogId());
                        } else {
                            bundle3.putLong("chat_id", -messageObject2.getDialogId());
                        }
                        bundle3.putInt("message_id", messageObject2.getId());
                        zn znVar3 = new zn(bundle3);
                        qy.d4(znVar3, messageObject2);
                        qyVar2.presentFragment(znVar3);
                        break;
                    }
                } else {
                    qyVar2.presentFragment(ProfileActivity.m4(((TLRPC.User) obj3).id));
                    break;
                }
                break;
            default:
                qy qyVar3 = this.b;
                Object J = qyVar3.z0.V.J(i10);
                if (!(J instanceof TLRPC.TL_sponsoredPeer)) {
                    if (view instanceof org.telegram.ui.Cells.g6) {
                        org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) view;
                        if (g6Var.k0) {
                            qyVar3.N4(g6Var.getDialogId(), view);
                            break;
                        }
                    }
                    if (qyVar3.O0 != 10) {
                        qyVar3.n4(view, i10, qyVar3.z0.V);
                        break;
                    } else {
                        zx zxVar = qyVar3.z0;
                        lh.e1 e1Var = zxVar.S;
                        qyVar3.o4(view, i10, f10, zxVar.V);
                        break;
                    }
                } else {
                    TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) J;
                    qyVar3.presentFragment(zn.R9(DialogObject.getPeerDialogId(tL_sponsoredPeer.peer)));
                    org.telegram.ui.Components.vn0 vn0Var = qyVar3.z0.V;
                    vn0Var.getClass();
                    TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
                    tL_messages_clickSponsoredMessage.random_id = tL_sponsoredPeer.random_id;
                    ConnectionsManager.getInstance(vn0Var.p0).sendRequest(tL_messages_clickSponsoredMessage, null);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.Components.jl0
    public boolean d(int i10, View view) {
        qy.n0(this.b, i10);
        return false;
    }

    @Override // org.telegram.ui.Components.xk0
    public void e() {
        qy qyVar = this.b;
        qyVar.N = true;
        qyVar.fragmentView.invalidate();
    }

    public void g(int i10) {
        bx bxVar = this.b.y1;
        if (bxVar == null) {
            return;
        }
        if (i10 == 0) {
            bxVar.q0(true);
        } else {
            bxVar.x1(true, false);
        }
    }

    public void h(boolean z4, ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        this.b.W4(z4, arrayList, arrayList2, z10, true);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 6:
                qy.f0(this.b);
                break;
            case 7:
            default:
                qy qyVar = this.b;
                qyVar.getMessagesController().hidePromoDialog();
                qyVar.b4(false);
                break;
            case 8:
                qy qyVar2 = this.b;
                qyVar2.getClass();
                Intent permissionManagerIntent = XiaomiUtilities.getPermissionManagerIntent();
                if (permissionManagerIntent != null) {
                    try {
                        try {
                            qyVar2.getParentActivity().startActivity(permissionManagerIntent);
                            break;
                        } catch (Exception unused) {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                            qyVar2.getParentActivity().startActivity(intent);
                            return;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                break;
            case 9:
                qy qyVar3 = this.b;
                qyVar3.getClass();
                Intent intent2 = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                try {
                    qyVar3.getParentActivity().startActivity(intent2);
                    break;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
        }
    }

    @Override // org.telegram.ui.Components.il0
    public /* synthetic */ void n0(View view, float f10, float f11) {
        int i10 = this.a;
    }

    private final /* synthetic */ void a(View view, float f10, float f11) {
    }

    private final /* synthetic */ void b(View view, float f10, float f11) {
    }

    private final /* synthetic */ void f(View view, float f10, float f11) {
    }
}
