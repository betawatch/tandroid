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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vv implements org.telegram.ui.Components.qr0, org.telegram.ui.Components.fm0, org.telegram.ui.Components.gm0, n10, org.telegram.ui.ActionBar.a2, r0.n, org.telegram.ui.Components.sl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ty b;

    public /* synthetic */ vv(ty tyVar, int i10) {
        this.a = i10;
        this.b = tyVar;
    }

    @Override // r0.n
    public r0.k1 M0(View view, r0.k1 k1Var) {
        ty tyVar = this.b;
        tyVar.v.k(k1Var);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        tyVar.e4 = defaultWindowInsets.b;
        tyVar.f4 = defaultWindowInsets.d;
        int i10 = k1Var.a.f(8).d;
        if (tyVar.g4 != i10) {
            tyVar.g4 = i10;
            tyVar.fragmentView.requestLayout();
        }
        tyVar.F0.setPadding(0, tyVar.e4, 0, 0);
        tyVar.U4();
        for (UndoView undoView : tyVar.y0) {
            if (undoView != null) {
                int i11 = tyVar.f4 + tyVar.h4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                    marginLayoutParams.bottomMargin = i11;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        nx nxVar = tyVar.F3;
        if (nxVar != null) {
            r0.i0.b(nxVar, k1Var);
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.fm0
    public /* synthetic */ boolean Y0(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.sl0
    public void a() {
        ty tyVar = this.b;
        tyVar.Q = true;
        tyVar.fragmentView.invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fa A[SYNTHETIC] */
    @Override // org.telegram.ui.Components.fm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(float f7, float f10, int i10, View view) {
        TLRPC.Chat chat;
        switch (this.a) {
            case 1:
                ty tyVar = this.b;
                org.telegram.ui.Components.p61 G = tyVar.C0.j0.G(i10);
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
                        ty.a4(znVar, messageObject);
                        tyVar.presentFragment(znVar);
                        break;
                    }
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("chat_id", ((TLRPC.Chat) obj).id);
                    zn znVar2 = new zn(bundle2);
                    org.telegram.ui.Components.yo0 yo0Var = tyVar.C0.j0;
                    yo0Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    while (true) {
                        i10++;
                        if (i10 >= yo0Var.x.size()) {
                            znVar2.fb = arrayList;
                            tyVar.presentFragment(znVar2);
                            break;
                        } else {
                            org.telegram.ui.Components.p61 G2 = yo0Var.G(i10);
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
                ty tyVar2 = this.b;
                org.telegram.ui.Components.p61 G3 = tyVar2.C0.o0.G(i10);
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
                        ty.a4(znVar3, messageObject2);
                        tyVar2.presentFragment(znVar3);
                        break;
                    }
                } else {
                    tyVar2.presentFragment(ProfileActivity.m4(((TLRPC.User) obj3).id));
                    break;
                }
                break;
            default:
                ty tyVar3 = this.b;
                Object J = tyVar3.C0.b0.J(i10);
                if (!(J instanceof TLRPC.TL_sponsoredPeer)) {
                    if (view instanceof org.telegram.ui.Cells.i6) {
                        org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
                        if (i6Var.n0) {
                            tyVar3.K4(i6Var.getDialogId(), view);
                            break;
                        }
                    }
                    if (tyVar3.R0 != 10) {
                        tyVar3.k4(view, i10, tyVar3.C0.b0);
                        break;
                    } else {
                        dy dyVar = tyVar3.C0;
                        ai.w0 w0Var = dyVar.V;
                        tyVar3.l4(view, i10, f7, dyVar.b0);
                        break;
                    }
                } else {
                    TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) J;
                    tyVar3.presentFragment(zn.W9(DialogObject.getPeerDialogId(tL_sponsoredPeer.peer)));
                    org.telegram.ui.Components.wo0 wo0Var = tyVar3.C0.b0;
                    wo0Var.getClass();
                    TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
                    tL_messages_clickSponsoredMessage.random_id = tL_sponsoredPeer.random_id;
                    ConnectionsManager.getInstance(wo0Var.s0).sendRequest(tL_messages_clickSponsoredMessage, null);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.Components.gm0
    public boolean d(int i10, View view) {
        ty.m0(this.b, i10);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 6:
                ty.d0(this.b);
                break;
            case 7:
            default:
                ty tyVar = this.b;
                tyVar.getMessagesController().hidePromoDialog();
                tyVar.Y3(false);
                break;
            case 8:
                ty tyVar2 = this.b;
                tyVar2.getClass();
                Intent permissionManagerIntent = XiaomiUtilities.getPermissionManagerIntent();
                if (permissionManagerIntent != null) {
                    try {
                        try {
                            tyVar2.getParentActivity().startActivity(permissionManagerIntent);
                            break;
                        } catch (Exception unused) {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                            tyVar2.getParentActivity().startActivity(intent);
                            return;
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                }
                break;
            case 9:
                ty tyVar3 = this.b;
                tyVar3.getClass();
                Intent intent2 = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                try {
                    tyVar3.getParentActivity().startActivity(intent2);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }

    public void h(int i10) {
        dx dxVar = this.b.B1;
        if (dxVar == null) {
            return;
        }
        if (i10 == 0) {
            dxVar.o0(true);
        } else {
            dxVar.v1(true, false);
        }
    }

    public void i(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11) {
        this.b.T4(z10, arrayList, arrayList2, z11, true);
    }

    @Override // org.telegram.ui.Components.fm0
    public /* synthetic */ void n0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    private final /* synthetic */ void b(View view, float f7, float f10) {
    }

    private final /* synthetic */ void e(View view, float f7, float f10) {
    }

    private final /* synthetic */ void g(View view, float f7, float f10) {
    }
}
