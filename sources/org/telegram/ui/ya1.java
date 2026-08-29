package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ya1 extends org.telegram.ui.Components.il0 {
    public final Context c;
    public boolean d = true;
    public final /* synthetic */ ThemeActivity e;

    public ya1(ThemeActivity themeActivity, Context context) {
        this.e = themeActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f;
        return i10 == 0 || i10 == 1 || i10 == 4 || i10 == 7 || i10 == 10 || i10 == 11 || i10 == 12 || i10 == 14 || i10 == 18 || i10 == 20 || i10 == 21;
    }

    @Override // f2.p0
    public final int h() {
        return this.e.F0;
    }

    @Override // f2.p0
    public final int j(int i10) {
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
        if (i10 == themeActivity.W || i10 == themeActivity.G || i10 == themeActivity.X || i10 == themeActivity.U || i10 == themeActivity.L || i10 == themeActivity.M || i10 == themeActivity.I || i10 == themeActivity.H) {
            return 1;
        }
        if (i10 == themeActivity.b0 || i10 == themeActivity.V || i10 == themeActivity.r0 || i10 == themeActivity.w0 || i10 == themeActivity.C0) {
            return 2;
        }
        if (i10 == themeActivity.n0 || i10 == themeActivity.R || i10 == themeActivity.Y || i10 == themeActivity.K || i10 == themeActivity.d0 || i10 == themeActivity.j0 || i10 == themeActivity.g0 || i10 == themeActivity.F || i10 == themeActivity.E0 || i10 == themeActivity.v0 || i10 == themeActivity.x0 || i10 == themeActivity.y0 || i10 == themeActivity.z0) {
            return 3;
        }
        if (i10 == themeActivity.N || i10 == themeActivity.O || i10 == themeActivity.P || i10 == themeActivity.Q) {
            return 4;
        }
        if (i10 == themeActivity.S || i10 == themeActivity.Z || i10 == themeActivity.c0 || i10 == themeActivity.x || i10 == themeActivity.e0 || i10 == themeActivity.w || i10 == themeActivity.h0 || i10 == themeActivity.f0 || i10 == themeActivity.p0 || i10 == themeActivity.s0 || i10 == themeActivity.D0 || i10 == themeActivity.A0 || i10 == themeActivity.B0) {
            return 5;
        }
        if (i10 == themeActivity.a0) {
            return 6;
        }
        if (i10 == themeActivity.T || i10 == themeActivity.C || i10 == themeActivity.A) {
            return 7;
        }
        i11 = themeActivity.raiseToListenRow;
        if (i10 == i11) {
            return 7;
        }
        i12 = themeActivity.pauseOnRecordRow;
        if (i10 == i12 || i10 == themeActivity.y || i10 == themeActivity.o0) {
            return 7;
        }
        i13 = themeActivity.pauseOnMediaRow;
        if (i10 == i13 || i10 == themeActivity.B) {
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
        if (i10 == themeActivity.i0) {
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
        if (i10 == themeActivity.k0) {
            return 11;
        }
        if (i10 == themeActivity.m0) {
            return 12;
        }
        i18 = themeActivity.bubbleRadiusRow;
        if (i10 == i18) {
            return 13;
        }
        i19 = themeActivity.backgroundRow;
        if (i10 == i19 || i10 == themeActivity.u0) {
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
        if (i10 == themeActivity.q0) {
            return 15;
        }
        if (i10 == themeActivity.t0) {
            return 16;
        }
        if (i10 == themeActivity.l0) {
            return 17;
        }
        if (i10 == themeActivity.D || i10 == themeActivity.E) {
            return 19;
        }
        i23 = themeActivity.appIconSelectorRow;
        if (i10 == i23) {
            return 20;
        }
        i24 = themeActivity.changeUserColor;
        return i10 == i24 ? 21 : 1;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
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
        int i23 = n1Var.f;
        View view = n1Var.a;
        ThemeActivity themeActivity = this.e;
        if (i23 == 1) {
            org.telegram.ui.Cells.y9 y9Var = (org.telegram.ui.Cells.y9) view;
            i11 = themeActivity.nightThemeRow;
            if (i10 == i11) {
                if (org.telegram.ui.ActionBar.g6.o == 0 || org.telegram.ui.ActionBar.g6.J == null) {
                    y9Var.c(LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.AutoNightThemeOff), false, false);
                    return;
                } else {
                    y9Var.c(LocaleController.getString(R.string.AutoNightTheme), org.telegram.ui.ActionBar.g6.z0(), false, false);
                    return;
                }
            }
            if (i10 == themeActivity.W) {
                int i24 = org.telegram.ui.ActionBar.g6.r;
                int i25 = i24 / 60;
                y9Var.c(LocaleController.getString("AutoNightFrom", R.string.AutoNightFrom), String.format("%02d:%02d", Integer.valueOf(i25), Integer.valueOf(i24 - (i25 * 60))), false, true);
                return;
            }
            if (i10 == themeActivity.X) {
                int i26 = org.telegram.ui.ActionBar.g6.s;
                int i27 = i26 / 60;
                y9Var.c(LocaleController.getString("AutoNightTo", R.string.AutoNightTo), String.format("%02d:%02d", Integer.valueOf(i27), Integer.valueOf(i26 - (i27 * 60))), false, false);
                return;
            }
            if (i10 == themeActivity.U) {
                y9Var.c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.g6.w, false, false);
                return;
            }
            if (i10 == themeActivity.M) {
                int i28 = MessagesController.getGlobalMainSettings().getInt("sortContactsBy", 0);
                y9Var.c(LocaleController.getString("SortBy", R.string.SortBy), i28 == 0 ? LocaleController.getString("Default", R.string.Default) : i28 == 1 ? LocaleController.getString("FirstName", R.string.SortFirstName) : LocaleController.getString("LastName", R.string.SortLastName), false, true);
                return;
            }
            if (i10 == themeActivity.L) {
                y9Var.b(LocaleController.getString("ImportContacts", R.string.ImportContacts), true);
                return;
            }
            if (i10 == themeActivity.G) {
                int i29 = SharedConfig.distanceSystemType;
                y9Var.c(LocaleController.getString("DistanceUnits", R.string.DistanceUnits), i29 == 0 ? LocaleController.getString("DistanceUnitsAutomatic", R.string.DistanceUnitsAutomatic) : i29 == 1 ? LocaleController.getString("DistanceUnitsKilometers", R.string.DistanceUnitsKilometers) : LocaleController.getString("DistanceUnitsMiles", R.string.DistanceUnitsMiles), themeActivity.K0, themeActivity.z0 >= 0);
                themeActivity.K0 = false;
                return;
            } else if (i10 == themeActivity.H) {
                y9Var.c(LocaleController.getString(R.string.SearchEngine), org.telegram.ui.web.k1.a().a, themeActivity.L0, false);
                return;
            } else {
                if (i10 == themeActivity.I) {
                    y9Var.c(LocaleController.getString(R.string.MicrophoneForVoiceMessages), LocaleController.getString(SharedConfig.recordViaSco ? R.string.MicrophoneForVoiceMessagesSco : R.string.MicrophoneForVoiceMessagesBuiltIn), themeActivity.J0, false);
                    themeActivity.J0 = false;
                    return;
                }
                return;
            }
        }
        if (i23 == 2) {
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            y8Var.setFixedSize(0);
            if (i10 == themeActivity.b0) {
                y8Var.setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (org.telegram.ui.ActionBar.g6.q * 100.0f))));
                return;
            }
            if (i10 == themeActivity.V) {
                y8Var.setText(ThemeActivity.y0());
                return;
            }
            if (i10 == themeActivity.r0) {
                y8Var.setText(LocaleController.getString("ChatListSwipeGestureInfo", R.string.ChatListSwipeGestureInfo));
                return;
            } else if (i10 == themeActivity.C0) {
                y8Var.setText(LocaleController.getString("LiteModeInfo", R.string.LiteModeInfo));
                return;
            } else {
                y8Var.setFixedSize(12);
                y8Var.setText("");
                return;
            }
        }
        if (i23 == 4) {
            org.telegram.ui.Cells.da daVar = (org.telegram.ui.Cells.da) view;
            if (i10 == themeActivity.N) {
                daVar.a(LocaleController.getString("AutoNightDisabled", R.string.AutoNightDisabled), org.telegram.ui.ActionBar.g6.o == 0, true);
                return;
            }
            if (i10 == themeActivity.O) {
                daVar.a(LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled), org.telegram.ui.ActionBar.g6.o == 1, true);
                return;
            } else if (i10 == themeActivity.P) {
                daVar.a(LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive), org.telegram.ui.ActionBar.g6.o == 2, themeActivity.Q != -1);
                return;
            } else {
                if (i10 == themeActivity.Q) {
                    daVar.a(LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault), org.telegram.ui.ActionBar.g6.o == 3, false);
                    return;
                }
                return;
            }
        }
        if (i23 == 5) {
            org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
            if (i10 == themeActivity.S) {
                k4Var.setText(LocaleController.getString("AutoNightSchedule", R.string.AutoNightSchedule));
                return;
            }
            if (i10 == themeActivity.Z) {
                k4Var.setText(LocaleController.getString("AutoNightBrightness", R.string.AutoNightBrightness));
                return;
            }
            if (i10 == themeActivity.c0) {
                k4Var.setText(LocaleController.getString("AutoNightPreferred", R.string.AutoNightPreferred));
                return;
            }
            if (i10 == themeActivity.x) {
                k4Var.setText(LocaleController.getString("SETTINGS", R.string.SETTINGS));
                return;
            }
            if (i10 == themeActivity.e0) {
                if (themeActivity.f == 3) {
                    k4Var.setText(LocaleController.getString("BuildMyOwnTheme", R.string.BuildMyOwnTheme));
                    return;
                } else {
                    k4Var.setText(LocaleController.getString("ColorTheme", R.string.ColorTheme));
                    return;
                }
            }
            if (i10 == themeActivity.w) {
                k4Var.setText(LocaleController.getString("TextSizeHeader", R.string.TextSizeHeader));
                return;
            }
            if (i10 == themeActivity.h0) {
                k4Var.setText(LocaleController.getString("ChatList", R.string.ChatList));
                return;
            }
            if (i10 == themeActivity.f0) {
                k4Var.setText(LocaleController.getString("BubbleRadius", R.string.BubbleRadius));
                return;
            }
            if (i10 == themeActivity.p0) {
                k4Var.setText(LocaleController.getString("ChatListSwipeGesture", R.string.ChatListSwipeGesture));
                return;
            }
            if (i10 == themeActivity.s0) {
                k4Var.setText(LocaleController.getString("SelectTheme", R.string.SelectTheme));
                return;
            }
            if (i10 == themeActivity.D0) {
                k4Var.setText(LocaleController.getString(R.string.AppIcon));
                return;
            } else if (i10 == themeActivity.B0) {
                k4Var.setText(LocaleController.getString("OtherSettings", R.string.OtherSettings));
                return;
            } else {
                if (i10 == themeActivity.A0) {
                    k4Var.setText(LocaleController.getString("MediaAndSoundSettings", R.string.MediaAndSoundSettings));
                    return;
                }
                return;
            }
        }
        if (i23 == 6) {
            ((org.telegram.ui.Cells.k0) view).setProgress(org.telegram.ui.ActionBar.g6.q);
            return;
        }
        if (i23 == 7) {
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
            if (i10 == themeActivity.T) {
                q8Var.f(LocaleController.getString("AutoNightLocation", R.string.AutoNightLocation), org.telegram.ui.ActionBar.g6.p, true);
                return;
            }
            if (i10 == themeActivity.J) {
                q8Var.f(LocaleController.getString("EnableAnimations", R.string.EnableAnimations), MessagesController.getGlobalMainSettings().getBoolean("view_animations", true), true);
                return;
            }
            if (i10 == themeActivity.C) {
                q8Var.f(LocaleController.getString("SendByEnter", R.string.SendByEnter), MessagesController.getGlobalMainSettings().getBoolean("send_by_enter", false), true);
                return;
            }
            if (i10 == themeActivity.A) {
                q8Var.g(LocaleController.getString("RaiseToSpeak", R.string.RaiseToSpeak), LocaleController.getString("RaiseToSpeakInfo", R.string.RaiseToSpeakInfo), SharedConfig.raiseToSpeak, true, true);
                return;
            }
            i12 = themeActivity.raiseToListenRow;
            if (i10 == i12) {
                q8Var.g(LocaleController.getString("RaiseToListen", R.string.RaiseToListen), LocaleController.getString("RaiseToListenInfo", R.string.RaiseToListenInfo), SharedConfig.raiseToListen, true, true);
                return;
            }
            if (i10 == themeActivity.B) {
                q8Var.g(LocaleController.getString("NextMediaTap", R.string.NextMediaTap), LocaleController.getString("NextMediaTapInfo", R.string.NextMediaTapInfo), SharedConfig.nextMediaTap, true, true);
                return;
            }
            i13 = themeActivity.pauseOnRecordRow;
            if (i10 == i13) {
                q8Var.g(LocaleController.getString(R.string.PauseMusicOnRecord), LocaleController.getString("PauseMusicOnRecordInfo", R.string.PauseMusicOnRecordInfo), SharedConfig.pauseMusicOnRecord, true, true);
                return;
            }
            i14 = themeActivity.pauseOnMediaRow;
            if (i10 == i14) {
                q8Var.f(LocaleController.getString(R.string.PauseMusicOnMedia), SharedConfig.pauseMusicOnMedia, true);
                return;
            }
            if (i10 == themeActivity.y) {
                q8Var.g(LocaleController.getString("DirectShare", R.string.DirectShare), LocaleController.getString("DirectShareInfo", R.string.DirectShareInfo), SharedConfig.directShare, false, true);
                return;
            }
            i15 = themeActivity.sensitiveContentRow;
            if (i10 == i15) {
                q8Var.g(LocaleController.getString(R.string.ShowSensitiveContent), LocaleController.getString(R.string.ShowSensitiveContentInfo), themeActivity.getMessagesController().showSensitiveContent(), true, true);
                return;
            } else {
                if (i10 == themeActivity.o0) {
                    q8Var.f(LocaleController.getString("BlurInChat", R.string.BlurInChat), SharedConfig.chatBlurEnabled(), true);
                    return;
                }
                return;
            }
        }
        if (i23 == 14) {
            org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
            m8Var.v = 48;
            i16 = themeActivity.backgroundRow;
            if (i10 == i16) {
                m8Var.setSubtitle(null);
                int i30 = org.telegram.ui.ActionBar.g6.q6;
                m8Var.e(i30, i30);
                String string = LocaleController.getString(R.string.ChangeChatBackground);
                int i31 = R.drawable.msg_background;
                i20 = themeActivity.changeUserColor;
                m8Var.m(i31, string, i20 >= 0);
                return;
            }
            if (i10 == themeActivity.u0) {
                m8Var.setSubtitle(null);
                int i32 = org.telegram.ui.ActionBar.g6.q6;
                m8Var.e(i32, i32);
                m8Var.m(R.drawable.msg_theme, LocaleController.getString(R.string.EditCurrentTheme), true);
                return;
            }
            i17 = themeActivity.createNewThemeRow;
            if (i10 == i17) {
                m8Var.setSubtitle(null);
                int i33 = org.telegram.ui.ActionBar.g6.q6;
                m8Var.e(i33, i33);
                m8Var.m(R.drawable.msg_colors, LocaleController.getString(R.string.CreateNewTheme), false);
                return;
            }
            i18 = themeActivity.liteModeRow;
            if (i10 == i18) {
                m8Var.e(org.telegram.ui.ActionBar.g6.J5, org.telegram.ui.ActionBar.g6.G6);
                m8Var.m(R.drawable.msg2_animations, LocaleController.getString(R.string.LiteMode), true);
                m8Var.setSubtitle(LocaleController.getString(R.string.LiteModeInfo));
                m8Var.v = 60;
                m8Var.s = 64;
                m8Var.w = 20;
                return;
            }
            i19 = themeActivity.stickersRow;
            if (i10 == i19) {
                m8Var.e(org.telegram.ui.ActionBar.g6.J5, org.telegram.ui.ActionBar.g6.G6);
                m8Var.m(R.drawable.msg2_sticker, LocaleController.getString(R.string.StickersName), false);
                m8Var.setSubtitle(LocaleController.getString(R.string.StickersNameInfo2));
                m8Var.s = 64;
                m8Var.v = 60;
                m8Var.w = 20;
                return;
            }
            return;
        }
        if (i23 == 17) {
            ((uu) view).b();
            return;
        }
        if (i23 == 19) {
            org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) view;
            if (i10 == themeActivity.D) {
                g6Var.b("save media only from peer chats", "", true, false);
                return;
            } else {
                g6Var.b("save media from all chats", "", true, false);
                return;
            }
        }
        if (i23 == 21) {
            ((go0) view).set(themeActivity.getUserConfig().getCurrentUser());
            return;
        }
        switch (i23) {
            case 10:
                org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view;
                i21 = themeActivity.nightThemeRow;
                if (i10 != i21) {
                    i22 = themeActivity.browserRow;
                    if (i10 == i22) {
                        h5Var.b(LocaleController.getString(R.string.InappBrowser), LocaleController.getString(R.string.InappBrowserInfo), R.drawable.msg2_language, themeActivity.getMessagesController().isWebBrowserInAppEnabled(), 0, false, true, false);
                        break;
                    }
                } else {
                    boolean z10 = org.telegram.ui.ActionBar.g6.o != 0;
                    String z02 = z10 ? org.telegram.ui.ActionBar.g6.z0() : LocaleController.getString("AutoNightThemeOff", R.string.AutoNightThemeOff);
                    if (z10) {
                        int i34 = org.telegram.ui.ActionBar.g6.o;
                        z02 = a4.w.y(i34 == 1 ? LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled) : i34 == 3 ? LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault) : LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive), " ", z02);
                    }
                    h5Var.b(LocaleController.getString("AutoNightTheme", R.string.AutoNightTheme), z02, R.drawable.menu_night_mode_24, z10, 0, false, true, false);
                    break;
                }
                break;
            case 11:
                if (this.d) {
                    themeActivity.c.x1(themeActivity.b.getMeasuredWidth());
                    this.d = false;
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Components.jl0 jl0Var = (org.telegram.ui.Components.jl0) view;
                ab1 ab1Var = (ab1) jl0Var.getAdapter();
                ab1Var.l();
                int indexOf = ab1Var.e.indexOf(ab1Var.d.k(false));
                if (indexOf == -1) {
                    indexOf = ab1Var.h() - 1;
                }
                if (indexOf != -1) {
                    ((f2.j0) jl0Var.getLayoutManager()).h1(indexOf, (themeActivity.b.getMeasuredWidth() / 2) - AndroidUtilities.dp(42.0f));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout, org.telegram.ui.Cells.da] */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, java.lang.Object, org.telegram.ui.ua1] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29, types: [org.telegram.ui.go0] */
    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        ?? daVar;
        View h5Var;
        int i11;
        org.telegram.ui.ActionBar.b5 b5Var;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.c6 c6Var = null;
        ThemeActivity themeActivity = this.e;
        Context context = this.c;
        switch (i10) {
            case 1:
                h5Var = new org.telegram.ui.Cells.y9(context);
                break;
            case 2:
                h5Var = new org.telegram.ui.Cells.y8(context);
                break;
            case 3:
                h5Var = new org.telegram.ui.Cells.x6(context, (b) null);
                break;
            case 4:
                daVar = new org.telegram.ui.Cells.da(context);
                daVar.setWillNotDraw(false);
                TextView textView = new TextView(context);
                daVar.a = textView;
                b.r(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false), 1, 16.0f, 1);
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                boolean z10 = LocaleController.isRTL;
                daVar.addView(textView, i7.f6.d(-1, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 71.0f : 21.0f, 0.0f, z10 ? 21.0f : 23.0f, 0.0f));
                ImageView imageView = new ImageView(context);
                daVar.b = imageView;
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Mh, false), PorterDuff.Mode.MULTIPLY));
                imageView.setImageResource(R.drawable.sticker_added);
                daVar.addView(imageView, i7.f6.d(19, 14.0f, (LocaleController.isRTL ? 3 : 5) | 16, 23.0f, 0.0f, 23.0f, 0.0f));
                h5Var = daVar;
                break;
            case 5:
                h5Var = new org.telegram.ui.Cells.k4(context);
                break;
            case 6:
                h5Var = new ta1(this, context);
                break;
            case 7:
                h5Var = new org.telegram.ui.Cells.q8(context);
                break;
            case 8:
                h5Var = new za1(themeActivity, context);
                break;
            case 9:
                daVar = new ua1(context);
                daVar.b = new org.telegram.ui.Cells.x0[2];
                daVar.setOrientation(0);
                daVar.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(21.0f), 0);
                int i14 = 0;
                while (true) {
                    org.telegram.ui.Cells.x0[] x0VarArr = (org.telegram.ui.Cells.x0[]) daVar.b;
                    if (i14 >= x0VarArr.length) {
                        h5Var = daVar;
                        break;
                    } else {
                        boolean z11 = i14 == 1;
                        org.telegram.ui.Cells.x0 x0Var = new org.telegram.ui.Cells.x0(context);
                        x0Var.c = new RectF();
                        TextPaint textPaint = new TextPaint(1);
                        x0Var.d = textPaint;
                        x0Var.setWillNotDraw(false);
                        x0Var.b = z11;
                        x0Var.setContentDescription(LocaleController.getString(z11 ? R.string.ChatListExpanded : R.string.ChatListDefault));
                        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
                        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(x0Var, context);
                        x0Var.a = w0Var;
                        w0Var.setSize(AndroidUtilities.dp(20.0f));
                        x0Var.addView(w0Var, i7.f6.d(22, 22.0f, 53, 0.0f, 26.0f, 10.0f, 0.0f));
                        w0Var.a((z11 && SharedConfig.useThreeLinesLayout) || !(z11 || SharedConfig.useThreeLinesLayout), false);
                        x0VarArr[i14] = x0Var;
                        daVar.addView(((org.telegram.ui.Cells.x0[]) daVar.b)[i14], i7.f6.m(0.5f, -1, -1, i14 == 1 ? 10 : 0, 0, 0));
                        ((org.telegram.ui.Cells.x0[]) daVar.b)[i14].setOnClickListener(new lh.z1(3, daVar, z11));
                        i14++;
                    }
                }
                break;
            case 10:
                h5Var = new org.telegram.ui.Cells.h5(21, 60, this.c, null, true);
                break;
            case 11:
                this.d = true;
                va1 va1Var = new va1(this, this.c, themeActivity, themeActivity.f, themeActivity.e, themeActivity.d);
                themeActivity.c = va1Var;
                va1Var.setDrawDivider(themeActivity.v);
                themeActivity.c.setFocusable(false);
                View view = themeActivity.c;
                view.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(148.0f)));
                h5Var = view;
                break;
            case 12:
                wa1 wa1Var = new wa1(context, 0, c6Var);
                wa1Var.setFocusable(false);
                wa1Var.setItemAnimator(null);
                wa1Var.setLayoutAnimation(null);
                wa1Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
                wa1Var.setClipToPadding(false);
                f2.j0 j0Var = new f2.j0();
                j0Var.j1(0);
                wa1Var.setLayoutManager(j0Var);
                ab1 ab1Var = new ab1(themeActivity, context);
                wa1Var.setAdapter(ab1Var);
                wa1Var.setOnItemClickListener(new ra1(this, ab1Var, wa1Var, 0));
                wa1Var.setOnItemLongClickListener(new kl0(22, this, ab1Var));
                wa1Var.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(62.0f)));
                h5Var = wa1Var;
                break;
            case 13:
                h5Var = new oa1(themeActivity, context);
                break;
            case 14:
            case 18:
            default:
                h5Var = new org.telegram.ui.Cells.m8(context);
                break;
            case 15:
                i11 = ((org.telegram.ui.ActionBar.o2) themeActivity).currentAccount;
                org.telegram.ui.Components.ly0 ly0Var = new org.telegram.ui.Components.ly0(context);
                Paint paint = new Paint(1);
                ly0Var.a = paint;
                ly0Var.b = new Paint(1);
                Paint paint2 = new Paint(1);
                ly0Var.c = paint2;
                Paint paint3 = new Paint(1);
                ly0Var.d = paint3;
                ly0Var.e = new RectF();
                ly0Var.h = new String[]{LocaleController.getString(R.string.SwipeSettingsPin), LocaleController.getString(R.string.SwipeSettingsRead), LocaleController.getString(R.string.SwipeSettingsArchive), LocaleController.getString(R.string.SwipeSettingsMute), LocaleController.getString(R.string.SwipeSettingsDelete), LocaleController.getString(R.string.SwipeSettingsFolders)};
                ly0Var.n = new int[]{r14, r14, r14, r14, org.telegram.ui.ActionBar.g6.Y5, org.telegram.ui.ActionBar.g6.d9};
                ly0Var.r = new org.telegram.ui.Components.xi0[6];
                ly0Var.v = new org.telegram.ui.Components.aj0[2];
                ly0Var.x = 1.0f;
                int i15 = org.telegram.ui.ActionBar.g6.c9;
                Paint.Style style = Paint.Style.STROKE;
                paint.setStyle(style);
                paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                paint2.setStyle(style);
                Paint.Cap cap = Paint.Cap.ROUND;
                paint2.setStrokeCap(cap);
                paint2.setStrokeWidth(AndroidUtilities.dp(5.0f));
                paint3.setStyle(style);
                paint3.setStrokeCap(cap);
                paint3.setStrokeWidth(AndroidUtilities.dp(2.0f));
                org.telegram.ui.Components.ky0 ky0Var = new org.telegram.ui.Components.ky0(ly0Var, context);
                ly0Var.f = ky0Var;
                ky0Var.setMinValue(0);
                ky0Var.setDrawDividers(false);
                boolean isEmpty = MessagesController.getInstance(i11).dialogFilters.isEmpty();
                ky0Var.setMaxValue(isEmpty ? 4 : 5);
                ky0Var.setAllItemsCount(isEmpty ? 5 : 6);
                ky0Var.setWrapSelectorWheel(true);
                ky0Var.setFormatter(new org.telegram.ui.Components.jy0(ly0Var));
                ky0Var.setOnValueChangedListener(new org.telegram.ui.Components.jy0(ly0Var));
                ky0Var.setImportantForAccessibility(2);
                ky0Var.setValue(SharedConfig.getChatSwipeAction(i11));
                ly0Var.addView(ky0Var, i7.f6.d(132, -1.0f, 5, 21.0f, 0.0f, 21.0f, 0.0f));
                ly0Var.setWillNotDraw(false);
                ly0Var.s = 0;
                for (int i16 = 0; i16 < 2; i16++) {
                    ly0Var.v[i16] = new org.telegram.ui.Components.aj0(context);
                    ly0Var.addView(ly0Var.v[i16], i7.f6.d(28, 28.0f, 21, 0.0f, 0.0f, 184.0f, 0.0f));
                }
                org.telegram.ui.Components.xi0 a2 = ly0Var.a(ly0Var.f.getValue());
                if (a2 != null) {
                    ly0Var.v[0].setImageDrawable(a2);
                    a2.K(a2.e[0] - 1);
                }
                AndroidUtilities.updateViewVisibilityAnimated(ly0Var.v[0], true, 0.5f, false);
                AndroidUtilities.updateViewVisibilityAnimated(ly0Var.v[1], false, 0.5f, false);
                ly0Var.w = ly0Var.f.getValue() != 5 ? 0.0f : 1.0f;
                ly0Var.B = ly0Var.f.getValue();
                h5Var = ly0Var;
                break;
            case 16:
                b5Var = ((org.telegram.ui.ActionBar.o2) themeActivity).parentLayout;
                View xa1Var = new xa1(context, b5Var, 0);
                xa1Var.setImportantForAccessibility(4);
                h5Var = xa1Var;
                break;
            case 17:
                View uuVar = new uu(themeActivity.f, context, themeActivity);
                uuVar.setFocusable(false);
                uuVar.setLayoutParams(new f2.x0(-1, -2));
                h5Var = uuVar;
                break;
            case 19:
                h5Var = new org.telegram.ui.Cells.g6(context, false);
                break;
            case 20:
                i12 = ((org.telegram.ui.ActionBar.o2) themeActivity).currentAccount;
                org.telegram.ui.Cells.t tVar = new org.telegram.ui.Cells.t(context, null);
                tVar.T2 = new ArrayList();
                tVar.V2 = i12;
                tVar.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
                tVar.setFocusable(false);
                tVar.setItemAnimator(null);
                tVar.setLayoutAnimation(null);
                f2.j0 j0Var2 = new f2.j0(0, false);
                tVar.U2 = j0Var2;
                tVar.setLayoutManager(j0Var2);
                tVar.setAdapter(new u7(tVar, 1));
                tVar.i(new eg.f2(tVar, 2));
                tVar.setOnItemClickListener(new lh.d0(tVar, themeActivity, context, 3));
                tVar.w1();
                h5Var = tVar;
                break;
            case 21:
                i13 = ((org.telegram.ui.ActionBar.o2) themeActivity).currentAccount;
                daVar = new go0(i13, 0L, this.c, themeActivity.getResourceProvider());
                h5Var = daVar;
                break;
        }
        return new org.telegram.ui.Components.vk0(h5Var);
    }

    @Override // f2.p0
    public final void y(f2.n1 n1Var) {
        if (n1Var.f == 4) {
            ((org.telegram.ui.Cells.da) n1Var.a).setTypeChecked(n1Var.b() == org.telegram.ui.ActionBar.g6.o);
        }
    }
}
