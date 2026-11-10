package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class xx extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xx(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:192:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0452  */
    @Override // org.telegram.ui.ActionBar.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i7) {
        long j3;
        int i10;
        boolean z9;
        boolean z10;
        boolean z11;
        h90 h90Var;
        String obj;
        boolean z12;
        Bitmap bitmap;
        int i11 = this.a;
        final int i12 = 0;
        boolean z13 = true;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                jy jyVar = (jy) obj2;
                if (i7 != -1) {
                    if (i7 == 1) {
                        jyVar.h0();
                        break;
                    }
                } else if (jyVar.b0(true)) {
                    jyVar.finishFragment();
                    break;
                }
                break;
            case 1:
                jz jzVar = (jz) obj2;
                if (i7 != -1) {
                    if (i7 == 1) {
                        jzVar.w0();
                        break;
                    }
                } else if (jzVar.n0(true)) {
                    jzVar.finishFragment();
                    break;
                }
                break;
            case 2:
                if (i7 == -1) {
                    ((FiltersSetupActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 3:
                if (i7 == -1) {
                    ((r00) obj2).finishFragment();
                    break;
                }
                break;
            case 4:
                z40 z40Var = (z40) obj2;
                if (i7 != -1) {
                    if (i7 == 1) {
                        z40Var.t0();
                        break;
                    }
                } else if (z40Var.k0(true)) {
                    z40Var.finishFragment();
                    break;
                }
                break;
            case 5:
                if (i7 == -1) {
                    ((g50) obj2).finishFragment();
                    break;
                }
                break;
            case 6:
                if (i7 == -1) {
                    ((i50) obj2).finishFragment();
                    break;
                }
                break;
            case 7:
                if (i7 == -1) {
                    ((p50) obj2).finishFragment();
                    break;
                }
                break;
            case 8:
                if (i7 == -1) {
                    ((s50) obj2).finishFragment();
                    break;
                }
                break;
            case 9:
                if (i7 == -1) {
                    ((c60) obj2).finishFragment();
                    break;
                }
                break;
            case 10:
                if (i7 == -1) {
                    ((LanguageSelectActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 11:
                final k90 k90Var = (k90) obj2;
                if (i7 != -1) {
                    if (i7 == 1) {
                        long j10 = k90Var.b;
                        ArrayList arrayList = k90Var.Q;
                        ArrayList arrayList2 = k90Var.O;
                        if (!k90Var.U) {
                            int selectedIndex = k90Var.d.getSelectedIndex();
                            if (selectedIndex < arrayList2.size() && ((Integer) arrayList2.get(selectedIndex)).intValue() < 0) {
                                org.telegram.messenger.g0.F3(k90Var.x);
                                Vibrator vibrator = (Vibrator) k90Var.x.getContext().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                    break;
                                }
                            } else {
                                org.telegram.ui.Cells.r8 r8Var = k90Var.n;
                                if (r8Var != null && r8Var.e.h) {
                                    try {
                                        j3 = Long.parseLong(k90Var.r.d.getText().toString());
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    i10 = k90Var.a;
                                    if (i10 != 0) {
                                        org.telegram.ui.ActionBar.u1 u1Var = k90Var.T;
                                        if (u1Var != null) {
                                            u1Var.dismiss();
                                        }
                                        k90Var.U = true;
                                        org.telegram.ui.ActionBar.u1 u1Var2 = new org.telegram.ui.ActionBar.u1(3, k90Var.getParentActivity(), null);
                                        k90Var.T = u1Var2;
                                        u1Var2.r(500L);
                                        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                                        tL_messages_exportChatInvite.peer = k90Var.getMessagesController().j1(-j10);
                                        tL_messages_exportChatInvite.legacy_revoke_permanent = false;
                                        int selectedIndex2 = k90Var.d.getSelectedIndex();
                                        tL_messages_exportChatInvite.flags |= 1;
                                        if (selectedIndex2 < arrayList2.size()) {
                                            tL_messages_exportChatInvite.expire_date = k90Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList2.get(selectedIndex2)).intValue();
                                        } else {
                                            tL_messages_exportChatInvite.expire_date = 0;
                                        }
                                        int selectedIndex3 = k90Var.c.getSelectedIndex();
                                        tL_messages_exportChatInvite.flags |= 2;
                                        if (selectedIndex3 < arrayList.size()) {
                                            tL_messages_exportChatInvite.usage_limit = ((Integer) arrayList.get(selectedIndex3)).intValue();
                                        } else {
                                            tL_messages_exportChatInvite.usage_limit = 0;
                                        }
                                        h90 h90Var2 = k90Var.f;
                                        boolean z14 = h90Var2 != null && h90Var2.e.h;
                                        tL_messages_exportChatInvite.request_needed = z14;
                                        if (z14) {
                                            tL_messages_exportChatInvite.usage_limit = 0;
                                        }
                                        String obj3 = k90Var.K.getText().toString();
                                        tL_messages_exportChatInvite.title = obj3;
                                        if (!TextUtils.isEmpty(obj3)) {
                                            tL_messages_exportChatInvite.flags |= 16;
                                        }
                                        if (j3 > 0) {
                                            tL_messages_exportChatInvite.flags |= 32;
                                            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = new TL_stars.TL_starsSubscriptionPricing();
                                            tL_messages_exportChatInvite.subscription_pricing = tL_starsSubscriptionPricing;
                                            tL_starsSubscriptionPricing.period = k90Var.getConnectionsManager().isTestBackend() ? org.telegram.messenger.qs.X4 : 2592000;
                                            tL_messages_exportChatInvite.subscription_pricing.amount = j3;
                                        }
                                        k90Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new RequestDelegate() { // from class: org.telegram.ui.b90
                                            @Override // org.telegram.tgnet.RequestDelegate
                                            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                switch (i12) {
                                                    case 0:
                                                        final int i13 = 0;
                                                        final k90 k90Var2 = k90Var;
                                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.c90
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                switch (i13) {
                                                                    case 0:
                                                                        k90 k90Var3 = k90Var2;
                                                                        k90Var3.U = false;
                                                                        org.telegram.ui.ActionBar.u1 u1Var3 = k90Var3.T;
                                                                        if (u1Var3 != null) {
                                                                            u1Var3.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                                        if (tL_error2 != null) {
                                                                            org.telegram.ui.Components.u4.r0(k90Var3, null, tL_error2.text, null);
                                                                            break;
                                                                        } else {
                                                                            j90 j90Var = k90Var3.S;
                                                                            if (j90Var != null) {
                                                                                j90Var.c(tLObject);
                                                                            }
                                                                            k90Var3.finishFragment();
                                                                            break;
                                                                        }
                                                                    default:
                                                                        k90 k90Var4 = k90Var2;
                                                                        k90Var4.U = false;
                                                                        org.telegram.ui.ActionBar.u1 u1Var4 = k90Var4.T;
                                                                        if (u1Var4 != null) {
                                                                            u1Var4.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                                        if (tL_error3 != null) {
                                                                            org.telegram.ui.Components.u4.r0(k90Var4, null, tL_error3.text, null);
                                                                            break;
                                                                        } else {
                                                                            TLObject tLObject2 = tLObject;
                                                                            if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                k90Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                            }
                                                                            j90 j90Var2 = k90Var4.S;
                                                                            if (j90Var2 != null) {
                                                                                j90Var2.b(k90Var4.e, tLObject2);
                                                                            }
                                                                            k90Var4.finishFragment();
                                                                            break;
                                                                        }
                                                                }
                                                            }
                                                        });
                                                        break;
                                                    default:
                                                        final int i14 = 1;
                                                        final k90 k90Var3 = k90Var;
                                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.c90
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                switch (i14) {
                                                                    case 0:
                                                                        k90 k90Var32 = k90Var3;
                                                                        k90Var32.U = false;
                                                                        org.telegram.ui.ActionBar.u1 u1Var3 = k90Var32.T;
                                                                        if (u1Var3 != null) {
                                                                            u1Var3.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                                        if (tL_error2 != null) {
                                                                            org.telegram.ui.Components.u4.r0(k90Var32, null, tL_error2.text, null);
                                                                            break;
                                                                        } else {
                                                                            j90 j90Var = k90Var32.S;
                                                                            if (j90Var != null) {
                                                                                j90Var.c(tLObject);
                                                                            }
                                                                            k90Var32.finishFragment();
                                                                            break;
                                                                        }
                                                                    default:
                                                                        k90 k90Var4 = k90Var3;
                                                                        k90Var4.U = false;
                                                                        org.telegram.ui.ActionBar.u1 u1Var4 = k90Var4.T;
                                                                        if (u1Var4 != null) {
                                                                            u1Var4.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                                        if (tL_error3 != null) {
                                                                            org.telegram.ui.Components.u4.r0(k90Var4, null, tL_error3.text, null);
                                                                            break;
                                                                        } else {
                                                                            TLObject tLObject2 = tLObject;
                                                                            if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                k90Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                            }
                                                                            j90 j90Var2 = k90Var4.S;
                                                                            if (j90Var2 != null) {
                                                                                j90Var2.b(k90Var4.e, tLObject2);
                                                                            }
                                                                            k90Var4.finishFragment();
                                                                            break;
                                                                        }
                                                                }
                                                            }
                                                        });
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    } else if (i10 == 1) {
                                        org.telegram.ui.ActionBar.u1 u1Var3 = k90Var.T;
                                        if (u1Var3 != null) {
                                            u1Var3.dismiss();
                                        }
                                        TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
                                        tL_messages_editExportedChatInvite.link = k90Var.e.link;
                                        tL_messages_editExportedChatInvite.revoked = false;
                                        tL_messages_editExportedChatInvite.peer = k90Var.getMessagesController().j1(-j10);
                                        int selectedIndex4 = k90Var.d.getSelectedIndex();
                                        if (selectedIndex4 < arrayList2.size()) {
                                            if (k90Var.V != ((Integer) arrayList2.get(selectedIndex4)).intValue()) {
                                                tL_messages_editExportedChatInvite.flags |= 1;
                                                tL_messages_editExportedChatInvite.expire_date = k90Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList2.get(selectedIndex4)).intValue();
                                                z9 = true;
                                            }
                                            z9 = false;
                                        } else {
                                            if (k90Var.V != 0) {
                                                tL_messages_editExportedChatInvite.flags |= 1;
                                                tL_messages_editExportedChatInvite.expire_date = 0;
                                                z9 = true;
                                            }
                                            z9 = false;
                                        }
                                        int selectedIndex5 = k90Var.c.getSelectedIndex();
                                        if (selectedIndex5 < arrayList.size()) {
                                            int intValue = ((Integer) arrayList.get(selectedIndex5)).intValue();
                                            z10 = z9;
                                            if (k90Var.e.usage_limit != intValue) {
                                                tL_messages_editExportedChatInvite.flags |= 2;
                                                tL_messages_editExportedChatInvite.usage_limit = intValue;
                                                z10 = true;
                                            }
                                            z11 = k90Var.e.request_needed;
                                            h90Var = k90Var.f;
                                            if (z11 != (h90Var == null && h90Var.e.h)) {
                                                int i13 = tL_messages_editExportedChatInvite.flags;
                                                tL_messages_editExportedChatInvite.flags = i13 | 8;
                                                boolean z15 = h90Var != null && h90Var.e.h;
                                                tL_messages_editExportedChatInvite.request_needed = z15;
                                                if (z15) {
                                                    tL_messages_editExportedChatInvite.flags = i13 | 10;
                                                    tL_messages_editExportedChatInvite.usage_limit = 0;
                                                }
                                                z10 = true;
                                            }
                                            obj = k90Var.K.getText().toString();
                                            z12 = z10;
                                            if (!TextUtils.equals(k90Var.e.title, obj)) {
                                                tL_messages_editExportedChatInvite.title = obj;
                                                tL_messages_editExportedChatInvite.flags |= 16;
                                                z12 = true;
                                            }
                                            if (!z12) {
                                                k90Var.U = true;
                                                org.telegram.ui.ActionBar.u1 u1Var4 = new org.telegram.ui.ActionBar.u1(3, k90Var.getParentActivity(), null);
                                                k90Var.T = u1Var4;
                                                u1Var4.r(500L);
                                                ConnectionsManager connectionsManager = k90Var.getConnectionsManager();
                                                final boolean z16 = z13 ? 1 : 0;
                                                connectionsManager.sendRequest(tL_messages_editExportedChatInvite, new RequestDelegate() { // from class: org.telegram.ui.b90
                                                    @Override // org.telegram.tgnet.RequestDelegate
                                                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                        switch (z16) {
                                                            case 0:
                                                                final int i132 = 0;
                                                                final k90 k90Var2 = k90Var;
                                                                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.c90
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        switch (i132) {
                                                                            case 0:
                                                                                k90 k90Var32 = k90Var2;
                                                                                k90Var32.U = false;
                                                                                org.telegram.ui.ActionBar.u1 u1Var32 = k90Var32.T;
                                                                                if (u1Var32 != null) {
                                                                                    u1Var32.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error2 = tL_error;
                                                                                if (tL_error2 != null) {
                                                                                    org.telegram.ui.Components.u4.r0(k90Var32, null, tL_error2.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    j90 j90Var = k90Var32.S;
                                                                                    if (j90Var != null) {
                                                                                        j90Var.c(tLObject);
                                                                                    }
                                                                                    k90Var32.finishFragment();
                                                                                    break;
                                                                                }
                                                                            default:
                                                                                k90 k90Var4 = k90Var2;
                                                                                k90Var4.U = false;
                                                                                org.telegram.ui.ActionBar.u1 u1Var42 = k90Var4.T;
                                                                                if (u1Var42 != null) {
                                                                                    u1Var42.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error3 = tL_error;
                                                                                if (tL_error3 != null) {
                                                                                    org.telegram.ui.Components.u4.r0(k90Var4, null, tL_error3.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    TLObject tLObject2 = tLObject;
                                                                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                        k90Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                    }
                                                                                    j90 j90Var2 = k90Var4.S;
                                                                                    if (j90Var2 != null) {
                                                                                        j90Var2.b(k90Var4.e, tLObject2);
                                                                                    }
                                                                                    k90Var4.finishFragment();
                                                                                    break;
                                                                                }
                                                                        }
                                                                    }
                                                                });
                                                                break;
                                                            default:
                                                                final int i14 = 1;
                                                                final k90 k90Var3 = k90Var;
                                                                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.c90
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        switch (i14) {
                                                                            case 0:
                                                                                k90 k90Var32 = k90Var3;
                                                                                k90Var32.U = false;
                                                                                org.telegram.ui.ActionBar.u1 u1Var32 = k90Var32.T;
                                                                                if (u1Var32 != null) {
                                                                                    u1Var32.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error2 = tL_error;
                                                                                if (tL_error2 != null) {
                                                                                    org.telegram.ui.Components.u4.r0(k90Var32, null, tL_error2.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    j90 j90Var = k90Var32.S;
                                                                                    if (j90Var != null) {
                                                                                        j90Var.c(tLObject);
                                                                                    }
                                                                                    k90Var32.finishFragment();
                                                                                    break;
                                                                                }
                                                                            default:
                                                                                k90 k90Var4 = k90Var3;
                                                                                k90Var4.U = false;
                                                                                org.telegram.ui.ActionBar.u1 u1Var42 = k90Var4.T;
                                                                                if (u1Var42 != null) {
                                                                                    u1Var42.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error3 = tL_error;
                                                                                if (tL_error3 != null) {
                                                                                    org.telegram.ui.Components.u4.r0(k90Var4, null, tL_error3.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    TLObject tLObject2 = tLObject;
                                                                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                        k90Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                    }
                                                                                    j90 j90Var2 = k90Var4.S;
                                                                                    if (j90Var2 != null) {
                                                                                        j90Var2.b(k90Var4.e, tLObject2);
                                                                                    }
                                                                                    k90Var4.finishFragment();
                                                                                    break;
                                                                                }
                                                                        }
                                                                    }
                                                                });
                                                                break;
                                                        }
                                                    }
                                                });
                                                break;
                                            } else {
                                                k90Var.finishFragment();
                                                break;
                                            }
                                        } else {
                                            z10 = z9;
                                            if (k90Var.e.usage_limit != 0) {
                                                tL_messages_editExportedChatInvite.flags |= 2;
                                                tL_messages_editExportedChatInvite.usage_limit = 0;
                                                z10 = true;
                                            }
                                            z11 = k90Var.e.request_needed;
                                            h90Var = k90Var.f;
                                            if (z11 != (h90Var == null && h90Var.e.h)) {
                                            }
                                            obj = k90Var.K.getText().toString();
                                            z12 = z10;
                                            if (!TextUtils.equals(k90Var.e.title, obj)) {
                                            }
                                            if (!z12) {
                                            }
                                        }
                                    }
                                }
                                j3 = 0;
                                i10 = k90Var.a;
                                if (i10 != 0) {
                                }
                            }
                        }
                    }
                } else {
                    k90Var.finishFragment();
                    org.telegram.messenger.g0.v1(k90Var.F);
                    break;
                }
                break;
            case 12:
                if (i7 == -1) {
                    ((z90) obj2).finishFragment();
                    break;
                }
                break;
            case 13:
                fe0 fe0Var = (fe0) obj2;
                if (i7 != 1) {
                    if (i7 == -1 && fe0Var.onBackPressed(true)) {
                        fe0Var.finishFragment();
                        break;
                    }
                } else {
                    fe0Var.H1();
                    break;
                }
                break;
            case 14:
                if (i7 == -1) {
                    ((he0) obj2).finishFragment();
                    break;
                }
                break;
            case 15:
                if (i7 == -1) {
                    ((ff0) obj2).finishFragment();
                    break;
                }
                break;
            case 16:
                if (i7 == -1) {
                    ((bi.w4) obj2).finishFragment();
                    break;
                }
                break;
            case 17:
                mg0 mg0Var = (mg0) obj2;
                if (i7 != -1) {
                    if (i7 == 1) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", mg0Var.b);
                        mg0Var.presentFragment(new e51(bundle));
                        break;
                    }
                } else {
                    mg0Var.finishFragment();
                    break;
                }
                break;
            case 18:
                if (i7 == -1) {
                    ((NotificationsCustomSettingsActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 19:
                if (i7 == -1) {
                    ((NotificationsSettingsActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 20:
                if (i7 == -1) {
                    ((PasscodeActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 21:
                if (i7 == -1) {
                    ((PasskeysActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 22:
                pm0 pm0Var = (pm0) obj2;
                if (i7 != -1) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            pm0.Z(pm0Var, null);
                            break;
                        }
                    } else if (pm0Var.V != null) {
                        pm0Var.finishFragment(false);
                        pm0Var.V.m();
                        break;
                    }
                } else {
                    pm0Var.finishFragment();
                    break;
                }
                break;
            case 23:
                sm0 sm0Var = (sm0) obj2;
                if (i7 != -1) {
                    if (i7 == 1) {
                        if (sm0Var.c != null && !sm0Var.f) {
                            qm0 qm0Var = sm0Var.d;
                            float f10 = qm0Var.f - qm0Var.y;
                            float f11 = qm0Var.w;
                            float f12 = f10 / f11;
                            float f13 = (qm0Var.h - qm0Var.D) / qm0Var.x;
                            float f14 = qm0Var.d / f11;
                            float f15 = qm0Var.e / f11;
                            sm0 sm0Var2 = qm0Var.H;
                            int width = (int) (f12 * sm0Var2.a.getWidth());
                            int height = (int) (f13 * sm0Var2.a.getHeight());
                            int width2 = (int) (f14 * sm0Var2.a.getWidth());
                            int width3 = (int) (f15 * sm0Var2.a.getWidth());
                            int i14 = width < 0 ? 0 : width;
                            int i15 = height < 0 ? 0 : height;
                            if (i14 + width2 > sm0Var2.a.getWidth()) {
                                width2 = sm0Var2.a.getWidth() - i14;
                            }
                            int i16 = width2;
                            if (i15 + width3 > sm0Var2.a.getHeight()) {
                                width3 = sm0Var2.a.getHeight() - i15;
                            }
                            int i17 = width3;
                            try {
                                bitmap = Bitmap.createBitmap(sm0Var2.a, i14, i15, i16, i17, (Matrix) null, false);
                            } catch (Throwable th2) {
                                org.telegram.messenger.a8.g(th2, true);
                                System.gc();
                                try {
                                    bitmap = Bitmap.createBitmap(sm0Var2.a, i14, i15, i16, i17, (Matrix) null, false);
                                } catch (Throwable th3) {
                                    org.telegram.messenger.a8.g(th3, true);
                                    bitmap = null;
                                }
                            }
                            if (bitmap == sm0Var.a) {
                                sm0Var.e = true;
                            }
                            ((org.telegram.ui.Components.j30) sm0Var.c).r(false, bitmap, null);
                            sm0Var.f = true;
                        }
                        sm0Var.finishFragment();
                        break;
                    }
                } else {
                    sm0Var.finishFragment();
                    break;
                }
                break;
            case 24:
                an0 an0Var = (an0) obj2;
                if (i7 != -1) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            zm0 zm0Var = an0Var.s0;
                            if (zm0Var != null) {
                                zm0Var.f0();
                            }
                            an0Var.finishFragment();
                            break;
                        }
                    } else {
                        boolean z17 = an0Var.Y;
                        an0Var.Y = !z17;
                        if (z17) {
                            an0Var.K.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(50.0f));
                        } else {
                            an0Var.K.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
                        }
                        an0Var.K.C0();
                        an0Var.M.h1(0, 0);
                        an0Var.L.f();
                        break;
                    }
                } else {
                    an0Var.finishFragment();
                    break;
                }
                break;
            case 25:
                if (i7 == -1) {
                    ((dn0) obj2).finishFragment();
                    break;
                }
                break;
            case 26:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj2;
                if (i7 != -1) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            int i18 = PopupNotificationActivity.b0;
                            popupNotificationActivity.p();
                            break;
                        }
                    } else {
                        int i19 = PopupNotificationActivity.b0;
                        popupNotificationActivity.k();
                        break;
                    }
                } else {
                    popupNotificationActivity.i();
                    popupNotificationActivity.finish();
                    break;
                }
                break;
            case 27:
                ks0 ks0Var = (ks0) obj2;
                if (i7 != -1) {
                    if (i7 == 1) {
                        ks0Var.d0();
                        break;
                    }
                } else if (ks0Var.onBackPressed(true)) {
                    ks0Var.finishFragment();
                    break;
                }
                break;
            case 28:
                if (i7 == -1) {
                    ((PremiumPreviewFragment) obj2).finishFragment();
                    break;
                }
                break;
            default:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj2;
                if (i7 != -1) {
                    if (i7 == 1) {
                        privacyControlActivity.K0();
                        break;
                    }
                } else if (privacyControlActivity.G0(true)) {
                    privacyControlActivity.finishFragment();
                    break;
                }
                break;
        }
    }
}
