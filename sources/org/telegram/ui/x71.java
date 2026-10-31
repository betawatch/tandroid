package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x71 extends org.telegram.ui.Components.sk0 {
    public final Context c;
    public boolean d = true;
    public final /* synthetic */ ThemeActivity e;

    public x71(ThemeActivity themeActivity, Context context) {
        this.e = themeActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 0 || i10 == 1 || i10 == 4 || i10 == 7 || i10 == 10 || i10 == 11 || i10 == 12 || i10 == 14 || i10 == 18 || i10 == 20 || i10 == 21;
    }

    @Override // s4.g0
    public final int b() {
        return this.e.J0;
    }

    @Override // s4.g0
    public final int d(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        ThemeActivity themeActivity = this.e;
        if (i10 == themeActivity.a0 || i10 == themeActivity.K || i10 == themeActivity.b0 || i10 == themeActivity.Y || i10 == themeActivity.P || i10 == themeActivity.Q || i10 == themeActivity.M || i10 == themeActivity.L) {
            return 1;
        }
        if (i10 == themeActivity.f0 || i10 == themeActivity.Z || i10 == themeActivity.v0 || i10 == themeActivity.A0 || i10 == themeActivity.G0) {
            return 2;
        }
        if (i10 == themeActivity.r0 || i10 == themeActivity.V || i10 == themeActivity.c0 || i10 == themeActivity.O || i10 == themeActivity.h0 || i10 == themeActivity.n0 || i10 == themeActivity.k0 || i10 == themeActivity.J || i10 == themeActivity.I0 || i10 == themeActivity.z0 || i10 == themeActivity.B0 || i10 == themeActivity.C0 || i10 == themeActivity.D0) {
            return 3;
        }
        if (i10 == themeActivity.R || i10 == themeActivity.S || i10 == themeActivity.T || i10 == themeActivity.U) {
            return 4;
        }
        if (i10 == themeActivity.W || i10 == themeActivity.d0 || i10 == themeActivity.g0 || i10 == themeActivity.y || i10 == themeActivity.i0 || i10 == themeActivity.x || i10 == themeActivity.l0 || i10 == themeActivity.j0 || i10 == themeActivity.t0 || i10 == themeActivity.w0 || i10 == themeActivity.H0 || i10 == themeActivity.E0 || i10 == themeActivity.F0) {
            return 5;
        }
        if (i10 == themeActivity.e0) {
            return 6;
        }
        if (i10 == themeActivity.X || i10 == themeActivity.G || i10 == themeActivity.E) {
            return 7;
        }
        i11 = themeActivity.raiseToListenRow;
        if (i10 == i11) {
            return 7;
        }
        i12 = themeActivity.pauseOnRecordRow;
        if (i10 == i12 || i10 == themeActivity.D || i10 == themeActivity.s0) {
            return 7;
        }
        i13 = themeActivity.pauseOnMediaRow;
        if (i10 == i13 || i10 == themeActivity.F) {
            return 7;
        }
        i14 = themeActivity.sensitiveContentRow;
        if (i10 == i14) {
            return 7;
        }
        i15 = themeActivity.textSizeRow;
        if (i10 == i15) {
            return 8;
        }
        if (i10 == themeActivity.m0) {
            return 9;
        }
        i16 = themeActivity.nightThemeRow;
        if (i10 == i16) {
            return 10;
        }
        i17 = themeActivity.browserRow;
        if (i10 == i17) {
            return 10;
        }
        if (i10 == themeActivity.o0) {
            return 11;
        }
        if (i10 == themeActivity.q0) {
            return 12;
        }
        i18 = themeActivity.bubbleRadiusRow;
        if (i10 == i18) {
            return 13;
        }
        i19 = themeActivity.backgroundRow;
        if (i10 == i19 || i10 == themeActivity.y0) {
            return 14;
        }
        i20 = themeActivity.createNewThemeRow;
        if (i10 == i20) {
            return 14;
        }
        i21 = themeActivity.liteModeRow;
        if (i10 == i21) {
            return 14;
        }
        i22 = themeActivity.stickersRow;
        if (i10 == i22) {
            return 14;
        }
        if (i10 == themeActivity.u0) {
            return 15;
        }
        if (i10 == themeActivity.x0) {
            return 16;
        }
        if (i10 == themeActivity.p0) {
            return 17;
        }
        if (i10 == themeActivity.H || i10 == themeActivity.I) {
            return 19;
        }
        i23 = themeActivity.appIconSelectorRow;
        if (i10 == i23) {
            return 20;
        }
        i24 = themeActivity.changeUserColor;
        return i10 == i24 ? 21 : 1;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23 = c1Var.f;
        View view = c1Var.a;
        ThemeActivity themeActivity = this.e;
        if (i23 == 1) {
            org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
            i11 = themeActivity.nightThemeRow;
            if (i10 == i11) {
                if (org.telegram.ui.ActionBar.t6.o == 0 || org.telegram.ui.ActionBar.t6.J == null) {
                    x9Var.c(org.telegram.messenger.cd.L0(2131753784, null), org.telegram.messenger.cd.L0(2131753783, null), false, false);
                    return;
                } else {
                    x9Var.c(org.telegram.messenger.cd.L0(2131753784, null), org.telegram.ui.ActionBar.t6.C0(), false, false);
                    return;
                }
            }
            if (i10 == themeActivity.a0) {
                int i24 = org.telegram.ui.ActionBar.t6.r;
                int i25 = i24 / 60;
                x9Var.c(org.telegram.messenger.cd.L0(2131753792, "AutoNightFrom"), String.format("%02d:%02d", Integer.valueOf(i25), Integer.valueOf(i24 - (i25 * 60))), false, true);
                return;
            }
            if (i10 == themeActivity.b0) {
                int i26 = org.telegram.ui.ActionBar.t6.s;
                int i27 = i26 / 60;
                x9Var.c(org.telegram.messenger.cd.L0(2131753782, "AutoNightTo"), String.format("%02d:%02d", Integer.valueOf(i27), Integer.valueOf(i26 - (i27 * 60))), false, false);
                return;
            }
            if (i10 == themeActivity.Y) {
                x9Var.c(org.telegram.messenger.cd.L0(2131753781, "AutoNightUpdateLocation"), org.telegram.ui.ActionBar.t6.w, false, false);
                return;
            }
            if (i10 == themeActivity.Q) {
                int i28 = org.telegram.messenger.vp.d1().getInt("sortContactsBy", 0);
                x9Var.c(org.telegram.messenger.cd.L0(2131745309, "SortBy"), i28 == 0 ? org.telegram.messenger.cd.L0(2131751601, "Default") : i28 == 1 ? org.telegram.messenger.cd.L0(2131745305, "FirstName") : org.telegram.messenger.cd.L0(2131745304, "LastName"), false, true);
                return;
            }
            if (i10 == themeActivity.P) {
                x9Var.b(org.telegram.messenger.cd.L0(2131749273, "ImportContacts"), true);
                return;
            }
            if (i10 == themeActivity.K) {
                int i29 = org.telegram.messenger.tz.s1;
                x9Var.c(org.telegram.messenger.cd.L0(2131751368, "DistanceUnits"), i29 == 0 ? org.telegram.messenger.cd.L0(2131751367, "DistanceUnitsAutomatic") : i29 == 1 ? org.telegram.messenger.cd.L0(2131751366, "DistanceUnitsKilometers") : org.telegram.messenger.cd.L0(2131751365, "DistanceUnitsMiles"), themeActivity.O0, themeActivity.D0 >= 0);
                themeActivity.O0 = false;
                return;
            } else if (i10 == themeActivity.L) {
                x9Var.c(org.telegram.messenger.cd.L0(2131745816, null), org.telegram.ui.web.g1.a().a, themeActivity.P0, false);
                return;
            } else {
                if (i10 == themeActivity.M) {
                    x9Var.c(org.telegram.messenger.cd.L0(2131748454, null), org.telegram.messenger.cd.L0(org.telegram.messenger.tz.u0 ? 2131748452 : 2131748453, null), themeActivity.N0, false);
                    themeActivity.N0 = false;
                    return;
                }
                return;
            }
        }
        if (i23 == 2) {
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            b9Var.setFixedSize(0);
            if (i10 == themeActivity.f0) {
                b9Var.setText(org.telegram.messenger.cd.a0("AutoNightBrightnessInfo", null, 2131753794, Integer.valueOf((int) (org.telegram.ui.ActionBar.t6.q * 100.0f))));
                return;
            }
            if (i10 == themeActivity.Z) {
                b9Var.setText(ThemeActivity.C0());
                return;
            }
            if (i10 == themeActivity.v0) {
                b9Var.setText(org.telegram.messenger.cd.L0(2131752221, "ChatListSwipeGestureInfo"));
                return;
            } else if (i10 == themeActivity.G0) {
                b9Var.setText(org.telegram.messenger.cd.L0(2131748875, "LiteModeInfo"));
                return;
            } else {
                b9Var.setFixedSize(12);
                b9Var.setText("");
                return;
            }
        }
        if (i23 == 4) {
            org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) view;
            if (i10 == themeActivity.R) {
                aaVar.a(org.telegram.messenger.cd.L0(2131753793, "AutoNightDisabled"), org.telegram.ui.ActionBar.t6.o == 0, true);
                return;
            }
            if (i10 == themeActivity.S) {
                aaVar.a(org.telegram.messenger.cd.L0(2131753787, "AutoNightScheduled"), org.telegram.ui.ActionBar.t6.o == 1, true);
                return;
            } else if (i10 == themeActivity.T) {
                aaVar.a(org.telegram.messenger.cd.L0(2131753796, "AutoNightAdaptive"), org.telegram.ui.ActionBar.t6.o == 2, themeActivity.U != -1);
                return;
            } else {
                if (i10 == themeActivity.U) {
                    aaVar.a(org.telegram.messenger.cd.L0(2131753786, "AutoNightSystemDefault"), org.telegram.ui.ActionBar.t6.o == 3, false);
                    return;
                }
                return;
            }
        }
        if (i23 == 5) {
            org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
            if (i10 == themeActivity.W) {
                p4Var.setText(org.telegram.messenger.cd.L0(2131753788, "AutoNightSchedule"));
                return;
            }
            if (i10 == themeActivity.d0) {
                p4Var.setText(org.telegram.messenger.cd.L0(2131753795, "AutoNightBrightness"));
                return;
            }
            if (i10 == themeActivity.g0) {
                p4Var.setText(org.telegram.messenger.cd.L0(2131753789, "AutoNightPreferred"));
                return;
            }
            if (i10 == themeActivity.y) {
                p4Var.setText(org.telegram.messenger.cd.L0(2131746000, "SETTINGS"));
                return;
            }
            if (i10 == themeActivity.i0) {
                if (themeActivity.f == 3) {
                    p4Var.setText(org.telegram.messenger.cd.L0(2131752839, "BuildMyOwnTheme"));
                    return;
                } else {
                    p4Var.setText(org.telegram.messenger.cd.L0(2131752011, "ColorTheme"));
                    return;
                }
            }
            if (i10 == themeActivity.x) {
                p4Var.setText(org.telegram.messenger.cd.L0(2131744216, "TextSizeHeader"));
                return;
            }
            if (i10 == themeActivity.l0) {
                p4Var.setText(org.telegram.messenger.cd.L0(2131752225, "ChatList"));
                return;
            }
            if (i10 == themeActivity.j0) {
                p4Var.setText(org.telegram.messenger.cd.L0(2131752840, "BubbleRadius"));
                return;
            }
            if (i10 == themeActivity.t0) {
                p4Var.setText(org.telegram.messenger.cd.L0(2131752222, "ChatListSwipeGesture"));
                return;
            }
            if (i10 == themeActivity.w0) {
                p4Var.setText(org.telegram.messenger.cd.L0(2131745668, "SelectTheme"));
                return;
            }
            if (i10 == themeActivity.H0) {
                p4Var.setText(org.telegram.messenger.cd.L0(2131754240, null));
                return;
            } else if (i10 == themeActivity.F0) {
                p4Var.setText(org.telegram.messenger.cd.L0(2131747781, "OtherSettings"));
                return;
            } else {
                if (i10 == themeActivity.E0) {
                    p4Var.setText(org.telegram.messenger.cd.L0(2131748675, "MediaAndSoundSettings"));
                    return;
                }
                return;
            }
        }
        if (i23 == 6) {
            ((org.telegram.ui.Cells.i0) view).setProgress(org.telegram.ui.ActionBar.t6.q);
            return;
        }
        if (i23 == 7) {
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
            if (i10 == themeActivity.X) {
                t8Var.f(org.telegram.messenger.cd.L0(2131753791, "AutoNightLocation"), org.telegram.ui.ActionBar.t6.p, true);
                return;
            }
            if (i10 == themeActivity.N) {
                t8Var.f(org.telegram.messenger.cd.L0(2131751158, "EnableAnimations"), org.telegram.messenger.vp.d1().getBoolean("view_animations", true), true);
                return;
            }
            if (i10 == themeActivity.G) {
                t8Var.f(org.telegram.messenger.cd.L0(2131745649, "SendByEnter"), org.telegram.messenger.vp.d1().getBoolean("send_by_enter", false), true);
                return;
            }
            if (i10 == themeActivity.E) {
                t8Var.g(org.telegram.messenger.cd.L0(2131746440, "RaiseToSpeak"), org.telegram.messenger.cd.L0(2131746439, "RaiseToSpeakInfo"), org.telegram.messenger.tz.r0, true, true);
                return;
            }
            i12 = themeActivity.raiseToListenRow;
            if (i10 == i12) {
                t8Var.g(org.telegram.messenger.cd.L0(2131746442, "RaiseToListen"), org.telegram.messenger.cd.L0(2131746441, "RaiseToListenInfo"), org.telegram.messenger.tz.s0, true, true);
                return;
            }
            if (i10 == themeActivity.F) {
                t8Var.g(org.telegram.messenger.cd.L0(2131748266, "NextMediaTap"), org.telegram.messenger.cd.L0(2131748265, "NextMediaTapInfo"), org.telegram.messenger.tz.t0, true, true);
                return;
            }
            i13 = themeActivity.pauseOnRecordRow;
            if (i10 == i13) {
                t8Var.g(org.telegram.messenger.cd.L0(2131747447, null), org.telegram.messenger.cd.L0(2131747446, "PauseMusicOnRecordInfo"), org.telegram.messenger.tz.F0, true, true);
                return;
            }
            i14 = themeActivity.pauseOnMediaRow;
            if (i10 == i14) {
                t8Var.f(org.telegram.messenger.cd.L0(2131747448, null), org.telegram.messenger.tz.G0, true);
                return;
            }
            if (i10 == themeActivity.D) {
                t8Var.g(org.telegram.messenger.cd.L0(2131751439, "DirectShare"), org.telegram.messenger.cd.L0(2131751438, "DirectShareInfo"), org.telegram.messenger.tz.x0, false, true);
                return;
            }
            i15 = themeActivity.sensitiveContentRow;
            if (i10 == i15) {
                t8Var.g(org.telegram.messenger.cd.L0(2131745348, null), org.telegram.messenger.cd.L0(2131745347, null), themeActivity.getMessagesController().P4(), true, true);
                return;
            } else {
                if (i10 == themeActivity.s0) {
                    t8Var.f(org.telegram.messenger.cd.L0(2131753675, "BlurInChat"), org.telegram.messenger.tz.f(), true);
                    return;
                }
                return;
            }
        }
        if (i23 == 14) {
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
            p8Var.w = 48;
            i16 = themeActivity.backgroundRow;
            if (i10 == i16) {
                p8Var.setSubtitle(null);
                int i30 = org.telegram.ui.ActionBar.t6.q6;
                p8Var.g(i30, i30);
                String L0 = org.telegram.messenger.cd.L0(2131752550, null);
                i20 = themeActivity.changeUserColor;
                p8Var.o(R.drawable.msg_background, L0, i20 >= 0);
                return;
            }
            if (i10 == themeActivity.y0) {
                p8Var.setSubtitle(null);
                int i31 = org.telegram.ui.ActionBar.t6.q6;
                p8Var.g(i31, i31);
                p8Var.o(R.drawable.msg_theme, org.telegram.messenger.cd.L0(2131751282, null), true);
                return;
            }
            i17 = themeActivity.createNewThemeRow;
            if (i10 == i17) {
                p8Var.setSubtitle(null);
                int i32 = org.telegram.ui.ActionBar.t6.q6;
                p8Var.g(i32, i32);
                p8Var.o(R.drawable.msg_colors, org.telegram.messenger.cd.L0(2131751713, null), false);
                return;
            }
            i18 = themeActivity.liteModeRow;
            if (i10 == i18) {
                p8Var.g(org.telegram.ui.ActionBar.t6.J5, org.telegram.ui.ActionBar.t6.G6);
                p8Var.o(R.drawable.msg2_animations, org.telegram.messenger.cd.L0(2131748876, null), true);
                p8Var.setSubtitle(org.telegram.messenger.cd.L0(2131748875, null));
                p8Var.w = 60;
                p8Var.s = 64;
                p8Var.x = 20;
                return;
            }
            i19 = themeActivity.stickersRow;
            if (i10 == i19) {
                p8Var.g(org.telegram.ui.ActionBar.t6.J5, org.telegram.ui.ActionBar.t6.G6);
                p8Var.o(R.drawable.msg2_sticker, org.telegram.messenger.cd.L0(2131744875, null), false);
                p8Var.setSubtitle(org.telegram.messenger.cd.L0(2131744874, null));
                p8Var.s = 64;
                p8Var.w = 60;
                p8Var.x = 20;
                return;
            }
            return;
        }
        if (i23 == 17) {
            ((vu) view).a();
            return;
        }
        if (i23 == 19) {
            org.telegram.ui.Cells.l6 l6Var = (org.telegram.ui.Cells.l6) view;
            if (i10 == themeActivity.H) {
                l6Var.b("save media only from peer chats", "", true, false);
                return;
            } else {
                l6Var.b("save media from all chats", "", true, false);
                return;
            }
        }
        if (i23 == 21) {
            ((zm0) view).set(themeActivity.getUserConfig().f());
            return;
        }
        switch (i23) {
            case 10:
                org.telegram.ui.Cells.l5 l5Var = (org.telegram.ui.Cells.l5) view;
                i21 = themeActivity.nightThemeRow;
                if (i10 != i21) {
                    i22 = themeActivity.browserRow;
                    if (i10 == i22) {
                        l5Var.b(org.telegram.messenger.cd.L0(2131749218, null), org.telegram.messenger.cd.L0(2131749217, null), R.drawable.msg2_language, themeActivity.getMessagesController().K2(), 0, false, true, false);
                        break;
                    }
                } else {
                    boolean z10 = org.telegram.ui.ActionBar.t6.o != 0;
                    String C0 = z10 ? org.telegram.ui.ActionBar.t6.C0() : org.telegram.messenger.cd.L0(2131753783, "AutoNightThemeOff");
                    if (z10) {
                        int i33 = org.telegram.ui.ActionBar.t6.o;
                        C0 = a1.g.C(i33 == 1 ? org.telegram.messenger.cd.L0(2131753787, "AutoNightScheduled") : i33 == 3 ? org.telegram.messenger.cd.L0(2131753786, "AutoNightSystemDefault") : org.telegram.messenger.cd.L0(2131753796, "AutoNightAdaptive"), " ", C0);
                    }
                    l5Var.b(org.telegram.messenger.cd.L0(2131753784, "AutoNightTheme"), C0, R.drawable.menu_night_mode_24, z10, 0, false, true, false);
                    break;
                }
                break;
            case 11:
                if (this.d) {
                    themeActivity.c.A1(themeActivity.b.getMeasuredWidth());
                    this.d = false;
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Components.tk0 tk0Var = (org.telegram.ui.Components.tk0) view;
                z71 z71Var = (z71) tk0Var.getAdapter();
                z71Var.f();
                int indexOf = z71Var.e.indexOf(z71Var.d.k(false));
                if (indexOf == -1) {
                    indexOf = z71Var.b() - 1;
                }
                if (indexOf != -1) {
                    ((s4.a0) tk0Var.getLayoutManager()).h1(indexOf, (themeActivity.b.getMeasuredWidth() / 2) - org.telegram.messenger.i0.L(42.0f));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [org.telegram.ui.Cells.x9] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v13, types: [android.view.View, org.telegram.ui.v71] */
    /* JADX WARN: Type inference failed for: r0v15, types: [org.telegram.ui.o71] */
    /* JADX WARN: Type inference failed for: r0v16, types: [org.telegram.ui.Components.yx0] */
    /* JADX WARN: Type inference failed for: r0v17, types: [android.view.View, org.telegram.ui.in0] */
    /* JADX WARN: Type inference failed for: r0v18, types: [android.view.View, org.telegram.ui.vu] */
    /* JADX WARN: Type inference failed for: r0v19, types: [org.telegram.ui.Cells.l6] */
    /* JADX WARN: Type inference failed for: r0v2, types: [org.telegram.ui.Cells.b9] */
    /* JADX WARN: Type inference failed for: r0v20, types: [android.view.View, android.view.ViewGroup, androidx.recyclerview.widget.RecyclerView, java.lang.Object, org.telegram.ui.Cells.t, org.telegram.ui.Components.tk0] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v23, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v24, types: [org.telegram.ui.Cells.p8] */
    /* JADX WARN: Type inference failed for: r0v3, types: [org.telegram.ui.Cells.c7] */
    /* JADX WARN: Type inference failed for: r0v5, types: [org.telegram.ui.Cells.p4] */
    /* JADX WARN: Type inference failed for: r0v6, types: [org.telegram.ui.t71] */
    /* JADX WARN: Type inference failed for: r0v7, types: [org.telegram.ui.Cells.t8] */
    /* JADX WARN: Type inference failed for: r0v8, types: [org.telegram.ui.y71] */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, java.lang.Object, org.telegram.ui.u71] */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout, org.telegram.ui.Cells.aa] */
    /* JADX WARN: Type inference failed for: r2v10, types: [android.view.View, android.view.ViewGroup, androidx.recyclerview.widget.RecyclerView, java.lang.Object, org.telegram.ui.Components.tk0, org.telegram.ui.w71] */
    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        ?? x9Var;
        int i11;
        org.telegram.ui.ActionBar.z4 z4Var;
        int i12;
        zm0 zm0Var;
        int i13;
        int i14 = 16;
        int i15 = 2;
        int i16 = 1;
        org.telegram.ui.ActionBar.p6 p6Var = null;
        int i17 = 0;
        ThemeActivity themeActivity = this.e;
        Context context = this.c;
        switch (i10) {
            case 1:
                x9Var = new org.telegram.ui.Cells.x9(context);
                break;
            case 2:
                x9Var = new org.telegram.ui.Cells.b9(context);
                break;
            case 3:
                x9Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 4:
                ?? aaVar = new org.telegram.ui.Cells.aa(context);
                aaVar.setWillNotDraw(false);
                TextView textView = new TextView(context);
                aaVar.a = textView;
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, null);
                org.telegram.messenger.z20.o(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 16);
                boolean z10 = org.telegram.messenger.cd.X;
                aaVar.addView(textView, w7.b6.d(-1, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 71.0f : 21.0f, 0.0f, z10 ? 21.0f : 23.0f, 0.0f));
                ImageView imageView = new ImageView(context);
                aaVar.b = imageView;
                org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.Ai, null, PorterDuff.Mode.MULTIPLY);
                imageView.setImageResource(R.drawable.sticker_added);
                aaVar.addView(imageView, w7.b6.d(19, 14.0f, (org.telegram.messenger.cd.X ? 3 : 5) | 16, 23.0f, 0.0f, 23.0f, 0.0f));
                zm0Var = aaVar;
                x9Var = zm0Var;
                break;
            case 5:
                x9Var = new org.telegram.ui.Cells.p4(context);
                break;
            case 6:
                x9Var = new t71(this, context);
                break;
            case 7:
                x9Var = new org.telegram.ui.Cells.t8(context);
                break;
            case 8:
                x9Var = new y71(themeActivity, context);
                break;
            case 9:
                x9Var = new u71(context, 0);
                x9Var.b = new org.telegram.ui.Cells.u0[2];
                x9Var.setOrientation(0);
                x9Var.setPadding(org.telegram.messenger.i0.L(21.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(21.0f), 0);
                int i18 = 0;
                while (true) {
                    org.telegram.ui.Cells.u0[] u0VarArr = (org.telegram.ui.Cells.u0[]) x9Var.b;
                    if (i18 >= u0VarArr.length) {
                        break;
                    } else {
                        boolean z11 = i18 == 1;
                        org.telegram.ui.Cells.u0 u0Var = new org.telegram.ui.Cells.u0(context, 0);
                        u0Var.b = new RectF();
                        TextPaint textPaint = new TextPaint(1);
                        u0Var.e = textPaint;
                        u0Var.setWillNotDraw(false);
                        u0Var.c = z11;
                        u0Var.setContentDescription(org.telegram.messenger.cd.L0(z11 ? 2131752223 : 2131752224, null));
                        textPaint.setTextSize(org.telegram.messenger.i0.L(13.0f));
                        org.telegram.ui.Cells.t0 t0Var = new org.telegram.ui.Cells.t0(u0Var, context);
                        u0Var.d = t0Var;
                        t0Var.setSize(org.telegram.messenger.i0.L(20.0f));
                        u0Var.addView(t0Var, w7.b6.d(22, 22.0f, 53, 0.0f, 26.0f, 10.0f, 0.0f));
                        t0Var.a((z11 && org.telegram.messenger.tz.p1) || !(z11 || org.telegram.messenger.tz.p1), false);
                        u0VarArr[i18] = u0Var;
                        x9Var.addView(((org.telegram.ui.Cells.u0[]) x9Var.b)[i18], w7.b6.m(0.5f, -1, -1, i18 == 1 ? 10 : 0, 0, 0));
                        ((org.telegram.ui.Cells.u0[]) x9Var.b)[i18].setOnClickListener(new org.telegram.ui.ActionBar.c0(i16, x9Var, z11));
                        i18++;
                    }
                }
                break;
            case 10:
                x9Var = new org.telegram.ui.Cells.l5(21, 60, this.c, null, true);
                break;
            case 11:
                this.d = true;
                v71 v71Var = new v71(this, this.c, themeActivity, themeActivity.f, themeActivity.e, themeActivity.d);
                themeActivity.c = v71Var;
                v71Var.setDrawDivider(themeActivity.w);
                themeActivity.c.setFocusable(false);
                x9Var = themeActivity.c;
                x9Var.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(148.0f)));
                break;
            case 12:
                ?? w71Var = new w71(i17, context, p6Var);
                w71Var.setFocusable(false);
                w71Var.setItemAnimator(null);
                w71Var.setLayoutAnimation(null);
                w71Var.setPadding(org.telegram.messenger.i0.L(11.0f), 0, org.telegram.messenger.i0.L(11.0f), 0);
                w71Var.setClipToPadding(false);
                s4.a0 a0Var = new s4.a0();
                a0Var.j1(0);
                w71Var.setLayoutManager(a0Var);
                z71 z71Var = new z71(themeActivity, context);
                w71Var.setAdapter(z71Var);
                w71Var.setOnItemClickListener(new r71(this, z71Var, w71Var, i17));
                w71Var.setOnItemLongClickListener(new ep0(i14, this, z71Var));
                w71Var.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(62.0f)));
                zm0Var = w71Var;
                x9Var = zm0Var;
                break;
            case 13:
                x9Var = new o71(themeActivity, context);
                break;
            case 14:
            case 18:
            default:
                x9Var = new org.telegram.ui.Cells.p8(context);
                break;
            case 15:
                i11 = ((org.telegram.ui.ActionBar.k2) themeActivity).currentAccount;
                x9Var = new org.telegram.ui.Components.yx0(context, i11);
                break;
            case 16:
                z4Var = ((org.telegram.ui.ActionBar.k2) themeActivity).parentLayout;
                x9Var = new in0(context, z4Var, 0);
                x9Var.setImportantForAccessibility(4);
                break;
            case 17:
                x9Var = new vu(themeActivity.f, context, themeActivity);
                x9Var.setFocusable(false);
                x9Var.setLayoutParams(new s4.o0(-1, -2));
                break;
            case 19:
                x9Var = new org.telegram.ui.Cells.l6(context, false);
                break;
            case 20:
                i12 = ((org.telegram.ui.ActionBar.k2) themeActivity).currentAccount;
                x9Var = new org.telegram.ui.Cells.t(context, null);
                x9Var.e3 = new ArrayList();
                x9Var.g3 = i12;
                x9Var.setPadding(0, org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f));
                x9Var.setFocusable(false);
                x9Var.setItemAnimator(null);
                x9Var.setLayoutAnimation(null);
                s4.a0 a0Var2 = new s4.a0(0, false);
                x9Var.f3 = a0Var2;
                x9Var.setLayoutManager(a0Var2);
                x9Var.setAdapter(new x7(x9Var, i16));
                x9Var.i(new mg.u1(x9Var, i15));
                x9Var.setOnItemClickListener(new org.telegram.ui.Cells.o(x9Var, themeActivity, context, i17));
                x9Var.z1();
                break;
            case 21:
                i13 = ((org.telegram.ui.ActionBar.k2) themeActivity).currentAccount;
                zm0Var = new zm0(i13, 0L, this.c, themeActivity.getResourceProvider());
                x9Var = zm0Var;
                break;
        }
        return new org.telegram.ui.Components.ck0(x9Var);
    }

    @Override // s4.g0
    public final void y(s4.c1 c1Var) {
        if (c1Var.f == 4) {
            ((org.telegram.ui.Cells.aa) c1Var.a).setTypeChecked(c1Var.b() == org.telegram.ui.ActionBar.t6.o);
        }
    }
}
