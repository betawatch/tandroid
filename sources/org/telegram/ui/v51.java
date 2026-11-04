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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v51 extends org.telegram.ui.Components.sj0 {
    public final Context c;
    public boolean d = true;
    public final /* synthetic */ ThemeActivity e;

    public v51(ThemeActivity themeActivity, Context context) {
        this.e = themeActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f;
        return i3 == 0 || i3 == 1 || i3 == 4 || i3 == 7 || i3 == 10 || i3 == 11 || i3 == 12 || i3 == 14 || i3 == 18 || i3 == 20 || i3 == 21;
    }

    @Override // u4.h0
    public final int b() {
        return this.e.K0;
    }

    @Override // u4.h0
    public final int d(int i3) {
        int i10;
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
        ThemeActivity themeActivity = this.e;
        if (i3 == themeActivity.b0 || i3 == themeActivity.L || i3 == themeActivity.c0 || i3 == themeActivity.Z || i3 == themeActivity.Q || i3 == themeActivity.R || i3 == themeActivity.N || i3 == themeActivity.M) {
            return 1;
        }
        if (i3 == themeActivity.g0 || i3 == themeActivity.a0 || i3 == themeActivity.w0 || i3 == themeActivity.B0 || i3 == themeActivity.H0) {
            return 2;
        }
        if (i3 == themeActivity.s0 || i3 == themeActivity.W || i3 == themeActivity.d0 || i3 == themeActivity.P || i3 == themeActivity.i0 || i3 == themeActivity.o0 || i3 == themeActivity.l0 || i3 == themeActivity.K || i3 == themeActivity.J0 || i3 == themeActivity.A0 || i3 == themeActivity.C0 || i3 == themeActivity.D0 || i3 == themeActivity.E0) {
            return 3;
        }
        if (i3 == themeActivity.S || i3 == themeActivity.T || i3 == themeActivity.U || i3 == themeActivity.V) {
            return 4;
        }
        if (i3 == themeActivity.X || i3 == themeActivity.e0 || i3 == themeActivity.h0 || i3 == themeActivity.y || i3 == themeActivity.j0 || i3 == themeActivity.x || i3 == themeActivity.m0 || i3 == themeActivity.k0 || i3 == themeActivity.u0 || i3 == themeActivity.x0 || i3 == themeActivity.I0 || i3 == themeActivity.F0 || i3 == themeActivity.G0) {
            return 5;
        }
        if (i3 == themeActivity.f0) {
            return 6;
        }
        if (i3 == themeActivity.Y || i3 == themeActivity.H || i3 == themeActivity.F) {
            return 7;
        }
        i10 = themeActivity.raiseToListenRow;
        if (i3 == i10) {
            return 7;
        }
        i11 = themeActivity.pauseOnRecordRow;
        if (i3 == i11 || i3 == themeActivity.E || i3 == themeActivity.t0) {
            return 7;
        }
        i12 = themeActivity.pauseOnMediaRow;
        if (i3 == i12 || i3 == themeActivity.G) {
            return 7;
        }
        i13 = themeActivity.sensitiveContentRow;
        if (i3 == i13) {
            return 7;
        }
        i14 = themeActivity.textSizeRow;
        if (i3 == i14) {
            return 8;
        }
        if (i3 == themeActivity.n0) {
            return 9;
        }
        i15 = themeActivity.nightThemeRow;
        if (i3 == i15) {
            return 10;
        }
        i16 = themeActivity.browserRow;
        if (i3 == i16) {
            return 10;
        }
        if (i3 == themeActivity.p0) {
            return 11;
        }
        if (i3 == themeActivity.r0) {
            return 12;
        }
        i17 = themeActivity.bubbleRadiusRow;
        if (i3 == i17) {
            return 13;
        }
        i18 = themeActivity.backgroundRow;
        if (i3 == i18 || i3 == themeActivity.z0) {
            return 14;
        }
        i19 = themeActivity.createNewThemeRow;
        if (i3 == i19) {
            return 14;
        }
        i20 = themeActivity.liteModeRow;
        if (i3 == i20) {
            return 14;
        }
        i21 = themeActivity.stickersRow;
        if (i3 == i21) {
            return 14;
        }
        if (i3 == themeActivity.v0) {
            return 15;
        }
        if (i3 == themeActivity.y0) {
            return 16;
        }
        if (i3 == themeActivity.q0) {
            return 17;
        }
        if (i3 == themeActivity.I || i3 == themeActivity.J) {
            return 19;
        }
        i22 = themeActivity.appIconSelectorRow;
        if (i3 == i22) {
            return 20;
        }
        i23 = themeActivity.changeUserColor;
        return i3 == i23 ? 21 : 1;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        int i10;
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
        int i22 = d1Var.f;
        View view = d1Var.a;
        ThemeActivity themeActivity = this.e;
        if (i22 == 1) {
            org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
            i10 = themeActivity.nightThemeRow;
            if (i3 == i10) {
                if (org.telegram.ui.ActionBar.k6.o == 0 || org.telegram.ui.ActionBar.k6.J == null) {
                    v9Var.c(org.telegram.messenger.bd.M0(2131753784, null), org.telegram.messenger.bd.M0(2131753783, null), false, false);
                    return;
                } else {
                    v9Var.c(org.telegram.messenger.bd.M0(2131753784, null), org.telegram.ui.ActionBar.k6.C0(), false, false);
                    return;
                }
            }
            if (i3 == themeActivity.b0) {
                int i23 = org.telegram.ui.ActionBar.k6.r;
                int i24 = i23 / 60;
                v9Var.c(org.telegram.messenger.bd.M0(2131753792, "AutoNightFrom"), String.format("%02d:%02d", Integer.valueOf(i24), Integer.valueOf(i23 - (i24 * 60))), false, true);
                return;
            }
            if (i3 == themeActivity.c0) {
                int i25 = org.telegram.ui.ActionBar.k6.s;
                int i26 = i25 / 60;
                v9Var.c(org.telegram.messenger.bd.M0(2131753782, "AutoNightTo"), String.format("%02d:%02d", Integer.valueOf(i26), Integer.valueOf(i25 - (i26 * 60))), false, false);
                return;
            }
            if (i3 == themeActivity.Z) {
                v9Var.c(org.telegram.messenger.bd.M0(2131753781, "AutoNightUpdateLocation"), org.telegram.ui.ActionBar.k6.w, false, false);
                return;
            }
            if (i3 == themeActivity.R) {
                int i27 = org.telegram.messenger.hp.e1().getInt("sortContactsBy", 0);
                v9Var.c(org.telegram.messenger.bd.M0(2131745301, "SortBy"), i27 == 0 ? org.telegram.messenger.bd.M0(2131751601, "Default") : i27 == 1 ? org.telegram.messenger.bd.M0(2131745297, "FirstName") : org.telegram.messenger.bd.M0(2131745296, "LastName"), false, true);
                return;
            }
            if (i3 == themeActivity.Q) {
                v9Var.b(org.telegram.messenger.bd.M0(2131749272, "ImportContacts"), true);
                return;
            }
            if (i3 == themeActivity.L) {
                int i28 = org.telegram.messenger.az.s1;
                v9Var.c(org.telegram.messenger.bd.M0(2131751368, "DistanceUnits"), i28 == 0 ? org.telegram.messenger.bd.M0(2131751367, "DistanceUnitsAutomatic") : i28 == 1 ? org.telegram.messenger.bd.M0(2131751366, "DistanceUnitsKilometers") : org.telegram.messenger.bd.M0(2131751365, "DistanceUnitsMiles"), themeActivity.P0, themeActivity.E0 >= 0);
                themeActivity.P0 = false;
                return;
            } else if (i3 == themeActivity.M) {
                v9Var.c(org.telegram.messenger.bd.M0(2131745809, null), org.telegram.ui.web.d1.a().a, themeActivity.Q0, false);
                return;
            } else {
                if (i3 == themeActivity.N) {
                    v9Var.c(org.telegram.messenger.bd.M0(2131748447, null), org.telegram.messenger.bd.M0(org.telegram.messenger.az.u0 ? 2131748445 : 2131748446, null), themeActivity.O0, false);
                    themeActivity.O0 = false;
                    return;
                }
                return;
            }
        }
        if (i22 == 2) {
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            y8Var.setFixedSize(0);
            if (i3 == themeActivity.g0) {
                y8Var.setText(org.telegram.messenger.bd.a0("AutoNightBrightnessInfo", null, 2131753794, Integer.valueOf((int) (org.telegram.ui.ActionBar.k6.q * 100.0f))));
                return;
            }
            if (i3 == themeActivity.a0) {
                y8Var.setText(ThemeActivity.D0());
                return;
            }
            if (i3 == themeActivity.w0) {
                y8Var.setText(org.telegram.messenger.bd.M0(2131752221, "ChatListSwipeGestureInfo"));
                return;
            } else if (i3 == themeActivity.H0) {
                y8Var.setText(org.telegram.messenger.bd.M0(2131748873, "LiteModeInfo"));
                return;
            } else {
                y8Var.setFixedSize(12);
                y8Var.setText("");
                return;
            }
        }
        if (i22 == 4) {
            org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) view;
            if (i3 == themeActivity.S) {
                aaVar.a(org.telegram.messenger.bd.M0(2131753793, "AutoNightDisabled"), org.telegram.ui.ActionBar.k6.o == 0, true);
                return;
            }
            if (i3 == themeActivity.T) {
                aaVar.a(org.telegram.messenger.bd.M0(2131753787, "AutoNightScheduled"), org.telegram.ui.ActionBar.k6.o == 1, true);
                return;
            } else if (i3 == themeActivity.U) {
                aaVar.a(org.telegram.messenger.bd.M0(2131753796, "AutoNightAdaptive"), org.telegram.ui.ActionBar.k6.o == 2, themeActivity.V != -1);
                return;
            } else {
                if (i3 == themeActivity.V) {
                    aaVar.a(org.telegram.messenger.bd.M0(2131753786, "AutoNightSystemDefault"), org.telegram.ui.ActionBar.k6.o == 3, false);
                    return;
                }
                return;
            }
        }
        if (i22 == 5) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
            if (i3 == themeActivity.X) {
                n4Var.setText(org.telegram.messenger.bd.M0(2131753788, "AutoNightSchedule"));
                return;
            }
            if (i3 == themeActivity.e0) {
                n4Var.setText(org.telegram.messenger.bd.M0(2131753795, "AutoNightBrightness"));
                return;
            }
            if (i3 == themeActivity.h0) {
                n4Var.setText(org.telegram.messenger.bd.M0(2131753789, "AutoNightPreferred"));
                return;
            }
            if (i3 == themeActivity.y) {
                n4Var.setText(org.telegram.messenger.bd.M0(2131745993, "SETTINGS"));
                return;
            }
            if (i3 == themeActivity.j0) {
                if (themeActivity.f == 3) {
                    n4Var.setText(org.telegram.messenger.bd.M0(2131752839, "BuildMyOwnTheme"));
                    return;
                } else {
                    n4Var.setText(org.telegram.messenger.bd.M0(2131752011, "ColorTheme"));
                    return;
                }
            }
            if (i3 == themeActivity.x) {
                n4Var.setText(org.telegram.messenger.bd.M0(2131744201, "TextSizeHeader"));
                return;
            }
            if (i3 == themeActivity.m0) {
                n4Var.setText(org.telegram.messenger.bd.M0(2131752225, "ChatList"));
                return;
            }
            if (i3 == themeActivity.k0) {
                n4Var.setText(org.telegram.messenger.bd.M0(2131752840, "BubbleRadius"));
                return;
            }
            if (i3 == themeActivity.u0) {
                n4Var.setText(org.telegram.messenger.bd.M0(2131752222, "ChatListSwipeGesture"));
                return;
            }
            if (i3 == themeActivity.x0) {
                n4Var.setText(org.telegram.messenger.bd.M0(2131745661, "SelectTheme"));
                return;
            }
            if (i3 == themeActivity.I0) {
                n4Var.setText(org.telegram.messenger.bd.M0(2131754240, null));
                return;
            } else if (i3 == themeActivity.G0) {
                n4Var.setText(org.telegram.messenger.bd.M0(2131747773, "OtherSettings"));
                return;
            } else {
                if (i3 == themeActivity.F0) {
                    n4Var.setText(org.telegram.messenger.bd.M0(2131748668, "MediaAndSoundSettings"));
                    return;
                }
                return;
            }
        }
        if (i22 == 6) {
            ((org.telegram.ui.Cells.i0) view).setProgress(org.telegram.ui.ActionBar.k6.q);
            return;
        }
        if (i22 == 7) {
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
            if (i3 == themeActivity.Y) {
                q8Var.f(org.telegram.messenger.bd.M0(2131753791, "AutoNightLocation"), org.telegram.ui.ActionBar.k6.p, true);
                return;
            }
            if (i3 == themeActivity.O) {
                q8Var.f(org.telegram.messenger.bd.M0(2131751158, "EnableAnimations"), org.telegram.messenger.hp.e1().getBoolean("view_animations", true), true);
                return;
            }
            if (i3 == themeActivity.H) {
                q8Var.f(org.telegram.messenger.bd.M0(2131745642, "SendByEnter"), org.telegram.messenger.hp.e1().getBoolean("send_by_enter", false), true);
                return;
            }
            if (i3 == themeActivity.F) {
                q8Var.g(org.telegram.messenger.bd.M0(2131746433, "RaiseToSpeak"), org.telegram.messenger.bd.M0(2131746432, "RaiseToSpeakInfo"), org.telegram.messenger.az.r0, true, true);
                return;
            }
            i11 = themeActivity.raiseToListenRow;
            if (i3 == i11) {
                q8Var.g(org.telegram.messenger.bd.M0(2131746435, "RaiseToListen"), org.telegram.messenger.bd.M0(2131746434, "RaiseToListenInfo"), org.telegram.messenger.az.s0, true, true);
                return;
            }
            if (i3 == themeActivity.G) {
                q8Var.g(org.telegram.messenger.bd.M0(2131748257, "NextMediaTap"), org.telegram.messenger.bd.M0(2131748256, "NextMediaTapInfo"), org.telegram.messenger.az.t0, true, true);
                return;
            }
            i12 = themeActivity.pauseOnRecordRow;
            if (i3 == i12) {
                q8Var.g(org.telegram.messenger.bd.M0(2131747439, null), org.telegram.messenger.bd.M0(2131747438, "PauseMusicOnRecordInfo"), org.telegram.messenger.az.F0, true, true);
                return;
            }
            i13 = themeActivity.pauseOnMediaRow;
            if (i3 == i13) {
                q8Var.f(org.telegram.messenger.bd.M0(2131747440, null), org.telegram.messenger.az.G0, true);
                return;
            }
            if (i3 == themeActivity.E) {
                q8Var.g(org.telegram.messenger.bd.M0(2131751439, "DirectShare"), org.telegram.messenger.bd.M0(2131751438, "DirectShareInfo"), org.telegram.messenger.az.x0, false, true);
                return;
            }
            i14 = themeActivity.sensitiveContentRow;
            if (i3 == i14) {
                q8Var.g(org.telegram.messenger.bd.M0(2131745340, null), org.telegram.messenger.bd.M0(2131745339, null), themeActivity.getMessagesController().S4(), true, true);
                return;
            } else {
                if (i3 == themeActivity.t0) {
                    q8Var.f(org.telegram.messenger.bd.M0(2131753675, "BlurInChat"), org.telegram.messenger.az.f(), true);
                    return;
                }
                return;
            }
        }
        if (i22 == 14) {
            org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
            l8Var.w = 48;
            i15 = themeActivity.backgroundRow;
            if (i3 == i15) {
                l8Var.setSubtitle(null);
                int i29 = org.telegram.ui.ActionBar.k6.q6;
                l8Var.g(i29, i29);
                String M0 = org.telegram.messenger.bd.M0(2131752550, null);
                i19 = themeActivity.changeUserColor;
                l8Var.o(R.drawable.msg_background, M0, i19 >= 0);
                return;
            }
            if (i3 == themeActivity.z0) {
                l8Var.setSubtitle(null);
                int i30 = org.telegram.ui.ActionBar.k6.q6;
                l8Var.g(i30, i30);
                l8Var.o(R.drawable.msg_theme, org.telegram.messenger.bd.M0(2131751282, null), true);
                return;
            }
            i16 = themeActivity.createNewThemeRow;
            if (i3 == i16) {
                l8Var.setSubtitle(null);
                int i31 = org.telegram.ui.ActionBar.k6.q6;
                l8Var.g(i31, i31);
                l8Var.o(R.drawable.msg_colors, org.telegram.messenger.bd.M0(2131751713, null), false);
                return;
            }
            i17 = themeActivity.liteModeRow;
            if (i3 == i17) {
                l8Var.g(org.telegram.ui.ActionBar.k6.J5, org.telegram.ui.ActionBar.k6.G6);
                l8Var.o(R.drawable.msg2_animations, org.telegram.messenger.bd.M0(2131748874, null), true);
                l8Var.setSubtitle(org.telegram.messenger.bd.M0(2131748873, null));
                l8Var.w = 60;
                l8Var.s = 64;
                l8Var.x = 20;
                return;
            }
            i18 = themeActivity.stickersRow;
            if (i3 == i18) {
                l8Var.g(org.telegram.ui.ActionBar.k6.J5, org.telegram.ui.ActionBar.k6.G6);
                l8Var.o(R.drawable.msg2_sticker, org.telegram.messenger.bd.M0(2131744867, null), false);
                l8Var.setSubtitle(org.telegram.messenger.bd.M0(2131744866, null));
                l8Var.s = 64;
                l8Var.w = 60;
                l8Var.x = 20;
                return;
            }
            return;
        }
        if (i22 == 17) {
            ((rt) view).a();
            return;
        }
        if (i22 == 19) {
            org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) view;
            if (i3 == themeActivity.I) {
                g6Var.b("save media only from peer chats", "", true, false);
                return;
            } else {
                g6Var.b("save media from all chats", "", true, false);
                return;
            }
        }
        if (i22 == 21) {
            ((il0) view).set(themeActivity.getUserConfig().f());
            return;
        }
        switch (i22) {
            case 10:
                org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view;
                i20 = themeActivity.nightThemeRow;
                if (i3 != i20) {
                    i21 = themeActivity.browserRow;
                    if (i3 == i21) {
                        h5Var.b(org.telegram.messenger.bd.M0(2131749217, null), org.telegram.messenger.bd.M0(2131749216, null), R.drawable.msg2_language, themeActivity.getMessagesController().M2(), 0, false, true, false);
                        break;
                    }
                } else {
                    boolean z10 = org.telegram.ui.ActionBar.k6.o != 0;
                    String C0 = z10 ? org.telegram.ui.ActionBar.k6.C0() : org.telegram.messenger.bd.M0(2131753783, "AutoNightThemeOff");
                    if (z10) {
                        int i32 = org.telegram.ui.ActionBar.k6.o;
                        C0 = a1.g.C(i32 == 1 ? org.telegram.messenger.bd.M0(2131753787, "AutoNightScheduled") : i32 == 3 ? org.telegram.messenger.bd.M0(2131753786, "AutoNightSystemDefault") : org.telegram.messenger.bd.M0(2131753796, "AutoNightAdaptive"), " ", C0);
                    }
                    h5Var.b(org.telegram.messenger.bd.M0(2131753784, "AutoNightTheme"), C0, R.drawable.menu_night_mode_24, z10, 0, false, true, false);
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
                org.telegram.ui.Components.tj0 tj0Var = (org.telegram.ui.Components.tj0) view;
                x51 x51Var = (x51) tj0Var.getAdapter();
                x51Var.f();
                int indexOf = x51Var.e.indexOf(x51Var.d.k(false));
                if (indexOf == -1) {
                    indexOf = x51Var.b() - 1;
                }
                if (indexOf != -1) {
                    ((u4.b0) tj0Var.getLayoutManager()).h1(indexOf, (themeActivity.b.getMeasuredWidth() / 2) - org.telegram.messenger.g0.L(42.0f));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout, org.telegram.ui.Cells.aa] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, java.lang.Object, org.telegram.ui.s51] */
    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        ?? aaVar;
        View view;
        int i10;
        org.telegram.ui.ActionBar.q4 q4Var;
        int i11;
        int i12;
        int i13 = 1;
        org.telegram.ui.ActionBar.e6 e6Var = null;
        int i14 = 0;
        ThemeActivity themeActivity = this.e;
        Context context = this.c;
        switch (i3) {
            case 1:
                view = new org.telegram.ui.Cells.v9(context);
                break;
            case 2:
                view = new org.telegram.ui.Cells.y8(context);
                break;
            case 3:
                view = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 4:
                aaVar = new org.telegram.ui.Cells.aa(context);
                aaVar.setWillNotDraw(false);
                TextView textView = new TextView(context);
                aaVar.a = textView;
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
                org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 16);
                boolean z10 = org.telegram.messenger.bd.a0;
                aaVar.addView(textView, b8.mf.d(-1, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 71.0f : 21.0f, 0.0f, z10 ? 21.0f : 23.0f, 0.0f));
                ImageView imageView = new ImageView(context);
                aaVar.b = imageView;
                org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.Ai, null, PorterDuff.Mode.MULTIPLY);
                imageView.setImageResource(R.drawable.sticker_added);
                aaVar.addView(imageView, b8.mf.d(19, 14.0f, (org.telegram.messenger.bd.a0 ? 3 : 5) | 16, 23.0f, 0.0f, 23.0f, 0.0f));
                view = aaVar;
                break;
            case 5:
                view = new org.telegram.ui.Cells.n4(context);
                break;
            case 6:
                view = new r51(this, context);
                break;
            case 7:
                view = new org.telegram.ui.Cells.q8(context);
                break;
            case 8:
                view = new w51(themeActivity, context);
                break;
            case 9:
                aaVar = new s51(context, 0);
                aaVar.b = new org.telegram.ui.Cells.v0[2];
                aaVar.setOrientation(0);
                aaVar.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(21.0f), 0);
                int i15 = 0;
                while (true) {
                    org.telegram.ui.Cells.v0[] v0VarArr = (org.telegram.ui.Cells.v0[]) aaVar.b;
                    if (i15 >= v0VarArr.length) {
                        view = aaVar;
                        break;
                    } else {
                        boolean z11 = i15 == 1;
                        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context, 0);
                        v0Var.b = new RectF();
                        TextPaint textPaint = new TextPaint(1);
                        v0Var.e = textPaint;
                        v0Var.setWillNotDraw(false);
                        v0Var.c = z11;
                        v0Var.setContentDescription(org.telegram.messenger.bd.M0(z11 ? 2131752223 : 2131752224, null));
                        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
                        org.telegram.ui.Cells.u0 u0Var = new org.telegram.ui.Cells.u0(v0Var, context);
                        v0Var.d = u0Var;
                        u0Var.setSize(org.telegram.messenger.g0.L(20.0f));
                        v0Var.addView(u0Var, b8.mf.d(22, 22.0f, 53, 0.0f, 26.0f, 10.0f, 0.0f));
                        u0Var.a((z11 && org.telegram.messenger.az.p1) || !(z11 || org.telegram.messenger.az.p1), false);
                        v0VarArr[i15] = v0Var;
                        aaVar.addView(((org.telegram.ui.Cells.v0[]) aaVar.b)[i15], b8.mf.m(0.5f, -1, -1, i15 == 1 ? 10 : 0, 0, 0));
                        ((org.telegram.ui.Cells.v0[]) aaVar.b)[i15].setOnClickListener(new ei.e2(r0, aaVar, z11));
                        i15++;
                    }
                }
                break;
            case 10:
                view = new org.telegram.ui.Cells.h5(this.c, 21, 60, true, null);
                break;
            case 11:
                this.d = true;
                t51 t51Var = new t51(this, this.c, themeActivity, themeActivity.f, themeActivity.e, themeActivity.d);
                themeActivity.c = t51Var;
                t51Var.setDrawDivider(themeActivity.w);
                themeActivity.c.setFocusable(false);
                View view2 = themeActivity.c;
                view2.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(148.0f)));
                view = view2;
                break;
            case 12:
                u51 u51Var = new u51(i14, context, e6Var);
                u51Var.setFocusable(false);
                u51Var.setItemAnimator(null);
                u51Var.setLayoutAnimation(null);
                u51Var.setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f), 0);
                u51Var.setClipToPadding(false);
                u4.b0 b0Var = new u4.b0();
                b0Var.j1(0);
                u51Var.setLayoutManager(b0Var);
                x51 x51Var = new x51(themeActivity, context);
                u51Var.setAdapter(x51Var);
                u51Var.setOnItemClickListener(new p51(this, x51Var, u51Var, i14));
                u51Var.setOnItemLongClickListener(new rb0(25, this, x51Var));
                u51Var.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(62.0f)));
                view = u51Var;
                break;
            case 13:
                view = new m51(themeActivity, context);
                break;
            case 14:
            case 18:
            default:
                view = new org.telegram.ui.Cells.l8(context);
                break;
            case 15:
                i10 = ((org.telegram.ui.ActionBar.d2) themeActivity).currentAccount;
                view = new org.telegram.ui.Components.uw0(context, i10);
                break;
            case 16:
                q4Var = ((org.telegram.ui.ActionBar.d2) themeActivity).parentLayout;
                View rl0Var = new rl0(context, q4Var, 0);
                rl0Var.setImportantForAccessibility(4);
                view = rl0Var;
                break;
            case 17:
                View rtVar = new rt(themeActivity.f, context, themeActivity);
                rtVar.setFocusable(false);
                rtVar.setLayoutParams(new u4.p0(-1, -2));
                view = rtVar;
                break;
            case 19:
                view = new org.telegram.ui.Cells.g6(context, false);
                break;
            case 20:
                i11 = ((org.telegram.ui.ActionBar.d2) themeActivity).currentAccount;
                org.telegram.ui.Cells.t tVar = new org.telegram.ui.Cells.t(context, null);
                tVar.f3 = new ArrayList();
                tVar.h3 = i11;
                tVar.setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
                tVar.setFocusable(false);
                tVar.setItemAnimator(null);
                tVar.setLayoutAnimation(null);
                u4.b0 b0Var2 = new u4.b0(0, false);
                tVar.g3 = b0Var2;
                tVar.setLayoutManager(b0Var2);
                tVar.setAdapter(new y7(tVar, i13));
                tVar.i(new gi.o1(tVar, i13));
                tVar.setOnItemClickListener(new ei.h0(tVar, themeActivity, context, r0));
                tVar.z1();
                view = tVar;
                break;
            case 21:
                i12 = ((org.telegram.ui.ActionBar.d2) themeActivity).currentAccount;
                view = new il0(i12, 0L, this.c, themeActivity.getResourceProvider());
                break;
        }
        return new org.telegram.ui.Components.bj0(view);
    }

    @Override // u4.h0
    public final void y(u4.d1 d1Var) {
        if (d1Var.f == 4) {
            ((org.telegram.ui.Cells.aa) d1Var.a).setTypeChecked(d1Var.b() == org.telegram.ui.ActionBar.k6.o);
        }
    }
}
