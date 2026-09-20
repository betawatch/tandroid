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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class xv implements org.telegram.ui.Components.yq0, org.telegram.ui.Components.kl0, org.telegram.ui.Components.ll0, o10, org.telegram.ui.ActionBar.a2, r0.n, org.telegram.ui.Components.xk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uy b;

    public /* synthetic */ xv(uy uyVar, int i10) {
        this.a = i10;
        this.b = uyVar;
    }

    @Override // r0.n
    public r0.l1 P0(View view, r0.l1 l1Var) {
        uy uyVar = this.b;
        uyVar.v.i(l1Var);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        uyVar.e4 = defaultWindowInsets.b;
        uyVar.f4 = defaultWindowInsets.d;
        int i10 = l1Var.a.f(8).d;
        if (uyVar.g4 != i10) {
            uyVar.g4 = i10;
            uyVar.fragmentView.requestLayout();
        }
        uyVar.F0.setPadding(0, uyVar.e4, 0, 0);
        uyVar.X4();
        for (UndoView undoView : uyVar.y0) {
            if (undoView != null) {
                int i11 = uyVar.f4 + uyVar.h4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                    marginLayoutParams.bottomMargin = i11;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        ox oxVar = uyVar.F3;
        if (oxVar != null) {
            r0.i0.b(oxVar, l1Var);
        }
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.xk0
    public void a() {
        uy uyVar = this.b;
        uyVar.Q = true;
        uyVar.fragmentView.invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fa A[SYNTHETIC] */
    @Override // org.telegram.ui.Components.kl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(float f7, float f10, int i10, View view) {
        TLRPC.Chat chat;
        switch (this.a) {
            case 1:
                uy uyVar = this.b;
                org.telegram.ui.Components.w51 G = uyVar.C0.k0.G(i10);
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
                        uy.d4(znVar, messageObject);
                        uyVar.presentFragment(znVar);
                        break;
                    }
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("chat_id", ((TLRPC.Chat) obj).id);
                    zn znVar2 = new zn(bundle2);
                    org.telegram.ui.Components.go0 go0Var = uyVar.C0.k0;
                    go0Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    while (true) {
                        i10++;
                        if (i10 >= go0Var.x.size()) {
                            znVar2.eb = arrayList;
                            uyVar.presentFragment(znVar2);
                            break;
                        } else {
                            org.telegram.ui.Components.w51 G2 = go0Var.G(i10);
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
                uy uyVar2 = this.b;
                org.telegram.ui.Components.w51 G3 = uyVar2.C0.p0.G(i10);
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
                        uy.d4(znVar3, messageObject2);
                        uyVar2.presentFragment(znVar3);
                        break;
                    }
                } else {
                    uyVar2.presentFragment(ProfileActivity.m4(((TLRPC.User) obj3).id));
                    break;
                }
                break;
            default:
                uy uyVar3 = this.b;
                Object J = uyVar3.C0.c0.J(i10);
                if (!(J instanceof TLRPC.TL_sponsoredPeer)) {
                    if (view instanceof org.telegram.ui.Cells.j6) {
                        org.telegram.ui.Cells.j6 j6Var = (org.telegram.ui.Cells.j6) view;
                        if (j6Var.n0) {
                            uyVar3.N4(j6Var.getDialogId(), view);
                            break;
                        }
                    }
                    if (uyVar3.R0 != 10) {
                        uyVar3.n4(view, i10, uyVar3.C0.c0);
                        break;
                    } else {
                        ey eyVar = uyVar3.C0;
                        ai.w0 w0Var = eyVar.W;
                        uyVar3.o4(view, i10, f7, eyVar.c0);
                        break;
                    }
                } else {
                    TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) J;
                    uyVar3.presentFragment(zn.R9(DialogObject.getPeerDialogId(tL_sponsoredPeer.peer)));
                    org.telegram.ui.Components.eo0 eo0Var = uyVar3.C0.c0;
                    eo0Var.getClass();
                    TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
                    tL_messages_clickSponsoredMessage.random_id = tL_sponsoredPeer.random_id;
                    ConnectionsManager.getInstance(eo0Var.s0).sendRequest(tL_messages_clickSponsoredMessage, null);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ boolean c1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean d(int i10, View view) {
        uy.o0(this.b, i10);
        return false;
    }

    public void g(int i10) {
        ex exVar = this.b.B1;
        if (exVar == null) {
            return;
        }
        if (i10 == 0) {
            exVar.q0(true);
        } else {
            exVar.w1(true, false);
        }
    }

    public void h(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11) {
        this.b.W4(z10, arrayList, arrayList2, z11, true);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 6:
                uy.g0(this.b);
                break;
            case 7:
            default:
                uy uyVar = this.b;
                uyVar.getMessagesController().hidePromoDialog();
                uyVar.b4(false);
                break;
            case 8:
                uy uyVar2 = this.b;
                uyVar2.getClass();
                Intent permissionManagerIntent = XiaomiUtilities.getPermissionManagerIntent();
                if (permissionManagerIntent != null) {
                    try {
                        try {
                            uyVar2.getParentActivity().startActivity(permissionManagerIntent);
                            break;
                        } catch (Exception unused) {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                            uyVar2.getParentActivity().startActivity(intent);
                            return;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                break;
            case 9:
                uy uyVar3 = this.b;
                uyVar3.getClass();
                Intent intent2 = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                try {
                    uyVar3.getParentActivity().startActivity(intent2);
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ void q0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    private final /* synthetic */ void b(View view, float f7, float f10) {
    }

    private final /* synthetic */ void e(View view, float f7, float f10) {
    }

    private final /* synthetic */ void f(View view, float f7, float f10) {
    }
}
