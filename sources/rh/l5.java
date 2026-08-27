package rh;

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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.b70;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t5 b;

    public /* synthetic */ l5(t5 t5Var, int i10) {
        this.a = i10;
        this.b = t5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Set<String> languages;
        switch (this.a) {
            case 0:
                t5 t5Var = this.b;
                a aVar = t5Var.x;
                if (aVar != null && aVar.e) {
                    boolean z10 = !aVar.f;
                    aVar.f = z10;
                    ((CheckBoxBase) t5Var.e.b).f(-1, z10, true);
                    q5 q5Var = t5Var.y;
                    if (q5Var != null) {
                        a aVar2 = t5Var.x;
                        boolean z11 = aVar2.f;
                        p3 p3Var = ((y2) q5Var).a;
                        aVar2.f = z11;
                        b2 b2Var = p3Var.F3;
                        if (b2Var != null) {
                            b2Var.d();
                            p3Var.F3.h();
                            break;
                        }
                    }
                }
                break;
            default:
                t5 t5Var2 = this.b;
                q5 q5Var2 = t5Var2.y;
                if (q5Var2 != null) {
                    a aVar3 = t5Var2.x;
                    p3 p3Var2 = ((y2) q5Var2).a;
                    if (aVar3 != null && (aVar3.b instanceof TL_iv.pageBlockPreformatted) && (languages = CodeHighlighting.getLanguages()) != null) {
                        ArrayList arrayList = new ArrayList(languages);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.b;
                        b70 A1 = p3Var2.d3.A1(view);
                        A1.W(g6.b0(AndroidUtilities.dp(3.0f), g6.v0(g6.d6, p3Var2.c3)));
                        A1.Z = true;
                        A1.X = AndroidUtilities.dp(350.0f);
                        A1.i(new i2(p3Var2, aVar3, 25), LocaleController.getString(R.string.ArticleNone), TextUtils.isEmpty(pageblockpreformatted.language));
                        if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                            A1.i(null, MessageObject.TextLayoutBlock.capitalizeLanguage(pageblockpreformatted.language), true);
                        }
                        A1.k();
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            String str = (String) obj;
                            A1.i(new qf.a(p3Var2, aVar3, str, 10), MessageObject.TextLayoutBlock.capitalizeLanguage(str), TextUtils.equals(str, pageblockpreformatted.language));
                        }
                        A1.Z();
                        break;
                    }
                }
                break;
        }
    }
}
