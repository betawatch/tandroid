package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class y70 extends org.telegram.ui.Components.vk0 {
    public final Context c;
    public final boolean d;
    public final /* synthetic */ LanguageSelectActivity e;

    public y70(LanguageSelectActivity languageSelectActivity, Context context, boolean z10) {
        this.e = languageSelectActivity;
        this.c = context;
        this.d = z10;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f;
        return i9 == 0 || i9 == 4 || i9 == 5 || i9 == 2;
    }

    @Override // f2.r0
    public final int h() {
        int i9;
        boolean z10 = this.d;
        LanguageSelectActivity languageSelectActivity = this.e;
        if (z10) {
            ArrayList arrayList = languageSelectActivity.e;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }
        if (languageSelectActivity.getMessagesController().isTranslationsManualEnabled() || languageSelectActivity.getMessagesController().isTranslationsAutoEnabled()) {
            int i10 = languageSelectActivity.getMessagesController().isTranslationsManualEnabled() ? 3 : 2;
            if (languageSelectActivity.getMessagesController().isTranslationsAutoEnabled() && !languageSelectActivity.getMessagesController().premiumFeaturesBlocked()) {
                i10++;
            }
            if (languageSelectActivity.f0() || languageSelectActivity.g0()) {
                i10++;
            }
            i9 = i10 + 1;
        } else {
            i9 = 1;
        }
        int size = languageSelectActivity.f.size() + i9 + 1;
        return !languageSelectActivity.h.isEmpty() ? languageSelectActivity.h.size() + 1 + size : size;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a1, code lost:
    
        if (r2 != ((r0.f.size() + r0.h.size()) + 1)) goto L55;
     */
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int j(int i9) {
        int i10;
        if (this.d) {
            return 0;
        }
        LanguageSelectActivity languageSelectActivity = this.e;
        if (languageSelectActivity.getMessagesController().isTranslationsManualEnabled() || languageSelectActivity.getMessagesController().isTranslationsAutoEnabled()) {
            int i11 = i9 - 1;
            if (i9 == 0) {
                return 3;
            }
            if (languageSelectActivity.getMessagesController().isTranslationsManualEnabled()) {
                int i12 = i9 - 2;
                if (i11 == 0) {
                    languageSelectActivity.manualTranslationPosition = i9;
                    return 2;
                }
                i11 = i12;
            } else {
                languageSelectActivity.manualTranslationPosition = -1;
            }
            if (!languageSelectActivity.getMessagesController().isTranslationsAutoEnabled() || languageSelectActivity.getMessagesController().premiumFeaturesBlocked()) {
                languageSelectActivity.autoTranslationPosition = -1;
            } else {
                int i13 = i11 - 1;
                if (i11 == 0) {
                    languageSelectActivity.autoTranslationPosition = i9;
                    return 2;
                }
                i11 = i13;
            }
            if (languageSelectActivity.f0() || languageSelectActivity.g0()) {
                languageSelectActivity.doNotTranslatePosition = i9;
                int i14 = i11 - 1;
                if (i11 == 0) {
                    return 4;
                }
                i11 = i14;
            }
            i10 = i11 - 1;
            if (i11 == 0) {
                languageSelectActivity.n = i9;
                return 6;
            }
        } else {
            i10 = i9;
        }
        int i15 = i10 - 1;
        if (i10 == 0) {
            return 3;
        }
        if (!languageSelectActivity.h.isEmpty()) {
            if (i15 != languageSelectActivity.h.size()) {
            }
            return 1;
        }
        if (!languageSelectActivity.h.isEmpty() || i15 != languageSelectActivity.f.size()) {
            languageSelectActivity.r = i9 - i15;
            return 0;
        }
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x0294, code lost:
    
        if (r2 == (r11.e.size() - 1)) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0296, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0298, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02bc, code lost:
    
        if (r2 == (r11.h.size() - 1)) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02e7, code lost:
    
        if (r2 == (r11.f.size() - 1)) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0107, code lost:
    
        if (r1.getValueTextView().getPaint().measureText(r4) > java.lang.Math.min((org.telegram.messenger.AndroidUtilities.displaySize.x - org.telegram.messenger.AndroidUtilities.dp(34.0f)) / 2.0f, (org.telegram.messenger.AndroidUtilities.displaySize.x - org.telegram.messenger.AndroidUtilities.dp(84.0f)) - r1.getTextView().getPaint().measureText(r3))) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0110  */
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.q1 q1Var, int i9) {
        boolean z10;
        int i10;
        int i11;
        String sb2;
        int i12 = i9;
        int i13 = q1Var.f;
        View view = q1Var.a;
        boolean z11 = this.d;
        LocaleController.LocaleInfo localeInfo = null;
        r8 = null;
        CharSequence charSequence = null;
        localeInfo = null;
        localeInfo = null;
        localeInfo = null;
        boolean z12 = true;
        LanguageSelectActivity languageSelectActivity = this.e;
        switch (i13) {
            case 0:
                if (!z11) {
                    i12 -= languageSelectActivity.r;
                }
                org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
                d9Var.c();
                if (!z11) {
                    if (!languageSelectActivity.h.isEmpty() && i12 >= 0 && i12 < languageSelectActivity.h.size()) {
                        localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.h.get(i12);
                        break;
                    } else {
                        if (!languageSelectActivity.h.isEmpty()) {
                            i12 = j3.r0.g(1, i12, languageSelectActivity.h);
                        }
                        if (i12 >= 0 && i12 < languageSelectActivity.f.size()) {
                            localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.f.get(i12);
                        }
                        break;
                    }
                } else {
                    if (i12 >= 0 && i12 < languageSelectActivity.e.size()) {
                        localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.e.get(i12);
                    }
                    break;
                }
                if (localeInfo != null) {
                    if (localeInfo.isLocal()) {
                        d9Var.b(String.format("%1$s (%2$s)", localeInfo.name, LocaleController.getString(R.string.LanguageCustom)), localeInfo.nameEnglish, !z10);
                    } else {
                        d9Var.b(localeInfo.name, localeInfo.nameEnglish, !z10);
                    }
                }
                d9Var.setChecked(localeInfo == LocaleController.getInstance().getCurrentLocaleInfo());
                break;
            case 1:
                if (!z11) {
                    i12--;
                }
                org.telegram.ui.Cells.z6 z6Var = (org.telegram.ui.Cells.z6) view;
                boolean isEmpty = languageSelectActivity.h.isEmpty();
                Context context = this.c;
                if (!isEmpty && i12 == languageSelectActivity.h.size()) {
                    z6Var.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.f6.b7));
                    break;
                } else {
                    z6Var.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.b7));
                    break;
                }
            case 2:
                org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                View view2 = t8Var.e;
                TextView textView = t8Var.d;
                TextView textView2 = t8Var.c;
                boolean z13 = t8Var.D;
                boolean z14 = LocaleController.isRTL;
                if (z13 != z14) {
                    t8Var.D = z14;
                    textView2.setGravity((z14 ? 5 : 3) | 16);
                    t8Var.removeView(textView2);
                    boolean z15 = LocaleController.isRTL;
                    t8Var.addView(textView2, g7.e6.d(-1, -1.0f, (z15 ? 5 : 3) | 48, z15 ? 70.0f : t8Var.A, 0.0f, z15 ? t8Var.A : 70.0f, 0.0f));
                    textView.setGravity(LocaleController.isRTL ? 5 : 3);
                    t8Var.removeView(textView);
                    boolean z16 = LocaleController.isRTL;
                    t8Var.addView(textView, g7.e6.d(-2, -2.0f, (z16 ? 5 : 3) | 48, z16 ? 64.0f : t8Var.A, 36.0f, z16 ? t8Var.A : 64.0f, 0.0f));
                    t8Var.removeView(view2);
                    t8Var.addView(view2, g7.e6.d(37, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                }
                i10 = languageSelectActivity.manualTranslationPosition;
                if (i12 != i10) {
                    i11 = languageSelectActivity.autoTranslationPosition;
                    if (i12 == i11) {
                        CharSequence string = LocaleController.getString(R.string.ShowTranslateChatButton);
                        boolean f02 = languageSelectActivity.f0();
                        if (!languageSelectActivity.g0() && !languageSelectActivity.f0()) {
                            z12 = false;
                        }
                        t8Var.f(string, f02, z12);
                        t8Var.setCheckBoxIcon(languageSelectActivity.getUserConfig().isPremium() ? 0 : R.drawable.permission_locked);
                        break;
                    }
                } else {
                    t8Var.f(LocaleController.getString(R.string.ShowTranslateButton), languageSelectActivity.g0(), true);
                    t8Var.setCheckBoxIcon(0);
                    break;
                }
                break;
            case 3:
                ((org.telegram.ui.Cells.m4) view).setText(LocaleController.getString((i12 == 0 && (languageSelectActivity.getMessagesController().isTranslationsManualEnabled() || languageSelectActivity.getMessagesController().isTranslationsAutoEnabled())) ? R.string.TranslateMessages : R.string.Language));
                break;
            case 4:
                org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
                baVar.d();
                HashSet X = b31.X();
                String string2 = LocaleController.getString(R.string.DoNotTranslate);
                try {
                    boolean[] zArr = new boolean[1];
                    if (X.size() != 0) {
                        if (X.size() != 1) {
                            Iterator it = X.iterator();
                            StringBuilder sb3 = new StringBuilder();
                            boolean z17 = true;
                            while (it.hasNext()) {
                                String str = (String) it.next();
                                if (!z17) {
                                    sb3.append(", ");
                                }
                                String y10 = org.telegram.ui.Components.z21.y(org.telegram.ui.Components.z21.D(str, zArr, null));
                                if (y10 != null) {
                                    sb3.append(y10);
                                    z17 = false;
                                }
                            }
                            sb2 = sb3.toString();
                            try {
                                break;
                            } catch (Exception unused) {
                                break;
                            }
                        } else {
                            charSequence = org.telegram.ui.Components.z21.y(org.telegram.ui.Components.z21.D((String) X.iterator().next(), zArr, null));
                        }
                    } else {
                        charSequence = "";
                    }
                } catch (Exception unused2) {
                }
                if (charSequence == null) {
                    charSequence = String.format(LocaleController.getPluralString("Languages", X.size()), Integer.valueOf(X.size()));
                }
                baVar.c(string2, charSequence, true, false);
                break;
            case 5:
                ((org.telegram.ui.Cells.ba) view).d();
                break;
            case 6:
                org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                org.telegram.ui.Cells.x1 x1Var = b9Var.a;
                boolean z18 = b9Var.n;
                boolean z19 = LocaleController.isRTL;
                if (z18 != z19) {
                    b9Var.n = z19;
                    x1Var.setGravity(z19 ? 5 : 3);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) x1Var.getLayoutParams();
                    layoutParams.gravity = (LocaleController.isRTL ? 5 : 3) | 48;
                    x1Var.setLayoutParams(layoutParams);
                }
                if (i12 != languageSelectActivity.n) {
                    b9Var.setTopPadding(0);
                    b9Var.setBottomPadding(16);
                    break;
                } else {
                    b9Var.setText(LocaleController.getString(R.string.TranslateMessagesInfo1));
                    b9Var.setTopPadding(11);
                    b9Var.setBottomPadding(16);
                    break;
                }
        }
        return;
        charSequence = sb2;
        if (charSequence == null) {
        }
        baVar.c(string2, charSequence, true, false);
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        Context context = this.c;
        if (i9 != 0) {
            view = i9 != 2 ? i9 != 3 ? (i9 == 4 || i9 == 5) ? new org.telegram.ui.Cells.ba(context) : i9 != 6 ? new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null) : new org.telegram.ui.Cells.b9(context) : new org.telegram.ui.Cells.m4(context) : new org.telegram.ui.Cells.t8(context);
        } else {
            org.telegram.ui.Cells.d9 d9Var = new org.telegram.ui.Cells.d9(context);
            d9Var.e = 50;
            d9Var.r = 21;
            TextView textView = new TextView(context);
            d9Var.a = textView;
            org.telegram.messenger.ll.s(textView, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false), 1, 16.0f, 1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView.setEllipsize(truncateAt);
            boolean z10 = LocaleController.isRTL;
            d9Var.addView(textView, g7.e6.d(-1, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 21 : 64.0f, 0.0f, z10 ? 64.0f : 21, 0.0f));
            TextView textView2 = new TextView(context);
            d9Var.b = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.z6, false));
            textView2.setTextSize(1, 13.0f);
            textView2.setGravity(LocaleController.isRTL ? 5 : 3);
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setPadding(0, 0, 0, 0);
            textView2.setEllipsize(truncateAt);
            boolean z11 = LocaleController.isRTL;
            d9Var.addView(textView2, g7.e6.d(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 64.0f, 36.0f, z11 ? 64.0f : 21, 0.0f));
            RadioButton radioButton = new RadioButton(context);
            d9Var.c = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.b(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.g7, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.h7, false));
            d9Var.addView(radioButton, g7.e6.d(20, 20.0f, (LocaleController.isRTL ? 5 : 3) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
            d9Var.n = LocaleController.isRTL;
            d9Var.setClipChildren(false);
            view = d9Var;
        }
        return new org.telegram.ui.Components.ik0(view);
    }

    @Override // f2.r0
    public final void y(f2.q1 q1Var) {
        View view = q1Var.a;
        if (view instanceof org.telegram.ui.Cells.d9) {
            ((org.telegram.ui.Cells.d9) view).c();
        }
    }
}
