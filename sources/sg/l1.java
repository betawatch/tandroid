package sg;

import ai.z4;
import ai.zd;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import ei.kb;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.kk;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.w90;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.xn0;
import org.telegram.ui.Components.z00;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.aw0;
import org.telegram.ui.qw0;
import org.telegram.ui.sa1;
import w7.z5;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public class l1 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public View A0;
    public View B0;
    public TLRPC.InputStickerSet C0;
    public TLRPC.TL_emojiStatusCollectible D0;
    public boolean E0;
    public final int[] F0;
    public float G0;
    public boolean H0;
    public ValueAnimator I0;
    public boolean J0;
    public boolean K0;
    public FrameLayout L0;
    public final FrameLayout M0;
    public FrameLayout N0;
    public x90[] O0;
    public x90 P0;
    public final ArrayList X;
    public int Y;
    public final TLRPC.User Z;
    public final k a0;
    public final TL_stars.StarGift b0;
    public boolean c0;
    public final aw0 d0;
    public int e0;
    public int f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public final z00 o0;
    public final z0 p0;
    public gi.f q0;
    public zd r0;
    public sa1 s0;
    public final n2 t0;
    public Integer u0;
    public float v0;
    public float w0;
    public float x0;
    public float y0;
    public float z0;

    public l1(n2 n2Var, int i10, TLRPC.User user, d6 d6Var) {
        this(n2Var, i10, user, null, null, d6Var);
    }

    public static /* synthetic */ void Q(l1 l1Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(l1Var.C0);
        z4 z4Var = new z4(l1Var, 10);
        n2 n2Var = l1Var.t0;
        if (n2Var != null) {
            z4Var.setParentFragment(n2Var);
        }
        new g1(l1Var, z4Var, l1Var.getContext(), l1Var.resourcesProvider, arrayList).show();
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence A() {
        return LocaleController.getString(R.string.TelegramPremium);
    }

    @Override // org.telegram.ui.Components.bb
    public final void F(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i12 = 0;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.X;
            if (i12 >= arrayList.size()) {
                this.e0 = i13;
                this.container.getLocationOnScreen(this.F0);
                return;
            }
            qw0 qw0Var = (qw0) arrayList.get(i12);
            aw0 aw0Var = this.d0;
            aw0Var.a(qw0Var, false);
            aw0Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
            ((qw0) arrayList.get(i12)).e = i13;
            i13 += aw0Var.getMeasuredHeight();
            i12++;
        }
    }

    @Override // org.telegram.ui.Components.bb
    public final void H(jw0 jw0Var) {
        this.Y = UserConfig.selectedAccount;
        p0 p0Var = new p0(getContext(), this.resourcesProvider, false);
        p0Var.a(PremiumPreviewFragment.o0(this.Y, null), new hg.r0(this, 21), false);
        this.L0 = new FrameLayout(getContext());
        View view = new View(getContext());
        view.setBackgroundColor(getThemedColor(h6.d7));
        this.L0.addView(view, z5.d(1.0f, -1));
        view.getLayoutParams().height = 1;
        AndroidUtilities.updateViewVisibilityAnimated(view, true, 1.0f, false);
        if (UserConfig.getInstance(this.Y).isPremium() || (this instanceof ug.i0)) {
            return;
        }
        this.L0.addView(p0Var, z5.a(48.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, 16));
        this.L0.setBackgroundColor(getThemedColor(h6.h5));
        jw0Var.addView(this.L0, z5.e(-1, 68, 80));
    }

    public void X(sa1 sa1Var) {
        sa1Var.addView(this.B0, z5.p(140, 140, 1.0f, 17, 10, 10, 10, 10));
    }

    public int Y() {
        return 0;
    }

    public View a0(Context context, int i10) {
        return null;
    }

    public void b0(boolean z10) {
        TLRPC.Document document;
        SpannableStringBuilder spannableStringBuilder;
        x90[] x90VarArr = this.O0;
        if (x90VarArr == null || this.P0 == null) {
            return;
        }
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.D0;
        int i10 = 2;
        int i11 = 1;
        TLRPC.User user = this.Z;
        int i12 = 0;
        if (tL_emojiStatusCollectible != null) {
            String str = tL_emojiStatusCollectible.title;
            int lastIndexOf = str.lastIndexOf(32);
            if (lastIndexOf >= 0) {
                str = str.substring(0, lastIndexOf);
            }
            this.O0[0].setText(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.TelegramPremiumUserStatusCollectibleDialogTitle, DialogObject.getShortName(user), str), new d1(this, i12)));
            org.telegram.ui.Cells.c1.s(R.string.TelegramPremiumUserStatusDialogSubtitle, this.P0);
        } else if (this.C0 != null) {
            String formatString = LocaleController.formatString(R.string.TelegramPremiumUserStatusDialogTitle, ContactsController.formatName(user.first_name, user.last_name), "<STICKERSET>");
            Integer num = this.u0;
            CharSequence replaceSingleLink = AndroidUtilities.replaceSingleLink(formatString, num == null ? getThemedColor(h6.u6) : num.intValue());
            try {
                replaceSingleLink = Emoji.replaceEmoji(replaceSingleLink, this.O0[0].getPaint().getFontMetricsInt(), false);
            } catch (Exception unused) {
            }
            SpannableStringBuilder spannableStringBuilder2 = replaceSingleLink instanceof SpannableStringBuilder ? (SpannableStringBuilder) replaceSingleLink : new SpannableStringBuilder(replaceSingleLink);
            int indexOf = replaceSingleLink.toString().indexOf("<STICKERSET>");
            if (indexOf >= 0) {
                TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.Y).getStickerSet(this.C0, false);
                if (stickerSet == null || stickerSet.documents.isEmpty()) {
                    document = null;
                } else {
                    document = stickerSet.documents.get(0);
                    if (stickerSet.set != null) {
                        int i13 = 0;
                        while (true) {
                            if (i13 >= stickerSet.documents.size()) {
                                break;
                            }
                            if (stickerSet.documents.get(i13).id == stickerSet.set.thumb_document_id) {
                                document = stickerSet.documents.get(i13);
                                break;
                            }
                            i13++;
                        }
                    }
                }
                if (document != null) {
                    spannableStringBuilder = new SpannableStringBuilder("x");
                    spannableStringBuilder.setSpan(new a6(document, this.O0[0].getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                    if (stickerSet != null && stickerSet.set != null) {
                        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) stickerSet.set.title);
                    }
                } else {
                    spannableStringBuilder = new SpannableStringBuilder("xxxxxx");
                    spannableStringBuilder.setSpan(new ca0(AndroidUtilities.dp(100.0f), this.O0[0]), 0, spannableStringBuilder.length(), 33);
                }
                spannableStringBuilder2.replace(indexOf, indexOf + 12, (CharSequence) spannableStringBuilder);
                spannableStringBuilder2.setSpan(new kb(this, 11), indexOf, spannableStringBuilder.length() + indexOf, 33);
                this.O0[1].setOnLinkPressListener(new w90() { // from class: sg.e1
                    @Override // org.telegram.ui.Components.w90
                    public final void a(ClickableSpan clickableSpan) {
                        l1.Q(l1.this);
                    }
                });
                if (document != null) {
                    x90[] x90VarArr2 = this.O0;
                    if (x90VarArr2 != null) {
                        x90VarArr2[1].setText(spannableStringBuilder2);
                        if (this.O0[1].getVisibility() != 0) {
                            if (z10) {
                                this.O0[1].setAlpha(0.0f);
                                this.O0[1].setVisibility(0);
                                ViewPropertyAnimator alpha = this.O0[1].animate().alpha(1.0f);
                                bs bsVar = bs.f;
                                kk.t(alpha, bsVar, 200L);
                                this.O0[0].animate().alpha(0.0f).setInterpolator(bsVar).setDuration(200L).withEndAction(new d1(this, i10)).start();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.addUpdateListener(new f1(this, i11));
                                ofFloat.setInterpolator(bsVar);
                                ofFloat.setDuration(200L);
                                ofFloat.start();
                            } else {
                                this.O0[1].setAlpha(1.0f);
                                this.O0[1].setVisibility(0);
                                this.O0[0].setAlpha(0.0f);
                                this.O0[0].setVisibility(8);
                            }
                        }
                    }
                } else {
                    this.O0[0].setText(spannableStringBuilder2, (TextView.BufferType) null);
                }
            }
            org.telegram.ui.Cells.c1.s(R.string.TelegramPremiumUserStatusDialogSubtitle, this.P0);
        } else if (this.E0) {
            x90VarArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.TelegramPremiumUserStatusDefaultDialogTitle, ContactsController.formatName(user.first_name, user.last_name))));
            this.P0.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.TelegramPremiumUserStatusDialogSubtitle, ContactsController.formatName(user.first_name, user.last_name))));
        } else {
            k kVar = this.a0;
            if (kVar == null) {
                TL_stars.StarGift starGift = this.b0;
                if (starGift != null) {
                    x90VarArr[0].setText(LocaleController.getString(R.string.Gift2PremiumTitle));
                    this.O0[0].setTextSize(1, 20.0f);
                    if (starGift.limited_per_user) {
                        this.P0.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PremiumSubtitleMany", starGift.per_user_total)));
                    } else {
                        org.telegram.ui.Cells.c1.s(R.string.Gift2PremiumSubtitle, this.P0);
                    }
                    this.P0.setTextSize(1, 14.0f);
                } else if (user == null) {
                    x90VarArr[0].setText(LocaleController.getString(R.string.TelegramPremium));
                    org.telegram.ui.Cells.c1.s(R.string.TelegramPremiumSubscribedSubtitle, this.P0);
                } else {
                    x90 x90Var = x90VarArr[0];
                    String formatString2 = LocaleController.formatString(R.string.TelegramPremiumUserDialogTitle, ContactsController.formatName(user.first_name, user.last_name));
                    Integer num2 = this.u0;
                    x90Var.setText(AndroidUtilities.replaceSingleLink(formatString2, num2 == null ? getThemedColor(h6.u6) : num2.intValue()));
                    org.telegram.ui.Cells.c1.s(R.string.TelegramPremiumUserDialogSubtitle, this.P0);
                }
            } else if (this.c0) {
                x90 x90Var2 = x90VarArr[0];
                String formatString3 = LocaleController.formatString(R.string.TelegramPremiumUserGiftedPremiumOutboundDialogTitleWithPlural, user != null ? user.first_name : "", LocaleController.formatPluralString("GiftMonths", kVar.d(), new Object[0]));
                Integer num3 = this.u0;
                x90Var2.setText(AndroidUtilities.replaceSingleLink(formatString3, num3 == null ? getThemedColor(h6.u6) : num3.intValue()));
                x90 x90Var3 = this.P0;
                String formatString4 = LocaleController.formatString(R.string.TelegramPremiumUserGiftedPremiumOutboundDialogSubtitle, user != null ? user.first_name : "");
                Integer num4 = this.u0;
                x90Var3.setText(AndroidUtilities.replaceSingleLink(formatString4, num4 == null ? getThemedColor(h6.u6) : num4.intValue()));
            } else if (user == null || TextUtils.isEmpty(user.first_name) || user.id == 777000) {
                x90 x90Var4 = this.O0[0];
                String formatString5 = LocaleController.formatString(R.string.TelegramPremiumUserGiftedPremiumDialogTitleWithPluralSomeone, LocaleController.formatPluralString("GiftMonths", kVar.d(), new Object[0]));
                Integer num5 = this.u0;
                x90Var4.setText(AndroidUtilities.replaceSingleLink(formatString5, num5 == null ? getThemedColor(h6.u6) : num5.intValue()));
                org.telegram.ui.Cells.c1.s(R.string.TelegramPremiumUserGiftedPremiumDialogSubtitle, this.P0);
            } else {
                x90 x90Var5 = this.O0[0];
                String formatString6 = LocaleController.formatString(R.string.TelegramPremiumUserGiftedPremiumDialogTitleWithPlural, user.first_name, LocaleController.formatPluralString("GiftMonths", kVar.d(), new Object[0]));
                Integer num6 = this.u0;
                x90Var5.setText(AndroidUtilities.replaceSingleLink(formatString6, num6 == null ? getThemedColor(h6.u6) : num6.intValue()));
                org.telegram.ui.Cells.c1.s(R.string.TelegramPremiumUserGiftedPremiumDialogSubtitle, this.P0);
            }
        }
        try {
            x90 x90Var6 = this.O0[0];
            x90Var6.setText(Emoji.replaceEmoji(x90Var6.getText(), this.O0[0].getPaint().getFontMetricsInt(), false));
        } catch (Exception unused2) {
        }
    }

    public void c0() {
        int i10 = this.f0;
        int i11 = i10 + 1;
        this.f0 = i11;
        this.g0 = i10;
        this.j0 = i11;
        int size = this.X.size() + i11;
        this.k0 = size;
        this.f0 = size + 1;
        this.l0 = size;
        if (UserConfig.getInstance(this.Y).isPremium() || this.a0 != null) {
            return;
        }
        int i12 = this.f0;
        this.f0 = i12 + 1;
        this.m0 = i12;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.InputStickerSet inputStickerSet;
        if (i10 == NotificationCenter.groupStickersDidLoad && (inputStickerSet = this.C0) != null && inputStickerSet.id == ((Long) objArr[0]).longValue()) {
            b0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
        ValueAnimator valueAnimator = this.I0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        z00 z00Var = this.o0;
        if (z00Var.c) {
            z00Var.animate().alpha(0.0f).setDuration(150L).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void mainContainerDispatchDraw(Canvas canvas) {
        View view = this.B0;
        if (view != null) {
            view.setVisibility(this.H0 ? 4 : 0);
        }
        super.mainContainerDispatchDraw(canvas);
        if (this.A0 == null || !this.H0) {
            return;
        }
        View view2 = this.B0;
        View view3 = view2 == null ? this.r0 : view2;
        if (view3 == view2) {
            view2.setVisibility(0);
        }
        canvas.save();
        float[] fArr = {this.v0, this.w0};
        this.A0.getMatrix().mapPoints(fArr);
        View view4 = this.A0;
        Drawable rightDrawable = view4 instanceof j5 ? ((j5) view4).getRightDrawable() : view4 instanceof org.telegram.ui.Cells.u1 ? ((org.telegram.ui.Cells.u1) view4).fc : null;
        if (rightDrawable == null) {
            canvas.restore();
            return;
        }
        int[] iArr = this.F0;
        float f7 = (-iArr[0]) + this.x0 + fArr[0];
        float f10 = (-iArr[1]) + this.y0 + fArr[1];
        if (AndroidUtilities.isTablet()) {
            ViewGroup view5 = this.t0.getParentLayout().getView();
            f7 += view5.getX() + view5.getPaddingLeft();
            f10 += view5.getY() + view5.getPaddingTop();
        }
        float intrinsicWidth = this.z0 * rightDrawable.getIntrinsicWidth();
        float measuredHeight = view3.getMeasuredHeight() * 0.8f;
        float f11 = measuredHeight / intrinsicWidth;
        float f12 = intrinsicWidth / measuredHeight;
        float measuredWidth = view3.getMeasuredWidth() / 2.0f;
        for (View view6 = view3; view6 != this.container && view6 != null; view6 = (View) view6.getParent()) {
            measuredWidth += view6.getX();
        }
        float measuredHeight2 = (view3.getMeasuredHeight() / 2.0f) + ((View) view3.getParent().getParent()).getY() + ((View) view3.getParent()).getY() + view3.getY() + 0.0f;
        float lerp = AndroidUtilities.lerp(f7, measuredWidth, bs.h.getInterpolation(this.G0));
        float lerp2 = AndroidUtilities.lerp(f10, measuredHeight2, this.G0);
        float f13 = this.z0;
        float f14 = this.G0;
        float f15 = (f11 * f14) + ((1.0f - f14) * f13);
        canvas.save();
        canvas.scale(f15, f15, lerp, lerp2);
        int i10 = (int) lerp;
        int i11 = (int) lerp2;
        rightDrawable.setBounds(org.telegram.ui.Cells.c1.w(2, i10, rightDrawable), org.telegram.ui.Cells.c1.f(2, i11, rightDrawable), org.telegram.ui.Cells.c1.B(2, i10, rightDrawable), org.telegram.ui.Cells.c1.A(2, i11, rightDrawable));
        rightDrawable.setAlpha((int) ((1.0f - Utilities.clamp(this.G0, 1.0f, 0.0f)) * 255.0f));
        rightDrawable.draw(canvas);
        rightDrawable.setAlpha(0);
        canvas.restore();
        float lerp3 = AndroidUtilities.lerp(f12, 1.0f, this.G0);
        canvas.scale(lerp3, lerp3, lerp, lerp2);
        canvas.translate(lerp - (view3.getMeasuredWidth() / 2.0f), lerp2 - (view3.getMeasuredHeight() / 2.0f));
        view3.draw(canvas);
        canvas.restore();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(UserConfig.selectedAccount).addObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean onCustomOpenAnimation() {
        Drawable drawable;
        int i10 = 0;
        if (this.A0 == null) {
            return false;
        }
        this.I0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.G0 = 0.0f;
        this.H0 = true;
        this.s0.invalidate();
        View view = this.A0;
        if (view instanceof j5) {
            drawable = ((j5) view).getRightDrawable();
        } else if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            p5 p5Var = u1Var.fc;
            u1Var.a3();
            drawable = p5Var;
        } else {
            drawable = null;
        }
        if (drawable != null) {
            drawable.setAlpha(0);
        }
        View view2 = this.A0;
        if (view2 instanceof org.telegram.ui.Cells.u1) {
            ((org.telegram.ui.Cells.u1) view2).a3();
        } else {
            view2.invalidate();
        }
        zd zdVar = this.r0;
        if (zdVar != null) {
            zdVar.o(100L);
        }
        this.I0.addUpdateListener(new f1(this, i10));
        this.I0.addListener(new ml0(22, this, drawable));
        this.I0.setDuration(600L);
        this.I0.setInterpolator(bs.h);
        this.I0.start();
        return super.onCustomOpenAnimation();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(UserConfig.selectedAccount).removeObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        int i10 = 1;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
        if (this.J0) {
            AndroidUtilities.runOnUIThread(new d1(this, i10), 200L);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, org.telegram.ui.ActionBar.j2
    public final boolean showDialog(Dialog dialog) {
        zd zdVar = this.r0;
        if (zdVar != null) {
            zdVar.setDialogVisible(true);
        }
        this.q0.setPaused(true);
        dialog.setOnDismissListener(new ai.bb(this, 13));
        dialog.show();
        return true;
    }

    @Override // org.telegram.ui.Components.bb
    public final hm0 x(im0 im0Var) {
        return new k1(this);
    }

    public l1(n2 n2Var, int i10, TLRPC.User user, k kVar, TL_stars.StarGift starGift, d6 d6Var) {
        super(n2Var, false, false, d6Var);
        ArrayList arrayList = new ArrayList();
        this.X = arrayList;
        this.F0 = new int[2];
        this.G0 = 0.0f;
        fixNavigationBar();
        this.t0 = n2Var;
        this.v = 0.26f;
        this.Z = user;
        this.Y = i10;
        this.a0 = kVar;
        this.b0 = starGift;
        this.d0 = new aw0(getContext(), null);
        PremiumPreviewFragment.n0(i10, arrayList);
        if (kVar != null || UserConfig.getInstance(i10).isPremium()) {
            this.L0.setVisibility(8);
        }
        z0 z0Var = new z0(h6.Lj, h6.Mj, h6.Nj, h6.Oj, null);
        this.p0 = z0Var;
        z0Var.m = true;
        z0Var.o = 1.0f;
        z0Var.p = 0.0f;
        z0Var.q = 0.0f;
        z0Var.b = 0.0f;
        z0Var.c = 0.0f;
        c0();
        this.d.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        this.d.setOnItemClickListener(new xn0(this, i10, n2Var, 1));
        MediaDataController.getInstance(i10).preloadPremiumPreviewStickers();
        PremiumPreviewFragment.r0("profile");
        z00 z00Var = new z00(getContext());
        this.o0 = z00Var;
        this.container.addView(z00Var, z5.d(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.M0 = frameLayout;
        this.containerView.addView(frameLayout, z5.e(-1, 140, 87));
    }

    public void Z(View view) {
    }

    public void W(int i10, View view) {
    }
}
