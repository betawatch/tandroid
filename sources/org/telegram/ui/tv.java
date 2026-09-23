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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class tv implements org.telegram.ui.Components.lq0, org.telegram.ui.Components.bl0, org.telegram.ui.Components.cl0, l10, org.telegram.ui.ActionBar.a2, r0.n, org.telegram.ui.Components.ok0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ry b;

    public /* synthetic */ tv(ry ryVar, int i10) {
        this.a = i10;
        this.b = ryVar;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        ry ryVar = this.b;
        ryVar.v.i(l1Var);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        ryVar.e4 = defaultWindowInsets.b;
        ryVar.f4 = defaultWindowInsets.d;
        int i10 = l1Var.a.f(8).d;
        if (ryVar.g4 != i10) {
            ryVar.g4 = i10;
            ryVar.fragmentView.requestLayout();
        }
        ryVar.F0.setPadding(0, ryVar.e4, 0, 0);
        ryVar.X4();
        for (UndoView undoView : ryVar.y0) {
            if (undoView != null) {
                int i11 = ryVar.f4 + ryVar.h4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                    marginLayoutParams.bottomMargin = i11;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        lx lxVar = ryVar.F3;
        if (lxVar != null) {
            r0.i0.b(lxVar, l1Var);
        }
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.ok0
    public void a() {
        ry ryVar = this.b;
        ryVar.Q = true;
        ryVar.fragmentView.invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fa A[SYNTHETIC] */
    @Override // org.telegram.ui.Components.bl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(float f7, float f10, int i10, View view) {
        TLRPC.Chat chat;
        switch (this.a) {
            case 1:
                ry ryVar = this.b;
                org.telegram.ui.Components.h51 G = ryVar.C0.j0.G(i10);
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
                        ry.d4(xnVar, messageObject);
                        ryVar.presentFragment(xnVar);
                        break;
                    }
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("chat_id", ((TLRPC.Chat) obj).id);
                    xn xnVar2 = new xn(bundle2);
                    org.telegram.ui.Components.tn0 tn0Var = ryVar.C0.j0;
                    tn0Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    while (true) {
                        i10++;
                        if (i10 >= tn0Var.x.size()) {
                            xnVar2.eb = arrayList;
                            ryVar.presentFragment(xnVar2);
                            break;
                        } else {
                            org.telegram.ui.Components.h51 G2 = tn0Var.G(i10);
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
                ry ryVar2 = this.b;
                org.telegram.ui.Components.h51 G3 = ryVar2.C0.o0.G(i10);
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
                        ry.d4(xnVar3, messageObject2);
                        ryVar2.presentFragment(xnVar3);
                        break;
                    }
                } else {
                    ryVar2.presentFragment(ProfileActivity.m4(((TLRPC.User) obj3).id));
                    break;
                }
                break;
            default:
                ry ryVar3 = this.b;
                Object J = ryVar3.C0.b0.J(i10);
                if (!(J instanceof TLRPC.TL_sponsoredPeer)) {
                    if (view instanceof org.telegram.ui.Cells.i6) {
                        org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
                        if (i6Var.n0) {
                            ryVar3.N4(i6Var.getDialogId(), view);
                            break;
                        }
                    }
                    if (ryVar3.R0 != 10) {
                        ryVar3.n4(view, i10, ryVar3.C0.b0);
                        break;
                    } else {
                        ay ayVar = ryVar3.C0;
                        ai.w0 w0Var = ayVar.V;
                        ryVar3.o4(view, i10, f7, ayVar.b0);
                        break;
                    }
                } else {
                    TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) J;
                    ryVar3.presentFragment(xn.R9(DialogObject.getPeerDialogId(tL_sponsoredPeer.peer)));
                    org.telegram.ui.Components.rn0 rn0Var = ryVar3.C0.b0;
                    rn0Var.getClass();
                    TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
                    tL_messages_clickSponsoredMessage.random_id = tL_sponsoredPeer.random_id;
                    ConnectionsManager.getInstance(rn0Var.s0).sendRequest(tL_messages_clickSponsoredMessage, null);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean d(int i10, View view) {
        ry.o0(this.b, i10);
        return false;
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ boolean d1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 6:
                ry.f0(this.b);
                break;
            case 7:
            default:
                ry ryVar = this.b;
                ryVar.getMessagesController().hidePromoDialog();
                ryVar.b4(false);
                break;
            case 8:
                ry ryVar2 = this.b;
                ryVar2.getClass();
                Intent permissionManagerIntent = XiaomiUtilities.getPermissionManagerIntent();
                if (permissionManagerIntent != null) {
                    try {
                        try {
                            ryVar2.getParentActivity().startActivity(permissionManagerIntent);
                            break;
                        } catch (Exception unused) {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                            ryVar2.getParentActivity().startActivity(intent);
                            return;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                break;
            case 9:
                ry ryVar3 = this.b;
                ryVar3.getClass();
                Intent intent2 = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                try {
                    ryVar3.getParentActivity().startActivity(intent2);
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }

    public void h(int i10) {
        bx bxVar = this.b.B1;
        if (bxVar == null) {
            return;
        }
        if (i10 == 0) {
            bxVar.r0(true);
        } else {
            bxVar.y1(true, false);
        }
    }

    public void i(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11) {
        this.b.W4(z10, arrayList, arrayList2, z11, true);
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ void r0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    private final /* synthetic */ void b(View view, float f7, float f10) {
    }

    private final /* synthetic */ void e(View view, float f7, float f10) {
    }

    private final /* synthetic */ void g(View view, float f7, float f10) {
    }
}
