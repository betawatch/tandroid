package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class qi0 extends org.telegram.ui.Components.il0 {
    public final Context c;
    public final /* synthetic */ si0 d;

    public qi0(si0 si0Var, Context context) {
        this.d = si0Var;
        this.c = context;
    }

    @Override // f2.p0
    public final void A(f2.n1 n1Var) {
        View view = n1Var.a;
        if (view instanceof org.telegram.ui.Cells.z4) {
            ((org.telegram.ui.Cells.z4) view).a();
        }
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        if (n1Var.f == 0) {
            return ((org.telegram.ui.Cells.z4) n1Var.a).getCurrentObject() instanceof TLObject;
        }
        return false;
    }

    @Override // f2.p0
    public final int h() {
        return this.d.M;
    }

    @Override // f2.p0
    public final int j(int i10) {
        si0 si0Var = this.d;
        if (si0Var.N.contains(Integer.valueOf(i10))) {
            return 1;
        }
        if (i10 == si0Var.D || i10 == si0Var.K) {
            return 2;
        }
        if (i10 == si0Var.G) {
            return 3;
        }
        if (i10 == si0Var.H) {
            return 4;
        }
        if (i10 == si0Var.J) {
            return 5;
        }
        if (i10 == si0Var.L) {
            return 6;
        }
        return i10 == si0Var.I ? 7 : 0;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        String str;
        String format;
        TLRPC.User user;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = n1Var.f;
        View view = n1Var.a;
        si0 si0Var = this.d;
        if (i15 == 0) {
            org.telegram.ui.Cells.z4 z4Var = (org.telegram.ui.Cells.z4) view;
            int i16 = si0Var.E;
            MessageObject messageObject = (i10 < i16 || i10 >= si0Var.F) ? null : (MessageObject) si0Var.x.get(i10 - i16);
            long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
            if (messageObject.isStory()) {
                TLObject user2 = DialogObject.isUserDialog(dialogId) ? si0Var.getMessagesController().getUser(Long.valueOf(dialogId)) : si0Var.getMessagesController().getChat(Long.valueOf(-dialogId));
                TL_stories.StoryViews storyViews = messageObject.storyItem.views;
                z4Var.b(user2, null, (storyViews == null || (i11 = storyViews.views_count) == 0) ? LocaleController.getString(R.string.NoViews) : LocaleController.formatPluralString("Views", i11, new Object[0]), i10 != si0Var.F - 1);
                TL_stories.StoryItem storyItem = messageObject.storyItem;
                t70 t70Var = new t70(10, this, messageObject);
                z4Var.r = storyItem;
                z4Var.a.setOnClickListener(t70Var);
                return;
            }
            z4Var.r = null;
            z4Var.a.setOnClickListener(null);
            if (DialogObject.isUserDialog(dialogId)) {
                user = si0Var.getMessagesController().getUser(Long.valueOf(dialogId));
                str = null;
            } else {
                TLRPC.Chat chat = si0Var.getMessagesController().getChat(Long.valueOf(-dialogId));
                if (!ChatObject.isChannel(chat) || chat.megagroup) {
                    int i17 = chat.participants_count;
                    if (i17 != 0) {
                        format = String.format("%1$s, %2$s", LocaleController.formatPluralString("Members", i17, new Object[0]), LocaleController.formatPluralString("Views", messageObject.messageOwner.views, new Object[0]));
                    } else {
                        str = null;
                        user = chat;
                    }
                } else {
                    format = LocaleController.formatPluralString("Views", messageObject.messageOwner.views, new Object[0]);
                }
                str = format;
                user = chat;
            }
            if (user != null) {
                z4Var.b(user, null, str, i10 != si0Var.F - 1);
                return;
            }
            return;
        }
        if (i15 == 1) {
            view.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(this.c, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7));
            return;
        }
        if (i15 == 2) {
            org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
            if (i10 == si0Var.K) {
                k4Var.setTopMargin(9);
                k4Var.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                k4Var.setText(LocaleController.formatString("StatisticOverview", R.string.StatisticOverview, new Object[0]));
                return;
            } else {
                k4Var.setTopMargin(11);
                k4Var.setPadding(0, 0, 0, 0);
                k4Var.setText(LocaleController.formatString("PublicShares", R.string.PublicShares, new Object[0]));
                return;
            }
        }
        if (i15 == 4) {
            d91 d91Var = (d91) view;
            d91Var.e(si0Var.r, false);
            d91Var.setLayoutParams(new f2.x0(-1, -2));
            return;
        }
        if (i15 != 5) {
            if (i15 != 7) {
                return;
            }
            d91 d91Var2 = (d91) view;
            d91Var2.e(si0Var.s, false);
            d91Var2.setLayoutParams(new f2.x0(-1, -2));
            return;
        }
        ri0 ri0Var = (ri0) view;
        TextView[] textViewArr = ri0Var.a;
        TextView[] textViewArr2 = ri0Var.b;
        si0 si0Var2 = ri0Var.c;
        q91 q91Var = si0Var2.a0;
        MessageObject messageObject2 = si0Var2.n;
        if (q91Var != null) {
            i13 = q91Var.d();
            i12 = q91Var.a();
            i14 = q91Var.c();
        } else {
            int i18 = messageObject2.isStory() ? messageObject2.storyItem.views.views_count : messageObject2.messageOwner.views;
            i12 = messageObject2.isStory() ? messageObject2.storyItem.views.forwards_count : messageObject2.messageOwner.forwards;
            if (messageObject2.isStory()) {
                int i19 = messageObject2.storyItem.views.reactions_count;
                i13 = i18;
                i14 = i19;
            } else if (messageObject2.messageOwner.reactions != null) {
                int i20 = 0;
                for (int i21 = 0; i21 < messageObject2.messageOwner.reactions.results.size(); i21++) {
                    i20 += messageObject2.messageOwner.reactions.results.get(i21).count;
                }
                i13 = i18;
                i14 = i20;
            } else {
                i13 = i18;
                i14 = 0;
            }
        }
        textViewArr[0].setText(AndroidUtilities.formatWholeNumber(i13, 0));
        textViewArr2[0].setText(LocaleController.getString(R.string.StatisticViews));
        textViewArr[1].setText(AndroidUtilities.formatWholeNumber(si0Var2.Q, 0));
        textViewArr2[1].setText(LocaleController.formatString("PublicShares", R.string.PublicShares, new Object[0]));
        textViewArr[2].setText(AndroidUtilities.formatWholeNumber(i14, 0));
        textViewArr2[2].setText(LocaleController.formatString("Reactions", R.string.Reactions, new Object[0]));
        TLRPC.ChatFull chatFull = si0Var2.a;
        if (chatFull != null && (chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && i14 == 0) {
            ((ViewGroup) textViewArr2[2].getParent()).setVisibility(8);
        }
        textViewArr[3].setText(AndroidUtilities.formatWholeNumber(Math.max(0, i12 - si0Var2.Q), 0));
        textViewArr2[3].setText(LocaleController.formatString("PrivateShares", R.string.PrivateShares, new Object[0]));
        ri0Var.a();
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    @Override // f2.p0
    public final f2.n1 x(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r12v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */
}
