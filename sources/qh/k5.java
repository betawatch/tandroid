package qh;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.x60;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s5 b;

    public /* synthetic */ k5(s5 s5Var, int i9) {
        this.a = i9;
        this.b = s5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Set<String> languages;
        switch (this.a) {
            case 0:
                s5 s5Var = this.b;
                a aVar = s5Var.x;
                if (aVar != null && aVar.e) {
                    boolean z10 = !aVar.f;
                    aVar.f = z10;
                    ((CheckBoxBase) s5Var.e.b).f(-1, z10, true);
                    p5 p5Var = s5Var.y;
                    if (p5Var != null) {
                        a aVar2 = s5Var.x;
                        boolean z11 = aVar2.f;
                        o3 o3Var = ((x2) p5Var).a;
                        aVar2.f = z11;
                        b2 b2Var = o3Var.F3;
                        if (b2Var != null) {
                            b2Var.d();
                            o3Var.F3.h();
                            break;
                        }
                    }
                }
                break;
            default:
                s5 s5Var2 = this.b;
                p5 p5Var2 = s5Var2.y;
                if (p5Var2 != null) {
                    a aVar3 = s5Var2.x;
                    o3 o3Var2 = ((x2) p5Var2).a;
                    if (aVar3 != null && (aVar3.b instanceof TL_iv.pageBlockPreformatted) && (languages = CodeHighlighting.getLanguages()) != null) {
                        ArrayList arrayList = new ArrayList(languages);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.b;
                        x60 J1 = o3Var2.d3.J1(view);
                        J1.W(f6.b0(AndroidUtilities.dp(3.0f), f6.v0(f6.d6, o3Var2.c3)));
                        J1.Z = true;
                        J1.X = AndroidUtilities.dp(350.0f);
                        J1.i(new i2(o3Var2, aVar3, 25), LocaleController.getString(R.string.ArticleNone), TextUtils.isEmpty(pageblockpreformatted.language));
                        if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                            J1.i(null, MessageObject.TextLayoutBlock.capitalizeLanguage(pageblockpreformatted.language), true);
                        }
                        J1.k();
                        int size = arrayList.size();
                        int i9 = 0;
                        while (i9 < size) {
                            Object obj = arrayList.get(i9);
                            i9++;
                            String str = (String) obj;
                            J1.i(new pf.a(o3Var2, aVar3, str, 10), MessageObject.TextLayoutBlock.capitalizeLanguage(str), TextUtils.equals(str, pageblockpreformatted.language));
                        }
                        J1.Z();
                        break;
                    }
                }
                break;
        }
    }
}
