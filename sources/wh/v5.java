package wh;

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
import java.util.ArrayList;
import java.util.List;
import k7.c6;
import k7.l8;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.x9;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.ti0;
import org.telegram.ui.Components.vt;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.nw0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class v5 extends FrameLayout implements b6, l9 {
    public static final /* synthetic */ int S = 0;
    public boolean B;
    public boolean C;
    public g2 D;
    public String E;
    public int F;
    public am0 G;
    public Drawable H;
    public ti0 I;
    public final RectF J;
    public boolean K;
    public int L;
    public wa0 M;
    public int N;
    public int O;
    public boolean P;
    public boolean Q;
    public final Paint R;
    public final g6 a;
    public final LinearLayout b;
    public final View c;
    public final fg.s0 d;
    public final nw0 e;
    public final e1 f;
    public final e1 h;
    public boolean n;
    public final ArrayList r;
    public LinearLayout s;
    public TextView v;
    public ImageView w;
    public a x;
    public s5 y;

    public v5(Context context, g6 g6Var) {
        super(context);
        this.r = new ArrayList();
        this.J = new RectF();
        this.N = -1;
        this.O = -1;
        this.R = new Paint(1);
        this.a = g6Var;
        setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.66f));
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(0);
        View view = new View(context);
        this.c = view;
        linearLayout.addView(view, new LinearLayout.LayoutParams(0, -2));
        fg.s0 s0Var = new fg.s0(this, context);
        this.d = s0Var;
        s0Var.setGravity(8388627);
        s0Var.setPaddingRelative(AndroidUtilities.dp(6.0f), 0, 0, 0);
        s0Var.setSingleLine(true);
        s0Var.setIncludeFontPadding(false);
        s0Var.setTextSize(1, 16.0f);
        linearLayout.addView(s0Var, c6.n(18, -2));
        nw0 nw0Var = new nw0(context, g6Var);
        this.e = nw0Var;
        nw0Var.setVisibility(8);
        nw0Var.setOnClickListener(new n5(this, 0));
        linearLayout.addView(nw0Var, c6.n(18, -2));
        e1 e1Var = new e1(context, g6Var);
        this.f = e1Var;
        e1Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        e1Var.setListener(new q5(this));
        final int i10 = 0;
        e1Var.setDelegate(new vt(this) { // from class: wh.o5
            public final /* synthetic */ v5 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.vt
            public final void b0() {
                switch (i10) {
                    case 0:
                        v5 v5Var = this.b;
                        if (!v5Var.P && v5Var.x != null) {
                            v5Var.J();
                            v5.d(v5Var.x.b, v5Var.f.getText());
                            s5 s5Var = v5Var.y;
                            if (s5Var != null) {
                                r3.N1(((a3) s5Var).a);
                                break;
                            }
                        }
                        break;
                    default:
                        v5 v5Var2 = this.b;
                        if (v5Var2.x != null) {
                            v5Var2.w();
                            s5 s5Var2 = v5Var2.y;
                            if (s5Var2 != null) {
                                r3.N1(((a3) s5Var2).a);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        e1Var.setOnFocusChangeListener(new dg.z(this, 7));
        linearLayout.addView(e1Var, c6.l(1.0f, 0, -2));
        addView(linearLayout, c6.e(-1, -2, 51));
        e1 e1Var2 = new e1(context, g6Var);
        this.h = e1Var2;
        e1Var2.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        e1Var2.setAllowNewlines(false);
        e1Var2.setInputType(147457);
        e1Var2.setListener(new r5(this));
        final int i11 = 1;
        e1Var2.setDelegate(new vt(this) { // from class: wh.o5
            public final /* synthetic */ v5 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.vt
            public final void b0() {
                switch (i11) {
                    case 0:
                        v5 v5Var = this.b;
                        if (!v5Var.P && v5Var.x != null) {
                            v5Var.J();
                            v5.d(v5Var.x.b, v5Var.f.getText());
                            s5 s5Var = v5Var.y;
                            if (s5Var != null) {
                                r3.N1(((a3) s5Var).a);
                                break;
                            }
                        }
                        break;
                    default:
                        v5 v5Var2 = this.b;
                        if (v5Var2.x != null) {
                            v5Var2.w();
                            s5 s5Var2 = v5Var2.y;
                            if (s5Var2 != null) {
                                r3.N1(((a3) s5Var2).a);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        e1Var2.setVisibility(8);
        addView(e1Var2, c6.e(-1, -2, 51));
        e();
    }

    public static SpannableStringBuilder A(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return null;
        }
        return x5.r(pageBlock.text, pageBlock, true);
    }

    public static void a(v5 v5Var, boolean z4) {
        s5 s5Var;
        v5Var.f.setHint(v5Var.getHint());
        if (z4 || (s5Var = v5Var.y) == null) {
            return;
        }
        ((a3) s5Var).a.e3.F(v5Var, null);
    }

    public static String b(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        if (str.charAt(0) != '/') {
            return null;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt == ' ' || charAt == '\n' || charAt == '\t') {
                return null;
            }
        }
        return str;
    }

    public static void d(TL_iv.PageBlock pageBlock, CharSequence charSequence) {
        pageBlock.text = x5.f(charSequence);
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

    public static boolean m(e1 e1Var, int i10, int i11, int i12, int i13) {
        return e1Var.length() == 0 && i12 >= i10 && i12 <= e1Var.getWidth() + i10 && i13 >= i11 && i13 <= e1Var.getHeight() + i11;
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

    public static u5 r(String str, a aVar) {
        int i10;
        int i11;
        char charAt;
        char charAt2;
        if (str == null || aVar == null) {
            return null;
        }
        String trim = str.trim();
        int i12 = 2;
        if (trim.length() == 3 && (((charAt2 = trim.charAt(0)) == '-' || charAt2 == '*' || charAt2 == '_') && trim.charAt(1) == charAt2 && trim.charAt(2) == charAt2)) {
            return new u5(new TL_iv.pageBlockDivider(), 0, 0);
        }
        String lowerCase = trim.toLowerCase();
        if (lowerCase.length() == 3 && lowerCase.charAt(0) == '/' && lowerCase.charAt(1) == 'h' && (charAt = lowerCase.charAt(2)) >= '1' && charAt <= '6') {
            return new u5(v(charAt - '0'), aVar.c, aVar.d);
        }
        if (lowerCase.equals("/code") || lowerCase.equals("/pre") || lowerCase.equals("/preformatted")) {
            return new u5(new TL_iv.pageBlockPreformatted(), 0, 0);
        }
        if (lowerCase.equals("/footer")) {
            return new u5(new TL_iv.pageBlockFooter(), 0, 0);
        }
        if (lowerCase.equals("/quote") || lowerCase.equals("/blockquote")) {
            TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
            pageblockblockquote.caption = new TL_iv.textEmpty();
            return new u5(pageblockblockquote, 0, 0);
        }
        if (lowerCase.equals("/pullquote")) {
            TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
            pageblockpullquote.caption = new TL_iv.textEmpty();
            return new u5(pageblockpullquote, 0, 0);
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
                    i11 = Math.max(1, Math.min(20, Integer.parseInt(trim2.substring(0, indexOf).trim())));
                } catch (NumberFormatException unused) {
                    i11 = 2;
                }
                try {
                    i10 = Math.max(1, Math.min(20, Integer.parseInt(trim2.substring(indexOf + 1).trim())));
                    i12 = i11;
                } catch (NumberFormatException unused2) {
                    i12 = i11;
                    i10 = 2;
                    return new u5(u(i12, i10), 0, 0);
                }
                return new u5(u(i12, i10), 0, 0);
            }
        }
        i10 = 2;
        return new u5(u(i12, i10), 0, 0);
    }

    public static u5 s(String str, a aVar) {
        int length;
        char charAt;
        if (aVar == null || str == null || (length = str.length()) < 2) {
            return null;
        }
        int i10 = length - 1;
        if (str.charAt(i10) != ' ') {
            return null;
        }
        TL_iv.PageBlock pageBlock = aVar.b;
        boolean z4 = pageBlock instanceof TL_iv.pageBlockParagraph;
        boolean z10 = (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6);
        if (str.charAt(0) == '#' && (z4 || z10)) {
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                if (str.charAt(i12) != '#') {
                    return null;
                }
                i11++;
            }
            if (i11 < 1 || i11 > 6) {
                return null;
            }
            return new u5(v(i11), aVar.c, aVar.d);
        }
        if (!z4) {
            return null;
        }
        if (aVar.c == 0 && length == 2) {
            char charAt2 = str.charAt(0);
            if (charAt2 == '-' || charAt2 == '*' || charAt2 == '+') {
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                f(pageblockparagraph, "");
                return new u5(pageblockparagraph, 1, 0);
            }
            if (charAt2 == '|') {
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                return new u5(pageblockblockquote, 0, 0);
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
            return new u5(pageblockparagraph2, 1, 1);
        }
        if (aVar.c != 0 || length != 4) {
            return null;
        }
        char charAt4 = str.charAt(0);
        if ((charAt4 == '-' || charAt4 == '*' || charAt4 == '_') && str.charAt(1) == charAt4 && str.charAt(2) == charAt4) {
            return new u5(new TL_iv.pageBlockDivider(), 0, 0);
        }
        if (charAt4 == '`' && str.charAt(1) == '`' && str.charAt(2) == '`') {
            return new u5(new TL_iv.pageBlockPreformatted(), 0, 0);
        }
        return null;
    }

    public static u5 t(boolean z4) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        f(pageblockparagraph, "");
        return new u5(pageblockparagraph, 1, 0, true, z4);
    }

    public static TL_iv.pageBlockTable u(int i10, int i11) {
        TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
        pageblocktable.bordered = true;
        pageblocktable.striped = false;
        pageblocktable.title = new TL_iv.textEmpty();
        pageblocktable.rows = new ArrayList<>();
        for (int i12 = 0; i12 < i10; i12++) {
            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
            pagetablerow.cells = new ArrayList<>();
            for (int i13 = 0; i13 < i11; i13++) {
                pagetablerow.cells.add(z5.f());
            }
            pageblocktable.rows.add(pagetablerow);
        }
        return pageblocktable;
    }

    public static TL_iv.PageBlock v(int i10) {
        switch (i10) {
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

    public static boolean y(e1 e1Var, int i10, int i11, int i12, int i13) {
        int lineForVertical;
        Layout layout = e1Var.getLayout();
        if (layout != null && e1Var.length() != 0) {
            int paddingLeft = i12 - (e1Var.getPaddingLeft() + i10);
            int paddingTop = i13 - (e1Var.getPaddingTop() + i11);
            if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical < layout.getLineCount()) {
                int dp = AndroidUtilities.dp(24.0f);
                int max = Math.max(0, (e1Var.getWidth() - e1Var.getPaddingLeft()) - e1Var.getPaddingRight());
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
        return x5.l(pageBlock.text);
    }

    public final void B() {
        this.f.r();
    }

    public final void C() {
        Runnable runnable = this.D;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.D = null;
        }
        a aVar = this.x;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                g2 g2Var = new g2(this, 1);
                this.D = g2Var;
                postDelayed(g2Var, 100L);
                return;
            }
        }
        this.F++;
        Editable text = this.f.getText();
        if (text != null) {
            for (CodeHighlighting.ColorSpan colorSpan : (CodeHighlighting.ColorSpan[]) text.getSpans(0, text.length(), CodeHighlighting.ColorSpan.class)) {
                text.removeSpan(colorSpan);
            }
        }
        this.E = null;
    }

    public final void D(l0 l0Var) {
        if (this.y == null || this.x == null || l0Var == null) {
            return;
        }
        List<String> list = l0Var.c;
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            int q10 = q(str);
            if (q10 != 0) {
                ((a3) this.y).c(this.x, q10);
                return;
            }
            u5 r10 = r(str, this.x);
            if (r10 == null) {
                r10 = s(w.c.e(str, " "), this.x);
            }
            if (r10 != null) {
                ((a3) this.y).d(this.x, r10.a, r10.b, r10.c, r10.d, r10.e);
                return;
            }
        }
    }

    public final void E(Editable editable) {
        a aVar = this.x;
        if (aVar != null && r3.B3(aVar.b) && e2.c.s(editable)) {
            e1 e1Var = this.f;
            Paint.FontMetricsInt fontMetricsInt = e1Var.getPaint().getFontMetricsInt();
            int max = Math.max(1, Math.round((e1Var.getTextSize() * 0.85f) / 1.2f));
            for (Emoji.EmojiSpan emojiSpan : (Emoji.EmojiSpan[]) editable.getSpans(0, editable.length(), Emoji.EmojiSpan.class)) {
                emojiSpan.scale = 0.85f;
            }
            for (org.telegram.ui.Components.u5 u5Var : (org.telegram.ui.Components.u5[]) editable.getSpans(0, editable.length(), org.telegram.ui.Components.u5.class)) {
                u5Var.replaceFontMetrics(fontMetricsInt);
                u5Var.setSize(max);
            }
        }
    }

    public final void F() {
        s5 s5Var;
        a aVar = this.x;
        if (aVar == null || aVar.c <= 0 || (s5Var = this.y) == null) {
            return;
        }
        int b10 = ((a3) s5Var).b(aVar);
        int a2 = ((a3) this.y).a(this.x);
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
        e1 e1Var = this.f;
        e1 e1Var2 = this.h;
        if (aVar != null && p(aVar.b) && (e1Var.length() > 0 || e1Var2.length() > 0)) {
            if (e1Var2.getVisibility() != 0) {
                e1Var2.setVisibility(0);
                requestLayout();
                return;
            }
            return;
        }
        if (e1Var2.getVisibility() != 8) {
            if (e1Var2.isFocused()) {
                e1Var.requestFocus();
            }
            e1Var2.setVisibility(8);
            requestLayout();
        }
    }

    public final void H() {
        int i10;
        Layout layout;
        int lineStart;
        e1 e1Var = this.f;
        if (e1Var.getText() != null) {
            Editable text = e1Var.getText();
            int i11 = -1;
            if (!o() || !((TL_iv.pageBlockBlockquote) this.x.b).collapsed || (layout = e1Var.getLayout()) == null || layout.getLineCount() <= 3 || (lineStart = layout.getLineStart(3)) >= (i10 = text.length())) {
                i10 = -1;
            } else {
                i11 = lineStart;
            }
            if (i11 == this.N && i10 == this.O) {
                return;
            }
            this.P = true;
            try {
                wa0 wa0Var = this.M;
                if (wa0Var != null) {
                    text.removeSpan(wa0Var);
                }
                if (i11 >= 0) {
                    if (this.M == null) {
                        this.M = new wa0(2, this);
                    }
                    text.setSpan(this.M, i11, i10, 33);
                }
                this.P = false;
                this.N = i11;
                this.O = i10;
            } catch (Throwable th2) {
                this.P = false;
                throw th2;
            }
        }
    }

    public final void I(TL_iv.PageBlock pageBlock, boolean z4) {
        if (!(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
            LinearLayout linearLayout = this.s;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.s;
        if (linearLayout2 != null && z4) {
            AndroidUtilities.removeFromParent(linearLayout2);
            this.s = null;
        }
        LinearLayout linearLayout3 = this.s;
        g6 g6Var = this.a;
        if (linearLayout3 == null) {
            LinearLayout linearLayout4 = new LinearLayout(getContext());
            this.s = linearLayout4;
            linearLayout4.setOrientation(0);
            this.s.setBackground(k6.Y(k6.v0(k6.i6, g6Var), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f)));
            this.s.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
            addView(this.s, c6.d(-2, -2.0f, 53, 0.0f, -15.0f, -5.0f, 0.0f));
            TextView textView = new TextView(getContext());
            this.v = textView;
            textView.setTextSize(1, 12.0f);
            this.v.setGravity(17);
            this.s.addView(this.v, c6.t(-2, -2, 16, 0, 0, 0, 0));
            ImageView imageView = new ImageView(getContext());
            this.w = imageView;
            imageView.setImageResource(R.drawable.arrows_select);
            this.s.addView(this.w, c6.r(16, 16, 16, 0.0f, 0.66f, 0.0f, 0.0f));
            CodeHighlighting.prepare();
            this.s.setOnClickListener(new n5(this, 1));
            this.s.setOnLongClickListener(new p5());
        }
        String str = ((TL_iv.pageBlockPreformatted) pageBlock).language;
        int l1 = k6.l1(TextUtils.isEmpty(str) ? 0.5f : 0.75f, k6.v0(k6.G6, g6Var));
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
        boolean z4 = false;
        if (aVar != null && aVar.d > 0) {
            e1 e1Var = this.f;
            if (e1Var.length() > 0 && (e1Var.getCurrentStyle(0, 1) & 1) != 0) {
                z4 = true;
            }
        }
        this.d.setTypeface(z4 ? AndroidUtilities.bold() : null);
        a aVar2 = this.x;
        if (aVar2 == null || aVar2.d <= 0) {
            return;
        }
        c(aVar2);
    }

    public final void c(a aVar) {
        int b10;
        int i10;
        a aVar2;
        int i11;
        int i12 = aVar.c;
        nw0 nw0Var = this.e;
        View view = this.c;
        fg.s0 s0Var = this.d;
        if (i12 <= 0) {
            view.setVisibility(8);
            s0Var.setVisibility(8);
            nw0Var.setVisibility(8);
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = AndroidUtilities.dp(24.0f) * (i12 - 1);
        view.setLayoutParams(layoutParams);
        view.setVisibility(i12 > 1 ? 0 : 8);
        if (aVar.e) {
            s0Var.setVisibility(8);
            nw0Var.setVisibility(0);
            ((CheckBoxBase) nw0Var.b).f(-1, aVar.f, false);
            return;
        }
        nw0Var.setVisibility(8);
        s0Var.setVisibility(0);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) s0Var.getLayoutParams();
        if (aVar.d == 0) {
            b10 = AndroidUtilities.dp(18.0f);
        } else {
            s5 s5Var = this.y;
            if (s5Var != null) {
                TextPaint paint = s0Var.getPaint();
                ArrayList arrayList = ((a3) s5Var).a.i3;
                int indexOf = arrayList.indexOf(aVar);
                if (indexOf < 0 || (i10 = aVar.c) <= 0 || aVar.d <= 0) {
                    b10 = org.telegram.messenger.y3.b(10.0f, (int) Math.ceil(paint.measureText(android.support.v4.media.a.m(aVar.d, ".", new StringBuilder()))), AndroidUtilities.dp(28.0f));
                } else {
                    int i13 = indexOf;
                    while (i13 > 0) {
                        a aVar3 = (a) arrayList.get(i13 - 1);
                        int i14 = aVar3.c;
                        if (i14 < i10 || (i14 == i10 && aVar3.d <= 0)) {
                            break;
                        } else {
                            i13--;
                        }
                    }
                    int i15 = indexOf + 1;
                    while (i15 < arrayList.size() && (i11 = (aVar2 = (a) arrayList.get(i15)).c) >= i10 && (i11 != i10 || aVar2.d > 0)) {
                        i15++;
                    }
                    Paint paint2 = new Paint(paint);
                    paint2.setTypeface(AndroidUtilities.bold());
                    float f10 = 0.0f;
                    while (i13 < i15) {
                        a aVar4 = (a) arrayList.get(i13);
                        if (aVar4.c == i10 && aVar4.d > 0) {
                            f10 = Math.max(f10, paint2.measureText(aVar4.d + "."));
                        }
                        i13++;
                    }
                    b10 = org.telegram.messenger.y3.b(10.0f, (int) Math.ceil(f10), AndroidUtilities.dp(28.0f));
                }
            } else {
                int dp = AndroidUtilities.dp(28.0f);
                TextPaint paint3 = s0Var.getPaint();
                b10 = org.telegram.messenger.y3.b(10.0f, (int) Math.ceil(paint3.measureText(aVar.d + ".")), dp);
            }
        }
        if (layoutParams2.width != b10) {
            layoutParams2.width = b10;
            s0Var.setLayoutParams(layoutParams2);
        }
        s0Var.setText(aVar.d == 0 ? "" : android.support.v4.media.a.m(aVar.d, ".", new StringBuilder()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        e1 e1Var;
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        int i10;
        a aVar = this.x;
        LinearLayout linearLayout = this.b;
        Paint paint = this.R;
        g6 g6Var = this.a;
        e1 e1Var2 = this.f;
        if (aVar == null || !(aVar.b instanceof TL_iv.pageBlockPreformatted)) {
            e1Var = e1Var2;
            if (aVar == null || !(aVar.b instanceof TL_iv.pageBlockBlockquote)) {
                canvas2 = canvas;
                if (aVar != null && (aVar.b instanceof TL_iv.pageBlockPullquote)) {
                    if (this.G == null) {
                        am0 am0Var = new am0(this);
                        this.G = am0Var;
                        am0Var.a(null, null, null, this.a, 1);
                        l8.a(this.G, g6Var);
                    }
                    if (this.H == null) {
                        Drawable mutate = getContext().getResources().getDrawable(R.drawable.mini_quote).mutate();
                        this.H = mutate;
                        mutate.setColorFilter(new PorterDuffColorFilter(k6.v0(k6.Oh, g6Var), PorterDuff.Mode.SRC_IN));
                    }
                    Layout layout = e1Var.getLayout();
                    float width = getWidth();
                    if (layout != null && !TextUtils.isEmpty(layout.getText())) {
                        f10 = 0.0f;
                        for (int i11 = 0; i11 < layout.getLineCount(); i11++) {
                            width = Math.min(width, layout.getLineLeft(i11) + e1Var.getPaddingLeft() + e1Var.getLeft() + linearLayout.getLeft());
                            f10 = Math.max(f10, layout.getLineRight(i11) + e1Var.getPaddingLeft() + e1Var.getLeft() + linearLayout.getLeft());
                        }
                    } else if (e1Var.getHint() != null) {
                        float measureText = e1Var.getPaint().measureText(e1Var.getHint().toString());
                        width = Math.min(width, ((getWidth() - measureText) / 2.0f) + AndroidUtilities.dp(2.0f));
                        f10 = Math.max(0.0f, ((getWidth() + measureText) / 2.0f) + AndroidUtilities.dp(2.0f));
                    } else {
                        f10 = 0.0f;
                    }
                    e1 e1Var3 = this.h;
                    if (e1Var3.getVisibility() == 0) {
                        Layout layout2 = e1Var3.getLayout();
                        if (layout2 != null && !TextUtils.isEmpty(layout2.getText())) {
                            for (int i12 = 0; i12 < layout2.getLineCount(); i12++) {
                                width = Math.min(width, layout2.getLineLeft(i12) + e1Var3.getPaddingLeft() + e1Var3.getLeft());
                                f10 = Math.max(f10, layout2.getLineRight(i12) + e1Var3.getPaddingLeft() + e1Var3.getLeft());
                            }
                        } else if (e1Var3.getHint() != null) {
                            float measureText2 = e1Var3.getPaint().measureText(e1Var3.getHint().toString());
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
                        this.G.b(canvas2, rectF, floor, floor, floor, 1.0f);
                        canvas2.save();
                        int i13 = (int) dp;
                        this.H.setBounds(AndroidUtilities.dp(8.0f) + i13, AndroidUtilities.dp(7.0f) + dp3, this.H.getIntrinsicWidth() + AndroidUtilities.dp(8.0f) + i13, this.H.getIntrinsicHeight() + AndroidUtilities.dp(7.0f) + dp3);
                        canvas2.scale(-1.0f, -1.0f, this.H.getBounds().centerX(), this.H.getBounds().centerY());
                        this.H.draw(canvas2);
                        canvas2.restore();
                        canvas2.save();
                        int i14 = (int) dp2;
                        this.H.setBounds((i14 - AndroidUtilities.dp(8.0f)) - this.H.getIntrinsicWidth(), (height - AndroidUtilities.dp(7.0f)) - this.H.getIntrinsicHeight(), i14 - AndroidUtilities.dp(8.0f), height - AndroidUtilities.dp(7.0f));
                        canvas2.scale(1.0f, -1.0f, this.H.getBounds().centerX(), this.H.getBounds().centerY());
                        this.H.draw(canvas2);
                        canvas2.restore();
                    }
                }
            } else {
                if (this.G == null) {
                    am0 am0Var2 = new am0(this);
                    this.G = am0Var2;
                    am0Var2.a(null, null, null, this.a, 1);
                    l8.a(this.G, g6Var);
                }
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), getWidth() - AndroidUtilities.dp(16.0f), getHeight() - AndroidUtilities.dp(8.0f));
                float floor2 = (float) Math.floor(SharedConfig.bubbleRadius / 3.0f);
                canvas2 = canvas;
                this.G.b(canvas2, rectF2, floor2, floor2, floor2, 1.0f);
                this.G.e(canvas2, rectF2, 1.0f);
            }
        } else {
            paint.setColor(k6.v0(k6.xk, g6Var));
            int c3 = l8.c(this.x);
            int d = l8.d(this.x);
            int width2 = getWidth();
            if (c3 > 0 || d > 0) {
                int dp4 = AndroidUtilities.dp(16.0f) + c3;
                int dp5 = AndroidUtilities.dp(16.0f) + d;
                i10 = LocaleController.isRTL ? dp5 : dp4;
                int width3 = getWidth();
                if (!LocaleController.isRTL) {
                    dp4 = dp5;
                }
                width2 = width3 - dp4;
            } else {
                i10 = 0;
            }
            float dp6 = (i10 > 0 || width2 < getWidth()) ? AndroidUtilities.dp(8.0f) : 0;
            e1Var = e1Var2;
            canvas.drawRoundRect(i10, AndroidUtilities.dp(7.0f), width2, getHeight() - AndroidUtilities.dp(7.0f), dp6, dp6, paint);
            canvas2 = canvas;
        }
        if (this.Q) {
            float width4 = getWidth();
            float height2 = getHeight();
            Layout layout3 = e1Var.getLayout();
            if (layout3 != null) {
                f11 = 0.0f;
                f12 = 0.0f;
                for (int i15 = 0; i15 < layout3.getLineCount(); i15++) {
                    height2 = Math.min(height2, layout3.getLineTop(i15) + e1Var.getPaddingTop() + getPaddingTop());
                    width4 = Math.min(width4, layout3.getLineLeft(i15) + e1Var.getPaddingLeft() + e1Var.getLeft() + linearLayout.getLeft());
                    f11 = Math.max(f11, layout3.getLineRight(i15) + e1Var.getPaddingLeft() + e1Var.getLeft() + linearLayout.getLeft());
                    f12 = Math.max(height2, layout3.getLineBottom(i15) + e1Var.getPaddingTop() + getPaddingTop());
                }
            } else {
                f11 = 0.0f;
                f12 = 0.0f;
            }
            if (width4 < f11 && height2 < f12) {
                float dp7 = width4 - AndroidUtilities.dp(4.0f);
                paint.setColor(k6.l1(0.05f, k6.v0(k6.G6, g6Var)));
                Canvas canvas3 = canvas2;
                canvas3.drawRoundRect(dp7, height2 - AndroidUtilities.dp(2.0f), f11 + AndroidUtilities.dp(4.0f), f12 + AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
                canvas2 = canvas3;
            }
        }
        s5 s5Var = this.y;
        m9 textSelectionHelper = s5Var != null ? ((a3) s5Var).a.getTextSelectionHelper() : null;
        if (textSelectionHelper != null) {
            ArrayList arrayList = this.r;
            arrayList.clear();
            fillTextLayoutBlocks(arrayList);
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                x9 x9Var = (x9) arrayList.get(i16);
                canvas2.save();
                canvas2.translate(x9Var.getX(), x9Var.getY());
                textSelectionHelper.a0(canvas2, this, i16);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (o()) {
            if (this.I == null) {
                this.I = new ti0(this);
            }
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) this.x.b;
            int v02 = k6.v0(k6.Oh, g6Var);
            int dp8 = AndroidUtilities.dp(3.333f);
            this.I.a(canvas2, this.J, org.telegram.messenger.y3.B(16.0f, getWidth(), dp8), org.telegram.messenger.y3.B(8.0f, getHeight(), dp8), v02, pageblockblockquote.collapsed, l());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (l() && this.I != null) {
            boolean contains = this.J.contains(motionEvent.getX(), motionEvent.getY());
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked == 3 && this.K) {
                            this.K = false;
                            this.I.b(false);
                            return true;
                        }
                    } else if (this.K) {
                        this.I.b(contains);
                        return true;
                    }
                } else if (this.K) {
                    this.K = false;
                    this.I.b(false);
                    if (contains && o()) {
                        ((TL_iv.pageBlockBlockquote) this.x.b).collapsed = !r6.collapsed;
                        H();
                        invalidate();
                        s5 s5Var = this.y;
                        if (s5Var != null) {
                            r3 r3Var = ((a3) s5Var).a;
                            d2 d2Var = r3Var.G3;
                            if (d2Var != null) {
                                d2Var.g();
                            }
                            r3Var.e3.onContentChanged();
                        }
                    }
                    return true;
                }
            } else if (contains) {
                this.K = true;
                this.I.b(true);
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void e() {
        this.f.t();
        e1 e1Var = this.h;
        if (e1Var != null) {
            e1Var.t();
        }
        int i10 = k6.G6;
        g6 g6Var = this.a;
        this.d.setTextColor(k6.v0(i10, g6Var));
        Drawable drawable = this.H;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(k6.v0(k6.Oh, g6Var), PorterDuff.Mode.SRC_IN));
        }
        am0 am0Var = this.G;
        if (am0Var != null) {
            l8.a(am0Var, g6Var);
        }
    }

    @Override // org.telegram.ui.Cells.l9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        Layout layout;
        e1 e1Var = this.f;
        Layout layout2 = e1Var.getLayout();
        if (layout2 != null) {
            LinearLayout linearLayout = this.b;
            arrayList.add(new x4(layout2, e1Var.getPaddingLeft() + e1Var.getLeft() + linearLayout.getLeft(), e1Var.getPaddingTop() + e1Var.getTop() + linearLayout.getTop(), 1));
        }
        e1 e1Var2 = this.h;
        if (e1Var2.getVisibility() != 0 || (layout = e1Var2.getLayout()) == null) {
            return;
        }
        arrayList.add(new x4(layout, e1Var2.getPaddingLeft() + e1Var2.getLeft(), e1Var2.getPaddingTop() + e1Var2.getTop(), 2));
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
    public final void g(a aVar, s5 s5Var, boolean z4) {
        float f10;
        float f11;
        a aVar2;
        int c3;
        boolean z10;
        boolean p10;
        this.x = aVar;
        this.y = s5Var;
        this.B = z4;
        this.O = -1;
        this.N = -1;
        TL_iv.PageBlock pageBlock = aVar.b;
        e1 e1Var = this.f;
        e1Var.setBlock(pageBlock);
        TL_iv.PageBlock pageBlock2 = aVar.b;
        int i10 = SharedConfig.fontSize;
        e1Var.setCenterEmptyHint(false);
        e1Var.setHint(getHint());
        e1Var.setTextColorKey(k6.G6);
        e1Var.setLineSpacing(0.0f, 1.0f);
        if (pageBlock2 instanceof TL_iv.pageBlockPreformatted) {
            f10 = 8.0f;
            setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(31.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(19.0f));
            e1Var.setInputType(655505);
            e1Var.setAllowNewlines(true);
            e1Var.setSoftEnterNewline(false);
            e1Var.setGravity(8388659);
            e1Var.setTextSize(1, i10 - 1);
            e1Var.setTypeface(Typeface.MONOSPACE);
            e1Var.setLineSpacing(e1Var.getPaint().getFontSpacing() * 0.3f, 1.0f);
            e1Var.setAccentHint(false);
        } else {
            f10 = 8.0f;
            if (pageBlock2 instanceof TL_iv.pageBlockBlockquote) {
                e1Var.setInputType(147457);
                e1Var.setAllowNewlines(false);
                e1Var.setSoftEnterNewline(false);
                e1Var.setGravity(8388659);
                setPadding(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(16.0f));
                e1Var.setTextSize(1, Math.max(8, i10 - 2));
                e1Var.setTypeface(null);
                e1Var.setAccentHint(true);
            } else {
                if (!(pageBlock2 instanceof TL_iv.pageBlockPullquote)) {
                    e1Var.setInputType(147457);
                    e1Var.setAllowNewlines(false);
                    e1Var.setSoftEnterNewline(false);
                    e1Var.setGravity(8388659);
                    boolean z11 = pageBlock2 instanceof TL_iv.pageBlockHeading1;
                    boolean z12 = z11 || (pageBlock2 instanceof TL_iv.pageBlockHeading2) || (pageBlock2 instanceof TL_iv.pageBlockHeading3) || (pageBlock2 instanceof TL_iv.pageBlockHeading4) || (pageBlock2 instanceof TL_iv.pageBlockHeading5) || (pageBlock2 instanceof TL_iv.pageBlockHeading6);
                    f11 = 24.0f;
                    setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(z12 ? 11.0f : 5.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(z12 ? 7.0f : 4.66f));
                    a aVar3 = this.x;
                    if (aVar3 != null && aVar3.c > 0) {
                        int dp = AndroidUtilities.dp(16.0f);
                        s5 s5Var2 = this.y;
                        int b10 = s5Var2 != null ? ((a3) s5Var2).b(this.x) : AndroidUtilities.dp(8.0f);
                        int dp2 = AndroidUtilities.dp(16.0f);
                        s5 s5Var3 = this.y;
                        setPadding(dp, b10, dp2, s5Var3 != null ? ((a3) s5Var3).a(this.x) : AndroidUtilities.dp(11.0f));
                    }
                    if (z11) {
                        e1Var.setTextSize(1, i10 + 3);
                        e1Var.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading2) {
                        e1Var.setTextSize(1, i10 + 2);
                        e1Var.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading3) {
                        e1Var.setTextSize(1, i10 + 1);
                        e1Var.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading4) {
                        e1Var.setTextSize(1, i10);
                        e1Var.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading5) {
                        e1Var.setTextSize(1, i10 - 1);
                        e1Var.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading6) {
                        e1Var.setTextSize(1, i10 - 2);
                        e1Var.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockFooter) {
                        e1Var.setTextSize(1, i10 - 2);
                        e1Var.setTypeface(null);
                        e1Var.setTextColorKey(k6.Yc);
                    } else {
                        e1Var.setTextSize(1, (!(pageBlock2 instanceof TL_iv.pageBlockParagraph) || (aVar2 = this.x) == null || aVar2.k.isEmpty()) ? i10 : Math.max(8, i10 - 2));
                        e1Var.setTypeface(null);
                    }
                    e1Var.setAccentHint(false);
                    c3 = l8.c(aVar);
                    int d = l8.d(aVar);
                    if (c3 <= 0 || d > 0) {
                        z10 = aVar.b instanceof TL_iv.pageBlockPreformatted;
                        int paddingTop = getPaddingTop();
                        int paddingBottom = getPaddingBottom();
                        if (aVar.n) {
                            paddingTop = (aVar.l <= 0 ? 0 : AndroidUtilities.dp(e2.c.e(r7, 1, 16, 10))) + (z10 ? AndroidUtilities.dp(f11) : 0);
                        }
                        if (aVar.o) {
                            paddingBottom = aVar.m <= 0 ? 0 : AndroidUtilities.dp(e2.c.e(r8, 1, 16, 10));
                        }
                        if (z10) {
                            c3 += AndroidUtilities.dp(f10);
                            d += AndroidUtilities.dp(f10);
                        }
                        if (LocaleController.isRTL) {
                            setPadding(getPaddingLeft() + c3, paddingTop, getPaddingRight() + d, paddingBottom);
                        } else {
                            setPadding(getPaddingLeft() + d, paddingTop, getPaddingRight() + c3, paddingBottom);
                        }
                    }
                    c(aVar);
                    I(aVar.b, false);
                    if (!String.valueOf(e1Var.getText()).equals(z(aVar.b))) {
                        SpannableStringBuilder A = A(aVar.b);
                        if (r3.B3(aVar.b)) {
                            SpannableString spannableString = new SpannableString(A);
                            x5.o(spannableString, 0, spannableString.length(), 1, false, null);
                            x5.o(spannableString, 0, spannableString.length(), 2, false, null);
                            A = spannableString;
                        }
                        e1Var.setTextSilently(Emoji.replaceEmoji((CharSequence) A, e1Var.getPaint().getFontMetricsInt(), false, r3.B3(aVar.b) ? 0.85f : 1.0f));
                        E(e1Var.getText());
                        e1Var.invalidateEffects();
                        this.E = null;
                    }
                    E(e1Var.getText());
                    J();
                    TL_iv.PageBlock pageBlock3 = aVar.b;
                    p10 = p(pageBlock3);
                    e1 e1Var2 = this.h;
                    if (p10) {
                        e1Var2.setVisibility(8);
                    } else {
                        j(pageBlock3);
                        e1Var2.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
                        e1Var2.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                        e1Var2.setTextColorKey(k6.Oh);
                        e1Var2.setAccentHint(true);
                        e1Var2.setHint(LocaleController.getString(R.string.ArticleHintAuthor));
                        if (pageBlock3 instanceof TL_iv.pageBlockPullquote) {
                            e1Var2.setGravity(49);
                        } else {
                            e1Var2.setGravity(8388659);
                        }
                        if (!String.valueOf(e1Var2.getText()).equals(x5.l(k(pageBlock3)))) {
                            e1Var2.setTextSilently(Emoji.replaceEmoji(x5.r(k(pageBlock3), null, true), e1Var2.getPaint().getFontMetricsInt(), false));
                            e1Var2.invalidateEffects();
                        }
                        G();
                    }
                    C();
                }
                e1Var.setInputType(147457);
                e1Var.setAllowNewlines(false);
                e1Var.setSoftEnterNewline(true);
                e1Var.setGravity(49);
                e1Var.setCenterEmptyHint(true);
                setPadding(AndroidUtilities.dp(40.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(16.0f));
                e1Var.setTextSize(1, Math.max(8, i10 - 2));
                e1Var.setTypeface(AndroidUtilities.getTypeface("fonts/ritalic.ttf"));
                e1Var.setAccentHint(true);
            }
        }
        f11 = 24.0f;
        c3 = l8.c(aVar);
        int d10 = l8.d(aVar);
        if (c3 <= 0) {
        }
        z10 = aVar.b instanceof TL_iv.pageBlockPreformatted;
        int paddingTop2 = getPaddingTop();
        int paddingBottom2 = getPaddingBottom();
        if (aVar.n) {
        }
        if (aVar.o) {
        }
        if (z10) {
        }
        if (LocaleController.isRTL) {
        }
        c(aVar);
        I(aVar.b, false);
        if (!String.valueOf(e1Var.getText()).equals(z(aVar.b))) {
        }
        E(e1Var.getText());
        J();
        TL_iv.PageBlock pageBlock32 = aVar.b;
        p10 = p(pageBlock32);
        e1 e1Var22 = this.h;
        if (p10) {
        }
        C();
    }

    public e1 getAuthorEditText() {
        return this.h;
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public e1 getEditText() {
        return this.f;
    }

    public a getRow() {
        return this.x;
    }

    public org.telegram.ui.ActionBar.y4 getStyleDelegate() {
        return this.f;
    }

    public final int h(int i10, int i11) {
        Layout layout;
        if (l()) {
            e1 e1Var = this.h;
            if (e1Var.getVisibility() == 0 && (layout = e1Var.getLayout()) != null && layout.getLineCount() > 0) {
                if (this.I == null) {
                    this.I = new ti0(this);
                }
                int lineCount = layout.getLineCount() - 1;
                int measuredHeight = this.b.getMeasuredHeight() + getPaddingTop();
                float lineRight = layout.getLineRight(lineCount) + e1Var.getPaddingLeft() + getPaddingLeft();
                float lineTop = layout.getLineTop(lineCount) + e1Var.getPaddingTop() + measuredHeight;
                float lineBottom = layout.getLineBottom(lineCount) + e1Var.getPaddingTop() + measuredHeight;
                int dp = AndroidUtilities.dp(3.333f);
                float B = org.telegram.messenger.y3.B(16.0f, i10, dp);
                this.I.getClass();
                float D = B - org.telegram.messenger.y3.D(3.333f, 2, AndroidUtilities.dp(23.66f) + r6.c);
                this.I.getClass();
                int i12 = i11 - dp;
                float dp2 = i12 - AndroidUtilities.dp(17.66f);
                float f10 = i12;
                boolean z4 = lineRight > D;
                boolean z10 = lineBottom > dp2 && lineTop < f10;
                if (z4 && z10) {
                    return (int) Math.ceil(Math.max(0.0f, (((lineBottom + AndroidUtilities.dp(4.0f)) + r2) + dp) - i11));
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
        e1 e1Var = this.h;
        if (e1Var.getVisibility() != 0) {
            e1Var.setVisibility(0);
            requestLayout();
        }
        e1Var.r();
        e1Var.setSelection(e1Var.length());
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
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        H();
        e1 e1Var = this.h;
        if (e1Var.getVisibility() == 8) {
            super.onLayout(z4, i10, i11, i12, i13);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        LinearLayout linearLayout = this.b;
        linearLayout.layout(paddingLeft, paddingTop, linearLayout.getMeasuredWidth() + paddingLeft, linearLayout.getMeasuredHeight() + paddingTop);
        int measuredHeight = linearLayout.getMeasuredHeight() + paddingTop;
        e1Var.layout(paddingLeft, measuredHeight, e1Var.getMeasuredWidth() + paddingLeft, e1Var.getMeasuredHeight() + measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        F();
        int size = View.MeasureSpec.getSize(i10);
        e1 e1Var = this.h;
        if (e1Var.getVisibility() == 8) {
            this.L = 0;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i11);
            return;
        }
        int max = Math.max(0, (size - getPaddingLeft()) - getPaddingRight());
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        LinearLayout linearLayout = this.b;
        linearLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        e1Var.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        int paddingBottom = getPaddingBottom() + e1Var.getMeasuredHeight() + linearLayout.getMeasuredHeight() + getPaddingTop();
        int h = h(size, paddingBottom);
        this.L = h;
        setMeasuredDimension(size, paddingBottom + h);
    }

    public void setLocked(boolean z4) {
        this.f.setLocked(z4);
        this.h.setLocked(z4);
    }

    public void setShowCommandBackground(boolean z4) {
        if (this.Q == z4) {
            return;
        }
        this.Q = z4;
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        ti0 ti0Var = this.I;
        if (ti0Var != null) {
            return drawable == ti0Var.b || drawable == ti0Var.e;
        }
        return false;
    }

    public final void w() {
        a aVar = this.x;
        if (aVar == null || !p(aVar.b)) {
            return;
        }
        TL_iv.PageBlock pageBlock = this.x.b;
        TL_iv.RichText f10 = x5.f(this.h.getText());
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            ((TL_iv.pageBlockBlockquote) pageBlock).caption = f10;
        } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            ((TL_iv.pageBlockPullquote) pageBlock).caption = f10;
        }
    }

    public final void x() {
        a aVar = this.x;
        if (aVar != null) {
            d(aVar.b, this.f.getText());
        }
    }
}
