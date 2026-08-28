package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import g7.v6;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.y9;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.xh0;
import org.telegram.ui.yi0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class s5 extends FrameLayout implements org.telegram.ui.ActionBar.w5, m9 {
    public static final /* synthetic */ int R = 0;
    public boolean A;
    public boolean B;
    public e2 C;
    public String D;
    public int E;
    public dl0 F;
    public Drawable G;
    public xh0 H;
    public final RectF I;
    public boolean J;
    public int K;
    public ba0 L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public final Paint Q;
    public final b6 a;
    public final LinearLayout b;
    public final View c;
    public final bh.e d;
    public final yi0 e;
    public final d1 f;
    public final d1 h;
    public boolean n;
    public final ArrayList r;
    public LinearLayout s;
    public TextView v;
    public ImageView w;
    public a x;
    public p5 y;

    public s5(Context context, b6 b6Var) {
        super(context);
        this.r = new ArrayList();
        this.I = new RectF();
        this.M = -1;
        this.N = -1;
        this.Q = new Paint(1);
        this.a = b6Var;
        setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.66f));
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(0);
        View view = new View(context);
        this.c = view;
        linearLayout.addView(view, new LinearLayout.LayoutParams(0, -2));
        bh.e eVar = new bh.e(this, context);
        this.d = eVar;
        eVar.setGravity(8388627);
        eVar.setPaddingRelative(AndroidUtilities.dp(6.0f), 0, 0, 0);
        eVar.setSingleLine(true);
        eVar.setIncludeFontPadding(false);
        eVar.setTextSize(1, 16.0f);
        linearLayout.addView(eVar, e6.n(18, -2));
        yi0 yi0Var = new yi0(context, b6Var);
        this.e = yi0Var;
        yi0Var.setVisibility(8);
        yi0Var.setOnClickListener(new k5(this, 0));
        linearLayout.addView(yi0Var, e6.n(18, -2));
        d1 d1Var = new d1(context, b6Var);
        this.f = d1Var;
        d1Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        d1Var.setListener(new n5(this));
        final int i9 = 0;
        d1Var.setDelegate(new kt(this) { // from class: qh.l5
            public final /* synthetic */ s5 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.kt
            public final void m1() {
                switch (i9) {
                    case 0:
                        s5 s5Var = this.b;
                        if (!s5Var.O && s5Var.x != null) {
                            s5Var.J();
                            s5.e(s5Var.x.b, s5Var.f.getText());
                            p5 p5Var = s5Var.y;
                            if (p5Var != null) {
                                o3.O1(((x2) p5Var).a);
                                break;
                            }
                        }
                        break;
                    default:
                        s5 s5Var2 = this.b;
                        if (s5Var2.x != null) {
                            s5Var2.w();
                            p5 p5Var2 = s5Var2.y;
                            if (p5Var2 != null) {
                                o3.O1(((x2) p5Var2).a);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        d1Var.setOnFocusChangeListener(new gh.j(this, 5));
        linearLayout.addView(d1Var, e6.l(1.0f, 0, -2));
        addView(linearLayout, e6.e(-1, -2, 51));
        d1 d1Var2 = new d1(context, b6Var);
        this.h = d1Var2;
        d1Var2.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        d1Var2.setAllowNewlines(false);
        d1Var2.setInputType(147457);
        d1Var2.setListener(new o5(this));
        final int i10 = 1;
        d1Var2.setDelegate(new kt(this) { // from class: qh.l5
            public final /* synthetic */ s5 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.kt
            public final void m1() {
                switch (i10) {
                    case 0:
                        s5 s5Var = this.b;
                        if (!s5Var.O && s5Var.x != null) {
                            s5Var.J();
                            s5.e(s5Var.x.b, s5Var.f.getText());
                            p5 p5Var = s5Var.y;
                            if (p5Var != null) {
                                o3.O1(((x2) p5Var).a);
                                break;
                            }
                        }
                        break;
                    default:
                        s5 s5Var2 = this.b;
                        if (s5Var2.x != null) {
                            s5Var2.w();
                            p5 p5Var2 = s5Var2.y;
                            if (p5Var2 != null) {
                                o3.O1(((x2) p5Var2).a);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        d1Var2.setVisibility(8);
        addView(d1Var2, e6.e(-1, -2, 51));
        d();
    }

    public static SpannableStringBuilder A(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return null;
        }
        return u5.r(pageBlock.text, pageBlock, true);
    }

    public static void a(s5 s5Var, boolean z10) {
        p5 p5Var;
        s5Var.f.setHint(s5Var.getHint());
        if (z10 || (p5Var = s5Var.y) == null) {
            return;
        }
        ((x2) p5Var).a.d3.c2(s5Var, null);
    }

    public static String b(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        if (str.charAt(0) != '/') {
            return null;
        }
        for (int i9 = 0; i9 < str.length(); i9++) {
            char charAt = str.charAt(i9);
            if (charAt == ' ' || charAt == '\n' || charAt == '\t') {
                return null;
            }
        }
        return str;
    }

    public static void e(TL_iv.PageBlock pageBlock, CharSequence charSequence) {
        pageBlock.text = u5.f(charSequence);
    }

    public static void f(TL_iv.PageBlock pageBlock, String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        pageBlock.text = textplain;
    }

    private String getHint() {
        a aVar = this.x;
        if (aVar == null) {
            return null;
        }
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            return LocaleController.getString(aVar.p ? R.string.ArticleHintTitle : R.string.ArticleHeading1);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            return LocaleController.getString(R.string.ArticleHeading2);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            return LocaleController.getString(R.string.ArticleHeading3);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            return LocaleController.getString(R.string.ArticleHeading4);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            return LocaleController.getString(R.string.ArticleHeading5);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            return LocaleController.getString(R.string.ArticleHeading6);
        }
        if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            return LocaleController.getString(R.string.ArticleHintCode);
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            return LocaleController.getString(R.string.ArticleHintQuote);
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            return LocaleController.getString(R.string.ArticleHintQuote);
        }
        if (aVar.q) {
            return LocaleController.getString(R.string.ArticleHintText);
        }
        return null;
    }

    public static void j(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
            if (pageblockblockquote.caption == null) {
                pageblockblockquote.caption = new TL_iv.textEmpty();
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
            if (pageblockpullquote.caption == null) {
                pageblockpullquote.caption = new TL_iv.textEmpty();
            }
        }
    }

    public static TL_iv.RichText k(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            return ((TL_iv.pageBlockBlockquote) pageBlock).caption;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            return ((TL_iv.pageBlockPullquote) pageBlock).caption;
        }
        return null;
    }

    public static boolean m(d1 d1Var, int i9, int i10, int i11, int i12) {
        return d1Var.length() == 0 && i11 >= i9 && i11 <= d1Var.getWidth() + i9 && i12 >= i10 && i12 <= d1Var.getHeight() + i10;
    }

    public static boolean p(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote);
    }

    public static int q(String str) {
        if (str == null) {
            return 0;
        }
        String lowerCase = str.trim().toLowerCase();
        if (lowerCase.equals("/img") || lowerCase.equals("/pic") || lowerCase.equals("/image") || lowerCase.equals("/picture") || lowerCase.equals("/photo")) {
            return 4;
        }
        if (lowerCase.equals("/vid") || lowerCase.equals("/video")) {
            return 5;
        }
        if (lowerCase.equals("/audio") || lowerCase.equals("/music")) {
            return 1;
        }
        if (lowerCase.equals("/map") || lowerCase.equals("/location") || lowerCase.equals("/loc")) {
            return 2;
        }
        if (lowerCase.equals("/latex") || lowerCase.equals("/equation") || lowerCase.equals("/math")) {
            return 3;
        }
        if (lowerCase.equals("/toggle") || lowerCase.equals("/details")) {
            return 6;
        }
        return lowerCase.equals("/button") ? 7 : 0;
    }

    public static r5 r(String str, a aVar) {
        int i9;
        int i10;
        char charAt;
        char charAt2;
        if (str == null || aVar == null) {
            return null;
        }
        String trim = str.trim();
        int i11 = 2;
        if (trim.length() == 3 && (((charAt2 = trim.charAt(0)) == '-' || charAt2 == '*' || charAt2 == '_') && trim.charAt(1) == charAt2 && trim.charAt(2) == charAt2)) {
            return new r5(new TL_iv.pageBlockDivider(), 0, 0);
        }
        String lowerCase = trim.toLowerCase();
        if (lowerCase.length() == 3 && lowerCase.charAt(0) == '/' && lowerCase.charAt(1) == 'h' && (charAt = lowerCase.charAt(2)) >= '1' && charAt <= '6') {
            return new r5(v(charAt - '0'), aVar.c, aVar.d);
        }
        if (lowerCase.equals("/code") || lowerCase.equals("/pre") || lowerCase.equals("/preformatted")) {
            return new r5(new TL_iv.pageBlockPreformatted(), 0, 0);
        }
        if (lowerCase.equals("/footer")) {
            return new r5(new TL_iv.pageBlockFooter(), 0, 0);
        }
        if (lowerCase.equals("/quote") || lowerCase.equals("/blockquote")) {
            TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
            pageblockblockquote.caption = new TL_iv.textEmpty();
            return new r5(pageblockblockquote, 0, 0);
        }
        if (lowerCase.equals("/pullquote")) {
            TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
            pageblockpullquote.caption = new TL_iv.textEmpty();
            return new r5(pageblockpullquote, 0, 0);
        }
        if (!lowerCase.equals("/table") && !lowerCase.startsWith("/table ")) {
            return null;
        }
        if (lowerCase.length() > 7) {
            String trim2 = lowerCase.substring(7).trim();
            int indexOf = trim2.indexOf(120);
            if (indexOf < 0) {
                indexOf = trim2.indexOf(88);
            }
            if (indexOf > 0) {
                try {
                    i10 = Math.max(1, Math.min(20, Integer.parseInt(trim2.substring(0, indexOf).trim())));
                } catch (NumberFormatException unused) {
                    i10 = 2;
                }
                try {
                    i9 = Math.max(1, Math.min(20, Integer.parseInt(trim2.substring(indexOf + 1).trim())));
                    i11 = i10;
                } catch (NumberFormatException unused2) {
                    i11 = i10;
                    i9 = 2;
                    return new r5(u(i11, i9), 0, 0);
                }
                return new r5(u(i11, i9), 0, 0);
            }
        }
        i9 = 2;
        return new r5(u(i11, i9), 0, 0);
    }

    public static r5 s(String str, a aVar) {
        int length;
        char charAt;
        if (aVar == null || str == null || (length = str.length()) < 2) {
            return null;
        }
        int i9 = length - 1;
        if (str.charAt(i9) != ' ') {
            return null;
        }
        TL_iv.PageBlock pageBlock = aVar.b;
        boolean z10 = pageBlock instanceof TL_iv.pageBlockParagraph;
        boolean z11 = (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6);
        if (str.charAt(0) == '#' && (z10 || z11)) {
            int i10 = 0;
            for (int i11 = 0; i11 < i9; i11++) {
                if (str.charAt(i11) != '#') {
                    return null;
                }
                i10++;
            }
            if (i10 < 1 || i10 > 6) {
                return null;
            }
            return new r5(v(i10), aVar.c, aVar.d);
        }
        if (!z10) {
            return null;
        }
        if (aVar.c == 0 && length == 2) {
            char charAt2 = str.charAt(0);
            if (charAt2 == '-' || charAt2 == '*' || charAt2 == '+') {
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                f(pageblockparagraph, "");
                return new r5(pageblockparagraph, 1, 0);
            }
            if (charAt2 == '|') {
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                return new r5(pageblockblockquote, 0, 0);
            }
        }
        if (aVar.c == 0 && length == 3 && str.charAt(0) == '[' && str.charAt(1) == ']') {
            return t(false);
        }
        if (aVar.c == 0 && length == 4 && str.charAt(0) == '[' && str.charAt(2) == ']') {
            char charAt3 = str.charAt(1);
            if (charAt3 == ' ') {
                return t(false);
            }
            if (charAt3 == 'x' || charAt3 == 'X') {
                return t(true);
            }
        }
        if (aVar.c == 0 && length == 3 && Character.isDigit(str.charAt(0)) && ((charAt = str.charAt(1)) == '.' || charAt == ')')) {
            TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
            f(pageblockparagraph2, "");
            return new r5(pageblockparagraph2, 1, 1);
        }
        if (aVar.c != 0 || length != 4) {
            return null;
        }
        char charAt4 = str.charAt(0);
        if ((charAt4 == '-' || charAt4 == '*' || charAt4 == '_') && str.charAt(1) == charAt4 && str.charAt(2) == charAt4) {
            return new r5(new TL_iv.pageBlockDivider(), 0, 0);
        }
        if (charAt4 == '`' && str.charAt(1) == '`' && str.charAt(2) == '`') {
            return new r5(new TL_iv.pageBlockPreformatted(), 0, 0);
        }
        return null;
    }

    public static r5 t(boolean z10) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        f(pageblockparagraph, "");
        return new r5(pageblockparagraph, 1, 0, true, z10);
    }

    public static TL_iv.pageBlockTable u(int i9, int i10) {
        TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
        pageblocktable.bordered = true;
        pageblocktable.striped = false;
        pageblocktable.title = new TL_iv.textEmpty();
        pageblocktable.rows = new ArrayList<>();
        for (int i11 = 0; i11 < i9; i11++) {
            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
            pagetablerow.cells = new ArrayList<>();
            for (int i12 = 0; i12 < i10; i12++) {
                pagetablerow.cells.add(w5.f());
            }
            pageblocktable.rows.add(pagetablerow);
        }
        return pageblocktable;
    }

    public static TL_iv.PageBlock v(int i9) {
        switch (i9) {
            case 1:
                return new TL_iv.pageBlockHeading1();
            case 2:
                return new TL_iv.pageBlockHeading2();
            case 3:
                return new TL_iv.pageBlockHeading3();
            case 4:
                return new TL_iv.pageBlockHeading4();
            case 5:
                return new TL_iv.pageBlockHeading5();
            case 6:
                return new TL_iv.pageBlockHeading6();
            default:
                return null;
        }
    }

    public static boolean y(d1 d1Var, int i9, int i10, int i11, int i12) {
        int lineForVertical;
        Layout layout = d1Var.getLayout();
        if (layout != null && d1Var.length() != 0) {
            int paddingLeft = i11 - (d1Var.getPaddingLeft() + i9);
            int paddingTop = i12 - (d1Var.getPaddingTop() + i10);
            if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical < layout.getLineCount()) {
                int dp = AndroidUtilities.dp(24.0f);
                int max = Math.max(0, (d1Var.getWidth() - d1Var.getPaddingLeft()) - d1Var.getPaddingRight());
                float f10 = dp;
                float max2 = Math.max(0.0f, layout.getLineLeft(lineForVertical) - f10);
                float min = Math.min(max, layout.getLineRight(lineForVertical) + f10);
                float f11 = paddingLeft;
                if (f11 >= max2 && f11 <= min) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String z(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return null;
        }
        return u5.l(pageBlock.text);
    }

    public final void B() {
        this.f.r();
    }

    public final void C() {
        Runnable runnable = this.C;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.C = null;
        }
        a aVar = this.x;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                e2 e2Var = new e2(this, 1);
                this.C = e2Var;
                postDelayed(e2Var, 100L);
                return;
            }
        }
        this.E++;
        Editable text = this.f.getText();
        if (text != null) {
            for (CodeHighlighting.ColorSpan colorSpan : (CodeHighlighting.ColorSpan[]) text.getSpans(0, text.length(), CodeHighlighting.ColorSpan.class)) {
                text.removeSpan(colorSpan);
            }
        }
        this.D = null;
    }

    public final void D(k0 k0Var) {
        if (this.y == null || this.x == null || k0Var == null) {
            return;
        }
        List<String> list = k0Var.c;
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            int q10 = q(str);
            if (q10 != 0) {
                ((x2) this.y).c(this.x, q10);
                return;
            }
            r5 r10 = r(str, this.x);
            if (r10 == null) {
                r10 = s(ta.b.j(str, " "), this.x);
            }
            if (r10 != null) {
                ((x2) this.y).d(this.x, r10.a, r10.b, r10.c, r10.d, r10.e);
                return;
            }
        }
    }

    public final void E(Editable editable) {
        a aVar = this.x;
        if (aVar != null && o3.C3(aVar.b) && e2.c.v(editable)) {
            d1 d1Var = this.f;
            Paint.FontMetricsInt fontMetricsInt = d1Var.getPaint().getFontMetricsInt();
            int max = Math.max(1, Math.round((d1Var.getTextSize() * 0.85f) / 1.2f));
            for (Emoji.EmojiSpan emojiSpan : (Emoji.EmojiSpan[]) editable.getSpans(0, editable.length(), Emoji.EmojiSpan.class)) {
                emojiSpan.scale = 0.85f;
            }
            for (org.telegram.ui.Components.t5 t5Var : (org.telegram.ui.Components.t5[]) editable.getSpans(0, editable.length(), org.telegram.ui.Components.t5.class)) {
                t5Var.replaceFontMetrics(fontMetricsInt);
                t5Var.setSize(max);
            }
        }
    }

    public final void F() {
        p5 p5Var;
        a aVar = this.x;
        if (aVar == null || aVar.c <= 0 || (p5Var = this.y) == null) {
            return;
        }
        int b10 = ((x2) p5Var).b(aVar);
        int a2 = ((x2) this.y).a(this.x);
        a aVar2 = this.x;
        if (aVar2.n) {
            b10 = aVar2.l <= 0 ? 0 : AndroidUtilities.dp(e2.c.e(r0, 1, 16, 10));
        }
        a aVar3 = this.x;
        if (aVar3.o) {
            a2 = aVar3.m <= 0 ? 0 : AndroidUtilities.dp(e2.c.e(r1, 1, 16, 10));
        }
        if (b10 == getPaddingTop() && a2 == getPaddingBottom()) {
            return;
        }
        setPadding(getPaddingLeft(), b10, getPaddingRight(), a2);
    }

    public final void G() {
        a aVar = this.x;
        d1 d1Var = this.f;
        d1 d1Var2 = this.h;
        if (aVar != null && p(aVar.b) && (d1Var.length() > 0 || d1Var2.length() > 0)) {
            if (d1Var2.getVisibility() != 0) {
                d1Var2.setVisibility(0);
                requestLayout();
                return;
            }
            return;
        }
        if (d1Var2.getVisibility() != 8) {
            if (d1Var2.isFocused()) {
                d1Var.requestFocus();
            }
            d1Var2.setVisibility(8);
            requestLayout();
        }
    }

    public final void H() {
        int i9;
        Layout layout;
        int lineStart;
        d1 d1Var = this.f;
        if (d1Var.getText() != null) {
            Editable text = d1Var.getText();
            int i10 = -1;
            if (!o() || !((TL_iv.pageBlockBlockquote) this.x.b).collapsed || (layout = d1Var.getLayout()) == null || layout.getLineCount() <= 3 || (lineStart = layout.getLineStart(3)) >= (i9 = text.length())) {
                i9 = -1;
            } else {
                i10 = lineStart;
            }
            if (i10 == this.M && i9 == this.N) {
                return;
            }
            this.O = true;
            try {
                ba0 ba0Var = this.L;
                if (ba0Var != null) {
                    text.removeSpan(ba0Var);
                }
                if (i10 >= 0) {
                    if (this.L == null) {
                        this.L = new ba0(2, this);
                    }
                    text.setSpan(this.L, i10, i9, 33);
                }
                this.O = false;
                this.M = i10;
                this.N = i9;
            } catch (Throwable th) {
                this.O = false;
                throw th;
            }
        }
    }

    public final void I(TL_iv.PageBlock pageBlock, boolean z10) {
        if (!(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
            LinearLayout linearLayout = this.s;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.s;
        if (linearLayout2 != null && z10) {
            AndroidUtilities.removeFromParent(linearLayout2);
            this.s = null;
        }
        LinearLayout linearLayout3 = this.s;
        b6 b6Var = this.a;
        if (linearLayout3 == null) {
            LinearLayout linearLayout4 = new LinearLayout(getContext());
            this.s = linearLayout4;
            linearLayout4.setOrientation(0);
            this.s.setBackground(f6.Y(f6.v0(f6.i6, b6Var), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f)));
            this.s.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
            addView(this.s, e6.d(-2, -2.0f, 53, 0.0f, -15.0f, -5.0f, 0.0f));
            TextView textView = new TextView(getContext());
            this.v = textView;
            textView.setTextSize(1, 12.0f);
            this.v.setGravity(17);
            this.s.addView(this.v, e6.t(-2, -2, 16, 0, 0, 0, 0));
            ImageView imageView = new ImageView(getContext());
            this.w = imageView;
            imageView.setImageResource(R.drawable.arrows_select);
            this.s.addView(this.w, e6.r(16, 16, 16, 0.0f, 0.66f, 0.0f, 0.0f));
            CodeHighlighting.prepare();
            this.s.setOnClickListener(new k5(this, 1));
            this.s.setOnLongClickListener(new m5());
        }
        String str = ((TL_iv.pageBlockPreformatted) pageBlock).language;
        int l1 = f6.l1(TextUtils.isEmpty(str) ? 0.5f : 0.75f, f6.v0(f6.G6, b6Var));
        this.w.setColorFilter(new PorterDuffColorFilter(l1, PorterDuff.Mode.SRC_IN));
        this.v.setTextColor(l1);
        if (TextUtils.isEmpty(str)) {
            this.v.setText(LocaleController.getString(R.string.ArticleHintLanguage));
        } else {
            this.v.setText(MessageObject.TextLayoutBlock.capitalizeLanguage(str));
        }
        this.s.setVisibility(0);
    }

    public final void J() {
        a aVar = this.x;
        boolean z10 = false;
        if (aVar != null && aVar.d > 0) {
            d1 d1Var = this.f;
            if (d1Var.length() > 0 && (d1Var.getCurrentStyle(0, 1) & 1) != 0) {
                z10 = true;
            }
        }
        this.d.setTypeface(z10 ? AndroidUtilities.bold() : null);
        a aVar2 = this.x;
        if (aVar2 == null || aVar2.d <= 0) {
            return;
        }
        c(aVar2);
    }

    public final void c(a aVar) {
        int z10;
        int i9;
        a aVar2;
        int i10;
        int i11 = aVar.c;
        yi0 yi0Var = this.e;
        View view = this.c;
        bh.e eVar = this.d;
        if (i11 <= 0) {
            view.setVisibility(8);
            eVar.setVisibility(8);
            yi0Var.setVisibility(8);
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = AndroidUtilities.dp(24.0f) * (i11 - 1);
        view.setLayoutParams(layoutParams);
        view.setVisibility(i11 > 1 ? 0 : 8);
        if (aVar.e) {
            eVar.setVisibility(8);
            yi0Var.setVisibility(0);
            ((CheckBoxBase) yi0Var.b).f(-1, aVar.f, false);
            return;
        }
        yi0Var.setVisibility(8);
        eVar.setVisibility(0);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) eVar.getLayoutParams();
        if (aVar.d == 0) {
            z10 = AndroidUtilities.dp(18.0f);
        } else {
            p5 p5Var = this.y;
            if (p5Var != null) {
                TextPaint paint = eVar.getPaint();
                ArrayList arrayList = ((x2) p5Var).a.h3;
                int indexOf = arrayList.indexOf(aVar);
                if (indexOf < 0 || (i9 = aVar.c) <= 0 || aVar.d <= 0) {
                    z10 = org.telegram.messenger.l0.z(10.0f, (int) Math.ceil(paint.measureText(aa.d.l(aVar.d, ".", new StringBuilder()))), AndroidUtilities.dp(28.0f));
                } else {
                    int i12 = indexOf;
                    while (i12 > 0) {
                        a aVar3 = (a) arrayList.get(i12 - 1);
                        int i13 = aVar3.c;
                        if (i13 < i9 || (i13 == i9 && aVar3.d <= 0)) {
                            break;
                        } else {
                            i12--;
                        }
                    }
                    int i14 = indexOf + 1;
                    while (i14 < arrayList.size() && (i10 = (aVar2 = (a) arrayList.get(i14)).c) >= i9 && (i10 != i9 || aVar2.d > 0)) {
                        i14++;
                    }
                    Paint paint2 = new Paint(paint);
                    paint2.setTypeface(AndroidUtilities.bold());
                    float f10 = 0.0f;
                    while (i12 < i14) {
                        a aVar4 = (a) arrayList.get(i12);
                        if (aVar4.c == i9 && aVar4.d > 0) {
                            f10 = Math.max(f10, paint2.measureText(aVar4.d + "."));
                        }
                        i12++;
                    }
                    z10 = org.telegram.messenger.l0.z(10.0f, (int) Math.ceil(f10), AndroidUtilities.dp(28.0f));
                }
            } else {
                int dp = AndroidUtilities.dp(28.0f);
                TextPaint paint3 = eVar.getPaint();
                z10 = org.telegram.messenger.l0.z(10.0f, (int) Math.ceil(paint3.measureText(aVar.d + ".")), dp);
            }
        }
        if (layoutParams2.width != z10) {
            layoutParams2.width = z10;
            eVar.setLayoutParams(layoutParams2);
        }
        eVar.setText(aVar.d == 0 ? "" : aa.d.l(aVar.d, ".", new StringBuilder()));
    }

    @Override // org.telegram.ui.ActionBar.w5
    public final void d() {
        this.f.t();
        d1 d1Var = this.h;
        if (d1Var != null) {
            d1Var.t();
        }
        int i9 = f6.G6;
        b6 b6Var = this.a;
        this.d.setTextColor(f6.v0(i9, b6Var));
        Drawable drawable = this.G;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(f6.v0(f6.Oh, b6Var), PorterDuff.Mode.SRC_IN));
        }
        dl0 dl0Var = this.F;
        if (dl0Var != null) {
            v6.a(dl0Var, b6Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        d1 d1Var;
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        int i9;
        a aVar = this.x;
        LinearLayout linearLayout = this.b;
        Paint paint = this.Q;
        b6 b6Var = this.a;
        d1 d1Var2 = this.f;
        if (aVar == null || !(aVar.b instanceof TL_iv.pageBlockPreformatted)) {
            d1Var = d1Var2;
            if (aVar == null || !(aVar.b instanceof TL_iv.pageBlockBlockquote)) {
                canvas2 = canvas;
                if (aVar != null && (aVar.b instanceof TL_iv.pageBlockPullquote)) {
                    if (this.F == null) {
                        dl0 dl0Var = new dl0(this);
                        this.F = dl0Var;
                        dl0Var.a(null, null, null, this.a, 1);
                        v6.a(this.F, b6Var);
                    }
                    if (this.G == null) {
                        Drawable mutate = getContext().getResources().getDrawable(R.drawable.mini_quote).mutate();
                        this.G = mutate;
                        mutate.setColorFilter(new PorterDuffColorFilter(f6.v0(f6.Oh, b6Var), PorterDuff.Mode.SRC_IN));
                    }
                    Layout layout = d1Var.getLayout();
                    float width = getWidth();
                    if (layout != null && !TextUtils.isEmpty(layout.getText())) {
                        f10 = 0.0f;
                        for (int i10 = 0; i10 < layout.getLineCount(); i10++) {
                            width = Math.min(width, layout.getLineLeft(i10) + d1Var.getPaddingLeft() + d1Var.getLeft() + linearLayout.getLeft());
                            f10 = Math.max(f10, layout.getLineRight(i10) + d1Var.getPaddingLeft() + d1Var.getLeft() + linearLayout.getLeft());
                        }
                    } else if (d1Var.getHint() != null) {
                        float measureText = d1Var.getPaint().measureText(d1Var.getHint().toString());
                        width = Math.min(width, ((getWidth() - measureText) / 2.0f) + AndroidUtilities.dp(2.0f));
                        f10 = Math.max(0.0f, ((getWidth() + measureText) / 2.0f) + AndroidUtilities.dp(2.0f));
                    } else {
                        f10 = 0.0f;
                    }
                    d1 d1Var3 = this.h;
                    if (d1Var3.getVisibility() == 0) {
                        Layout layout2 = d1Var3.getLayout();
                        if (layout2 != null && !TextUtils.isEmpty(layout2.getText())) {
                            for (int i11 = 0; i11 < layout2.getLineCount(); i11++) {
                                width = Math.min(width, layout2.getLineLeft(i11) + d1Var3.getPaddingLeft() + d1Var3.getLeft());
                                f10 = Math.max(f10, layout2.getLineRight(i11) + d1Var3.getPaddingLeft() + d1Var3.getLeft());
                            }
                        } else if (d1Var3.getHint() != null) {
                            float measureText2 = d1Var3.getPaint().measureText(d1Var3.getHint().toString());
                            width = Math.min(width, ((getWidth() - measureText2) / 2.0f) + AndroidUtilities.dp(2.0f));
                            f10 = Math.max(f10, ((getWidth() + measureText2) / 2.0f) + AndroidUtilities.dp(2.0f));
                        }
                    }
                    if (width < f10) {
                        float dp = width - AndroidUtilities.dp(30.0f);
                        float dp2 = AndroidUtilities.dp(30.0f) + f10;
                        float floor = (float) Math.floor(SharedConfig.bubbleRadius / 2.0f);
                        int dp3 = AndroidUtilities.dp(8.0f);
                        int height = getHeight() - AndroidUtilities.dp(8.0f);
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(dp, dp3, dp2, height);
                        this.F.b(canvas2, rectF, floor, floor, floor, 1.0f);
                        canvas2.save();
                        int i12 = (int) dp;
                        this.G.setBounds(AndroidUtilities.dp(8.0f) + i12, AndroidUtilities.dp(7.0f) + dp3, this.G.getIntrinsicWidth() + AndroidUtilities.dp(8.0f) + i12, this.G.getIntrinsicHeight() + AndroidUtilities.dp(7.0f) + dp3);
                        canvas2.scale(-1.0f, -1.0f, this.G.getBounds().centerX(), this.G.getBounds().centerY());
                        this.G.draw(canvas2);
                        canvas2.restore();
                        canvas2.save();
                        int i13 = (int) dp2;
                        this.G.setBounds((i13 - AndroidUtilities.dp(8.0f)) - this.G.getIntrinsicWidth(), (height - AndroidUtilities.dp(7.0f)) - this.G.getIntrinsicHeight(), i13 - AndroidUtilities.dp(8.0f), height - AndroidUtilities.dp(7.0f));
                        canvas2.scale(1.0f, -1.0f, this.G.getBounds().centerX(), this.G.getBounds().centerY());
                        this.G.draw(canvas2);
                        canvas2.restore();
                    }
                }
            } else {
                if (this.F == null) {
                    dl0 dl0Var2 = new dl0(this);
                    this.F = dl0Var2;
                    dl0Var2.a(null, null, null, this.a, 1);
                    v6.a(this.F, b6Var);
                }
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), getWidth() - AndroidUtilities.dp(16.0f), getHeight() - AndroidUtilities.dp(8.0f));
                float floor2 = (float) Math.floor(SharedConfig.bubbleRadius / 3.0f);
                canvas2 = canvas;
                this.F.b(canvas2, rectF2, floor2, floor2, floor2, 1.0f);
                this.F.e(canvas2, rectF2, 1.0f);
            }
        } else {
            paint.setColor(f6.v0(f6.xk, b6Var));
            int c10 = v6.c(this.x);
            int d = v6.d(this.x);
            int width2 = getWidth();
            if (c10 > 0 || d > 0) {
                int dp4 = AndroidUtilities.dp(16.0f) + c10;
                int dp5 = AndroidUtilities.dp(16.0f) + d;
                i9 = LocaleController.isRTL ? dp5 : dp4;
                int width3 = getWidth();
                if (!LocaleController.isRTL) {
                    dp4 = dp5;
                }
                width2 = width3 - dp4;
            } else {
                i9 = 0;
            }
            float dp6 = (i9 > 0 || width2 < getWidth()) ? AndroidUtilities.dp(8.0f) : 0;
            d1Var = d1Var2;
            canvas.drawRoundRect(i9, AndroidUtilities.dp(7.0f), width2, getHeight() - AndroidUtilities.dp(7.0f), dp6, dp6, paint);
            canvas2 = canvas;
        }
        if (this.P) {
            float width4 = getWidth();
            float height2 = getHeight();
            Layout layout3 = d1Var.getLayout();
            if (layout3 != null) {
                f11 = 0.0f;
                f12 = 0.0f;
                for (int i14 = 0; i14 < layout3.getLineCount(); i14++) {
                    height2 = Math.min(height2, layout3.getLineTop(i14) + d1Var.getPaddingTop() + getPaddingTop());
                    width4 = Math.min(width4, layout3.getLineLeft(i14) + d1Var.getPaddingLeft() + d1Var.getLeft() + linearLayout.getLeft());
                    f11 = Math.max(f11, layout3.getLineRight(i14) + d1Var.getPaddingLeft() + d1Var.getLeft() + linearLayout.getLeft());
                    f12 = Math.max(height2, layout3.getLineBottom(i14) + d1Var.getPaddingTop() + getPaddingTop());
                }
            } else {
                f11 = 0.0f;
                f12 = 0.0f;
            }
            if (width4 < f11 && height2 < f12) {
                float dp7 = width4 - AndroidUtilities.dp(4.0f);
                paint.setColor(f6.l1(0.05f, f6.v0(f6.G6, b6Var)));
                Canvas canvas3 = canvas2;
                canvas3.drawRoundRect(dp7, height2 - AndroidUtilities.dp(2.0f), f11 + AndroidUtilities.dp(4.0f), f12 + AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
                canvas2 = canvas3;
            }
        }
        p5 p5Var = this.y;
        n9 textSelectionHelper = p5Var != null ? ((x2) p5Var).a.getTextSelectionHelper() : null;
        if (textSelectionHelper != null) {
            ArrayList arrayList = this.r;
            arrayList.clear();
            fillTextLayoutBlocks(arrayList);
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                y9 y9Var = (y9) arrayList.get(i15);
                canvas2.save();
                canvas2.translate(y9Var.getX(), y9Var.getY());
                textSelectionHelper.a0(canvas2, this, i15);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (o()) {
            if (this.H == null) {
                this.H = new xh0(this);
            }
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) this.x.b;
            int v02 = f6.v0(f6.Oh, b6Var);
            int dp8 = AndroidUtilities.dp(3.333f);
            this.H.a(canvas2, this.I, org.telegram.messenger.l0.B(16.0f, getWidth(), dp8), org.telegram.messenger.l0.B(8.0f, getHeight(), dp8), v02, pageblockblockquote.collapsed, l());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (l() && this.H != null) {
            boolean contains = this.I.contains(motionEvent.getX(), motionEvent.getY());
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked == 3 && this.J) {
                            this.J = false;
                            this.H.b(false);
                            return true;
                        }
                    } else if (this.J) {
                        this.H.b(contains);
                        return true;
                    }
                } else if (this.J) {
                    this.J = false;
                    this.H.b(false);
                    if (contains && o()) {
                        ((TL_iv.pageBlockBlockquote) this.x.b).collapsed = !r6.collapsed;
                        H();
                        invalidate();
                        p5 p5Var = this.y;
                        if (p5Var != null) {
                            o3 o3Var = ((x2) p5Var).a;
                            b2 b2Var = o3Var.F3;
                            if (b2Var != null) {
                                b2Var.g();
                            }
                            o3Var.d3.onContentChanged();
                        }
                    }
                    return true;
                }
            } else if (contains) {
                this.J = true;
                this.H.b(true);
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Cells.m9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        Layout layout;
        d1 d1Var = this.f;
        Layout layout2 = d1Var.getLayout();
        if (layout2 != null) {
            LinearLayout linearLayout = this.b;
            arrayList.add(new u4(layout2, d1Var.getPaddingLeft() + d1Var.getLeft() + linearLayout.getLeft(), d1Var.getPaddingTop() + d1Var.getTop() + linearLayout.getTop(), 1));
        }
        d1 d1Var2 = this.h;
        if (d1Var2.getVisibility() != 0 || (layout = d1Var2.getLayout()) == null) {
            return;
        }
        arrayList.add(new u4(layout, d1Var2.getPaddingLeft() + d1Var2.getLeft(), d1Var2.getPaddingTop() + d1Var2.getTop(), 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0297  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(a aVar, p5 p5Var, boolean z10) {
        float f10;
        float f11;
        a aVar2;
        int c10;
        boolean z11;
        boolean p6;
        this.x = aVar;
        this.y = p5Var;
        this.A = z10;
        this.N = -1;
        this.M = -1;
        TL_iv.PageBlock pageBlock = aVar.b;
        d1 d1Var = this.f;
        d1Var.setBlock(pageBlock);
        TL_iv.PageBlock pageBlock2 = aVar.b;
        int i9 = SharedConfig.fontSize;
        d1Var.setCenterEmptyHint(false);
        d1Var.setHint(getHint());
        d1Var.setTextColorKey(f6.G6);
        d1Var.setLineSpacing(0.0f, 1.0f);
        if (pageBlock2 instanceof TL_iv.pageBlockPreformatted) {
            f10 = 8.0f;
            setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(31.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(19.0f));
            d1Var.setInputType(655505);
            d1Var.setAllowNewlines(true);
            d1Var.setSoftEnterNewline(false);
            d1Var.setGravity(8388659);
            d1Var.setTextSize(1, i9 - 1);
            d1Var.setTypeface(Typeface.MONOSPACE);
            d1Var.setLineSpacing(d1Var.getPaint().getFontSpacing() * 0.3f, 1.0f);
            d1Var.setAccentHint(false);
        } else {
            f10 = 8.0f;
            if (pageBlock2 instanceof TL_iv.pageBlockBlockquote) {
                d1Var.setInputType(147457);
                d1Var.setAllowNewlines(false);
                d1Var.setSoftEnterNewline(false);
                d1Var.setGravity(8388659);
                setPadding(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(16.0f));
                d1Var.setTextSize(1, Math.max(8, i9 - 2));
                d1Var.setTypeface(null);
                d1Var.setAccentHint(true);
            } else {
                if (!(pageBlock2 instanceof TL_iv.pageBlockPullquote)) {
                    d1Var.setInputType(147457);
                    d1Var.setAllowNewlines(false);
                    d1Var.setSoftEnterNewline(false);
                    d1Var.setGravity(8388659);
                    boolean z12 = pageBlock2 instanceof TL_iv.pageBlockHeading1;
                    boolean z13 = z12 || (pageBlock2 instanceof TL_iv.pageBlockHeading2) || (pageBlock2 instanceof TL_iv.pageBlockHeading3) || (pageBlock2 instanceof TL_iv.pageBlockHeading4) || (pageBlock2 instanceof TL_iv.pageBlockHeading5) || (pageBlock2 instanceof TL_iv.pageBlockHeading6);
                    f11 = 24.0f;
                    setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(z13 ? 11.0f : 5.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(z13 ? 7.0f : 4.66f));
                    a aVar3 = this.x;
                    if (aVar3 != null && aVar3.c > 0) {
                        int dp = AndroidUtilities.dp(16.0f);
                        p5 p5Var2 = this.y;
                        int b10 = p5Var2 != null ? ((x2) p5Var2).b(this.x) : AndroidUtilities.dp(8.0f);
                        int dp2 = AndroidUtilities.dp(16.0f);
                        p5 p5Var3 = this.y;
                        setPadding(dp, b10, dp2, p5Var3 != null ? ((x2) p5Var3).a(this.x) : AndroidUtilities.dp(11.0f));
                    }
                    if (z12) {
                        d1Var.setTextSize(1, i9 + 3);
                        d1Var.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading2) {
                        d1Var.setTextSize(1, i9 + 2);
                        d1Var.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading3) {
                        d1Var.setTextSize(1, i9 + 1);
                        d1Var.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading4) {
                        d1Var.setTextSize(1, i9);
                        d1Var.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading5) {
                        d1Var.setTextSize(1, i9 - 1);
                        d1Var.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading6) {
                        d1Var.setTextSize(1, i9 - 2);
                        d1Var.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockFooter) {
                        d1Var.setTextSize(1, i9 - 2);
                        d1Var.setTypeface(null);
                        d1Var.setTextColorKey(f6.Yc);
                    } else {
                        d1Var.setTextSize(1, (!(pageBlock2 instanceof TL_iv.pageBlockParagraph) || (aVar2 = this.x) == null || aVar2.k.isEmpty()) ? i9 : Math.max(8, i9 - 2));
                        d1Var.setTypeface(null);
                    }
                    d1Var.setAccentHint(false);
                    c10 = v6.c(aVar);
                    int d = v6.d(aVar);
                    if (c10 <= 0 || d > 0) {
                        z11 = aVar.b instanceof TL_iv.pageBlockPreformatted;
                        int paddingTop = getPaddingTop();
                        int paddingBottom = getPaddingBottom();
                        if (aVar.n) {
                            paddingTop = (aVar.l <= 0 ? 0 : AndroidUtilities.dp(e2.c.e(r7, 1, 16, 10))) + (z11 ? AndroidUtilities.dp(f11) : 0);
                        }
                        if (aVar.o) {
                            paddingBottom = aVar.m <= 0 ? 0 : AndroidUtilities.dp(e2.c.e(r8, 1, 16, 10));
                        }
                        if (z11) {
                            c10 += AndroidUtilities.dp(f10);
                            d += AndroidUtilities.dp(f10);
                        }
                        if (LocaleController.isRTL) {
                            setPadding(getPaddingLeft() + c10, paddingTop, getPaddingRight() + d, paddingBottom);
                        } else {
                            setPadding(getPaddingLeft() + d, paddingTop, getPaddingRight() + c10, paddingBottom);
                        }
                    }
                    c(aVar);
                    I(aVar.b, false);
                    if (!String.valueOf(d1Var.getText()).equals(z(aVar.b))) {
                        SpannableStringBuilder A = A(aVar.b);
                        if (o3.C3(aVar.b)) {
                            SpannableString spannableString = new SpannableString(A);
                            u5.o(spannableString, 0, spannableString.length(), 1, false, null);
                            u5.o(spannableString, 0, spannableString.length(), 2, false, null);
                            A = spannableString;
                        }
                        d1Var.setTextSilently(Emoji.replaceEmoji((CharSequence) A, d1Var.getPaint().getFontMetricsInt(), false, o3.C3(aVar.b) ? 0.85f : 1.0f));
                        E(d1Var.getText());
                        d1Var.invalidateEffects();
                        this.D = null;
                    }
                    E(d1Var.getText());
                    J();
                    TL_iv.PageBlock pageBlock3 = aVar.b;
                    p6 = p(pageBlock3);
                    d1 d1Var2 = this.h;
                    if (p6) {
                        d1Var2.setVisibility(8);
                    } else {
                        j(pageBlock3);
                        d1Var2.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
                        d1Var2.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                        d1Var2.setTextColorKey(f6.Oh);
                        d1Var2.setAccentHint(true);
                        d1Var2.setHint(LocaleController.getString(R.string.ArticleHintAuthor));
                        if (pageBlock3 instanceof TL_iv.pageBlockPullquote) {
                            d1Var2.setGravity(49);
                        } else {
                            d1Var2.setGravity(8388659);
                        }
                        if (!String.valueOf(d1Var2.getText()).equals(u5.l(k(pageBlock3)))) {
                            d1Var2.setTextSilently(Emoji.replaceEmoji(u5.r(k(pageBlock3), null, true), d1Var2.getPaint().getFontMetricsInt(), false));
                            d1Var2.invalidateEffects();
                        }
                        G();
                    }
                    C();
                }
                d1Var.setInputType(147457);
                d1Var.setAllowNewlines(false);
                d1Var.setSoftEnterNewline(true);
                d1Var.setGravity(49);
                d1Var.setCenterEmptyHint(true);
                setPadding(AndroidUtilities.dp(40.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(16.0f));
                d1Var.setTextSize(1, Math.max(8, i9 - 2));
                d1Var.setTypeface(AndroidUtilities.getTypeface("fonts/ritalic.ttf"));
                d1Var.setAccentHint(true);
            }
        }
        f11 = 24.0f;
        c10 = v6.c(aVar);
        int d9 = v6.d(aVar);
        if (c10 <= 0) {
        }
        z11 = aVar.b instanceof TL_iv.pageBlockPreformatted;
        int paddingTop2 = getPaddingTop();
        int paddingBottom2 = getPaddingBottom();
        if (aVar.n) {
        }
        if (aVar.o) {
        }
        if (z11) {
        }
        if (LocaleController.isRTL) {
        }
        c(aVar);
        I(aVar.b, false);
        if (!String.valueOf(d1Var.getText()).equals(z(aVar.b))) {
        }
        E(d1Var.getText());
        J();
        TL_iv.PageBlock pageBlock32 = aVar.b;
        p6 = p(pageBlock32);
        d1 d1Var22 = this.h;
        if (p6) {
        }
        C();
    }

    public d1 getAuthorEditText() {
        return this.h;
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public d1 getEditText() {
        return this.f;
    }

    public a getRow() {
        return this.x;
    }

    public org.telegram.ui.ActionBar.u4 getStyleDelegate() {
        return this.f;
    }

    public final int h(int i9, int i10) {
        Layout layout;
        if (l()) {
            d1 d1Var = this.h;
            if (d1Var.getVisibility() == 0 && (layout = d1Var.getLayout()) != null && layout.getLineCount() > 0) {
                if (this.H == null) {
                    this.H = new xh0(this);
                }
                int lineCount = layout.getLineCount() - 1;
                int measuredHeight = this.b.getMeasuredHeight() + getPaddingTop();
                float lineRight = layout.getLineRight(lineCount) + d1Var.getPaddingLeft() + getPaddingLeft();
                float lineTop = layout.getLineTop(lineCount) + d1Var.getPaddingTop() + measuredHeight;
                float lineBottom = layout.getLineBottom(lineCount) + d1Var.getPaddingTop() + measuredHeight;
                int dp = AndroidUtilities.dp(3.333f);
                float B = org.telegram.messenger.l0.B(16.0f, i9, dp);
                this.H.getClass();
                float D = B - org.telegram.messenger.l0.D(3.333f, 2, AndroidUtilities.dp(23.66f) + r6.c);
                this.H.getClass();
                int i11 = i10 - dp;
                float dp2 = i11 - AndroidUtilities.dp(17.66f);
                float f10 = i11;
                boolean z10 = lineRight > D;
                boolean z11 = lineBottom > dp2 && lineTop < f10;
                if (z10 && z11) {
                    return (int) Math.ceil(Math.max(0.0f, (((lineBottom + AndroidUtilities.dp(4.0f)) + r2) + dp) - i10));
                }
            }
        }
        return 0;
    }

    public final void i() {
        a aVar = this.x;
        if (aVar != null) {
            j(aVar.b);
        }
        d1 d1Var = this.h;
        if (d1Var.getVisibility() != 0) {
            d1Var.setVisibility(0);
            requestLayout();
        }
        d1Var.r();
        d1Var.setSelection(d1Var.length());
    }

    public final boolean l() {
        Layout layout;
        return o() && (layout = this.f.getLayout()) != null && layout.getLineCount() > 3;
    }

    public final boolean n() {
        return this.h.getVisibility() == 0;
    }

    public final boolean o() {
        a aVar = this.x;
        return aVar != null && (aVar.b instanceof TL_iv.pageBlockBlockquote);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        H();
        d1 d1Var = this.h;
        if (d1Var.getVisibility() == 8) {
            super.onLayout(z10, i9, i10, i11, i12);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        LinearLayout linearLayout = this.b;
        linearLayout.layout(paddingLeft, paddingTop, linearLayout.getMeasuredWidth() + paddingLeft, linearLayout.getMeasuredHeight() + paddingTop);
        int measuredHeight = linearLayout.getMeasuredHeight() + paddingTop;
        d1Var.layout(paddingLeft, measuredHeight, d1Var.getMeasuredWidth() + paddingLeft, d1Var.getMeasuredHeight() + measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        F();
        int size = View.MeasureSpec.getSize(i9);
        d1 d1Var = this.h;
        if (d1Var.getVisibility() == 8) {
            this.K = 0;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i10);
            return;
        }
        int max = Math.max(0, (size - getPaddingLeft()) - getPaddingRight());
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        LinearLayout linearLayout = this.b;
        linearLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        d1Var.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        int paddingBottom = getPaddingBottom() + d1Var.getMeasuredHeight() + linearLayout.getMeasuredHeight() + getPaddingTop();
        int h = h(size, paddingBottom);
        this.K = h;
        setMeasuredDimension(size, paddingBottom + h);
    }

    public void setLocked(boolean z10) {
        this.f.setLocked(z10);
        this.h.setLocked(z10);
    }

    public void setShowCommandBackground(boolean z10) {
        if (this.P == z10) {
            return;
        }
        this.P = z10;
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        xh0 xh0Var = this.H;
        if (xh0Var != null) {
            return drawable == xh0Var.b || drawable == xh0Var.e;
        }
        return false;
    }

    public final void w() {
        a aVar = this.x;
        if (aVar == null || !p(aVar.b)) {
            return;
        }
        TL_iv.PageBlock pageBlock = this.x.b;
        TL_iv.RichText f10 = u5.f(this.h.getText());
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            ((TL_iv.pageBlockBlockquote) pageBlock).caption = f10;
        } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            ((TL_iv.pageBlockPullquote) pageBlock).caption = f10;
        }
    }

    public final void x() {
        a aVar = this.x;
        if (aVar != null) {
            e(aVar.b, this.f.getText());
        }
    }
}
