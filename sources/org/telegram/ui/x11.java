package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class x11 extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public final /* synthetic */ y11 d;

    public x11(y11 y11Var, Context context) {
        this.d = y11Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int b10 = b1Var.b();
        if (b10 == 0) {
            return true;
        }
        y11 y11Var = this.d;
        return b10 == y11Var.c || b10 == y11Var.d || b10 == y11Var.e;
    }

    @Override // s4.g0
    public final int h() {
        return this.d.h;
    }

    @Override // s4.g0
    public final int j(int i10) {
        y11 y11Var = this.d;
        if (i10 == y11Var.f) {
            return 0;
        }
        if (i10 == 0 || i10 == y11Var.c || i10 == y11Var.d || i10 == y11Var.e) {
            return i10 + 9;
        }
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.b1 b1Var, int i10) {
        String str;
        String string;
        String str2;
        int i11 = b1Var.f;
        View view = b1Var.a;
        String str3 = null;
        if (i11 == 0) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7, this.c, e9Var, null);
            e9Var.setText(LocaleController.getString(R.string.VoipQuickRepliesExplain));
            return;
        }
        if (i11 == 1) {
            return;
        }
        y11 y11Var = this.d;
        if (i11 == 4) {
            ((org.telegram.ui.Cells.w8) view).f(LocaleController.getString(R.string.AllowCustomQuickReply), y11Var.getParentActivity().getSharedPreferences("mainconfig", 0).getBoolean("quick_reply_allow_custom", true), false);
            return;
        }
        switch (i11) {
            case 9:
            case 10:
            case 11:
            case 12:
                org.telegram.ui.Cells.i3 i3Var = (org.telegram.ui.Cells.i3) view;
                if (i10 != 0) {
                    if (i10 != y11Var.c) {
                        if (i10 != y11Var.d) {
                            if (i10 != y11Var.e) {
                                str = null;
                                String string2 = y11Var.getParentActivity().getSharedPreferences("mainconfig", 0).getString(str3, "");
                                boolean z10 = i10 != y11Var.e;
                                EditTextBoldCursor editTextBoldCursor = i3Var.a;
                                editTextBoldCursor.setText(string2);
                                editTextBoldCursor.setHint(str);
                                i3Var.b = z10;
                                i3Var.setWillNotDraw(!z10);
                                break;
                            } else {
                                string = LocaleController.getString(R.string.QuickReplyDefault4);
                                str2 = "quick_reply_msg4";
                            }
                        } else {
                            string = LocaleController.getString(R.string.QuickReplyDefault3);
                            str2 = "quick_reply_msg3";
                        }
                    } else {
                        string = LocaleController.getString(R.string.QuickReplyDefault2);
                        str2 = "quick_reply_msg2";
                    }
                } else {
                    string = LocaleController.getString(R.string.QuickReplyDefault1);
                    str2 = "quick_reply_msg1";
                }
                String str4 = string;
                str3 = str2;
                str = str4;
                String string22 = y11Var.getParentActivity().getSharedPreferences("mainconfig", 0).getString(str3, "");
                if (i10 != y11Var.e) {
                }
                EditTextBoldCursor editTextBoldCursor2 = i3Var.a;
                editTextBoldCursor2.setText(string22);
                editTextBoldCursor2.setHint(str);
                i3Var.b = z10;
                i3Var.setWillNotDraw(!z10);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View e9Var;
        Context context = this.c;
        if (i10 == 0) {
            e9Var = new org.telegram.ui.Cells.e9(context);
        } else if (i10 != 1) {
            switch (i10) {
                case 9:
                case 10:
                case 11:
                case 12:
                    org.telegram.ui.Cells.i3 i3Var = new org.telegram.ui.Cells.i3(context);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, i3Var, null);
                    this.d.n[i10 - 9] = i3Var;
                    e9Var = i3Var;
                    break;
                default:
                    e9Var = new org.telegram.ui.Cells.w8(context);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, e9Var, null);
                    break;
            }
        } else {
            e9Var = new org.telegram.ui.Cells.ca(context);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, e9Var, null);
        }
        e9Var.setLayoutParams(new s4.o0(-1, -2));
        return new org.telegram.ui.Components.wl0(e9Var);
    }
}
