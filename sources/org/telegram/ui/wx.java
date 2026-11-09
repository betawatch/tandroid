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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class wx extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wx(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:192:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0452  */
    @Override // org.telegram.ui.ActionBar.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i7) {
        long j3;
        int i10;
        boolean z9;
        boolean z10;
        boolean z11;
        g90 g90Var;
        String obj;
        boolean z12;
        Bitmap bitmap;
        int i11 = this.a;
        final int i12 = 0;
        boolean z13 = true;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                iy iyVar = (iy) obj2;
                if (i7 != -1) {
                    if (i7 == 1) {
                        iyVar.h0();
                        break;
                    }
                } else if (iyVar.b0(true)) {
                    iyVar.finishFragment();
                    break;
                }
                break;
            case 1:
                iz izVar = (iz) obj2;
                if (i7 != -1) {
                    if (i7 == 1) {
                        izVar.w0();
                        break;
                    }
                } else if (izVar.n0(true)) {
                    izVar.finishFragment();
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
                    ((q00) obj2).finishFragment();
                    break;
                }
                break;
            case 4:
                y40 y40Var = (y40) obj2;
                if (i7 != -1) {
                    if (i7 == 1) {
                        y40Var.t0();
                        break;
                    }
                } else if (y40Var.k0(true)) {
                    y40Var.finishFragment();
                    break;
                }
                break;
            case 5:
                if (i7 == -1) {
                    ((f50) obj2).finishFragment();
                    break;
                }
                break;
            case 6:
                if (i7 == -1) {
                    ((h50) obj2).finishFragment();
                    break;
                }
                break;
            case 7:
                if (i7 == -1) {
                    ((o50) obj2).finishFragment();
                    break;
                }
                break;
            case 8:
                if (i7 == -1) {
                    ((r50) obj2).finishFragment();
                    break;
                }
                break;
            case 9:
                if (i7 == -1) {
                    ((b60) obj2).finishFragment();
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
                final j90 j90Var = (j90) obj2;
                if (i7 != -1) {
                    if (i7 == 1) {
                        long j10 = j90Var.b;
                        ArrayList arrayList = j90Var.Q;
                        ArrayList arrayList2 = j90Var.O;
                        if (!j90Var.U) {
                            int selectedIndex = j90Var.d.getSelectedIndex();
                            if (selectedIndex < arrayList2.size() && ((Integer) arrayList2.get(selectedIndex)).intValue() < 0) {
                                org.telegram.messenger.g0.F3(j90Var.x);
                                Vibrator vibrator = (Vibrator) j90Var.x.getContext().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                    break;
                                }
                            } else {
                                org.telegram.ui.Cells.r8 r8Var = j90Var.n;
                                if (r8Var != null && r8Var.e.h) {
                                    try {
                                        j3 = Long.parseLong(j90Var.r.d.getText().toString());
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    i10 = j90Var.a;
                                    if (i10 != 0) {
                                        org.telegram.ui.ActionBar.u1 u1Var = j90Var.T;
                                        if (u1Var != null) {
                                            u1Var.dismiss();
                                        }
                                        j90Var.U = true;
                                        org.telegram.ui.ActionBar.u1 u1Var2 = new org.telegram.ui.ActionBar.u1(3, j90Var.getParentActivity(), null);
                                        j90Var.T = u1Var2;
                                        u1Var2.r(500L);
                                        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                                        tL_messages_exportChatInvite.peer = j90Var.getMessagesController().j1(-j10);
                                        tL_messages_exportChatInvite.legacy_revoke_permanent = false;
                                        int selectedIndex2 = j90Var.d.getSelectedIndex();
                                        tL_messages_exportChatInvite.flags |= 1;
                                        if (selectedIndex2 < arrayList2.size()) {
                                            tL_messages_exportChatInvite.expire_date = j90Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList2.get(selectedIndex2)).intValue();
                                        } else {
                                            tL_messages_exportChatInvite.expire_date = 0;
                                        }
                                        int selectedIndex3 = j90Var.c.getSelectedIndex();
                                        tL_messages_exportChatInvite.flags |= 2;
                                        if (selectedIndex3 < arrayList.size()) {
                                            tL_messages_exportChatInvite.usage_limit = ((Integer) arrayList.get(selectedIndex3)).intValue();
                                        } else {
                                            tL_messages_exportChatInvite.usage_limit = 0;
                                        }
                                        g90 g90Var2 = j90Var.f;
                                        boolean z14 = g90Var2 != null && g90Var2.e.h;
                                        tL_messages_exportChatInvite.request_needed = z14;
                                        if (z14) {
                                            tL_messages_exportChatInvite.usage_limit = 0;
                                        }
                                        String obj3 = j90Var.K.getText().toString();
                                        tL_messages_exportChatInvite.title = obj3;
                                        if (!TextUtils.isEmpty(obj3)) {
                                            tL_messages_exportChatInvite.flags |= 16;
                                        }
                                        if (j3 > 0) {
                                            tL_messages_exportChatInvite.flags |= 32;
                                            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = new TL_stars.TL_starsSubscriptionPricing();
                                            tL_messages_exportChatInvite.subscription_pricing = tL_starsSubscriptionPricing;
                                            tL_starsSubscriptionPricing.period = j90Var.getConnectionsManager().isTestBackend() ? org.telegram.messenger.qs.X4 : 2592000;
                                            tL_messages_exportChatInvite.subscription_pricing.amount = j3;
                                        }
                                        j90Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new RequestDelegate() { // from class: org.telegram.ui.a90
                                            @Override // org.telegram.tgnet.RequestDelegate
                                            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                switch (i12) {
                                                    case 0:
                                                        final int i13 = 0;
                                                        final j90 j90Var2 = j90Var;
                                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.b90
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                switch (i13) {
                                                                    case 0:
                                                                        j90 j90Var3 = j90Var2;
                                                                        j90Var3.U = false;
                                                                        org.telegram.ui.ActionBar.u1 u1Var3 = j90Var3.T;
                                                                        if (u1Var3 != null) {
                                                                            u1Var3.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                                        if (tL_error2 != null) {
                                                                            org.telegram.ui.Components.v4.r0(j90Var3, null, tL_error2.text, null);
                                                                            break;
                                                                        } else {
                                                                            i90 i90Var = j90Var3.S;
                                                                            if (i90Var != null) {
                                                                                i90Var.c(tLObject);
                                                                            }
                                                                            j90Var3.finishFragment();
                                                                            break;
                                                                        }
                                                                    default:
                                                                        j90 j90Var4 = j90Var2;
                                                                        j90Var4.U = false;
                                                                        org.telegram.ui.ActionBar.u1 u1Var4 = j90Var4.T;
                                                                        if (u1Var4 != null) {
                                                                            u1Var4.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                                        if (tL_error3 != null) {
                                                                            org.telegram.ui.Components.v4.r0(j90Var4, null, tL_error3.text, null);
                                                                            break;
                                                                        } else {
                                                                            TLObject tLObject2 = tLObject;
                                                                            if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                j90Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                            }
                                                                            i90 i90Var2 = j90Var4.S;
                                                                            if (i90Var2 != null) {
                                                                                i90Var2.b(j90Var4.e, tLObject2);
                                                                            }
                                                                            j90Var4.finishFragment();
                                                                            break;
                                                                        }
                                                                }
                                                            }
                                                        });
                                                        break;
                                                    default:
                                                        final int i14 = 1;
                                                        final j90 j90Var3 = j90Var;
                                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.b90
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                switch (i14) {
                                                                    case 0:
                                                                        j90 j90Var32 = j90Var3;
                                                                        j90Var32.U = false;
                                                                        org.telegram.ui.ActionBar.u1 u1Var3 = j90Var32.T;
                                                                        if (u1Var3 != null) {
                                                                            u1Var3.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                                        if (tL_error2 != null) {
                                                                            org.telegram.ui.Components.v4.r0(j90Var32, null, tL_error2.text, null);
                                                                            break;
                                                                        } else {
                                                                            i90 i90Var = j90Var32.S;
                                                                            if (i90Var != null) {
                                                                                i90Var.c(tLObject);
                                                                            }
                                                                            j90Var32.finishFragment();
                                                                            break;
                                                                        }
                                                                    default:
                                                                        j90 j90Var4 = j90Var3;
                                                                        j90Var4.U = false;
                                                                        org.telegram.ui.ActionBar.u1 u1Var4 = j90Var4.T;
                                                                        if (u1Var4 != null) {
                                                                            u1Var4.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                                        if (tL_error3 != null) {
                                                                            org.telegram.ui.Components.v4.r0(j90Var4, null, tL_error3.text, null);
                                                                            break;
                                                                        } else {
                                                                            TLObject tLObject2 = tLObject;
                                                                            if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                j90Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                            }
                                                                            i90 i90Var2 = j90Var4.S;
                                                                            if (i90Var2 != null) {
                                                                                i90Var2.b(j90Var4.e, tLObject2);
                                                                            }
                                                                            j90Var4.finishFragment();
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
                                        org.telegram.ui.ActionBar.u1 u1Var3 = j90Var.T;
                                        if (u1Var3 != null) {
                                            u1Var3.dismiss();
                                        }
                                        TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
                                        tL_messages_editExportedChatInvite.link = j90Var.e.link;
                                        tL_messages_editExportedChatInvite.revoked = false;
                                        tL_messages_editExportedChatInvite.peer = j90Var.getMessagesController().j1(-j10);
                                        int selectedIndex4 = j90Var.d.getSelectedIndex();
                                        if (selectedIndex4 < arrayList2.size()) {
                                            if (j90Var.V != ((Integer) arrayList2.get(selectedIndex4)).intValue()) {
                                                tL_messages_editExportedChatInvite.flags |= 1;
                                                tL_messages_editExportedChatInvite.expire_date = j90Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList2.get(selectedIndex4)).intValue();
                                                z9 = true;
                                            }
                                            z9 = false;
                                        } else {
                                            if (j90Var.V != 0) {
                                                tL_messages_editExportedChatInvite.flags |= 1;
                                                tL_messages_editExportedChatInvite.expire_date = 0;
                                                z9 = true;
                                            }
                                            z9 = false;
                                        }
                                        int selectedIndex5 = j90Var.c.getSelectedIndex();
                                        if (selectedIndex5 < arrayList.size()) {
                                            int intValue = ((Integer) arrayList.get(selectedIndex5)).intValue();
                                            z10 = z9;
                                            if (j90Var.e.usage_limit != intValue) {
                                                tL_messages_editExportedChatInvite.flags |= 2;
                                                tL_messages_editExportedChatInvite.usage_limit = intValue;
                                                z10 = true;
                                            }
                                            z11 = j90Var.e.request_needed;
                                            g90Var = j90Var.f;
                                            if (z11 != (g90Var == null && g90Var.e.h)) {
                                                int i13 = tL_messages_editExportedChatInvite.flags;
                                                tL_messages_editExportedChatInvite.flags = i13 | 8;
                                                boolean z15 = g90Var != null && g90Var.e.h;
                                                tL_messages_editExportedChatInvite.request_needed = z15;
                                                if (z15) {
                                                    tL_messages_editExportedChatInvite.flags = i13 | 10;
                                                    tL_messages_editExportedChatInvite.usage_limit = 0;
                                                }
                                                z10 = true;
                                            }
                                            obj = j90Var.K.getText().toString();
                                            z12 = z10;
                                            if (!TextUtils.equals(j90Var.e.title, obj)) {
                                                tL_messages_editExportedChatInvite.title = obj;
                                                tL_messages_editExportedChatInvite.flags |= 16;
                                                z12 = true;
                                            }
                                            if (!z12) {
                                                j90Var.U = true;
                                                org.telegram.ui.ActionBar.u1 u1Var4 = new org.telegram.ui.ActionBar.u1(3, j90Var.getParentActivity(), null);
                                                j90Var.T = u1Var4;
                                                u1Var4.r(500L);
                                                ConnectionsManager connectionsManager = j90Var.getConnectionsManager();
                                                final boolean z16 = z13 ? 1 : 0;
                                                connectionsManager.sendRequest(tL_messages_editExportedChatInvite, new RequestDelegate() { // from class: org.telegram.ui.a90
                                                    @Override // org.telegram.tgnet.RequestDelegate
                                                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                        switch (z16) {
                                                            case 0:
                                                                final int i132 = 0;
                                                                final j90 j90Var2 = j90Var;
                                                                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.b90
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        switch (i132) {
                                                                            case 0:
                                                                                j90 j90Var32 = j90Var2;
                                                                                j90Var32.U = false;
                                                                                org.telegram.ui.ActionBar.u1 u1Var32 = j90Var32.T;
                                                                                if (u1Var32 != null) {
                                                                                    u1Var32.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error2 = tL_error;
                                                                                if (tL_error2 != null) {
                                                                                    org.telegram.ui.Components.v4.r0(j90Var32, null, tL_error2.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    i90 i90Var = j90Var32.S;
                                                                                    if (i90Var != null) {
                                                                                        i90Var.c(tLObject);
                                                                                    }
                                                                                    j90Var32.finishFragment();
                                                                                    break;
                                                                                }
                                                                            default:
                                                                                j90 j90Var4 = j90Var2;
                                                                                j90Var4.U = false;
                                                                                org.telegram.ui.ActionBar.u1 u1Var42 = j90Var4.T;
                                                                                if (u1Var42 != null) {
                                                                                    u1Var42.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error3 = tL_error;
                                                                                if (tL_error3 != null) {
                                                                                    org.telegram.ui.Components.v4.r0(j90Var4, null, tL_error3.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    TLObject tLObject2 = tLObject;
                                                                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                        j90Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                    }
                                                                                    i90 i90Var2 = j90Var4.S;
                                                                                    if (i90Var2 != null) {
                                                                                        i90Var2.b(j90Var4.e, tLObject2);
                                                                                    }
                                                                                    j90Var4.finishFragment();
                                                                                    break;
                                                                                }
                                                                        }
                                                                    }
                                                                });
                                                                break;
                                                            default:
                                                                final int i14 = 1;
                                                                final j90 j90Var3 = j90Var;
                                                                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.b90
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        switch (i14) {
                                                                            case 0:
                                                                                j90 j90Var32 = j90Var3;
                                                                                j90Var32.U = false;
                                                                                org.telegram.ui.ActionBar.u1 u1Var32 = j90Var32.T;
                                                                                if (u1Var32 != null) {
                                                                                    u1Var32.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error2 = tL_error;
                                                                                if (tL_error2 != null) {
                                                                                    org.telegram.ui.Components.v4.r0(j90Var32, null, tL_error2.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    i90 i90Var = j90Var32.S;
                                                                                    if (i90Var != null) {
                                                                                        i90Var.c(tLObject);
                                                                                    }
                                                                                    j90Var32.finishFragment();
                                                                                    break;
                                                                                }
                                                                            default:
                                                                                j90 j90Var4 = j90Var3;
                                                                                j90Var4.U = false;
                                                                                org.telegram.ui.ActionBar.u1 u1Var42 = j90Var4.T;
                                                                                if (u1Var42 != null) {
                                                                                    u1Var42.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error3 = tL_error;
                                                                                if (tL_error3 != null) {
                                                                                    org.telegram.ui.Components.v4.r0(j90Var4, null, tL_error3.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    TLObject tLObject2 = tLObject;
                                                                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                        j90Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                    }
                                                                                    i90 i90Var2 = j90Var4.S;
                                                                                    if (i90Var2 != null) {
                                                                                        i90Var2.b(j90Var4.e, tLObject2);
                                                                                    }
                                                                                    j90Var4.finishFragment();
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
                                                j90Var.finishFragment();
                                                break;
                                            }
                                        } else {
                                            z10 = z9;
                                            if (j90Var.e.usage_limit != 0) {
                                                tL_messages_editExportedChatInvite.flags |= 2;
                                                tL_messages_editExportedChatInvite.usage_limit = 0;
                                                z10 = true;
                                            }
                                            z11 = j90Var.e.request_needed;
                                            g90Var = j90Var.f;
                                            if (z11 != (g90Var == null && g90Var.e.h)) {
                                            }
                                            obj = j90Var.K.getText().toString();
                                            z12 = z10;
                                            if (!TextUtils.equals(j90Var.e.title, obj)) {
                                            }
                                            if (!z12) {
                                            }
                                        }
                                    }
                                }
                                j3 = 0;
                                i10 = j90Var.a;
                                if (i10 != 0) {
                                }
                            }
                        }
                    }
                } else {
                    j90Var.finishFragment();
                    org.telegram.messenger.g0.v1(j90Var.F);
                    break;
                }
                break;
            case 12:
                if (i7 == -1) {
                    ((y90) obj2).finishFragment();
                    break;
                }
                break;
            case 13:
                ee0 ee0Var = (ee0) obj2;
                if (i7 != 1) {
                    if (i7 == -1 && ee0Var.onBackPressed(true)) {
                        ee0Var.finishFragment();
                        break;
                    }
                } else {
                    ee0Var.H1();
                    break;
                }
                break;
            case 14:
                if (i7 == -1) {
                    ((ge0) obj2).finishFragment();
                    break;
                }
                break;
            case 15:
                if (i7 == -1) {
                    ((ef0) obj2).finishFragment();
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
                lg0 lg0Var = (lg0) obj2;
                if (i7 != -1) {
                    if (i7 == 1) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", lg0Var.b);
                        lg0Var.presentFragment(new d51(bundle));
                        break;
                    }
                } else {
                    lg0Var.finishFragment();
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
                om0 om0Var = (om0) obj2;
                if (i7 != -1) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            om0.Z(om0Var, null);
                            break;
                        }
                    } else if (om0Var.V != null) {
                        om0Var.finishFragment(false);
                        om0Var.V.m();
                        break;
                    }
                } else {
                    om0Var.finishFragment();
                    break;
                }
                break;
            case 23:
                rm0 rm0Var = (rm0) obj2;
                if (i7 != -1) {
                    if (i7 == 1) {
                        if (rm0Var.c != null && !rm0Var.f) {
                            pm0 pm0Var = rm0Var.d;
                            float f10 = pm0Var.f - pm0Var.y;
                            float f11 = pm0Var.w;
                            float f12 = f10 / f11;
                            float f13 = (pm0Var.h - pm0Var.D) / pm0Var.x;
                            float f14 = pm0Var.d / f11;
                            float f15 = pm0Var.e / f11;
                            rm0 rm0Var2 = pm0Var.H;
                            int width = (int) (f12 * rm0Var2.a.getWidth());
                            int height = (int) (f13 * rm0Var2.a.getHeight());
                            int width2 = (int) (f14 * rm0Var2.a.getWidth());
                            int width3 = (int) (f15 * rm0Var2.a.getWidth());
                            int i14 = width < 0 ? 0 : width;
                            int i15 = height < 0 ? 0 : height;
                            if (i14 + width2 > rm0Var2.a.getWidth()) {
                                width2 = rm0Var2.a.getWidth() - i14;
                            }
                            int i16 = width2;
                            if (i15 + width3 > rm0Var2.a.getHeight()) {
                                width3 = rm0Var2.a.getHeight() - i15;
                            }
                            int i17 = width3;
                            try {
                                bitmap = Bitmap.createBitmap(rm0Var2.a, i14, i15, i16, i17, (Matrix) null, false);
                            } catch (Throwable th2) {
                                org.telegram.messenger.a8.g(th2, true);
                                System.gc();
                                try {
                                    bitmap = Bitmap.createBitmap(rm0Var2.a, i14, i15, i16, i17, (Matrix) null, false);
                                } catch (Throwable th3) {
                                    org.telegram.messenger.a8.g(th3, true);
                                    bitmap = null;
                                }
                            }
                            if (bitmap == rm0Var.a) {
                                rm0Var.e = true;
                            }
                            ((org.telegram.ui.Components.k30) rm0Var.c).r(false, bitmap, null);
                            rm0Var.f = true;
                        }
                        rm0Var.finishFragment();
                        break;
                    }
                } else {
                    rm0Var.finishFragment();
                    break;
                }
                break;
            case 24:
                zm0 zm0Var = (zm0) obj2;
                if (i7 != -1) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            ym0 ym0Var = zm0Var.s0;
                            if (ym0Var != null) {
                                ym0Var.f0();
                            }
                            zm0Var.finishFragment();
                            break;
                        }
                    } else {
                        boolean z17 = zm0Var.Y;
                        zm0Var.Y = !z17;
                        if (z17) {
                            zm0Var.K.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(50.0f));
                        } else {
                            zm0Var.K.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
                        }
                        zm0Var.K.C0();
                        zm0Var.M.h1(0, 0);
                        zm0Var.L.f();
                        break;
                    }
                } else {
                    zm0Var.finishFragment();
                    break;
                }
                break;
            case 25:
                if (i7 == -1) {
                    ((cn0) obj2).finishFragment();
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
                js0 js0Var = (js0) obj2;
                if (i7 != -1) {
                    if (i7 == 1) {
                        js0Var.d0();
                        break;
                    }
                } else if (js0Var.onBackPressed(true)) {
                    js0Var.finishFragment();
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
