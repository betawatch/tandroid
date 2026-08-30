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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sv implements org.telegram.ui.Components.pq0, org.telegram.ui.Components.jl0, org.telegram.ui.Components.kl0, k10, org.telegram.ui.ActionBar.c2, r0.o, org.telegram.ui.Components.yk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oy b;

    public /* synthetic */ sv(oy oyVar, int i10) {
        this.a = i10;
        this.b = oyVar;
    }

    @Override // r0.o
    public r0.m1 N0(View view, r0.m1 m1Var) {
        oy oyVar = this.b;
        oyVar.v.i(m1Var);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        oyVar.c4 = defaultWindowInsets.b;
        oyVar.d4 = defaultWindowInsets.d;
        int i10 = m1Var.a.f(8).d;
        if (oyVar.e4 != i10) {
            oyVar.e4 = i10;
            oyVar.fragmentView.requestLayout();
        }
        oyVar.C0.setPadding(0, oyVar.c4, 0, 0);
        oyVar.X4();
        for (UndoView undoView : oyVar.v0) {
            if (undoView != null) {
                int i11 = oyVar.d4 + oyVar.f4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                    marginLayoutParams.bottomMargin = i11;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        jx jxVar = oyVar.C3;
        if (jxVar != null) {
            r0.j0.b(jxVar, m1Var);
        }
        return r0.m1.b;
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
                oy oyVar = this.b;
                org.telegram.ui.Components.i51 G = oyVar.z0.g0.G(i10);
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
                        oy.d4(xnVar, messageObject);
                        oyVar.presentFragment(xnVar);
                        break;
                    }
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("chat_id", ((TLRPC.Chat) obj).id);
                    xn xnVar2 = new xn(bundle2);
                    org.telegram.ui.Components.yn0 yn0Var = oyVar.z0.g0;
                    yn0Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    while (true) {
                        i10++;
                        if (i10 >= yn0Var.x.size()) {
                            xnVar2.cb = arrayList;
                            oyVar.presentFragment(xnVar2);
                            break;
                        } else {
                            org.telegram.ui.Components.i51 G2 = yn0Var.G(i10);
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
                oy oyVar2 = this.b;
                org.telegram.ui.Components.i51 G3 = oyVar2.z0.l0.G(i10);
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
                        oy.d4(xnVar3, messageObject2);
                        oyVar2.presentFragment(xnVar3);
                        break;
                    }
                } else {
                    oyVar2.presentFragment(ProfileActivity.m4(((TLRPC.User) obj3).id));
                    break;
                }
                break;
            default:
                oy oyVar3 = this.b;
                Object J = oyVar3.z0.V.J(i10);
                if (!(J instanceof TLRPC.TL_sponsoredPeer)) {
                    if (view instanceof org.telegram.ui.Cells.h6) {
                        org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                        if (h6Var.k0) {
                            oyVar3.N4(h6Var.getDialogId(), view);
                            break;
                        }
                    }
                    if (oyVar3.O0 != 10) {
                        oyVar3.n4(view, i10, oyVar3.z0.V);
                        break;
                    } else {
                        xx xxVar = oyVar3.z0;
                        lh.e1 e1Var = xxVar.S;
                        oyVar3.o4(view, i10, f10, xxVar.V);
                        break;
                    }
                } else {
                    TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) J;
                    oyVar3.presentFragment(xn.R9(DialogObject.getPeerDialogId(tL_sponsoredPeer.peer)));
                    org.telegram.ui.Components.wn0 wn0Var = oyVar3.z0.V;
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
        oy oyVar = this.b;
        oyVar.N = true;
        oyVar.fragmentView.invalidate();
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ boolean e1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.kl0
    public boolean f(int i10, View view) {
        oy.n0(this.b, i10);
        return false;
    }

    public void g(int i10) {
        zw zwVar = this.b.y1;
        if (zwVar == null) {
            return;
        }
        if (i10 == 0) {
            zwVar.q0(true);
        } else {
            zwVar.x1(true, false);
        }
    }

    public void h(boolean z4, ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        this.b.W4(z4, arrayList, arrayList2, z10, true);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 6:
                oy.f0(this.b);
                break;
            case 7:
            default:
                oy oyVar = this.b;
                oyVar.getMessagesController().hidePromoDialog();
                oyVar.b4(false);
                break;
            case 8:
                oy oyVar2 = this.b;
                oyVar2.getClass();
                Intent permissionManagerIntent = XiaomiUtilities.getPermissionManagerIntent();
                if (permissionManagerIntent != null) {
                    try {
                        try {
                            oyVar2.getParentActivity().startActivity(permissionManagerIntent);
                            break;
                        } catch (Exception unused) {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                            oyVar2.getParentActivity().startActivity(intent);
                            return;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                break;
            case 9:
                oy oyVar3 = this.b;
                oyVar3.getClass();
                Intent intent2 = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                try {
                    oyVar3.getParentActivity().startActivity(intent2);
                    break;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
        }
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ void o0(View view, float f10, float f11) {
        int i10 = this.a;
    }

    private final /* synthetic */ void a(View view, float f10, float f11) {
    }

    private final /* synthetic */ void b(View view, float f10, float f11) {
    }

    private final /* synthetic */ void e(View view, float f10, float f11) {
    }
}
