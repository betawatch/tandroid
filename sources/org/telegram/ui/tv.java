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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tv implements org.telegram.ui.Components.pq0, org.telegram.ui.Components.jl0, org.telegram.ui.Components.kl0, k10, org.telegram.ui.ActionBar.c2, r0.o, org.telegram.ui.Components.yk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ py b;

    public /* synthetic */ tv(py pyVar, int i10) {
        this.a = i10;
        this.b = pyVar;
    }

    @Override // r0.o
    public r0.m1 M0(View view, r0.m1 m1Var) {
        py pyVar = this.b;
        pyVar.v.i(m1Var);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        pyVar.c4 = defaultWindowInsets.b;
        pyVar.d4 = defaultWindowInsets.d;
        int i10 = m1Var.a.f(8).d;
        if (pyVar.e4 != i10) {
            pyVar.e4 = i10;
            pyVar.fragmentView.requestLayout();
        }
        pyVar.C0.setPadding(0, pyVar.c4, 0, 0);
        pyVar.X4();
        for (UndoView undoView : pyVar.v0) {
            if (undoView != null) {
                int i11 = pyVar.d4 + pyVar.f4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                    marginLayoutParams.bottomMargin = i11;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        kx kxVar = pyVar.C3;
        if (kxVar != null) {
            r0.j0.b(kxVar, m1Var);
        }
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ boolean Y0(View view) {
        switch (this.a) {
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fa A[SYNTHETIC] */
    @Override // org.telegram.ui.Components.jl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(float f10, float f11, int i10, View view) {
        TLRPC.Chat chat;
        switch (this.a) {
            case 1:
                py pyVar = this.b;
                org.telegram.ui.Components.h51 G = pyVar.z0.g0.G(i10);
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
                        xn xnVar = new xn(bundle);
                        py.d4(xnVar, messageObject);
                        pyVar.presentFragment(xnVar);
                        break;
                    }
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("chat_id", ((TLRPC.Chat) obj).id);
                    xn xnVar2 = new xn(bundle2);
                    org.telegram.ui.Components.yn0 yn0Var = pyVar.z0.g0;
                    yn0Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    while (true) {
                        i10++;
                        if (i10 >= yn0Var.x.size()) {
                            xnVar2.cb = arrayList;
                            pyVar.presentFragment(xnVar2);
                            break;
                        } else {
                            org.telegram.ui.Components.h51 G2 = yn0Var.G(i10);
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
                py pyVar2 = this.b;
                org.telegram.ui.Components.h51 G3 = pyVar2.z0.l0.G(i10);
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
                        xn xnVar3 = new xn(bundle3);
                        py.d4(xnVar3, messageObject2);
                        pyVar2.presentFragment(xnVar3);
                        break;
                    }
                } else {
                    pyVar2.presentFragment(ProfileActivity.m4(((TLRPC.User) obj3).id));
                    break;
                }
                break;
            default:
                py pyVar3 = this.b;
                Object J = pyVar3.z0.V.J(i10);
                if (!(J instanceof TLRPC.TL_sponsoredPeer)) {
                    if (view instanceof org.telegram.ui.Cells.h6) {
                        org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                        if (h6Var.k0) {
                            pyVar3.N4(h6Var.getDialogId(), view);
                            break;
                        }
                    }
                    if (pyVar3.O0 != 10) {
                        pyVar3.n4(view, i10, pyVar3.z0.V);
                        break;
                    } else {
                        yx yxVar = pyVar3.z0;
                        mh.d1 d1Var = yxVar.S;
                        pyVar3.o4(view, i10, f10, yxVar.V);
                        break;
                    }
                } else {
                    TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) J;
                    pyVar3.presentFragment(xn.R9(DialogObject.getPeerDialogId(tL_sponsoredPeer.peer)));
                    org.telegram.ui.Components.wn0 wn0Var = pyVar3.z0.V;
                    wn0Var.getClass();
                    TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
                    tL_messages_clickSponsoredMessage.random_id = tL_sponsoredPeer.random_id;
                    ConnectionsManager.getInstance(wn0Var.p0).sendRequest(tL_messages_clickSponsoredMessage, null);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.Components.yk0
    public void d() {
        py pyVar = this.b;
        pyVar.N = true;
        pyVar.fragmentView.invalidate();
    }

    @Override // org.telegram.ui.Components.kl0
    public boolean f(int i10, View view) {
        py.n0(this.b, i10);
        return false;
    }

    public void g(int i10) {
        ax axVar = this.b.y1;
        if (axVar == null) {
            return;
        }
        if (i10 == 0) {
            axVar.q0(true);
        } else {
            axVar.x1(true, false);
        }
    }

    public void h(boolean z4, ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        this.b.W4(z4, arrayList, arrayList2, z10, true);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 6:
                py.f0(this.b);
                break;
            case 7:
            default:
                py pyVar = this.b;
                pyVar.getMessagesController().hidePromoDialog();
                pyVar.b4(false);
                break;
            case 8:
                py pyVar2 = this.b;
                pyVar2.getClass();
                Intent permissionManagerIntent = XiaomiUtilities.getPermissionManagerIntent();
                if (permissionManagerIntent != null) {
                    try {
                        try {
                            pyVar2.getParentActivity().startActivity(permissionManagerIntent);
                            break;
                        } catch (Exception unused) {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                            pyVar2.getParentActivity().startActivity(intent);
                            return;
                        }
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        return;
                    }
                }
                break;
            case 9:
                py pyVar3 = this.b;
                pyVar3.getClass();
                Intent intent2 = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                try {
                    pyVar3.getParentActivity().startActivity(intent2);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ void r0(View view, float f10, float f11) {
        int i10 = this.a;
    }

    private final /* synthetic */ void a(View view, float f10, float f11) {
    }

    private final /* synthetic */ void b(View view, float f10, float f11) {
    }

    private final /* synthetic */ void e(View view, float f10, float f11) {
    }
}
