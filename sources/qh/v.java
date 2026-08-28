package qh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import g7.e6;
import g7.g6;
import kh.b8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ll;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class v extends sa {
    public final int T;
    public final Utilities.Callback U;
    public z41 V;
    public final FrameLayout W;
    public final FrameLayout X;
    public final RichMessageLayout.PreviewView Y;
    public final FrameLayout Z;
    public final org.telegram.ui.Cells.j3 a0;
    public final kh.d b0;
    public boolean c0;
    public int d0;
    public TL_iv.RichMessage e0;

    public v(int i9, Context context, Utilities.Callback callback, b6 b6Var) {
        super(context, null, true, false, false, 1, b6Var);
        this.T = i9;
        this.U = callback;
        int i10 = f6.a7;
        setBackgroundColor(f6.v0(i10, b6Var));
        fixNavigationBar(f6.v0(i10, b6Var));
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.ArticleAICreate));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i11 = f6.G6;
        textView.setTextColor(f6.v0(i11, b6Var));
        textView.setGravity(19);
        frameLayout.addView(textView, e6.d(-1, 56.0f, 51, 22.0f, 6.0f, 56.0f, 0.0f));
        this.E = AndroidUtilities.dp(-8.0f);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(f6.v0(i11, b6Var), PorterDuff.Mode.SRC_IN));
        g6.a(imageView);
        final int i12 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: qh.t
            public final /* synthetic */ v b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.b.dismiss();
                        break;
                    default:
                        v vVar = this.b;
                        org.telegram.ui.Cells.j3 j3Var = vVar.a0;
                        if (!vVar.c0) {
                            TL_iv.RichMessage richMessage = vVar.e0;
                            if (richMessage == null) {
                                String trim = j3Var.b.getText().toString().trim();
                                if (!TextUtils.isEmpty(trim)) {
                                    vVar.c0 = true;
                                    vVar.b0.setLoading(true);
                                    TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                    TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                    inputaicomposetonesingleuse.custom_prompt = trim;
                                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                    vVar.d0 = ConnectionsManager.getInstance(vVar.T).sendRequest(tL_messages_composeRichMessageWithAI, new bf.a(vVar, 28));
                                    AndroidUtilities.hideKeyboard(j3Var.b);
                                    break;
                                }
                            } else {
                                Utilities.Callback callback2 = vVar.U;
                                if (callback2 != null) {
                                    callback2.run(richMessage);
                                }
                                vVar.dismiss();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        frameLayout.addView(imageView, e6.d(48, 48.0f, 53, 0.0f, 10.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.X = frameLayout2;
        RichMessageLayout.PreviewView previewView = new RichMessageLayout.PreviewView(context, i9, b6Var);
        this.Y = previewView;
        previewView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(12.0f);
        int i13 = f6.d6;
        previewView.setBackground(f6.b0(dp, f6.v0(i13, b6Var)));
        frameLayout2.addView(previewView, e6.c(-2.0f, -1));
        frameLayout2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Z = frameLayout3;
        org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.ArticleAIPrompt), true, false, MessagesController.getInstance(i9).config.aicomposeTonePromptLengthMax.get(), b6Var);
        this.a0 = j3Var;
        org.telegram.ui.Cells.h3 h3Var = j3Var.b;
        h3Var.setImeOptions(6);
        h3Var.setMaxLines(5);
        j3Var.setBackground(f6.b0(AndroidUtilities.dp(20.0f), f6.v0(i13, b6Var)));
        h3Var.addTextChangedListener(new u(this));
        frameLayout3.addView(j3Var, e6.c(-2.0f, -1));
        frameLayout3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        kh.d i14 = ll.i(24, context, b6Var, true);
        this.b0 = i14;
        i14.g(LocaleController.getString(R.string.ArticleAIGenerate), false, true);
        final int i15 = 1;
        i14.setOnClickListener(new View.OnClickListener(this) { // from class: qh.t
            public final /* synthetic */ v b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        this.b.dismiss();
                        break;
                    default:
                        v vVar = this.b;
                        org.telegram.ui.Cells.j3 j3Var2 = vVar.a0;
                        if (!vVar.c0) {
                            TL_iv.RichMessage richMessage = vVar.e0;
                            if (richMessage == null) {
                                String trim = j3Var2.b.getText().toString().trim();
                                if (!TextUtils.isEmpty(trim)) {
                                    vVar.c0 = true;
                                    vVar.b0.setLoading(true);
                                    TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                    TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                    inputaicomposetonesingleuse.custom_prompt = trim;
                                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                    vVar.d0 = ConnectionsManager.getInstance(vVar.T).sendRequest(tL_messages_composeRichMessageWithAI, new bf.a(vVar, 28));
                                    AndroidUtilities.hideKeyboard(j3Var2.b);
                                    break;
                                }
                            } else {
                                Utilities.Callback callback2 = vVar.U;
                                if (callback2 != null) {
                                    callback2.run(richMessage);
                                }
                                vVar.dismiss();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.containerView.addView(i14, e6.d(-1, 48.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        ((ViewGroup.MarginLayoutParams) i14.getLayoutParams()).leftMargin += this.backgroundPaddingLeft;
        ((ViewGroup.MarginLayoutParams) i14.getLayoutParams()).rightMargin += this.backgroundPaddingLeft;
        f2.n nVar = new f2.n();
        nVar.m = false;
        nVar.C = false;
        nVar.o(gr.h);
        nVar.n(350L);
        this.d.setItemAnimator(nVar);
        wk0 wk0Var = this.d;
        int i16 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i16, 0, i16, AndroidUtilities.dp(72.0f));
        this.d.setClipToPadding(false);
        this.V.N(false);
        O();
    }

    public final void O() {
        TL_iv.RichMessage richMessage = this.e0;
        kh.d dVar = this.b0;
        if (richMessage != null) {
            dVar.setEnabled(true);
        } else {
            dVar.setEnabled(!TextUtils.isEmpty(this.a0.b.getText().toString().trim()));
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        if (this.d0 != 0) {
            ConnectionsManager.getInstance(this.T).cancelRequest(this.d0, true);
            this.d0 = 0;
        }
        AndroidUtilities.hideKeyboard(this.a0.b);
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new pf.o1(this, 2), 200L);
    }

    @Override // org.telegram.ui.Components.sa
    public final vk0 v(wk0 wk0Var) {
        z41 z41Var = new z41(wk0Var, getContext(), this.T, 0, true, new b8(this, 27), this.resourcesProvider);
        this.V = z41Var;
        return z41Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return LocaleController.getString(R.string.ArticleAICreate);
    }
}
