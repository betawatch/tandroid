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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yv implements org.telegram.ui.Components.mq0, org.telegram.ui.Components.bl0, org.telegram.ui.Components.cl0, q10, org.telegram.ui.ActionBar.b2, r0.n, org.telegram.ui.Components.ok0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wy b;

    public /* synthetic */ yv(wy wyVar, int i10) {
        this.a = i10;
        this.b = wyVar;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        wy wyVar = this.b;
        wyVar.v.i(l1Var);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        wyVar.e4 = defaultWindowInsets.b;
        wyVar.f4 = defaultWindowInsets.d;
        int i10 = l1Var.a.f(8).d;
        if (wyVar.g4 != i10) {
            wyVar.g4 = i10;
            wyVar.fragmentView.requestLayout();
        }
        wyVar.F0.setPadding(0, wyVar.e4, 0, 0);
        wyVar.X4();
        for (UndoView undoView : wyVar.y0) {
            if (undoView != null) {
                int i11 = wyVar.f4 + wyVar.h4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                    marginLayoutParams.bottomMargin = i11;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        qx qxVar = wyVar.F3;
        if (qxVar != null) {
            r0.i0.b(qxVar, l1Var);
        }
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.ok0
    public void a() {
        wy wyVar = this.b;
        wyVar.Q = true;
        wyVar.fragmentView.invalidate();
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
                wy wyVar = this.b;
                org.telegram.ui.Components.j51 G = wyVar.C0.k0.G(i10);
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
                        wy.d4(boVar, messageObject);
                        wyVar.presentFragment(boVar);
                        break;
                    }
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("chat_id", ((TLRPC.Chat) obj).id);
                    bo boVar2 = new bo(bundle2);
                    org.telegram.ui.Components.un0 un0Var = wyVar.C0.k0;
                    un0Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    while (true) {
                        i10++;
                        if (i10 >= un0Var.x.size()) {
                            boVar2.eb = arrayList;
                            wyVar.presentFragment(boVar2);
                            break;
                        } else {
                            org.telegram.ui.Components.j51 G2 = un0Var.G(i10);
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
                wy wyVar2 = this.b;
                org.telegram.ui.Components.j51 G3 = wyVar2.C0.p0.G(i10);
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
                        wy.d4(boVar3, messageObject2);
                        wyVar2.presentFragment(boVar3);
                        break;
                    }
                } else {
                    wyVar2.presentFragment(ProfileActivity.m4(((TLRPC.User) obj3).id));
                    break;
                }
                break;
            default:
                wy wyVar3 = this.b;
                Object J = wyVar3.C0.c0.J(i10);
                if (!(J instanceof TLRPC.TL_sponsoredPeer)) {
                    if (view instanceof org.telegram.ui.Cells.h6) {
                        org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                        if (h6Var.n0) {
                            wyVar3.N4(h6Var.getDialogId(), view);
                            break;
                        }
                    }
                    if (wyVar3.R0 != 10) {
                        wyVar3.n4(view, i10, wyVar3.C0.c0);
                        break;
                    } else {
                        gy gyVar = wyVar3.C0;
                        ai.w0 w0Var = gyVar.W;
                        wyVar3.o4(view, i10, f7, gyVar.c0);
                        break;
                    }
                } else {
                    TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) J;
                    wyVar3.presentFragment(bo.R9(DialogObject.getPeerDialogId(tL_sponsoredPeer.peer)));
                    org.telegram.ui.Components.sn0 sn0Var = wyVar3.C0.c0;
                    sn0Var.getClass();
                    TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
                    tL_messages_clickSponsoredMessage.random_id = tL_sponsoredPeer.random_id;
                    ConnectionsManager.getInstance(sn0Var.s0).sendRequest(tL_messages_clickSponsoredMessage, null);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean d(int i10, View view) {
        wy.o0(this.b, i10);
        return false;
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ boolean d1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 6:
                wy.g0(this.b);
                break;
            case 7:
            default:
                wy wyVar = this.b;
                wyVar.getMessagesController().hidePromoDialog();
                wyVar.b4(false);
                break;
            case 8:
                wy wyVar2 = this.b;
                wyVar2.getClass();
                Intent permissionManagerIntent = XiaomiUtilities.getPermissionManagerIntent();
                if (permissionManagerIntent != null) {
                    try {
                        try {
                            wyVar2.getParentActivity().startActivity(permissionManagerIntent);
                            break;
                        } catch (Exception unused) {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                            wyVar2.getParentActivity().startActivity(intent);
                            return;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                break;
            case 9:
                wy wyVar3 = this.b;
                wyVar3.getClass();
                Intent intent2 = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                try {
                    wyVar3.getParentActivity().startActivity(intent2);
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }

    public void h(int i10) {
        gx gxVar = this.b.B1;
        if (gxVar == null) {
            return;
        }
        if (i10 == 0) {
            gxVar.r0(true);
        } else {
            gxVar.x1(true, false);
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
