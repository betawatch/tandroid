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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wv implements org.telegram.ui.Components.lq0, org.telegram.ui.Components.al0, org.telegram.ui.Components.bl0, o10, org.telegram.ui.ActionBar.a2, r0.n, org.telegram.ui.Components.nk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uy b;

    public /* synthetic */ wv(uy uyVar, int i10) {
        this.a = i10;
        this.b = uyVar;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
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

    @Override // org.telegram.ui.Components.nk0
    public void a() {
        uy uyVar = this.b;
        uyVar.Q = true;
        uyVar.fragmentView.invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fa A[SYNTHETIC] */
    @Override // org.telegram.ui.Components.al0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(float f7, float f10, int i10, View view) {
        TLRPC.Chat chat;
        switch (this.a) {
            case 1:
                uy uyVar = this.b;
                org.telegram.ui.Components.i51 G = uyVar.C0.j0.G(i10);
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
                        bo boVar = new bo(bundle);
                        uy.d4(boVar, messageObject);
                        uyVar.presentFragment(boVar);
                        break;
                    }
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("chat_id", ((TLRPC.Chat) obj).id);
                    bo boVar2 = new bo(bundle2);
                    org.telegram.ui.Components.tn0 tn0Var = uyVar.C0.j0;
                    tn0Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    while (true) {
                        i10++;
                        if (i10 >= tn0Var.x.size()) {
                            boVar2.eb = arrayList;
                            uyVar.presentFragment(boVar2);
                            break;
                        } else {
                            org.telegram.ui.Components.i51 G2 = tn0Var.G(i10);
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
                org.telegram.ui.Components.i51 G3 = uyVar2.C0.o0.G(i10);
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
                        bo boVar3 = new bo(bundle3);
                        uy.d4(boVar3, messageObject2);
                        uyVar2.presentFragment(boVar3);
                        break;
                    }
                } else {
                    uyVar2.presentFragment(ProfileActivity.m4(((TLRPC.User) obj3).id));
                    break;
                }
                break;
            default:
                uy uyVar3 = this.b;
                Object J = uyVar3.C0.b0.J(i10);
                if (!(J instanceof TLRPC.TL_sponsoredPeer)) {
                    if (view instanceof org.telegram.ui.Cells.i6) {
                        org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
                        if (i6Var.n0) {
                            uyVar3.N4(i6Var.getDialogId(), view);
                            break;
                        }
                    }
                    if (uyVar3.R0 != 10) {
                        uyVar3.n4(view, i10, uyVar3.C0.b0);
                        break;
                    } else {
                        ey eyVar = uyVar3.C0;
                        ai.w0 w0Var = eyVar.V;
                        uyVar3.o4(view, i10, f7, eyVar.b0);
                        break;
                    }
                } else {
                    TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) J;
                    uyVar3.presentFragment(bo.R9(DialogObject.getPeerDialogId(tL_sponsoredPeer.peer)));
                    org.telegram.ui.Components.rn0 rn0Var = uyVar3.C0.b0;
                    rn0Var.getClass();
                    TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
                    tL_messages_clickSponsoredMessage.random_id = tL_sponsoredPeer.random_id;
                    ConnectionsManager.getInstance(rn0Var.s0).sendRequest(tL_messages_clickSponsoredMessage, null);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean d(int i10, View view) {
        uy.o0(this.b, i10);
        return false;
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ boolean d1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
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

    public void h(int i10) {
        ex exVar = this.b.B1;
        if (exVar == null) {
            return;
        }
        if (i10 == 0) {
            exVar.r0(true);
        } else {
            exVar.y1(true, false);
        }
    }

    public void i(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11) {
        this.b.W4(z10, arrayList, arrayList2, z11, true);
    }

    @Override // org.telegram.ui.Components.al0
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
