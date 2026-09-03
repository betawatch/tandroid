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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class tb1 extends org.telegram.ui.Components.ql0 {
    public final Context c;
    public boolean d = true;
    public final /* synthetic */ ThemeActivity e;

    public tb1(ThemeActivity themeActivity, Context context) {
        this.e = themeActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f;
        return i10 == 0 || i10 == 1 || i10 == 4 || i10 == 7 || i10 == 10 || i10 == 11 || i10 == 12 || i10 == 14 || i10 == 18 || i10 == 20 || i10 == 21;
    }

    @Override // f2.o0
    public final int h() {
        return this.e.G0;
    }

    @Override // f2.o0
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
        if (i10 == themeActivity.X || i10 == themeActivity.H || i10 == themeActivity.Y || i10 == themeActivity.V || i10 == themeActivity.M || i10 == themeActivity.N || i10 == themeActivity.J || i10 == themeActivity.I) {
            return 1;
        }
        if (i10 == themeActivity.c0 || i10 == themeActivity.W || i10 == themeActivity.s0 || i10 == themeActivity.x0 || i10 == themeActivity.D0) {
            return 2;
        }
        if (i10 == themeActivity.o0 || i10 == themeActivity.S || i10 == themeActivity.Z || i10 == themeActivity.L || i10 == themeActivity.e0 || i10 == themeActivity.k0 || i10 == themeActivity.h0 || i10 == themeActivity.G || i10 == themeActivity.F0 || i10 == themeActivity.w0 || i10 == themeActivity.y0 || i10 == themeActivity.z0 || i10 == themeActivity.A0) {
            return 3;
        }
        if (i10 == themeActivity.O || i10 == themeActivity.P || i10 == themeActivity.Q || i10 == themeActivity.R) {
            return 4;
        }
        if (i10 == themeActivity.T || i10 == themeActivity.a0 || i10 == themeActivity.d0 || i10 == themeActivity.x || i10 == themeActivity.f0 || i10 == themeActivity.w || i10 == themeActivity.i0 || i10 == themeActivity.g0 || i10 == themeActivity.q0 || i10 == themeActivity.t0 || i10 == themeActivity.E0 || i10 == themeActivity.B0 || i10 == themeActivity.C0) {
            return 5;
        }
        if (i10 == themeActivity.b0) {
            return 6;
        }
        if (i10 == themeActivity.U || i10 == themeActivity.D || i10 == themeActivity.B) {
            return 7;
        }
        i11 = themeActivity.raiseToListenRow;
        if (i10 == i11) {
            return 7;
        }
        i12 = themeActivity.pauseOnRecordRow;
        if (i10 == i12 || i10 == themeActivity.y || i10 == themeActivity.p0) {
            return 7;
        }
        i13 = themeActivity.pauseOnMediaRow;
        if (i10 == i13 || i10 == themeActivity.C) {
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
        if (i10 == themeActivity.j0) {
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
        if (i10 == themeActivity.l0) {
            return 11;
        }
        if (i10 == themeActivity.n0) {
            return 12;
        }
        i18 = themeActivity.bubbleRadiusRow;
        if (i10 == i18) {
            return 13;
        }
        i19 = themeActivity.backgroundRow;
        if (i10 == i19 || i10 == themeActivity.v0) {
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
        if (i10 == themeActivity.r0) {
            return 15;
        }
        if (i10 == themeActivity.u0) {
            return 16;
        }
        if (i10 == themeActivity.m0) {
            return 17;
        }
        if (i10 == themeActivity.E || i10 == themeActivity.F) {
            return 19;
        }
        i23 = themeActivity.appIconSelectorRow;
        if (i10 == i23) {
            return 20;
        }
        i24 = themeActivity.changeUserColor;
        return i10 == i24 ? 21 : 1;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
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
        int i23 = l1Var.f;
        View view = l1Var.a;
        ThemeActivity themeActivity = this.e;
        if (i23 == 1) {
            org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) view;
            i11 = themeActivity.nightThemeRow;
            if (i10 == i11) {
                if (org.telegram.ui.ActionBar.j6.o == 0 || org.telegram.ui.ActionBar.j6.J == null) {
                    z9Var.c(LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.AutoNightThemeOff), false, false);
                    return;
                } else {
                    z9Var.c(LocaleController.getString(R.string.AutoNightTheme), org.telegram.ui.ActionBar.j6.z0(), false, false);
                    return;
                }
            }
            if (i10 == themeActivity.X) {
                int i24 = org.telegram.ui.ActionBar.j6.r;
                int i25 = i24 / 60;
                z9Var.c(LocaleController.getString("AutoNightFrom", R.string.AutoNightFrom), String.format("%02d:%02d", Integer.valueOf(i25), Integer.valueOf(i24 - (i25 * 60))), false, true);
                return;
            }
            if (i10 == themeActivity.Y) {
                int i26 = org.telegram.ui.ActionBar.j6.s;
                int i27 = i26 / 60;
                z9Var.c(LocaleController.getString("AutoNightTo", R.string.AutoNightTo), String.format("%02d:%02d", Integer.valueOf(i27), Integer.valueOf(i26 - (i27 * 60))), false, false);
                return;
            }
            if (i10 == themeActivity.V) {
                z9Var.c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.j6.w, false, false);
                return;
            }
            if (i10 == themeActivity.N) {
                int i28 = MessagesController.getGlobalMainSettings().getInt("sortContactsBy", 0);
                z9Var.c(LocaleController.getString("SortBy", R.string.SortBy), i28 == 0 ? LocaleController.getString("Default", R.string.Default) : i28 == 1 ? LocaleController.getString("FirstName", R.string.SortFirstName) : LocaleController.getString("LastName", R.string.SortLastName), false, true);
                return;
            }
            if (i10 == themeActivity.M) {
                z9Var.b(LocaleController.getString("ImportContacts", R.string.ImportContacts), true);
                return;
            }
            if (i10 == themeActivity.H) {
                int i29 = SharedConfig.distanceSystemType;
                z9Var.c(LocaleController.getString("DistanceUnits", R.string.DistanceUnits), i29 == 0 ? LocaleController.getString("DistanceUnitsAutomatic", R.string.DistanceUnitsAutomatic) : i29 == 1 ? LocaleController.getString("DistanceUnitsKilometers", R.string.DistanceUnitsKilometers) : LocaleController.getString("DistanceUnitsMiles", R.string.DistanceUnitsMiles), themeActivity.L0, themeActivity.A0 >= 0);
                themeActivity.L0 = false;
                return;
            } else if (i10 == themeActivity.I) {
                z9Var.c(LocaleController.getString(R.string.SearchEngine), org.telegram.ui.web.n1.a().a, themeActivity.M0, false);
                return;
            } else {
                if (i10 == themeActivity.J) {
                    z9Var.c(LocaleController.getString(R.string.MicrophoneForVoiceMessages), LocaleController.getString(SharedConfig.recordViaSco ? R.string.MicrophoneForVoiceMessagesSco : R.string.MicrophoneForVoiceMessagesBuiltIn), themeActivity.K0, false);
                    themeActivity.K0 = false;
                    return;
                }
                return;
            }
        }
        if (i23 == 2) {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            z8Var.setFixedSize(0);
            if (i10 == themeActivity.c0) {
                z8Var.setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (org.telegram.ui.ActionBar.j6.q * 100.0f))));
                return;
            }
            if (i10 == themeActivity.W) {
                z8Var.setText(ThemeActivity.y0());
                return;
            }
            if (i10 == themeActivity.s0) {
                z8Var.setText(LocaleController.getString("ChatListSwipeGestureInfo", R.string.ChatListSwipeGestureInfo));
                return;
            } else if (i10 == themeActivity.D0) {
                z8Var.setText(LocaleController.getString("LiteModeInfo", R.string.LiteModeInfo));
                return;
            } else {
                z8Var.setFixedSize(12);
                z8Var.setText("");
                return;
            }
        }
        if (i23 == 4) {
            org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) view;
            if (i10 == themeActivity.O) {
                eaVar.a(LocaleController.getString("AutoNightDisabled", R.string.AutoNightDisabled), org.telegram.ui.ActionBar.j6.o == 0, true);
                return;
            }
            if (i10 == themeActivity.P) {
                eaVar.a(LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled), org.telegram.ui.ActionBar.j6.o == 1, true);
                return;
            } else if (i10 == themeActivity.Q) {
                eaVar.a(LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive), org.telegram.ui.ActionBar.j6.o == 2, themeActivity.R != -1);
                return;
            } else {
                if (i10 == themeActivity.R) {
                    eaVar.a(LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault), org.telegram.ui.ActionBar.j6.o == 3, false);
                    return;
                }
                return;
            }
        }
        if (i23 == 5) {
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            if (i10 == themeActivity.T) {
                l4Var.setText(LocaleController.getString("AutoNightSchedule", R.string.AutoNightSchedule));
                return;
            }
            if (i10 == themeActivity.a0) {
                l4Var.setText(LocaleController.getString("AutoNightBrightness", R.string.AutoNightBrightness));
                return;
            }
            if (i10 == themeActivity.d0) {
                l4Var.setText(LocaleController.getString("AutoNightPreferred", R.string.AutoNightPreferred));
                return;
            }
            if (i10 == themeActivity.x) {
                l4Var.setText(LocaleController.getString("SETTINGS", R.string.SETTINGS));
                return;
            }
            if (i10 == themeActivity.f0) {
                if (themeActivity.f == 3) {
                    l4Var.setText(LocaleController.getString("BuildMyOwnTheme", R.string.BuildMyOwnTheme));
                    return;
                } else {
                    l4Var.setText(LocaleController.getString("ColorTheme", R.string.ColorTheme));
                    return;
                }
            }
            if (i10 == themeActivity.w) {
                l4Var.setText(LocaleController.getString("TextSizeHeader", R.string.TextSizeHeader));
                return;
            }
            if (i10 == themeActivity.i0) {
                l4Var.setText(LocaleController.getString("ChatList", R.string.ChatList));
                return;
            }
            if (i10 == themeActivity.g0) {
                l4Var.setText(LocaleController.getString("BubbleRadius", R.string.BubbleRadius));
                return;
            }
            if (i10 == themeActivity.q0) {
                l4Var.setText(LocaleController.getString("ChatListSwipeGesture", R.string.ChatListSwipeGesture));
                return;
            }
            if (i10 == themeActivity.t0) {
                l4Var.setText(LocaleController.getString("SelectTheme", R.string.SelectTheme));
                return;
            }
            if (i10 == themeActivity.E0) {
                l4Var.setText(LocaleController.getString(R.string.AppIcon));
                return;
            } else if (i10 == themeActivity.C0) {
                l4Var.setText(LocaleController.getString("OtherSettings", R.string.OtherSettings));
                return;
            } else {
                if (i10 == themeActivity.B0) {
                    l4Var.setText(LocaleController.getString("MediaAndSoundSettings", R.string.MediaAndSoundSettings));
                    return;
                }
                return;
            }
        }
        if (i23 == 6) {
            ((org.telegram.ui.Cells.k0) view).setProgress(org.telegram.ui.ActionBar.j6.q);
            return;
        }
        if (i23 == 7) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            if (i10 == themeActivity.U) {
                r8Var.f(LocaleController.getString("AutoNightLocation", R.string.AutoNightLocation), org.telegram.ui.ActionBar.j6.p, true);
                return;
            }
            if (i10 == themeActivity.K) {
                r8Var.f(LocaleController.getString("EnableAnimations", R.string.EnableAnimations), MessagesController.getGlobalMainSettings().getBoolean("view_animations", true), true);
                return;
            }
            if (i10 == themeActivity.D) {
                r8Var.f(LocaleController.getString("SendByEnter", R.string.SendByEnter), MessagesController.getGlobalMainSettings().getBoolean("send_by_enter", false), true);
                return;
            }
            if (i10 == themeActivity.B) {
                r8Var.g(LocaleController.getString("RaiseToSpeak", R.string.RaiseToSpeak), LocaleController.getString("RaiseToSpeakInfo", R.string.RaiseToSpeakInfo), SharedConfig.raiseToSpeak, true, true);
                return;
            }
            i12 = themeActivity.raiseToListenRow;
            if (i10 == i12) {
                r8Var.g(LocaleController.getString("RaiseToListen", R.string.RaiseToListen), LocaleController.getString("RaiseToListenInfo", R.string.RaiseToListenInfo), SharedConfig.raiseToListen, true, true);
                return;
            }
            if (i10 == themeActivity.C) {
                r8Var.g(LocaleController.getString("NextMediaTap", R.string.NextMediaTap), LocaleController.getString("NextMediaTapInfo", R.string.NextMediaTapInfo), SharedConfig.nextMediaTap, true, true);
                return;
            }
            i13 = themeActivity.pauseOnRecordRow;
            if (i10 == i13) {
                r8Var.g(LocaleController.getString(R.string.PauseMusicOnRecord), LocaleController.getString("PauseMusicOnRecordInfo", R.string.PauseMusicOnRecordInfo), SharedConfig.pauseMusicOnRecord, true, true);
                return;
            }
            i14 = themeActivity.pauseOnMediaRow;
            if (i10 == i14) {
                r8Var.f(LocaleController.getString(R.string.PauseMusicOnMedia), SharedConfig.pauseMusicOnMedia, true);
                return;
            }
            if (i10 == themeActivity.y) {
                r8Var.g(LocaleController.getString("DirectShare", R.string.DirectShare), LocaleController.getString("DirectShareInfo", R.string.DirectShareInfo), SharedConfig.directShare, false, true);
                return;
            }
            i15 = themeActivity.sensitiveContentRow;
            if (i10 == i15) {
                r8Var.g(LocaleController.getString(R.string.ShowSensitiveContent), LocaleController.getString(R.string.ShowSensitiveContentInfo), themeActivity.getMessagesController().showSensitiveContent(), true, true);
                return;
            } else {
                if (i10 == themeActivity.p0) {
                    r8Var.f(LocaleController.getString("BlurInChat", R.string.BlurInChat), SharedConfig.chatBlurEnabled(), true);
                    return;
                }
                return;
            }
        }
        if (i23 == 14) {
            org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
            n8Var.v = 48;
            i16 = themeActivity.backgroundRow;
            if (i10 == i16) {
                n8Var.setSubtitle(null);
                int i30 = org.telegram.ui.ActionBar.j6.q6;
                n8Var.e(i30, i30);
                String string = LocaleController.getString(R.string.ChangeChatBackground);
                int i31 = R.drawable.msg_background;
                i20 = themeActivity.changeUserColor;
                n8Var.m(i31, string, i20 >= 0);
                return;
            }
            if (i10 == themeActivity.v0) {
                n8Var.setSubtitle(null);
                int i32 = org.telegram.ui.ActionBar.j6.q6;
                n8Var.e(i32, i32);
                n8Var.m(R.drawable.msg_theme, LocaleController.getString(R.string.EditCurrentTheme), true);
                return;
            }
            i17 = themeActivity.createNewThemeRow;
            if (i10 == i17) {
                n8Var.setSubtitle(null);
                int i33 = org.telegram.ui.ActionBar.j6.q6;
                n8Var.e(i33, i33);
                n8Var.m(R.drawable.msg_colors, LocaleController.getString(R.string.CreateNewTheme), false);
                return;
            }
            i18 = themeActivity.liteModeRow;
            if (i10 == i18) {
                n8Var.e(org.telegram.ui.ActionBar.j6.J5, org.telegram.ui.ActionBar.j6.G6);
                n8Var.m(R.drawable.msg2_animations, LocaleController.getString(R.string.LiteMode), true);
                n8Var.setSubtitle(LocaleController.getString(R.string.LiteModeInfo));
                n8Var.v = 60;
                n8Var.s = 64;
                n8Var.w = 20;
                return;
            }
            i19 = themeActivity.stickersRow;
            if (i10 == i19) {
                n8Var.e(org.telegram.ui.ActionBar.j6.J5, org.telegram.ui.ActionBar.j6.G6);
                n8Var.m(R.drawable.msg2_sticker, LocaleController.getString(R.string.StickersName), false);
                n8Var.setSubtitle(LocaleController.getString(R.string.StickersNameInfo2));
                n8Var.s = 64;
                n8Var.v = 60;
                n8Var.w = 20;
                return;
            }
            return;
        }
        if (i23 == 17) {
            ((ev) view).b();
            return;
        }
        if (i23 == 19) {
            org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
            if (i10 == themeActivity.E) {
                h6Var.b("save media only from peer chats", "", true, false);
                return;
            } else {
                h6Var.b("save media from all chats", "", true, false);
                return;
            }
        }
        if (i23 == 21) {
            ((so0) view).set(themeActivity.getUserConfig().getCurrentUser());
            return;
        }
        switch (i23) {
            case 10:
                org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) view;
                i21 = themeActivity.nightThemeRow;
                if (i10 != i21) {
                    i22 = themeActivity.browserRow;
                    if (i10 == i22) {
                        i5Var.b(LocaleController.getString(R.string.InappBrowser), LocaleController.getString(R.string.InappBrowserInfo), R.drawable.msg2_language, themeActivity.getMessagesController().isWebBrowserInAppEnabled(), 0, false, true, false);
                        break;
                    }
                } else {
                    boolean z4 = org.telegram.ui.ActionBar.j6.o != 0;
                    String z02 = z4 ? org.telegram.ui.ActionBar.j6.z0() : LocaleController.getString("AutoNightThemeOff", R.string.AutoNightThemeOff);
                    if (z4) {
                        int i34 = org.telegram.ui.ActionBar.j6.o;
                        z02 = android.support.v4.media.a.z(i34 == 1 ? LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled) : i34 == 3 ? LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault) : LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive), " ", z02);
                    }
                    i5Var.b(LocaleController.getString("AutoNightTheme", R.string.AutoNightTheme), z02, R.drawable.menu_night_mode_24, z4, 0, false, true, false);
                    break;
                }
                break;
            case 11:
                if (this.d) {
                    themeActivity.c.w1(themeActivity.b.getMeasuredWidth());
                    this.d = false;
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Components.rl0 rl0Var = (org.telegram.ui.Components.rl0) view;
                vb1 vb1Var = (vb1) rl0Var.getAdapter();
                vb1Var.l();
                int indexOf = vb1Var.e.indexOf(vb1Var.d.k(false));
                if (indexOf == -1) {
                    indexOf = vb1Var.h() - 1;
                }
                if (indexOf != -1) {
                    ((f2.i0) rl0Var.getLayoutManager()).h1(indexOf, (themeActivity.b.getMeasuredWidth() / 2) - AndroidUtilities.dp(42.0f));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout, org.telegram.ui.Cells.ea] */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, java.lang.Object, org.telegram.ui.pb1] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29, types: [org.telegram.ui.so0] */
    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        ?? eaVar;
        View i5Var;
        int i11;
        org.telegram.ui.ActionBar.e5 e5Var;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.f6 f6Var = null;
        ThemeActivity themeActivity = this.e;
        Context context = this.c;
        switch (i10) {
            case 1:
                i5Var = new org.telegram.ui.Cells.z9(context);
                break;
            case 2:
                i5Var = new org.telegram.ui.Cells.z8(context);
                break;
            case 3:
                i5Var = new org.telegram.ui.Cells.y6(context, (b) null);
                break;
            case 4:
                eaVar = new org.telegram.ui.Cells.ea(context);
                eaVar.setWillNotDraw(false);
                TextView textView = new TextView(context);
                eaVar.a = textView;
                b.q(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), 1, 16.0f, 1);
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                boolean z4 = LocaleController.isRTL;
                eaVar.addView(textView, k7.b6.d(-1, -1.0f, (z4 ? 5 : 3) | 48, z4 ? 71.0f : 21.0f, 0.0f, z4 ? 21.0f : 23.0f, 0.0f));
                ImageView imageView = new ImageView(context);
                eaVar.b = imageView;
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Mh, false), PorterDuff.Mode.MULTIPLY));
                imageView.setImageResource(R.drawable.sticker_added);
                eaVar.addView(imageView, k7.b6.d(19, 14.0f, (LocaleController.isRTL ? 3 : 5) | 16, 23.0f, 0.0f, 23.0f, 0.0f));
                i5Var = eaVar;
                break;
            case 5:
                i5Var = new org.telegram.ui.Cells.l4(context);
                break;
            case 6:
                i5Var = new ob1(this, context);
                break;
            case 7:
                i5Var = new org.telegram.ui.Cells.r8(context);
                break;
            case 8:
                i5Var = new ub1(themeActivity, context);
                break;
            case 9:
                eaVar = new pb1(context);
                eaVar.b = new org.telegram.ui.Cells.x0[2];
                eaVar.setOrientation(0);
                eaVar.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(21.0f), 0);
                int i14 = 0;
                while (true) {
                    org.telegram.ui.Cells.x0[] x0VarArr = (org.telegram.ui.Cells.x0[]) eaVar.b;
                    if (i14 >= x0VarArr.length) {
                        i5Var = eaVar;
                        break;
                    } else {
                        boolean z10 = i14 == 1;
                        org.telegram.ui.Cells.x0 x0Var = new org.telegram.ui.Cells.x0(context);
                        x0Var.c = new RectF();
                        TextPaint textPaint = new TextPaint(1);
                        x0Var.d = textPaint;
                        x0Var.setWillNotDraw(false);
                        x0Var.b = z10;
                        x0Var.setContentDescription(LocaleController.getString(z10 ? R.string.ChatListExpanded : R.string.ChatListDefault));
                        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
                        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(x0Var, context);
                        x0Var.a = w0Var;
                        w0Var.setSize(AndroidUtilities.dp(20.0f));
                        x0Var.addView(w0Var, k7.b6.d(22, 22.0f, 53, 0.0f, 26.0f, 10.0f, 0.0f));
                        w0Var.a((z10 && SharedConfig.useThreeLinesLayout) || !(z10 || SharedConfig.useThreeLinesLayout), false);
                        x0VarArr[i14] = x0Var;
                        eaVar.addView(((org.telegram.ui.Cells.x0[]) eaVar.b)[i14], k7.b6.m(0.5f, -1, -1, i14 == 1 ? 10 : 0, 0, 0));
                        ((org.telegram.ui.Cells.x0[]) eaVar.b)[i14].setOnClickListener(new nh.a2(3, eaVar, z10));
                        i14++;
                    }
                }
                break;
            case 10:
                i5Var = new org.telegram.ui.Cells.i5(21, 60, this.c, null, true);
                break;
            case 11:
                this.d = true;
                qb1 qb1Var = new qb1(this, this.c, themeActivity, themeActivity.f, themeActivity.e, themeActivity.d);
                themeActivity.c = qb1Var;
                qb1Var.setDrawDivider(themeActivity.v);
                themeActivity.c.setFocusable(false);
                View view = themeActivity.c;
                view.setLayoutParams(new f2.w0(-1, AndroidUtilities.dp(148.0f)));
                i5Var = view;
                break;
            case 12:
                rb1 rb1Var = new rb1(context, 0, f6Var);
                rb1Var.setFocusable(false);
                rb1Var.setItemAnimator(null);
                rb1Var.setLayoutAnimation(null);
                rb1Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
                rb1Var.setClipToPadding(false);
                f2.i0 i0Var = new f2.i0();
                i0Var.j1(0);
                rb1Var.setLayoutManager(i0Var);
                vb1 vb1Var = new vb1(themeActivity, context);
                rb1Var.setAdapter(vb1Var);
                rb1Var.setOnItemClickListener(new mb1(this, vb1Var, rb1Var, 0));
                rb1Var.setOnItemLongClickListener(new vl0(21, this, vb1Var));
                rb1Var.setLayoutParams(new f2.w0(-1, AndroidUtilities.dp(62.0f)));
                i5Var = rb1Var;
                break;
            case 13:
                i5Var = new jb1(themeActivity, context);
                break;
            case 14:
            case 18:
            default:
                i5Var = new org.telegram.ui.Cells.n8(context);
                break;
            case 15:
                i11 = ((org.telegram.ui.ActionBar.p2) themeActivity).currentAccount;
                org.telegram.ui.Components.wy0 wy0Var = new org.telegram.ui.Components.wy0(context);
                Paint paint = new Paint(1);
                wy0Var.a = paint;
                wy0Var.b = new Paint(1);
                Paint paint2 = new Paint(1);
                wy0Var.c = paint2;
                Paint paint3 = new Paint(1);
                wy0Var.d = paint3;
                wy0Var.e = new RectF();
                wy0Var.h = new String[]{LocaleController.getString(R.string.SwipeSettingsPin), LocaleController.getString(R.string.SwipeSettingsRead), LocaleController.getString(R.string.SwipeSettingsArchive), LocaleController.getString(R.string.SwipeSettingsMute), LocaleController.getString(R.string.SwipeSettingsDelete), LocaleController.getString(R.string.SwipeSettingsFolders)};
                wy0Var.n = new int[]{r14, r14, r14, r14, org.telegram.ui.ActionBar.j6.Y5, org.telegram.ui.ActionBar.j6.d9};
                wy0Var.r = new org.telegram.ui.Components.gj0[6];
                wy0Var.v = new org.telegram.ui.Components.jj0[2];
                wy0Var.x = 1.0f;
                int i15 = org.telegram.ui.ActionBar.j6.c9;
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
                org.telegram.ui.Components.vy0 vy0Var = new org.telegram.ui.Components.vy0(wy0Var, context);
                wy0Var.f = vy0Var;
                vy0Var.setMinValue(0);
                vy0Var.setDrawDividers(false);
                boolean isEmpty = MessagesController.getInstance(i11).dialogFilters.isEmpty();
                vy0Var.setMaxValue(isEmpty ? 4 : 5);
                vy0Var.setAllItemsCount(isEmpty ? 5 : 6);
                vy0Var.setWrapSelectorWheel(true);
                vy0Var.setFormatter(new org.telegram.ui.Components.uy0(wy0Var));
                vy0Var.setOnValueChangedListener(new org.telegram.ui.Components.uy0(wy0Var));
                vy0Var.setImportantForAccessibility(2);
                vy0Var.setValue(SharedConfig.getChatSwipeAction(i11));
                wy0Var.addView(vy0Var, k7.b6.d(132, -1.0f, 5, 21.0f, 0.0f, 21.0f, 0.0f));
                wy0Var.setWillNotDraw(false);
                wy0Var.s = 0;
                for (int i16 = 0; i16 < 2; i16++) {
                    wy0Var.v[i16] = new org.telegram.ui.Components.jj0(context);
                    wy0Var.addView(wy0Var.v[i16], k7.b6.d(28, 28.0f, 21, 0.0f, 0.0f, 184.0f, 0.0f));
                }
                org.telegram.ui.Components.gj0 a2 = wy0Var.a(wy0Var.f.getValue());
                if (a2 != null) {
                    wy0Var.v[0].setImageDrawable(a2);
                    a2.K(a2.e[0] - 1);
                }
                AndroidUtilities.updateViewVisibilityAnimated(wy0Var.v[0], true, 0.5f, false);
                AndroidUtilities.updateViewVisibilityAnimated(wy0Var.v[1], false, 0.5f, false);
                wy0Var.w = wy0Var.f.getValue() != 5 ? 0.0f : 1.0f;
                wy0Var.C = wy0Var.f.getValue();
                i5Var = wy0Var;
                break;
            case 16:
                e5Var = ((org.telegram.ui.ActionBar.p2) themeActivity).parentLayout;
                View sb1Var = new sb1(context, e5Var, 0);
                sb1Var.setImportantForAccessibility(4);
                i5Var = sb1Var;
                break;
            case 17:
                View evVar = new ev(themeActivity.f, context, themeActivity);
                evVar.setFocusable(false);
                evVar.setLayoutParams(new f2.w0(-1, -2));
                i5Var = evVar;
                break;
            case 19:
                i5Var = new org.telegram.ui.Cells.h6(context, false);
                break;
            case 20:
                i12 = ((org.telegram.ui.ActionBar.p2) themeActivity).currentAccount;
                org.telegram.ui.Cells.t tVar = new org.telegram.ui.Cells.t(context, null);
                tVar.U2 = new ArrayList();
                tVar.W2 = i12;
                tVar.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
                tVar.setFocusable(false);
                tVar.setItemAnimator(null);
                tVar.setLayoutAnimation(null);
                f2.i0 i0Var2 = new f2.i0(0, false);
                tVar.V2 = i0Var2;
                tVar.setLayoutManager(i0Var2);
                int i17 = 1;
                tVar.setAdapter(new a8(tVar, i17));
                tVar.i(new gg.e2(tVar, i17));
                tVar.setOnItemClickListener(new nh.e0(tVar, themeActivity, context, i17));
                tVar.v1();
                i5Var = tVar;
                break;
            case 21:
                i13 = ((org.telegram.ui.ActionBar.p2) themeActivity).currentAccount;
                eaVar = new so0(i13, 0L, this.c, themeActivity.getResourceProvider());
                i5Var = eaVar;
                break;
        }
        return new org.telegram.ui.Components.dl0(i5Var);
    }

    @Override // f2.o0
    public final void y(f2.l1 l1Var) {
        if (l1Var.f == 4) {
            ((org.telegram.ui.Cells.ea) l1Var.a).setTypeChecked(l1Var.b() == org.telegram.ui.ActionBar.j6.o);
        }
    }
}
