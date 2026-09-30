/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import java.awt.Image;
import java.time.LocalDate;
import javax.swing.ImageIcon;

/**
 * 
 * @author ArthurGiuvannucci
 */
public class Signos extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Signos.class.getName());

    /**
     * Creates new form Signos
     */
    public Signos() {
        initComponents();
        //RedimencionarImagens (); //serve para redimencionar imagens que ficaram estouradas
    }
//TODA FUNÇÃO É CRIADA ABAIXO DO CONTRUTOR 
    public void RedimencionarImagens (){
   //capturar as imagens dentro da lebael 
    ImageIcon aries = (ImageIcon) imgSignoAries.getIcon();
    ImageIcon aquario = (ImageIcon) imgSignoAquario.getIcon();
    ImageIcon cancer = (ImageIcon) imgSignoCancer.getIcon();
    ImageIcon escorpiao = (ImageIcon) imgSignoEscorpiao.getIcon();
    ImageIcon gemeos = (ImageIcon) imgSignoGemeos.getIcon();
    ImageIcon leao = (ImageIcon) imgSignoLeao.getIcon();
    ImageIcon libra = (ImageIcon) imgSignoLibra.getIcon();
    ImageIcon peixes = (ImageIcon) imgSignoPeixes.getIcon();
    ImageIcon sargitario = (ImageIcon) imgSignoSargitario.getIcon();
    ImageIcon touro = (ImageIcon) imgSignoTouro.getIcon();
    ImageIcon virgem = (ImageIcon) imgSignoVirgem.getIcon();
    ImageIcon capricornio = (ImageIcon) imgSignoCapricornio.getIcon();
    
    //redimencionar o tamanho da imagem delas 
    Image imgAries = aries.getImage().getScaledInstance( 230, 220, Image.SCALE_SMOOTH);
    Image imgAquario = aquario.getImage().getScaledInstance( 201, 220, Image.SCALE_SMOOTH);
    Image imgCancer = cancer.getImage().getScaledInstance( 201, 220, Image.SCALE_SMOOTH);
    Image imgEscorpiao = escorpiao.getImage().getScaledInstance( 201, 220, Image.SCALE_SMOOTH);
    Image imgGemeos = gemeos.getImage().getScaledInstance( 201, 220, Image.SCALE_SMOOTH);
    Image imgLeao = leao.getImage().getScaledInstance( 201, 220, Image.SCALE_SMOOTH);
    Image imgLibra = libra.getImage().getScaledInstance( 201, 220, Image.SCALE_SMOOTH);
    Image imgPeixes = peixes.getImage().getScaledInstance( 201, 220, Image.SCALE_SMOOTH);
    Image imgSargitario = sargitario.getImage().getScaledInstance( 201, 220, Image.SCALE_SMOOTH);
    Image imgTouro = touro.getImage().getScaledInstance( 201, 220, Image.SCALE_SMOOTH);
    Image imgVirgem = virgem.getImage().getScaledInstance( 201, 220, Image.SCALE_SMOOTH);
    Image imgCapricornio = capricornio.getImage().getScaledInstance( 201, 220, Image.SCALE_SMOOTH);
    
    //JOGAR A IMAGEM RAEDIMENCIONADA NA LABEL NOVAMENTE
    imgSignoAries.setIcon (new ImageIcon (imgAries));
    imgSignoAquario.setIcon (new ImageIcon (imgAquario));
    imgSignoCancer.setIcon (new ImageIcon (imgCancer));
    imgSignoEscorpiao.setIcon (new ImageIcon (imgEscorpiao));
    imgSignoGemeos.setIcon (new ImageIcon (imgGemeos));
    imgSignoLeao.setIcon (new ImageIcon (imgLeao));
    imgSignoLibra.setIcon (new ImageIcon (imgLibra));
    imgSignoPeixes.setIcon (new ImageIcon (imgPeixes));
    imgSignoSargitario.setIcon (new ImageIcon (imgSargitario));
    imgSignoTouro.setIcon (new ImageIcon (imgTouro));
    imgSignoVirgem.setIcon (new ImageIcon (imgVirgem));
    imgSignoCapricornio.setIcon (new ImageIcon (imgCapricornio));
    
    
    
    
    
    
    
    
    
    }//fim da função 
    
    public void PreecherPrevisao(){
    //verificar o dia da semana 
    //lacalDate - puxar a data ddo computador 
    int diaSemana = LocalDate.now() . getDayOfWeek(). getValue();
    
    //CRIAR A CONDICIONAL PARA PREENCHER O CAMPO PREVISAO
     switch (diaSemana){
           case 1: // Segunda-feira
        txPrevisoesAries.setText("Áries: Comece a semana com energia e determinação.");
        txPrevisoesTouro.setText("Touro: Tenha paciência e organize suas tarefas.");
        txPrevisoesGemeos.setText("Gêmeos: A comunicação será importante hoje.");
        txPrevisoesCancer.setText("Câncer: Valorize os momentos com pessoas queridas.");
        txPrevisoesLeao.setText("Leão: Mostre confiança para enfrentar os desafios.");
        txPrevisoesVirgem.setText("Virgem: Organização será sua maior aliada.");
        txPrevisoesLibra.setText("Libra: Busque equilíbrio em suas decisões.");
        txPrevisoesEscorpiao.setText("Escorpião: Mantenha o foco nos seus objetivos.");
        txPrevisoesSargitario.setText("Sagitário: Comece a semana com entusiasmo.");
        txPrevisoesCapricornio.setText("Capricórnio: Disciplina ajudará você a alcançar seus objetivos.");
        txPrevisoesAquario.setText("Aquário: Uma ideia criativa pode ajudar no seu dia.");
        txPrevisoesPeixes.setText("Peixes: Comece a semana com pensamentos positivos.");
        break;

    case 2: // Terça-feira
        txPrevisaoAries.setText("Áries: Uma oportunidade pode aparecer inesperadamente.");
        txPrevisaoTouro.setText("Touro: Um bom dia para resolver assuntos importantes.");
        txPrevisaoGemeos.setText("Gêmeos: Uma conversa pode trazer uma nova oportunidade.");
        txPrevisaoCancer.setText("Câncer: Procure manter a calma diante dos desafios.");
        txPrevisaoLeao.setText("Leão: Sua determinação ajudará em uma tarefa importante.");
        txPrevisaoVirgem.setText("Virgem: Concentre-se nas tarefas mais importantes.");
        txPrevisaoLibra.setText("Libra: Uma boa conversa pode resolver uma situação.");
        txPrevisaoEscorpiao.setText("Escorpião: Confie na sua capacidade de resolver problemas.");
        txPrevisaoSagitario.setText("Sagitário: Uma nova ideia pode chamar sua atenção.");
        txPrevisaoCapricornio.setText("Capricórnio: Continue trabalhando com determinação.");
        txPrevisaoAquario.setText("Aquário: Compartilhe suas ideias com quem confia.");
        txPrevisaoPeixes.setText("Peixes: Sua sensibilidade será importante hoje.");
        break;

    case 3: // Quarta-feira
        txPrevisaoAries.setText("Áries: Evite decisões impulsivas e pense antes de agir.");
        txPrevisaoTouro.setText("Touro: Tenha paciência e evite decisões por impulso.");
        txPrevisaoGemeos.setText("Gêmeos: Uma conversa pode mudar sua forma de pensar.");
        txPrevisaoCancer.setText("Câncer: Um momento em família pode trazer alegria.");
        txPrevisaoLeao.setText("Leão: Evite conflitos e procure ouvir as outras pessoas.");
        txPrevisaoVirgem.setText("Virgem: Não se preocupe demais com pequenos detalhes.");
        txPrevisaoLibra.setText("Libra: Evite deixar decisões importantes para depois.");
        txPrevisaoEscorpiao.setText("Escorpião: Evite agir com pressa.");
        txPrevisaoSagitario.setText("Sagitário: Tenha cuidado para não assumir compromissos demais.");
        txPrevisaoCapricornio.setText("Capricórnio: Não deixe a preocupação atrapalhar seu dia.");
        txPrevisaoAquario.setText("Aquário: Procure enxergar uma situação por outro ponto de vista.");
        txPrevisaoPeixes.setText("Peixes: Reserve um momento para organizar seus pensamentos.");
        break;

    case 4: // Quinta-feira
        txPrevisaoAries.setText("Áries: Novos desafios podem trazer boas experiências.");
        txPrevisaoTouro.setText("Touro: Novas oportunidades podem surgir hoje.");
        txPrevisaoGemeos.setText("Gêmeos: Evite distrações e concentre-se nos seus objetivos.");
        txPrevisaoCancer.setText("Câncer: Confie mais nas suas decisões.");
        txPrevisaoLeao.setText("Leão: Um projeto pode começar a apresentar bons resultados.");
        txPrevisaoVirgem.setText("Virgem: Seu esforço poderá trazer bons resultados.");
        txPrevisaoLibra.setText("Libra: O dia favorece novas ideias e possibilidades.");
        txPrevisaoEscorpiao.setText("Escorpião: Uma mudança pode trazer novas possibilidades.");
        txPrevisaoSagitario.setText("Sagitário: O dia pode trazer uma oportunidade interessante.");
        txPrevisaoCapricornio.setText("Capricórnio: Seus esforços podem começar a ser reconhecidos.");
        txPrevisaoAquario.setText("Aquário: Um novo projeto pode despertar seu interesse.");
        txPrevisaoPeixes.setText("Peixes: Uma boa notícia pode melhorar seu dia.");
        break;

    case 5: // Sexta-feira
        txPrevisaoAries.setText("Áries: Aproveite o dia para comemorar suas conquistas.");
        txPrevisaoTouro.setText("Touro: Aproveite o dia para descansar e estar com pessoas queridas.");
        txPrevisaoGemeos.setText("Gêmeos: Aproveite o dia para se divertir e relaxar.");
        txPrevisaoCancer.setText("Câncer: O dia favorece momentos de descontração.");
        txPrevisaoLeao.setText("Leão: Aproveite a sexta-feira para comemorar suas conquistas.");
        txPrevisaoVirgem.setText("Virgem: Termine a semana com sensação de dever cumprido.");
        txPrevisaoLibra.setText("Libra: Aproveite o dia para estar perto de pessoas especiais.");
        txPrevisaoEscorpiao.setText("Escorpião: Aproveite para concluir suas pendências.");
        txPrevisaoSagitario.setText("Sagitário: Aproveite a sexta para se divertir.");
        txPrevisaoCapricornio.setText("Capricórnio: Finalize suas tarefas antes de descansar.");
        txPrevisaoAquario.setText("Aquário: Aproveite o dia para fazer algo diferente.");
        txPrevisaoPeixes.setText("Peixes: Aproveite a sexta-feira para relaxar.");
        break;

    case 6: // Sábado
        txPrevisaoAries.setText("Áries: Aproveite o sábado para se divertir.");
        txPrevisaoTouro.setText("Touro: Um ótimo dia para aproveitar momentos de lazer.");
        txPrevisaoGemeos.setText("Gêmeos: Um passeio pode deixar seu dia mais agradável.");
        txPrevisaoCancer.setText("Câncer: Aproveite o sábado para cuidar de você.");
        txPrevisaoLeao.setText("Leão: Divirta-se e aproveite bons momentos.");
        txPrevisaoVirgem.setText("Virgem: Reserve um tempo para descansar.");
        txPrevisaoLibra.setText("Libra: Um momento de lazer fará bem ao seu dia.");
        txPrevisaoEscorpiao.setText("Escorpião: Um programa diferente pode tornar seu sábado especial.");
        txPrevisaoSagitario.setText("Sagitário: Um passeio pode renovar suas energias.");
        txPrevisaoCapricornio.setText("Capricórnio: Permita-se descansar e aproveitar o momento.");
        txPrevisaoAquario.setText("Aquário: Novas experiências podem deixar seu sábado divertido.");
        txPrevisaoPeixes.setText("Peixes: Faça algo que você realmente gosta.");
        break;

    case 7: // Domingo
        txPrevisaoAries.setText("Áries: Descanse e prepare-se para uma nova semana.");
        txPrevisaoTouro.setText("Touro: Recarregue as energias para a próxima semana.");
        txPrevisaoGemeos.setText("Gêmeos: Organize seus planos para a próxima semana.");
        txPrevisaoCancer.setText("Câncer: Descanse e prepare-se para uma nova semana.");
        txPrevisaoLeao.setText("Leão: Planeje tranquilamente os próximos dias.");
        txPrevisaoVirgem.setText("Virgem: Planeje tranquilamente os próximos dias.");
        txPrevisaoLibra.setText("Libra: Termine a semana com tranquilidade.");
        txPrevisaoEscorpiao.setText("Escorpião: Reflita sobre seus próximos objetivos.");
        txPrevisaoSagitario.setText("Sagitário: Prepare-se para uma nova semana.");
        txPrevisaoCapricornio.setText("Capricórnio: Organize suas prioridades para a próxima semana.");
        txPrevisaoAquario.setText("Aquário: Relaxe e aproveite o domingo.");
        txPrevisaoPeixes.setText("Peixes: Termine a semana com tranquilidade.");
        break;
     
     
     
     }
    
    
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        areaAbas = new javax.swing.JTabbedPane();
        inicio = new javax.swing.JPanel();
        areaResultado = new javax.swing.JPanel();
        signo = new javax.swing.JLabel();
        compatibilidade = new javax.swing.JLabel();
        btnSigno = new javax.swing.JButton();
        tfCompatibilidade = new javax.swing.JTextField();
        areaDescobrirSigno = new javax.swing.JPanel();
        tituloDescobrirSigno = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        diaNascimento = new javax.swing.JLabel();
        mesNascimento = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        cbDia = new javax.swing.JComboBox<>();
        cbMes = new javax.swing.JComboBox<>();
        btnDescobrirSigno = new javax.swing.JButton();
        areaCompatibilidade = new javax.swing.JPanel();
        tituloCompatibilidade = new javax.swing.JLabel();
        signo1 = new javax.swing.JLabel();
        signo2 = new javax.swing.JLabel();
        cbSigno1 = new javax.swing.JComboBox<>();
        cbSigno2 = new javax.swing.JComboBox<>();
        btnCalular = new javax.swing.JButton();
        fundoInicio = new javax.swing.JLabel();
        aries = new javax.swing.JPanel();
        areaInformacoesAries = new javax.swing.JPanel();
        tfPeriodoAries = new javax.swing.JTextField();
        tfElementoAries = new javax.swing.JTextField();
        tfPlanetaAries = new javax.swing.JTextField();
        tfCorAries = new javax.swing.JTextField();
        tfNumeroAries = new javax.swing.JTextField();
        imgSignoAries = new javax.swing.JLabel();
        periodoAries = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        planetaAries = new javax.swing.JLabel();
        corAries = new javax.swing.JLabel();
        numeroAreis = new javax.swing.JLabel();
        elementoAries = new javax.swing.JLabel();
        tituloAries = new javax.swing.JLabel();
        areaEnergiaAries = new javax.swing.JPanel();
        tituloEnergiaAries = new javax.swing.JLabel();
        amorAries = new javax.swing.JLabel();
        trabalhoAries = new javax.swing.JLabel();
        saudeAries = new javax.swing.JLabel();
        sorteAries = new javax.swing.JLabel();
        tfAmorAries = new javax.swing.JTextField();
        tfTrabalhoAries = new javax.swing.JTextField();
        tfSaudeAries = new javax.swing.JTextField();
        tfSorteAries = new javax.swing.JTextField();
        areaMensagemAries = new javax.swing.JPanel();
        tituloMensagemAries = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txMensagemAries = new javax.swing.JTextArea();
        btnCopiarMensagemAries = new javax.swing.JButton();
        areaCaracteristicasAries = new javax.swing.JPanel();
        caracteristicasAries = new javax.swing.JLabel();
        pfortesAries = new javax.swing.JLabel();
        pmelhoriasAries = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txFortesAries = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txMelhoriasAries = new javax.swing.JTextArea();
        areaPrevisaoAries = new javax.swing.JPanel();
        previsaoAries = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txPrevisoesAries = new javax.swing.JTextArea();
        btnAtualizarPrevisaoAries = new javax.swing.JButton();
        fundoAries = new javax.swing.JLabel();
        aquario = new javax.swing.JPanel();
        areaInformacoesAquario = new javax.swing.JPanel();
        tfPeriodoAquario = new javax.swing.JTextField();
        tfElementoAquario = new javax.swing.JTextField();
        tfPlanetaAquario = new javax.swing.JTextField();
        tfCorAquario = new javax.swing.JTextField();
        tfNumeroAquario = new javax.swing.JTextField();
        imgSignoAquario = new javax.swing.JLabel();
        periodoAquario = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        planetaAquario = new javax.swing.JLabel();
        corAquario = new javax.swing.JLabel();
        numeroAquario = new javax.swing.JLabel();
        elementoAquario = new javax.swing.JLabel();
        tituloAquario = new javax.swing.JLabel();
        areaPrevisaoAquario = new javax.swing.JPanel();
        previsaoAquario = new javax.swing.JLabel();
        jScrollPane45 = new javax.swing.JScrollPane();
        txPrevisoesAquario = new javax.swing.JTextArea();
        btnAtualizarPrevisaoAquario = new javax.swing.JButton();
        areaEnergiaAquario = new javax.swing.JPanel();
        tituloEnergiaAquario = new javax.swing.JLabel();
        amorAquario = new javax.swing.JLabel();
        trabalhoAquario = new javax.swing.JLabel();
        saudeAquario = new javax.swing.JLabel();
        sorteAquario = new javax.swing.JLabel();
        tfAmorAquario = new javax.swing.JTextField();
        tfTrabalhoAquario = new javax.swing.JTextField();
        tfSaudeAquario = new javax.swing.JTextField();
        tfSorteAquario = new javax.swing.JTextField();
        areaMensagemAquario = new javax.swing.JPanel();
        tituloMensagemAquario = new javax.swing.JLabel();
        jScrollPane46 = new javax.swing.JScrollPane();
        txMensagemAquario = new javax.swing.JTextArea();
        btnCopiarMensagemAquario = new javax.swing.JButton();
        areaCaracteristicasAquario = new javax.swing.JPanel();
        caracteristicasAquario = new javax.swing.JLabel();
        pfortesAquario = new javax.swing.JLabel();
        pmelhoriasAquario = new javax.swing.JLabel();
        jScrollPane47 = new javax.swing.JScrollPane();
        txFortesAquario = new javax.swing.JTextArea();
        jScrollPane48 = new javax.swing.JScrollPane();
        txMelhoriasAquario = new javax.swing.JTextArea();
        fundoAquario = new javax.swing.JLabel();
        cancer = new javax.swing.JPanel();
        areaInformacoesCancer = new javax.swing.JPanel();
        tfPeriodoCancer = new javax.swing.JTextField();
        tfElementoCancer = new javax.swing.JTextField();
        tfPlanetaCancer = new javax.swing.JTextField();
        tfCorCancer = new javax.swing.JTextField();
        tfNumeroCancer = new javax.swing.JTextField();
        imgSignoCancer = new javax.swing.JLabel();
        periodoCancer = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        planetaCancer = new javax.swing.JLabel();
        corCancer = new javax.swing.JLabel();
        numeroCancer = new javax.swing.JLabel();
        elementoCancer = new javax.swing.JLabel();
        tituloCancer = new javax.swing.JLabel();
        areaEnergiaCancer = new javax.swing.JPanel();
        tituloEnergiaCancer = new javax.swing.JLabel();
        amorCancer = new javax.swing.JLabel();
        trabalhoCancer = new javax.swing.JLabel();
        saudeCancer = new javax.swing.JLabel();
        sorteCancer = new javax.swing.JLabel();
        tfAmorCancer = new javax.swing.JTextField();
        tfTrabalhoCancer = new javax.swing.JTextField();
        tfSaudeCancer = new javax.swing.JTextField();
        tfSorteCancer = new javax.swing.JTextField();
        areaMensagemCancer = new javax.swing.JPanel();
        tituloMensagemCancer = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txMensagemCancer = new javax.swing.JTextArea();
        btnCopiarMensagemCancer = new javax.swing.JButton();
        areaCaracteristicasCancer = new javax.swing.JPanel();
        caracteristicasCancer = new javax.swing.JLabel();
        pfortesCancer = new javax.swing.JLabel();
        pmelhoriasCancer = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txFortesCancer = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        txMelhoriasCancer = new javax.swing.JTextArea();
        areaPrevisaoCancer = new javax.swing.JPanel();
        previsaoCancer = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txPrevisoesCancer = new javax.swing.JTextArea();
        btnAtualizarPrevisaoCancer = new javax.swing.JButton();
        fundoCancer = new javax.swing.JLabel();
        escorpiao = new javax.swing.JPanel();
        areaInformacoesEscorpiao = new javax.swing.JPanel();
        tfPeriodoEscorpiao = new javax.swing.JTextField();
        tfElementoEscorpiao = new javax.swing.JTextField();
        tfPlanetaEscorpiao = new javax.swing.JTextField();
        tfCorEscorpiao = new javax.swing.JTextField();
        tfNumeroEscorpiao = new javax.swing.JTextField();
        imgSignoEscorpiao = new javax.swing.JLabel();
        periodoEscorpiao = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        planetaEscorpiao = new javax.swing.JLabel();
        corEscorpiao = new javax.swing.JLabel();
        numeroEscorpiao = new javax.swing.JLabel();
        elementoEscorpiao = new javax.swing.JLabel();
        tituloEscorpiao = new javax.swing.JLabel();
        areaEnergiaEscorpiao = new javax.swing.JPanel();
        tituloEnergiaEscorpiao = new javax.swing.JLabel();
        amorEscorpiao = new javax.swing.JLabel();
        trabalhoEscorpiao = new javax.swing.JLabel();
        saudeEscorpiao = new javax.swing.JLabel();
        sorteEscorpiao = new javax.swing.JLabel();
        tfAmorEscorpiao = new javax.swing.JTextField();
        tfTrabalhoEscorpiao = new javax.swing.JTextField();
        tfSaudeEscorpiao = new javax.swing.JTextField();
        tfSorteEscorpiao = new javax.swing.JTextField();
        areaMensagemEscorpiao = new javax.swing.JPanel();
        tituloMensagemEscorpiao = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        txMensagemEscorpiao = new javax.swing.JTextArea();
        btnCopiarMensagemEscorpiao = new javax.swing.JButton();
        areaCaracteristicasEscorpiao = new javax.swing.JPanel();
        caracteristicasEscorpiao = new javax.swing.JLabel();
        pfortesEscorpiao = new javax.swing.JLabel();
        pmelhoriasEscorpiao = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        txFortesEscorpiao = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        txMelhoriasEscorpiao = new javax.swing.JTextArea();
        areaPrevisaoEscorpiao = new javax.swing.JPanel();
        previsaoEscorpiao = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        txPrevisoesEscorpiao = new javax.swing.JTextArea();
        btnAtualizarPrevisaoEscorpiao = new javax.swing.JButton();
        fundoEscorpiao = new javax.swing.JLabel();
        gemeos = new javax.swing.JPanel();
        areaInformacoesGemeos = new javax.swing.JPanel();
        tfPeriodoGemeos = new javax.swing.JTextField();
        tfElementoGemeos = new javax.swing.JTextField();
        tfPlanetaGemeos = new javax.swing.JTextField();
        tfCorGemeos = new javax.swing.JTextField();
        tfNumeroGemeos = new javax.swing.JTextField();
        imgSignoGemeos = new javax.swing.JLabel();
        periodoGemeos = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        planetaGemeos = new javax.swing.JLabel();
        corGemeos = new javax.swing.JLabel();
        numeroGemeos = new javax.swing.JLabel();
        elementoGemeos = new javax.swing.JLabel();
        tituloGemeos = new javax.swing.JLabel();
        areaPrevisaoGemeos = new javax.swing.JPanel();
        GemeosGemeos = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        txPrevisoesGemeos = new javax.swing.JTextArea();
        btnAtualizarPrevisaoGemeos = new javax.swing.JButton();
        areaEnergiaGemeos = new javax.swing.JPanel();
        tituloEnergiaGemeos = new javax.swing.JLabel();
        amorGemeos = new javax.swing.JLabel();
        trabalhoGemeos = new javax.swing.JLabel();
        saudeGemeos = new javax.swing.JLabel();
        sorteGemeos = new javax.swing.JLabel();
        tfAmorGemeos = new javax.swing.JTextField();
        tfTrabalhoGemeos = new javax.swing.JTextField();
        tfSaudeGemeos = new javax.swing.JTextField();
        tfSorteGemeos = new javax.swing.JTextField();
        areaMensagemGemeos = new javax.swing.JPanel();
        tituloMensagemGemeos = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        txMensagemGemeos = new javax.swing.JTextArea();
        btnCopiarMensagemGemeos = new javax.swing.JButton();
        areaCaracteristicasGemeos = new javax.swing.JPanel();
        caracteristicasGemeos = new javax.swing.JLabel();
        pfortesGemeos = new javax.swing.JLabel();
        pmelhoriasGemeos = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        txFortesGemeos = new javax.swing.JTextArea();
        jScrollPane16 = new javax.swing.JScrollPane();
        txMelhoriasGemeos = new javax.swing.JTextArea();
        fundoGemeos = new javax.swing.JLabel();
        leao = new javax.swing.JPanel();
        areaInformacoesLeao = new javax.swing.JPanel();
        tfPeriodoLeao = new javax.swing.JTextField();
        tfElementoLeao = new javax.swing.JTextField();
        tfPlanetaLeao = new javax.swing.JTextField();
        tfCorLeao = new javax.swing.JTextField();
        tfNumeroLeao = new javax.swing.JTextField();
        imgSignoLeao = new javax.swing.JLabel();
        periodoLeao = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        planetaLeao = new javax.swing.JLabel();
        corLeao = new javax.swing.JLabel();
        numeroLeao = new javax.swing.JLabel();
        elementoLeao = new javax.swing.JLabel();
        tituloLeao = new javax.swing.JLabel();
        areaPrevisaoLeao = new javax.swing.JPanel();
        previsaoLeao = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        txPrevisoesLeao = new javax.swing.JTextArea();
        btnAtualizarPrevisaoLeao = new javax.swing.JButton();
        areaEnergiaLeao = new javax.swing.JPanel();
        tituloEnergiaLeao = new javax.swing.JLabel();
        amorLeao = new javax.swing.JLabel();
        trabalhoLeao = new javax.swing.JLabel();
        saudeLeao = new javax.swing.JLabel();
        sorteLeao = new javax.swing.JLabel();
        tfAmorLeao = new javax.swing.JTextField();
        tfTrabalhoLeao = new javax.swing.JTextField();
        tfSaudeLeao = new javax.swing.JTextField();
        tfSorteLeao = new javax.swing.JTextField();
        areaMensagemLeao = new javax.swing.JPanel();
        tituloMensagemLeao = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        txMensagemLeao = new javax.swing.JTextArea();
        btnCopiarMensagemLeao = new javax.swing.JButton();
        areaCaracteristicasLeao = new javax.swing.JPanel();
        caracteristicasLeao = new javax.swing.JLabel();
        pfortesLeao = new javax.swing.JLabel();
        pmelhoriasLeao = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        txFortesLeao = new javax.swing.JTextArea();
        jScrollPane20 = new javax.swing.JScrollPane();
        txMelhoriasLeao = new javax.swing.JTextArea();
        fundoLeao = new javax.swing.JLabel();
        libra = new javax.swing.JPanel();
        areaInformacoesLibra = new javax.swing.JPanel();
        tfPeriodoLibra = new javax.swing.JTextField();
        tfElementoLibra = new javax.swing.JTextField();
        tfPlanetaLibra = new javax.swing.JTextField();
        tfCorLibra = new javax.swing.JTextField();
        tfNumeroLibra = new javax.swing.JTextField();
        imgSignoLibra = new javax.swing.JLabel();
        periodoLibra = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        planetaLibra = new javax.swing.JLabel();
        corLibra = new javax.swing.JLabel();
        numeroLibra = new javax.swing.JLabel();
        elementoLibra = new javax.swing.JLabel();
        tituloLibra = new javax.swing.JLabel();
        areaPrevisaoLibra = new javax.swing.JPanel();
        previsaoLibra = new javax.swing.JLabel();
        jScrollPane21 = new javax.swing.JScrollPane();
        txPrevisoesLibra = new javax.swing.JTextArea();
        btnAtualizarPrevisaoLibra = new javax.swing.JButton();
        areaEnergiaLibra = new javax.swing.JPanel();
        tituloEnergiaLibra = new javax.swing.JLabel();
        amorLibra = new javax.swing.JLabel();
        trabalhoLibra = new javax.swing.JLabel();
        saudeLibra = new javax.swing.JLabel();
        sorteLibra = new javax.swing.JLabel();
        tfAmorLibra = new javax.swing.JTextField();
        tfTrabalhoLibra = new javax.swing.JTextField();
        tfSaudeLibra = new javax.swing.JTextField();
        tfSorteLibra = new javax.swing.JTextField();
        areaMensagemLibra = new javax.swing.JPanel();
        tituloMensagemLibra = new javax.swing.JLabel();
        jScrollPane22 = new javax.swing.JScrollPane();
        txMensagemLibra = new javax.swing.JTextArea();
        btnCopiarMensagemLibra = new javax.swing.JButton();
        areaCaracteristicasLibra = new javax.swing.JPanel();
        caracteristicasLibra = new javax.swing.JLabel();
        pfortesLibra = new javax.swing.JLabel();
        pmelhoriasLibra = new javax.swing.JLabel();
        jScrollPane23 = new javax.swing.JScrollPane();
        txFortesLibra = new javax.swing.JTextArea();
        jScrollPane24 = new javax.swing.JScrollPane();
        txMelhoriasLibra = new javax.swing.JTextArea();
        fundoLibra = new javax.swing.JLabel();
        peixes = new javax.swing.JPanel();
        areaInformacoesPeixes = new javax.swing.JPanel();
        tfPeriodoPeixes = new javax.swing.JTextField();
        tfElementoPeixes = new javax.swing.JTextField();
        tfPlanetaPeixes = new javax.swing.JTextField();
        tfCorPeixes = new javax.swing.JTextField();
        tfNumeroPeixes = new javax.swing.JTextField();
        imgSignoPeixes = new javax.swing.JLabel();
        periodoPeixes = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        planetaPeixes = new javax.swing.JLabel();
        corPeixes = new javax.swing.JLabel();
        numeroPeixes = new javax.swing.JLabel();
        elementoPeixes = new javax.swing.JLabel();
        tituloPeixes = new javax.swing.JLabel();
        areaPrevisaoPeixes = new javax.swing.JPanel();
        previsaoPeixes = new javax.swing.JLabel();
        jScrollPane25 = new javax.swing.JScrollPane();
        txPrevisoesPeixes = new javax.swing.JTextArea();
        btnAtualizarPrevisaoPeixes = new javax.swing.JButton();
        areaEnergiaPeixes = new javax.swing.JPanel();
        tituloEnergiaPeixes = new javax.swing.JLabel();
        amorPeixes = new javax.swing.JLabel();
        trabalhoPeixes = new javax.swing.JLabel();
        saudePeixes = new javax.swing.JLabel();
        sorteAries6 = new javax.swing.JLabel();
        tfAmorPeixes = new javax.swing.JTextField();
        tfTrabalhoPeixes = new javax.swing.JTextField();
        Aries6 = new javax.swing.JTextField();
        tfSorteAries6 = new javax.swing.JTextField();
        areaMensagemPeixes = new javax.swing.JPanel();
        tituloMensagemPeixes = new javax.swing.JLabel();
        jScrollPane26 = new javax.swing.JScrollPane();
        txMensagemPeixes = new javax.swing.JTextArea();
        btnCopiarMensagemPeixes = new javax.swing.JButton();
        areaCaracteristicasPeixes = new javax.swing.JPanel();
        caracteristicasPeixes = new javax.swing.JLabel();
        pfortesPeixes = new javax.swing.JLabel();
        pmelhoriasPeixes = new javax.swing.JLabel();
        jScrollPane27 = new javax.swing.JScrollPane();
        txFortesPeixes = new javax.swing.JTextArea();
        jScrollPane28 = new javax.swing.JScrollPane();
        txMelhoriasPeixes = new javax.swing.JTextArea();
        fundoPeixes = new javax.swing.JLabel();
        sargitario = new javax.swing.JPanel();
        areaInformacoesSargitario = new javax.swing.JPanel();
        tfPeriodoSargitario = new javax.swing.JTextField();
        tfElementoSargitario = new javax.swing.JTextField();
        tfPlanetaSargitario = new javax.swing.JTextField();
        tfCorSargitario = new javax.swing.JTextField();
        tfNumeroSargitario = new javax.swing.JTextField();
        imgSignoSargitario = new javax.swing.JLabel();
        periodoSargitario = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        planetaSargitario = new javax.swing.JLabel();
        corSargitario = new javax.swing.JLabel();
        numeroSargitario = new javax.swing.JLabel();
        elementoSargitario = new javax.swing.JLabel();
        tituloSargitario = new javax.swing.JLabel();
        areaPrevisaoSargitario = new javax.swing.JPanel();
        previsaoSargitario = new javax.swing.JLabel();
        jScrollPane29 = new javax.swing.JScrollPane();
        txPrevisoesSargitario = new javax.swing.JTextArea();
        btnAtualizarPrevisaoSargitario = new javax.swing.JButton();
        areaEnergiaSargitario = new javax.swing.JPanel();
        tituloEnergiaSargitario = new javax.swing.JLabel();
        amorSargitario = new javax.swing.JLabel();
        trabalhoSargitario = new javax.swing.JLabel();
        saudeSargitario = new javax.swing.JLabel();
        sorteSargitario = new javax.swing.JLabel();
        tfAmorSargitario = new javax.swing.JTextField();
        tfTrabalhoSargitario = new javax.swing.JTextField();
        tfSaudeSargitario = new javax.swing.JTextField();
        tfSorteSargitario = new javax.swing.JTextField();
        areaMensagemSargitario = new javax.swing.JPanel();
        tituloMensagemSargitario = new javax.swing.JLabel();
        jScrollPane30 = new javax.swing.JScrollPane();
        txMensagemSargitario = new javax.swing.JTextArea();
        btnCopiarMensagemSargitario = new javax.swing.JButton();
        areaCaracteristicasSargitario = new javax.swing.JPanel();
        caracteristicasSargitario = new javax.swing.JLabel();
        pfortesSargitario = new javax.swing.JLabel();
        pmelhoriasSargitario = new javax.swing.JLabel();
        jScrollPane31 = new javax.swing.JScrollPane();
        txFortesSargitariov = new javax.swing.JTextArea();
        jScrollPane32 = new javax.swing.JScrollPane();
        txMelhoriasSargitario = new javax.swing.JTextArea();
        fundoSargitario = new javax.swing.JLabel();
        touro = new javax.swing.JPanel();
        areaInformacoesTouro = new javax.swing.JPanel();
        tfPeriodoTouro = new javax.swing.JTextField();
        tfElementoTouro = new javax.swing.JTextField();
        tfPlanetaTouro = new javax.swing.JTextField();
        tfCorTouro = new javax.swing.JTextField();
        tfNumeroTouro = new javax.swing.JTextField();
        imgSignoTouro = new javax.swing.JLabel();
        periodoTouro = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        planetaTouro = new javax.swing.JLabel();
        corTouro = new javax.swing.JLabel();
        numeroTouro = new javax.swing.JLabel();
        elementoTouro = new javax.swing.JLabel();
        tituloTouro = new javax.swing.JLabel();
        areaPrevisaoTouro = new javax.swing.JPanel();
        previsaoTouro = new javax.swing.JLabel();
        jScrollPane49 = new javax.swing.JScrollPane();
        txPrevisoesTouro = new javax.swing.JTextArea();
        btnAtualizarPrevisaoTouro = new javax.swing.JButton();
        areaEnergiaTouro = new javax.swing.JPanel();
        tituloEnergiaTouro = new javax.swing.JLabel();
        amorTouro = new javax.swing.JLabel();
        trabalhoTouro = new javax.swing.JLabel();
        saudeTouro = new javax.swing.JLabel();
        sorteTouro = new javax.swing.JLabel();
        tfAmorTouro = new javax.swing.JTextField();
        tfTrabalhoTouro = new javax.swing.JTextField();
        tfSaudeTouro = new javax.swing.JTextField();
        tfSorteTouro = new javax.swing.JTextField();
        areaMensagemTouro = new javax.swing.JPanel();
        tituloMensagemTouro = new javax.swing.JLabel();
        jScrollPane50 = new javax.swing.JScrollPane();
        txMensagemTouro = new javax.swing.JTextArea();
        btnCopiarMensagemTouro = new javax.swing.JButton();
        areaCaracteristicasTouro = new javax.swing.JPanel();
        caracteristicasTouro = new javax.swing.JLabel();
        pfortesTouro = new javax.swing.JLabel();
        pmelhoriasTouro = new javax.swing.JLabel();
        jScrollPane51 = new javax.swing.JScrollPane();
        txFortesTouro = new javax.swing.JTextArea();
        jScrollPane52 = new javax.swing.JScrollPane();
        txMelhoriasTouro = new javax.swing.JTextArea();
        fundoTouro = new javax.swing.JLabel();
        virgem = new javax.swing.JPanel();
        areaInformacoesVirgem = new javax.swing.JPanel();
        tfPeriodoVirgem = new javax.swing.JTextField();
        tfElementoVirgem = new javax.swing.JTextField();
        tfPlanetaVirgem = new javax.swing.JTextField();
        tfCorVirgem = new javax.swing.JTextField();
        tfNumeroVirgem = new javax.swing.JTextField();
        imgSignoVirgem = new javax.swing.JLabel();
        periodoVirgem = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        planetaVirgem = new javax.swing.JLabel();
        corVirgem = new javax.swing.JLabel();
        numeroVirgem = new javax.swing.JLabel();
        elementoVirgem = new javax.swing.JLabel();
        tituloVirgem = new javax.swing.JLabel();
        areaPrevisaoVirgem = new javax.swing.JPanel();
        previsaoVirgem = new javax.swing.JLabel();
        jScrollPane37 = new javax.swing.JScrollPane();
        txPrevisoesVirgem = new javax.swing.JTextArea();
        btnAtualizarPrevisaoVirgem = new javax.swing.JButton();
        areaEnergiaVirgem = new javax.swing.JPanel();
        tituloEnergiaVirgem = new javax.swing.JLabel();
        amorVirgem = new javax.swing.JLabel();
        trabalhoVirgem = new javax.swing.JLabel();
        saudeVirgem = new javax.swing.JLabel();
        sorteVirgem = new javax.swing.JLabel();
        tfAmorVirgem = new javax.swing.JTextField();
        tfTrabalhoVirgem = new javax.swing.JTextField();
        tfSaudeVirgem = new javax.swing.JTextField();
        tfSorteVirgem = new javax.swing.JTextField();
        areaMensagemVirgem = new javax.swing.JPanel();
        tituloMensagemVirgem = new javax.swing.JLabel();
        jScrollPane38 = new javax.swing.JScrollPane();
        txMensagemVirgem = new javax.swing.JTextArea();
        btnCopiarMensagemVirgem = new javax.swing.JButton();
        areaCaracteristicasVirgem = new javax.swing.JPanel();
        caracteristicasVirgem = new javax.swing.JLabel();
        pfortesVirgem = new javax.swing.JLabel();
        pmelhoriasVirgem = new javax.swing.JLabel();
        jScrollPane39 = new javax.swing.JScrollPane();
        txFortesVirgem = new javax.swing.JTextArea();
        jScrollPane40 = new javax.swing.JScrollPane();
        txMelhoriasVirgem = new javax.swing.JTextArea();
        fundoVirgem = new javax.swing.JLabel();
        capricornio = new javax.swing.JPanel();
        areaInformacoesCapricornio = new javax.swing.JPanel();
        tfPeriodoCapricornio = new javax.swing.JTextField();
        tfElementoCapricornio = new javax.swing.JTextField();
        tfPlanetaCapricornio = new javax.swing.JTextField();
        tfCorCapricornio = new javax.swing.JTextField();
        tfNumeroCapricornio = new javax.swing.JTextField();
        imgSignoCapricornio = new javax.swing.JLabel();
        periodoCapricornio = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        planetaAries10 = new javax.swing.JLabel();
        corCapricornio = new javax.swing.JLabel();
        numeroCapricornio = new javax.swing.JLabel();
        elementoCapricornio = new javax.swing.JLabel();
        tituloCapricornio = new javax.swing.JLabel();
        areaPrevisaoCapricornio = new javax.swing.JPanel();
        previsaoCapricornio = new javax.swing.JLabel();
        jScrollPane41 = new javax.swing.JScrollPane();
        txPrevisoesCapricornio = new javax.swing.JTextArea();
        btnAtualizarPrevisaoCapricornio = new javax.swing.JButton();
        areaEnergiaCapricornio = new javax.swing.JPanel();
        tituloEnergiaCapricornio = new javax.swing.JLabel();
        amorCapricornio = new javax.swing.JLabel();
        trabalhoCapricornio = new javax.swing.JLabel();
        saudeCapricornio = new javax.swing.JLabel();
        sorteCapricornio = new javax.swing.JLabel();
        tfAmorCapricornio = new javax.swing.JTextField();
        tfTrabalhoCapricornio = new javax.swing.JTextField();
        tfSaudeCapricornio = new javax.swing.JTextField();
        tfSorteCapricornio = new javax.swing.JTextField();
        areaMensagemCapricornio = new javax.swing.JPanel();
        tituloMensagemCapricornio = new javax.swing.JLabel();
        jScrollPane42 = new javax.swing.JScrollPane();
        txMensagemCapricornio = new javax.swing.JTextArea();
        btnCopiarMensagemCapricornio = new javax.swing.JButton();
        areaCaracteristicasCapricornio = new javax.swing.JPanel();
        caracteristicasCapricornio = new javax.swing.JLabel();
        pfortesCapricornio = new javax.swing.JLabel();
        pmelhoriasCapricornio = new javax.swing.JLabel();
        jScrollPane43 = new javax.swing.JScrollPane();
        txFortesCapricornio = new javax.swing.JTextArea();
        jScrollPane44 = new javax.swing.JScrollPane();
        txMelhoriasCapricornio = new javax.swing.JTextArea();
        fundoCapricornio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaAbas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 51, 255)));
        areaAbas.setFont(new java.awt.Font("Felix Titling", 1, 12)); // NOI18N

        inicio.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 51, 255)));
        inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        signo.setText("Signo");

        compatibilidade.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        compatibilidade.setText("Compatibilidade");

        javax.swing.GroupLayout areaResultadoLayout = new javax.swing.GroupLayout(areaResultado);
        areaResultado.setLayout(areaResultadoLayout);
        areaResultadoLayout.setHorizontalGroup(
            areaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaResultadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfCompatibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(areaResultadoLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(btnSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(areaResultadoLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(signo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(areaResultadoLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(compatibilidade)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        areaResultadoLayout.setVerticalGroup(
            areaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaResultadoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(signo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(compatibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfCompatibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        inicio.add(areaResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, 330, 580));

        areaDescobrirSigno.setPreferredSize(new java.awt.Dimension(200, 200));

        tituloDescobrirSigno.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloDescobrirSigno.setText("Descubra Seu Signo ");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Nome:");

        diaNascimento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        diaNascimento.setText("Dia de Nascimento: ");

        mesNascimento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mesNascimento.setText("Mês de Nascimento:");

        tfNome.setText("digite seu nome ");
        tfNome.addActionListener(this::tfNomeActionPerformed);

        cbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));

        btnDescobrirSigno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDescobrirSigno.setText("Descobrir Signo");
        btnDescobrirSigno.addActionListener(this::btnDescobrirSignoActionPerformed);

        javax.swing.GroupLayout areaDescobrirSignoLayout = new javax.swing.GroupLayout(areaDescobrirSigno);
        areaDescobrirSigno.setLayout(areaDescobrirSignoLayout);
        areaDescobrirSignoLayout.setHorizontalGroup(
            areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaDescobrirSignoLayout.createSequentialGroup()
                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNome))
                            .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                                .addComponent(mesNascimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                                .addComponent(diaNascimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))))
                    .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tituloDescobrirSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addGap(91, 91, 91))
            .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(btnDescobrirSigno)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaDescobrirSignoLayout.setVerticalGroup(
            areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(tituloDescobrirSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diaNascimento)
                    .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesNascimento)
                    .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnDescobrirSigno)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        inicio.add(areaDescobrirSigno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 410, 250));

        tituloCompatibilidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tituloCompatibilidade.setText("Compatibilidade");

        signo1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        signo1.setText("Primeiro Signo:");

        signo2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        signo2.setText("Segundo Sigino:");

        cbSigno1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Áries ♈", "Aquário ♒", "Câncer ♋", "Capricórnio ♑", "Escorpião ♏", "Gêmeos ♊", "Leão ♌", "Libra ♎", "Peixes ♓", "Sagitário ♐", "Touro ♉", "Virgem ♍" }));

        cbSigno2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Áries ♈", "Aquário ♒", "Câncer ♋", "Capricórnio ♑", "Escorpião ♏", "Gêmeos ♊", "Leão ♌", "Libra ♎", "Peixes ♓", "Sagitário ♐", "Touro ♉", "Virgem ♍" }));

        btnCalular.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCalular.setText("Calcular");

        javax.swing.GroupLayout areaCompatibilidadeLayout = new javax.swing.GroupLayout(areaCompatibilidade);
        areaCompatibilidade.setLayout(areaCompatibilidadeLayout);
        areaCompatibilidadeLayout.setHorizontalGroup(
            areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaCompatibilidadeLayout.createSequentialGroup()
                .addContainerGap(148, Short.MAX_VALUE)
                .addComponent(tituloCompatibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
            .addGroup(areaCompatibilidadeLayout.createSequentialGroup()
                .addGroup(areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCompatibilidadeLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(signo2)
                            .addComponent(signo1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbSigno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbSigno2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaCompatibilidadeLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(btnCalular)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaCompatibilidadeLayout.setVerticalGroup(
            areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCompatibilidadeLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloCompatibilidade)
                .addGap(18, 18, 18)
                .addGroup(areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signo1)
                    .addComponent(cbSigno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signo2)
                    .addComponent(cbSigno2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(btnCalular)
                .addGap(29, 29, 29))
        );

        inicio.add(areaCompatibilidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 410, 240));

        fundoInicio.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurGiuvannucci\\Documents\\ProjetoAppHoroscopo\\Horospoco\\src\\main\\resources\\assets\\81XnKshePmL._AC_SL1200_.jpg")); // NOI18N
        inicio.add(fundoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, -1));

        areaAbas.addTab("Inicio", inicio);

        aries.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 0, 255)));
        aries.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoesAries.setBackground(new java.awt.Color(255, 255, 255));

        tfPeriodoAries.setText("21/03 – 19/04");
        tfPeriodoAries.addActionListener(this::tfPeriodoAriesActionPerformed);

        tfElementoAries.setText("🔥 Fogo");
        tfElementoAries.addActionListener(this::tfElementoAriesActionPerformed);

        tfPlanetaAries.setText("Marte");
        tfPlanetaAries.addActionListener(this::tfPlanetaAriesActionPerformed);

        tfCorAries.setText("Vermelho");
        tfCorAries.addActionListener(this::tfCorAriesActionPerformed);

        tfNumeroAries.setText("9");
        tfNumeroAries.addActionListener(this::tfNumeroAriesActionPerformed);

        imgSignoAries.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurGiuvannucci\\Documents\\ProjetoAppHoroscopo\\Horospoco\\src\\main\\resources\\assets\\aries.png")); // NOI18N

        periodoAries.setText("PERIODO:");

        planetaAries.setText("PLANETA REGENTE:");

        corAries.setText("COR:");

        numeroAreis.setText("NÚMERO DA SORTE:");

        elementoAries.setText("ELEMENTO:");

        tituloAries.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloAries.setText("                  ÁRIES");

        javax.swing.GroupLayout areaInformacoesAriesLayout = new javax.swing.GroupLayout(areaInformacoesAries);
        areaInformacoesAries.setLayout(areaInformacoesAriesLayout);
        areaInformacoesAriesLayout.setHorizontalGroup(
            areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaInformacoesAriesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesAriesLayout.createSequentialGroup()
                        .addComponent(numeroAreis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNumeroAries))
                    .addGroup(areaInformacoesAriesLayout.createSequentialGroup()
                        .addComponent(planetaAries)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(tfPlanetaAries, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesAriesLayout.createSequentialGroup()
                        .addComponent(corAries)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCorAries, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesAriesLayout.createSequentialGroup()
                        .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(periodoAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesAriesLayout.createSequentialGroup()
                                .addComponent(elementoAries)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPeriodoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesAriesLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(tfElementoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
            .addGroup(areaInformacoesAriesLayout.createSequentialGroup()
                .addComponent(tituloAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoesAriesLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(imgSignoAries)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaInformacoesAriesLayout.setVerticalGroup(
            areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaInformacoesAriesLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(imgSignoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(tituloAries, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPeriodoAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(periodoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfElementoAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(elementoAries))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPlanetaAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(planetaAries))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCorAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(corAries))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNumeroAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroAreis))
                .addGap(41, 41, 41))
        );

        aries.add(areaInformacoesAries, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 240, 600));

        tituloEnergiaAries.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloEnergiaAries.setText("Energia do Dia");

        amorAries.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        amorAries.setText("Amor:");

        trabalhoAries.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        trabalhoAries.setText("Trabalho:");

        saudeAries.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saudeAries.setText("Saúde:");

        sorteAries.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sorteAries.setText("Sorte:");

        javax.swing.GroupLayout areaEnergiaAriesLayout = new javax.swing.GroupLayout(areaEnergiaAries);
        areaEnergiaAries.setLayout(areaEnergiaAriesLayout);
        areaEnergiaAriesLayout.setHorizontalGroup(
            areaEnergiaAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaAriesLayout.createSequentialGroup()
                .addGroup(areaEnergiaAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaAriesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(amorAries, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaEnergiaAriesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloEnergiaAries, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaEnergiaAriesLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(areaEnergiaAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sorteAries)
                            .addComponent(saudeAries)
                            .addComponent(trabalhoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfAmorAries, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                            .addComponent(tfTrabalhoAries)
                            .addComponent(tfSaudeAries)
                            .addComponent(tfSorteAries))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        areaEnergiaAriesLayout.setVerticalGroup(
            areaEnergiaAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaAriesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amorAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(trabalhoAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saudeAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaudeAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        aries.add(areaEnergiaAries, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 350, 300));

        tituloMensagemAries.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloMensagemAries.setText("Menagem do Dia:");

        txMensagemAries.setColumns(20);
        txMensagemAries.setRows(5);
        jScrollPane2.setViewportView(txMensagemAries);

        btnCopiarMensagemAries.setBackground(new java.awt.Color(102, 102, 102));
        btnCopiarMensagemAries.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCopiarMensagemAries.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMensagemAries.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemAriesLayout = new javax.swing.GroupLayout(areaMensagemAries);
        areaMensagemAries.setLayout(areaMensagemAriesLayout);
        areaMensagemAriesLayout.setHorizontalGroup(
            areaMensagemAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemAriesLayout.createSequentialGroup()
                .addGroup(areaMensagemAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagemAriesLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(areaMensagemAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloMensagemAries)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaMensagemAriesLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(btnCopiarMensagemAries)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        areaMensagemAriesLayout.setVerticalGroup(
            areaMensagemAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemAriesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCopiarMensagemAries, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        aries.add(areaMensagemAries, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 420, 320, 240));

        caracteristicasAries.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        caracteristicasAries.setText("Características");

        pfortesAries.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pfortesAries.setText("Pontos Fortes:");

        pmelhoriasAries.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pmelhoriasAries.setText("Pontos a Melhorar:");

        txFortesAries.setColumns(20);
        txFortesAries.setRows(5);
        txFortesAries.setText("coragem, iniciativa, liderança, determinação e energia.");
        jScrollPane3.setViewportView(txFortesAries);

        txMelhoriasAries.setColumns(20);
        txMelhoriasAries.setRows(5);
        txMelhoriasAries.setText("impulsividade, impaciência, agressividade, teimosia e \ndificuldade em esperar.");
        jScrollPane4.setViewportView(txMelhoriasAries);

        javax.swing.GroupLayout areaCaracteristicasAriesLayout = new javax.swing.GroupLayout(areaCaracteristicasAries);
        areaCaracteristicasAries.setLayout(areaCaracteristicasAriesLayout);
        areaCaracteristicasAriesLayout.setHorizontalGroup(
            areaCaracteristicasAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasAriesLayout.createSequentialGroup()
                .addGroup(areaCaracteristicasAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCaracteristicasAriesLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(areaCaracteristicasAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                            .addComponent(jScrollPane4)
                            .addComponent(pfortesAries, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pmelhoriasAries, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaCaracteristicasAriesLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(caracteristicasAries)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        areaCaracteristicasAriesLayout.setVerticalGroup(
            areaCaracteristicasAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasAriesLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(caracteristicasAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfortesAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pmelhoriasAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        aries.add(areaCaracteristicasAries, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 370, 340));

        previsaoAries.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        previsaoAries.setText("Previsão do Dia: ");

        txPrevisoesAries.setColumns(20);
        txPrevisoesAries.setRows(5);
        jScrollPane1.setViewportView(txPrevisoesAries);

        btnAtualizarPrevisaoAries.setBackground(new java.awt.Color(102, 102, 102));
        btnAtualizarPrevisaoAries.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAtualizarPrevisaoAries.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoAries.setText("Atualizar Previsão");
        btnAtualizarPrevisaoAries.addActionListener(this::btnAtualizarPrevisaoAriesActionPerformed);

        javax.swing.GroupLayout areaPrevisaoAriesLayout = new javax.swing.GroupLayout(areaPrevisaoAries);
        areaPrevisaoAries.setLayout(areaPrevisaoAriesLayout);
        areaPrevisaoAriesLayout.setHorizontalGroup(
            areaPrevisaoAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoAriesLayout.createSequentialGroup()
                .addGroup(areaPrevisaoAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisaoAriesLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(areaPrevisaoAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(previsaoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaPrevisaoAriesLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(btnAtualizarPrevisaoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        areaPrevisaoAriesLayout.setVerticalGroup(
            areaPrevisaoAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoAriesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtualizarPrevisaoAries)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        aries.add(areaPrevisaoAries, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 390, 250));

        fundoAries.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurGiuvannucci\\Documents\\ProjetoAppHoroscopo\\Horospoco\\src\\main\\resources\\assets\\81XnKshePmL._AC_SL1200_.jpg")); // NOI18N
        aries.add(fundoAries, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Áries", aries);

        aquario.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 51, 255)));
        aquario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoesAquario.setBackground(new java.awt.Color(255, 255, 255));

        tfPeriodoAquario.setText("20/01 – 18/02");
        tfPeriodoAquario.addActionListener(this::tfPeriodoAquarioActionPerformed);

        tfElementoAquario.setText("💨 Ar");
        tfElementoAquario.addActionListener(this::tfElementoAquarioActionPerformed);

        tfPlanetaAquario.setText("Urano");

        tfCorAquario.setText("Azul");
        tfCorAquario.addActionListener(this::tfCorAquarioActionPerformed);

        tfNumeroAquario.setText("4");
        tfNumeroAquario.addActionListener(this::tfNumeroAquarioActionPerformed);

        imgSignoAquario.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurGiuvannucci\\Documents\\ProjetoAppHoroscopo\\Horospoco\\src\\main\\resources\\assets\\aquario.png")); // NOI18N

        periodoAquario.setText("PERIODO:");

        planetaAquario.setText("PLANETA REGENTE:");

        corAquario.setText("COR:");

        numeroAquario.setText("NÚMERO DA SORTE:");

        elementoAquario.setText("ELEMENTO:");

        tituloAquario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloAquario.setText("             AQUÁRIO");

        javax.swing.GroupLayout areaInformacoesAquarioLayout = new javax.swing.GroupLayout(areaInformacoesAquario);
        areaInformacoesAquario.setLayout(areaInformacoesAquarioLayout);
        areaInformacoesAquarioLayout.setHorizontalGroup(
            areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaInformacoesAquarioLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                        .addComponent(numeroAquario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNumeroAquario))
                    .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                        .addComponent(planetaAquario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(tfPlanetaAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                        .addComponent(corAquario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCorAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                        .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(periodoAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesAquarioLayout.createSequentialGroup()
                                .addComponent(elementoAquario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPeriodoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(tfElementoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
            .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                .addComponent(tituloAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(imgSignoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaInformacoesAquarioLayout.setVerticalGroup(
            areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaInformacoesAquarioLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(imgSignoAquario)
                .addGap(30, 30, 30)
                .addComponent(tituloAquario, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPeriodoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(periodoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfElementoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(elementoAquario))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPlanetaAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(planetaAquario))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCorAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(corAquario))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNumeroAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroAquario))
                .addGap(41, 41, 41))
        );

        aquario.add(areaInformacoesAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 240, 550));

        previsaoAquario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        previsaoAquario.setText("Previsão do Dia: ");

        txPrevisoesAquario.setColumns(20);
        txPrevisoesAquario.setRows(5);
        jScrollPane45.setViewportView(txPrevisoesAquario);

        btnAtualizarPrevisaoAquario.setBackground(new java.awt.Color(102, 102, 102));
        btnAtualizarPrevisaoAquario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAtualizarPrevisaoAquario.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoAquario.setText("Atualizar Previsão");
        btnAtualizarPrevisaoAquario.addActionListener(this::btnAtualizarPrevisaoAquarioActionPerformed);

        javax.swing.GroupLayout areaPrevisaoAquarioLayout = new javax.swing.GroupLayout(areaPrevisaoAquario);
        areaPrevisaoAquario.setLayout(areaPrevisaoAquarioLayout);
        areaPrevisaoAquarioLayout.setHorizontalGroup(
            areaPrevisaoAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaPrevisaoAquarioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAtualizarPrevisaoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(areaPrevisaoAquarioLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(areaPrevisaoAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(previsaoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane45, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        areaPrevisaoAquarioLayout.setVerticalGroup(
            areaPrevisaoAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoAquarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane45, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtualizarPrevisaoAquario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        aquario.add(areaPrevisaoAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 380, 240));

        tituloEnergiaAquario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloEnergiaAquario.setText("Energia do Dia");

        amorAquario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        amorAquario.setText("Amor:");

        trabalhoAquario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        trabalhoAquario.setText("Trabalho:");

        saudeAquario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saudeAquario.setText("Saúde:");

        sorteAquario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sorteAquario.setText("Sorte:");

        javax.swing.GroupLayout areaEnergiaAquarioLayout = new javax.swing.GroupLayout(areaEnergiaAquario);
        areaEnergiaAquario.setLayout(areaEnergiaAquarioLayout);
        areaEnergiaAquarioLayout.setHorizontalGroup(
            areaEnergiaAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaAquarioLayout.createSequentialGroup()
                .addGroup(areaEnergiaAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaAquarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloEnergiaAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaEnergiaAquarioLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(areaEnergiaAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amorAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(areaEnergiaAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(sorteAquario)
                                .addComponent(saudeAquario)
                                .addComponent(trabalhoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfAmorAquario, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                                .addComponent(tfTrabalhoAquario)
                                .addComponent(tfSaudeAquario)
                                .addComponent(tfSorteAquario)))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        areaEnergiaAquarioLayout.setVerticalGroup(
            areaEnergiaAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaAquarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amorAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(trabalhoAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saudeAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaudeAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        aquario.add(areaEnergiaAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 340, 300));

        tituloMensagemAquario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloMensagemAquario.setText("Mensagem do Dia:");

        txMensagemAquario.setColumns(20);
        txMensagemAquario.setRows(5);
        jScrollPane46.setViewportView(txMensagemAquario);

        btnCopiarMensagemAquario.setBackground(new java.awt.Color(102, 102, 102));
        btnCopiarMensagemAquario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCopiarMensagemAquario.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMensagemAquario.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemAquarioLayout = new javax.swing.GroupLayout(areaMensagemAquario);
        areaMensagemAquario.setLayout(areaMensagemAquarioLayout);
        areaMensagemAquarioLayout.setHorizontalGroup(
            areaMensagemAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemAquarioLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(areaMensagemAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane46, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloMensagemAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaMensagemAquarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCopiarMensagemAquario)
                .addGap(61, 61, 61))
        );
        areaMensagemAquarioLayout.setVerticalGroup(
            areaMensagemAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemAquarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane46, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCopiarMensagemAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        aquario.add(areaMensagemAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 420, 320, 250));

        caracteristicasAquario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        caracteristicasAquario.setText("Características");

        pfortesAquario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pfortesAquario.setText("Pontos Fortes:");

        pmelhoriasAquario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pmelhoriasAquario.setText("Pontos a Melhorar:");

        txFortesAquario.setColumns(20);
        txFortesAquario.setRows(5);
        txFortesAquario.setText("criatividade, independência, originalidade, inteligência e \nvisão de futuro.");
        jScrollPane47.setViewportView(txFortesAquario);

        txMelhoriasAquario.setColumns(20);
        txMelhoriasAquario.setRows(5);
        txMelhoriasAquario.setText("teimosia, distanciamento emocional, imprevisibilidade,\nrebeldia e dificuldade em seguir regras.");
        jScrollPane48.setViewportView(txMelhoriasAquario);

        javax.swing.GroupLayout areaCaracteristicasAquarioLayout = new javax.swing.GroupLayout(areaCaracteristicasAquario);
        areaCaracteristicasAquario.setLayout(areaCaracteristicasAquarioLayout);
        areaCaracteristicasAquarioLayout.setHorizontalGroup(
            areaCaracteristicasAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasAquarioLayout.createSequentialGroup()
                .addGroup(areaCaracteristicasAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCaracteristicasAquarioLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(areaCaracteristicasAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane47, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                            .addComponent(jScrollPane48)
                            .addComponent(pfortesAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pmelhoriasAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaCaracteristicasAquarioLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(caracteristicasAquario)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        areaCaracteristicasAquarioLayout.setVerticalGroup(
            areaCaracteristicasAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasAquarioLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(caracteristicasAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfortesAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pmelhoriasAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        aquario.add(areaCaracteristicasAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 380, 330));

        fundoAquario.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurGiuvannucci\\Documents\\ProjetoAppHoroscopo\\Horospoco\\src\\main\\resources\\assets\\81XnKshePmL._AC_SL1200_.jpg")); // NOI18N
        aquario.add(fundoAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Aquário", aquario);

        cancer.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 51, 255)));
        cancer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoesCancer.setBackground(new java.awt.Color(255, 255, 255));

        tfPeriodoCancer.setText("21/06 – 22/07");
        tfPeriodoCancer.addActionListener(this::tfPeriodoCancerActionPerformed);

        tfElementoCancer.setText("💧 Água");
        tfElementoCancer.addActionListener(this::tfElementoCancerActionPerformed);

        tfPlanetaCancer.setText("Lua");

        tfCorCancer.setText("Branco/Prata");
        tfCorCancer.addActionListener(this::tfCorCancerActionPerformed);

        tfNumeroCancer.setText("2");
        tfNumeroCancer.addActionListener(this::tfNumeroCancerActionPerformed);

        imgSignoCancer.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurGiuvannucci\\Documents\\ProjetoAppHoroscopo\\Horospoco\\src\\main\\resources\\assets\\cancer.png")); // NOI18N

        periodoCancer.setText("PERIODO:");

        planetaCancer.setText("PLANETA REGENTE:");

        corCancer.setText("COR:");

        numeroCancer.setText("NÚMERO DA SORTE:");

        elementoCancer.setText("ELEMENTO:");

        tituloCancer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloCancer.setText("              CÂNCER");

        javax.swing.GroupLayout areaInformacoesCancerLayout = new javax.swing.GroupLayout(areaInformacoesCancer);
        areaInformacoesCancer.setLayout(areaInformacoesCancerLayout);
        areaInformacoesCancerLayout.setHorizontalGroup(
            areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaInformacoesCancerLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                        .addComponent(numeroCancer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNumeroCancer))
                    .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                        .addComponent(planetaCancer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(tfPlanetaCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                        .addComponent(corCancer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCorCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                        .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(periodoCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesCancerLayout.createSequentialGroup()
                                .addComponent(elementoCancer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPeriodoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(tfElementoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
            .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                .addComponent(tituloCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(imgSignoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaInformacoesCancerLayout.setVerticalGroup(
            areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaInformacoesCancerLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(imgSignoCancer)
                .addGap(30, 30, 30)
                .addComponent(tituloCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPeriodoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(periodoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfElementoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(elementoCancer))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPlanetaCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(planetaCancer))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCorCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(corCancer))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNumeroCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroCancer))
                .addGap(41, 41, 41))
        );

        cancer.add(areaInformacoesCancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 240, 550));

        tituloEnergiaCancer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloEnergiaCancer.setText("Energia do Dia");

        amorCancer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        amorCancer.setText("Amor:");

        trabalhoCancer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        trabalhoCancer.setText("Trabalho:");

        saudeCancer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saudeCancer.setText("Saúde:");

        sorteCancer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sorteCancer.setText("Sorte:");

        javax.swing.GroupLayout areaEnergiaCancerLayout = new javax.swing.GroupLayout(areaEnergiaCancer);
        areaEnergiaCancer.setLayout(areaEnergiaCancerLayout);
        areaEnergiaCancerLayout.setHorizontalGroup(
            areaEnergiaCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaCancerLayout.createSequentialGroup()
                .addGroup(areaEnergiaCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaCancerLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(amorCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaEnergiaCancerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloEnergiaCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaEnergiaCancerLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(areaEnergiaCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sorteCancer)
                            .addComponent(saudeCancer)
                            .addComponent(trabalhoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfAmorCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                            .addComponent(tfTrabalhoCancer)
                            .addComponent(tfSaudeCancer)
                            .addComponent(tfSorteCancer))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        areaEnergiaCancerLayout.setVerticalGroup(
            areaEnergiaCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaCancerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amorCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(trabalhoCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saudeCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaudeCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        cancer.add(areaEnergiaCancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 340, 290));

        tituloMensagemCancer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloMensagemCancer.setText("Menagem do Dia:");

        txMensagemCancer.setColumns(20);
        txMensagemCancer.setRows(5);
        jScrollPane5.setViewportView(txMensagemCancer);

        btnCopiarMensagemCancer.setBackground(new java.awt.Color(102, 102, 102));
        btnCopiarMensagemCancer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCopiarMensagemCancer.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMensagemCancer.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemCancerLayout = new javax.swing.GroupLayout(areaMensagemCancer);
        areaMensagemCancer.setLayout(areaMensagemCancerLayout);
        areaMensagemCancerLayout.setHorizontalGroup(
            areaMensagemCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemCancerLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(areaMensagemCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloMensagemCancer)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaMensagemCancerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCopiarMensagemCancer)
                .addGap(61, 61, 61))
        );
        areaMensagemCancerLayout.setVerticalGroup(
            areaMensagemCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemCancerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCopiarMensagemCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cancer.add(areaMensagemCancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 420, 320, 240));

        caracteristicasCancer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        caracteristicasCancer.setText("Características");

        pfortesCancer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pfortesCancer.setText("Pontos Fortes:");

        pmelhoriasCancer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pmelhoriasCancer.setText("Pontos a Melhorar:");

        txFortesCancer.setColumns(20);
        txFortesCancer.setRows(5);
        txFortesCancer.setText("sensibilidade, empatia, proteção, lealdade e forte \nvínculo familiar.");
        jScrollPane6.setViewportView(txFortesCancer);

        txMelhoriasCancer.setColumns(20);
        txMelhoriasCancer.setRows(5);
        txMelhoriasCancer.setText("insegurança, excesso de sensibilidade, apego ao passado, \nmudanças de humor e tendência a se fechar.");
        jScrollPane7.setViewportView(txMelhoriasCancer);

        javax.swing.GroupLayout areaCaracteristicasCancerLayout = new javax.swing.GroupLayout(areaCaracteristicasCancer);
        areaCaracteristicasCancer.setLayout(areaCaracteristicasCancerLayout);
        areaCaracteristicasCancerLayout.setHorizontalGroup(
            areaCaracteristicasCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasCancerLayout.createSequentialGroup()
                .addGroup(areaCaracteristicasCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCaracteristicasCancerLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(areaCaracteristicasCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                            .addComponent(jScrollPane7)
                            .addComponent(pfortesCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pmelhoriasCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaCaracteristicasCancerLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(caracteristicasCancer)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        areaCaracteristicasCancerLayout.setVerticalGroup(
            areaCaracteristicasCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasCancerLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(caracteristicasCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfortesCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pmelhoriasCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cancer.add(areaCaracteristicasCancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 380, 330));

        previsaoCancer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        previsaoCancer.setText("Previsão do Dia: ");

        txPrevisoesCancer.setColumns(20);
        txPrevisoesCancer.setRows(5);
        jScrollPane8.setViewportView(txPrevisoesCancer);

        btnAtualizarPrevisaoCancer.setBackground(new java.awt.Color(102, 102, 102));
        btnAtualizarPrevisaoCancer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAtualizarPrevisaoCancer.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoCancer.setText("Atualizar Previsão");
        btnAtualizarPrevisaoCancer.addActionListener(this::btnAtualizarPrevisaoCancerActionPerformed);

        javax.swing.GroupLayout areaPrevisaoCancerLayout = new javax.swing.GroupLayout(areaPrevisaoCancer);
        areaPrevisaoCancer.setLayout(areaPrevisaoCancerLayout);
        areaPrevisaoCancerLayout.setHorizontalGroup(
            areaPrevisaoCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaPrevisaoCancerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAtualizarPrevisaoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(areaPrevisaoCancerLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(areaPrevisaoCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(previsaoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        areaPrevisaoCancerLayout.setVerticalGroup(
            areaPrevisaoCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoCancerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtualizarPrevisaoCancer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cancer.add(areaPrevisaoCancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 380, 240));

        fundoCancer.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurGiuvannucci\\Documents\\ProjetoAppHoroscopo\\Horospoco\\src\\main\\resources\\assets\\81XnKshePmL._AC_SL1200_.jpg")); // NOI18N
        cancer.add(fundoCancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, -1, -1));

        areaAbas.addTab("Câncer", cancer);

        escorpiao.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 51, 255)));
        escorpiao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoesEscorpiao.setBackground(new java.awt.Color(255, 255, 255));

        tfPeriodoEscorpiao.setText("23/10 – 21/11");
        tfPeriodoEscorpiao.addActionListener(this::tfPeriodoEscorpiaoActionPerformed);

        tfElementoEscorpiao.setText("💧 Água");
        tfElementoEscorpiao.addActionListener(this::tfElementoEscorpiaoActionPerformed);

        tfPlanetaEscorpiao.setText("Plutão");

        tfCorEscorpiao.setText("Vermelho-escuro");
        tfCorEscorpiao.addActionListener(this::tfCorEscorpiaoActionPerformed);

        tfNumeroEscorpiao.setText("8");
        tfNumeroEscorpiao.addActionListener(this::tfNumeroEscorpiaoActionPerformed);

        imgSignoEscorpiao.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurGiuvannucci\\Documents\\ProjetoAppHoroscopo\\Horospoco\\src\\main\\resources\\assets\\escorpiao.png")); // NOI18N

        periodoEscorpiao.setText("PERIODO:");

        planetaEscorpiao.setText("PLANETA REGENTE:");

        corEscorpiao.setText("COR:");

        numeroEscorpiao.setText("NÚMERO DA SORTE:");

        elementoEscorpiao.setText("ELEMENTO:");

        tituloEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloEscorpiao.setText("            ESCORPIÃO");

        javax.swing.GroupLayout areaInformacoesEscorpiaoLayout = new javax.swing.GroupLayout(areaInformacoesEscorpiao);
        areaInformacoesEscorpiao.setLayout(areaInformacoesEscorpiaoLayout);
        areaInformacoesEscorpiaoLayout.setHorizontalGroup(
            areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaInformacoesEscorpiaoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                        .addComponent(numeroEscorpiao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNumeroEscorpiao))
                    .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                        .addComponent(planetaEscorpiao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(tfPlanetaEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                        .addComponent(corEscorpiao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCorEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                        .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(periodoEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesEscorpiaoLayout.createSequentialGroup()
                                .addComponent(elementoEscorpiao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPeriodoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(tfElementoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
            .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                .addComponent(tituloEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(imgSignoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaInformacoesEscorpiaoLayout.setVerticalGroup(
            areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaInformacoesEscorpiaoLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(imgSignoEscorpiao)
                .addGap(30, 30, 30)
                .addComponent(tituloEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPeriodoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(periodoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfElementoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(elementoEscorpiao))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPlanetaEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(planetaEscorpiao))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCorEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(corEscorpiao))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNumeroEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroEscorpiao))
                .addGap(41, 41, 41))
        );

        escorpiao.add(areaInformacoesEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 240, 550));

        tituloEnergiaEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloEnergiaEscorpiao.setText("Energia do Dia");

        amorEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        amorEscorpiao.setText("Amor:");

        trabalhoEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        trabalhoEscorpiao.setText("Trabalho:");

        saudeEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saudeEscorpiao.setText("Saúde:");

        sorteEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sorteEscorpiao.setText("Sorte:");

        javax.swing.GroupLayout areaEnergiaEscorpiaoLayout = new javax.swing.GroupLayout(areaEnergiaEscorpiao);
        areaEnergiaEscorpiao.setLayout(areaEnergiaEscorpiaoLayout);
        areaEnergiaEscorpiaoLayout.setHorizontalGroup(
            areaEnergiaEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                .addGroup(areaEnergiaEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(amorEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloEnergiaEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(areaEnergiaEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sorteEscorpiao)
                            .addComponent(saudeEscorpiao)
                            .addComponent(trabalhoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfAmorEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                            .addComponent(tfTrabalhoEscorpiao)
                            .addComponent(tfSaudeEscorpiao)
                            .addComponent(tfSorteEscorpiao))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        areaEnergiaEscorpiaoLayout.setVerticalGroup(
            areaEnergiaEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amorEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(trabalhoEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saudeEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaudeEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        escorpiao.add(areaEnergiaEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 340, 290));

        tituloMensagemEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloMensagemEscorpiao.setText("Menagem do Dia:");

        txMensagemEscorpiao.setColumns(20);
        txMensagemEscorpiao.setRows(5);
        jScrollPane9.setViewportView(txMensagemEscorpiao);

        btnCopiarMensagemEscorpiao.setBackground(new java.awt.Color(102, 102, 102));
        btnCopiarMensagemEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCopiarMensagemEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMensagemEscorpiao.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemEscorpiaoLayout = new javax.swing.GroupLayout(areaMensagemEscorpiao);
        areaMensagemEscorpiao.setLayout(areaMensagemEscorpiaoLayout);
        areaMensagemEscorpiaoLayout.setHorizontalGroup(
            areaMensagemEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemEscorpiaoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(areaMensagemEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloMensagemEscorpiao)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaMensagemEscorpiaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCopiarMensagemEscorpiao)
                .addGap(61, 61, 61))
        );
        areaMensagemEscorpiaoLayout.setVerticalGroup(
            areaMensagemEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemEscorpiaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCopiarMensagemEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        escorpiao.add(areaMensagemEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 420, 320, 240));

        caracteristicasEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        caracteristicasEscorpiao.setText("Características");

        pfortesEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pfortesEscorpiao.setText("Pontos Fortes:");

        pmelhoriasEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pmelhoriasEscorpiao.setText("Pontos a Melhorar:");

        txFortesEscorpiao.setColumns(20);
        txFortesEscorpiao.setRows(5);
        txFortesEscorpiao.setText("determinação, intensidade, lealdade, coragem e \ncapacidade de investigação.");
        jScrollPane10.setViewportView(txFortesEscorpiao);

        txMelhoriasEscorpiao.setColumns(20);
        txMelhoriasEscorpiao.setRows(5);
        txMelhoriasEscorpiao.setText("ciúme, desconfiança, possessividade, rancor e \ntendência ao controle.");
        jScrollPane11.setViewportView(txMelhoriasEscorpiao);

        javax.swing.GroupLayout areaCaracteristicasEscorpiaoLayout = new javax.swing.GroupLayout(areaCaracteristicasEscorpiao);
        areaCaracteristicasEscorpiao.setLayout(areaCaracteristicasEscorpiaoLayout);
        areaCaracteristicasEscorpiaoLayout.setHorizontalGroup(
            areaCaracteristicasEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasEscorpiaoLayout.createSequentialGroup()
                .addGroup(areaCaracteristicasEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCaracteristicasEscorpiaoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(areaCaracteristicasEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                            .addComponent(jScrollPane11)
                            .addComponent(pfortesEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pmelhoriasEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaCaracteristicasEscorpiaoLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(caracteristicasEscorpiao)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        areaCaracteristicasEscorpiaoLayout.setVerticalGroup(
            areaCaracteristicasEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasEscorpiaoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(caracteristicasEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfortesEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pmelhoriasEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        escorpiao.add(areaCaracteristicasEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 380, 330));

        previsaoEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        previsaoEscorpiao.setText("Previsão do Dia: ");

        txPrevisoesEscorpiao.setColumns(20);
        txPrevisoesEscorpiao.setRows(5);
        jScrollPane12.setViewportView(txPrevisoesEscorpiao);

        btnAtualizarPrevisaoEscorpiao.setBackground(new java.awt.Color(102, 102, 102));
        btnAtualizarPrevisaoEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAtualizarPrevisaoEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoEscorpiao.setText("Atualizar Previsão");
        btnAtualizarPrevisaoEscorpiao.addActionListener(this::btnAtualizarPrevisaoEscorpiaoActionPerformed);

        javax.swing.GroupLayout areaPrevisaoEscorpiaoLayout = new javax.swing.GroupLayout(areaPrevisaoEscorpiao);
        areaPrevisaoEscorpiao.setLayout(areaPrevisaoEscorpiaoLayout);
        areaPrevisaoEscorpiaoLayout.setHorizontalGroup(
            areaPrevisaoEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaPrevisaoEscorpiaoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAtualizarPrevisaoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(areaPrevisaoEscorpiaoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(areaPrevisaoEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(previsaoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        areaPrevisaoEscorpiaoLayout.setVerticalGroup(
            areaPrevisaoEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoEscorpiaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtualizarPrevisaoEscorpiao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        escorpiao.add(areaPrevisaoEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 380, 240));

        fundoEscorpiao.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurGiuvannucci\\Documents\\ProjetoAppHoroscopo\\Horospoco\\src\\main\\resources\\assets\\81XnKshePmL._AC_SL1200_.jpg")); // NOI18N
        escorpiao.add(fundoEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, -1, -1));

        areaAbas.addTab("Escorpião", escorpiao);

        gemeos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 51, 255)));
        gemeos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoesGemeos.setBackground(new java.awt.Color(255, 255, 255));

        tfPeriodoGemeos.setText("21/05 – 20/06");
        tfPeriodoGemeos.addActionListener(this::tfPeriodoGemeosActionPerformed);

        tfElementoGemeos.setText("💨 Ar");
        tfElementoGemeos.addActionListener(this::tfElementoGemeosActionPerformed);

        tfPlanetaGemeos.setText("Mercúrio");

        tfCorGemeos.setText("Amarelo");
        tfCorGemeos.addActionListener(this::tfCorGemeosActionPerformed);

        tfNumeroGemeos.setText("5");
        tfNumeroGemeos.addActionListener(this::tfNumeroGemeosActionPerformed);

        imgSignoGemeos.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurGiuvannucci\\Documents\\ProjetoAppHoroscopo\\Horospoco\\src\\main\\resources\\assets\\gemeos.png")); // NOI18N

        periodoGemeos.setText("PERIODO:");

        planetaGemeos.setText("PLANETA REGENTE:");

        corGemeos.setText("COR:");

        numeroGemeos.setText("NÚMERO DA SORTE:");

        elementoGemeos.setText("ELEMENTO:");

        tituloGemeos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloGemeos.setText("                 GÊMEOS");

        javax.swing.GroupLayout areaInformacoesGemeosLayout = new javax.swing.GroupLayout(areaInformacoesGemeos);
        areaInformacoesGemeos.setLayout(areaInformacoesGemeosLayout);
        areaInformacoesGemeosLayout.setHorizontalGroup(
            areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaInformacoesGemeosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                        .addComponent(numeroGemeos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNumeroGemeos))
                    .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                        .addComponent(planetaGemeos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(tfPlanetaGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                        .addComponent(corGemeos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCorGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                        .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(periodoGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesGemeosLayout.createSequentialGroup()
                                .addComponent(elementoGemeos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPeriodoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(tfElementoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
            .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                .addComponent(tituloGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(imgSignoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaInformacoesGemeosLayout.setVerticalGroup(
            areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaInformacoesGemeosLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(imgSignoGemeos)
                .addGap(30, 30, 30)
                .addComponent(tituloGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPeriodoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(periodoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfElementoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(elementoGemeos))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPlanetaGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(planetaGemeos))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCorGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(corGemeos))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNumeroGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroGemeos))
                .addGap(41, 41, 41))
        );

        gemeos.add(areaInformacoesGemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 240, 550));

        GemeosGemeos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        GemeosGemeos.setText("Previsão do Dia: ");

        txPrevisoesGemeos.setColumns(20);
        txPrevisoesGemeos.setRows(5);
        jScrollPane13.setViewportView(txPrevisoesGemeos);

        btnAtualizarPrevisaoGemeos.setBackground(new java.awt.Color(102, 102, 102));
        btnAtualizarPrevisaoGemeos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAtualizarPrevisaoGemeos.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoGemeos.setText("Atualizar Previsão");
        btnAtualizarPrevisaoGemeos.addActionListener(this::btnAtualizarPrevisaoGemeosActionPerformed);

        javax.swing.GroupLayout areaPrevisaoGemeosLayout = new javax.swing.GroupLayout(areaPrevisaoGemeos);
        areaPrevisaoGemeos.setLayout(areaPrevisaoGemeosLayout);
        areaPrevisaoGemeosLayout.setHorizontalGroup(
            areaPrevisaoGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaPrevisaoGemeosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAtualizarPrevisaoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(areaPrevisaoGemeosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(areaPrevisaoGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GemeosGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        areaPrevisaoGemeosLayout.setVerticalGroup(
            areaPrevisaoGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoGemeosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GemeosGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtualizarPrevisaoGemeos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gemeos.add(areaPrevisaoGemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 380, 240));

        tituloEnergiaGemeos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloEnergiaGemeos.setText("Energia do Dia");

        amorGemeos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        amorGemeos.setText("Amor:");

        trabalhoGemeos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        trabalhoGemeos.setText("Trabalho:");

        saudeGemeos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saudeGemeos.setText("Saúde:");

        sorteGemeos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sorteGemeos.setText("Sorte:");

        javax.swing.GroupLayout areaEnergiaGemeosLayout = new javax.swing.GroupLayout(areaEnergiaGemeos);
        areaEnergiaGemeos.setLayout(areaEnergiaGemeosLayout);
        areaEnergiaGemeosLayout.setHorizontalGroup(
            areaEnergiaGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaGemeosLayout.createSequentialGroup()
                .addGroup(areaEnergiaGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaGemeosLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(amorGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaEnergiaGemeosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloEnergiaGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaEnergiaGemeosLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(areaEnergiaGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sorteGemeos)
                            .addComponent(saudeGemeos)
                            .addComponent(trabalhoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfAmorGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                            .addComponent(tfTrabalhoGemeos)
                            .addComponent(tfSaudeGemeos)
                            .addComponent(tfSorteGemeos))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        areaEnergiaGemeosLayout.setVerticalGroup(
            areaEnergiaGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaGemeosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amorGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(trabalhoGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saudeGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaudeGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        gemeos.add(areaEnergiaGemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 330, 270));

        tituloMensagemGemeos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloMensagemGemeos.setText("Menagem do Dia:");

        txMensagemGemeos.setColumns(20);
        txMensagemGemeos.setRows(5);
        jScrollPane14.setViewportView(txMensagemGemeos);

        btnCopiarMensagemGemeos.setBackground(new java.awt.Color(102, 102, 102));
        btnCopiarMensagemGemeos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCopiarMensagemGemeos.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMensagemGemeos.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemGemeosLayout = new javax.swing.GroupLayout(areaMensagemGemeos);
        areaMensagemGemeos.setLayout(areaMensagemGemeosLayout);
        areaMensagemGemeosLayout.setHorizontalGroup(
            areaMensagemGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemGemeosLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(areaMensagemGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloMensagemGemeos)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaMensagemGemeosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCopiarMensagemGemeos)
                .addGap(61, 61, 61))
        );
        areaMensagemGemeosLayout.setVerticalGroup(
            areaMensagemGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemGemeosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCopiarMensagemGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gemeos.add(areaMensagemGemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 420, 320, 240));

        caracteristicasGemeos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        caracteristicasGemeos.setText("Características");

        pfortesGemeos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pfortesGemeos.setText("Pontos Fortes:");

        pmelhoriasGemeos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pmelhoriasGemeos.setText("Pontos a Melhorar:");

        txFortesGemeos.setColumns(20);
        txFortesGemeos.setRows(5);
        txFortesGemeos.setText("comunicação, inteligência, curiosidade, criatividade \ne adaptabilidade.");
        jScrollPane15.setViewportView(txFortesGemeos);

        txMelhoriasGemeos.setColumns(20);
        txMelhoriasGemeos.setRows(5);
        txMelhoriasGemeos.setText("inconstância, ansiedade, dispersão, superficialidade \ne indecisão.");
        jScrollPane16.setViewportView(txMelhoriasGemeos);

        javax.swing.GroupLayout areaCaracteristicasGemeosLayout = new javax.swing.GroupLayout(areaCaracteristicasGemeos);
        areaCaracteristicasGemeos.setLayout(areaCaracteristicasGemeosLayout);
        areaCaracteristicasGemeosLayout.setHorizontalGroup(
            areaCaracteristicasGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasGemeosLayout.createSequentialGroup()
                .addGroup(areaCaracteristicasGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCaracteristicasGemeosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(areaCaracteristicasGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                            .addComponent(jScrollPane16)
                            .addComponent(pfortesGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pmelhoriasGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaCaracteristicasGemeosLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(caracteristicasGemeos)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        areaCaracteristicasGemeosLayout.setVerticalGroup(
            areaCaracteristicasGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasGemeosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(caracteristicasGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfortesGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pmelhoriasGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gemeos.add(areaCaracteristicasGemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 380, 330));

        fundoGemeos.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurGiuvannucci\\Documents\\ProjetoAppHoroscopo\\Horospoco\\src\\main\\resources\\assets\\81XnKshePmL._AC_SL1200_.jpg")); // NOI18N
        gemeos.add(fundoGemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, -1, -1));

        areaAbas.addTab("Gêmeos", gemeos);

        leao.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 51, 255)));
        leao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoesLeao.setBackground(new java.awt.Color(255, 255, 255));

        tfPeriodoLeao.setText("23/07 – 22/08");
        tfPeriodoLeao.addActionListener(this::tfPeriodoLeaoActionPerformed);

        tfElementoLeao.setText("🔥 Fogo");
        tfElementoLeao.addActionListener(this::tfElementoLeaoActionPerformed);

        tfPlanetaLeao.setText("Sol");

        tfCorLeao.setText("Dourado");
        tfCorLeao.addActionListener(this::tfCorLeaoActionPerformed);

        tfNumeroLeao.setText("1");
        tfNumeroLeao.addActionListener(this::tfNumeroLeaoActionPerformed);

        imgSignoLeao.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurGiuvannucci\\Documents\\ProjetoAppHoroscopo\\Horospoco\\src\\main\\resources\\assets\\leao.png")); // NOI18N

        periodoLeao.setText("PERIODO:");

        planetaLeao.setText("PLANETA REGENTE:");

        corLeao.setText("COR:");

        numeroLeao.setText("NÚMERO DA SORTE:");

        elementoLeao.setText("ELEMENTO:");

        tituloLeao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloLeao.setText("                   LEÃO");

        javax.swing.GroupLayout areaInformacoesLeaoLayout = new javax.swing.GroupLayout(areaInformacoesLeao);
        areaInformacoesLeao.setLayout(areaInformacoesLeaoLayout);
        areaInformacoesLeaoLayout.setHorizontalGroup(
            areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaInformacoesLeaoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                        .addComponent(numeroLeao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNumeroLeao))
                    .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                        .addComponent(planetaLeao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(tfPlanetaLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                        .addComponent(corLeao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCorLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                        .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(periodoLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesLeaoLayout.createSequentialGroup()
                                .addComponent(elementoLeao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPeriodoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(tfElementoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
            .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                .addComponent(tituloLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(imgSignoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaInformacoesLeaoLayout.setVerticalGroup(
            areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaInformacoesLeaoLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(imgSignoLeao)
                .addGap(30, 30, 30)
                .addComponent(tituloLeao, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPeriodoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(periodoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfElementoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(elementoLeao))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPlanetaLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(planetaLeao))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCorLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(corLeao))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNumeroLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroLeao))
                .addGap(41, 41, 41))
        );

        leao.add(areaInformacoesLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 240, 550));

        previsaoLeao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        previsaoLeao.setText("Previsão do Dia: ");

        txPrevisoesLeao.setColumns(20);
        txPrevisoesLeao.setRows(5);
        jScrollPane17.setViewportView(txPrevisoesLeao);

        btnAtualizarPrevisaoLeao.setBackground(new java.awt.Color(102, 102, 102));
        btnAtualizarPrevisaoLeao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAtualizarPrevisaoLeao.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoLeao.setText("Atualizar Previsão");
        btnAtualizarPrevisaoLeao.addActionListener(this::btnAtualizarPrevisaoLeaoActionPerformed);

        javax.swing.GroupLayout areaPrevisaoLeaoLayout = new javax.swing.GroupLayout(areaPrevisaoLeao);
        areaPrevisaoLeao.setLayout(areaPrevisaoLeaoLayout);
        areaPrevisaoLeaoLayout.setHorizontalGroup(
            areaPrevisaoLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaPrevisaoLeaoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAtualizarPrevisaoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(areaPrevisaoLeaoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(areaPrevisaoLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(previsaoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        areaPrevisaoLeaoLayout.setVerticalGroup(
            areaPrevisaoLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoLeaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtualizarPrevisaoLeao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        leao.add(areaPrevisaoLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 380, 240));

        tituloEnergiaLeao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloEnergiaLeao.setText("Energia do Dia");

        amorLeao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        amorLeao.setText("Amor:");

        trabalhoLeao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        trabalhoLeao.setText("Trabalho:");

        saudeLeao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saudeLeao.setText("Saúde:");

        sorteLeao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sorteLeao.setText("Sorte:");

        javax.swing.GroupLayout areaEnergiaLeaoLayout = new javax.swing.GroupLayout(areaEnergiaLeao);
        areaEnergiaLeao.setLayout(areaEnergiaLeaoLayout);
        areaEnergiaLeaoLayout.setHorizontalGroup(
            areaEnergiaLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaLeaoLayout.createSequentialGroup()
                .addGroup(areaEnergiaLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaLeaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloEnergiaLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaEnergiaLeaoLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(areaEnergiaLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amorLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(areaEnergiaLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(sorteLeao)
                                .addComponent(saudeLeao)
                                .addComponent(trabalhoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfAmorLeao, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                                .addComponent(tfTrabalhoLeao)
                                .addComponent(tfSaudeLeao)
                                .addComponent(tfSorteLeao)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        areaEnergiaLeaoLayout.setVerticalGroup(
            areaEnergiaLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaLeaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amorLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(trabalhoLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saudeLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaudeLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        leao.add(areaEnergiaLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 330, 270));

        tituloMensagemLeao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloMensagemLeao.setText("Menagem do Dia:");

        txMensagemLeao.setColumns(20);
        txMensagemLeao.setRows(5);
        jScrollPane18.setViewportView(txMensagemLeao);

        btnCopiarMensagemLeao.setBackground(new java.awt.Color(102, 102, 102));
        btnCopiarMensagemLeao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCopiarMensagemLeao.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMensagemLeao.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemLeaoLayout = new javax.swing.GroupLayout(areaMensagemLeao);
        areaMensagemLeao.setLayout(areaMensagemLeaoLayout);
        areaMensagemLeaoLayout.setHorizontalGroup(
            areaMensagemLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLeaoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(areaMensagemLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloMensagemLeao)
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaMensagemLeaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCopiarMensagemLeao)
                .addGap(61, 61, 61))
        );
        areaMensagemLeaoLayout.setVerticalGroup(
            areaMensagemLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLeaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCopiarMensagemLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        leao.add(areaMensagemLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 420, 320, 240));

        caracteristicasLeao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        caracteristicasLeao.setText("Características");

        pfortesLeao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pfortesLeao.setText("Pontos Fortes:");

        pmelhoriasLeao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pmelhoriasLeao.setText("Pontos a Melhorar:");

        txFortesLeao.setColumns(20);
        txFortesLeao.setRows(5);
        txFortesLeao.setText("liderança, confiança, criatividade, generosidade \ne entusiasmo.");
        jScrollPane19.setViewportView(txFortesLeao);

        txMelhoriasLeao.setColumns(20);
        txMelhoriasLeao.setRows(5);
        txMelhoriasLeao.setText("orgulho, necessidade de reconhecimento, autoritarismo, \nvaidade e dificuldade em aceitar críticas.");
        jScrollPane20.setViewportView(txMelhoriasLeao);

        javax.swing.GroupLayout areaCaracteristicasLeaoLayout = new javax.swing.GroupLayout(areaCaracteristicasLeao);
        areaCaracteristicasLeao.setLayout(areaCaracteristicasLeaoLayout);
        areaCaracteristicasLeaoLayout.setHorizontalGroup(
            areaCaracteristicasLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasLeaoLayout.createSequentialGroup()
                .addGroup(areaCaracteristicasLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCaracteristicasLeaoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(areaCaracteristicasLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane19, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                            .addComponent(jScrollPane20)
                            .addComponent(pfortesLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pmelhoriasLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaCaracteristicasLeaoLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(caracteristicasLeao)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        areaCaracteristicasLeaoLayout.setVerticalGroup(
            areaCaracteristicasLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasLeaoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(caracteristicasLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfortesLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pmelhoriasLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        leao.add(areaCaracteristicasLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 380, 330));

        fundoLeao.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurGiuvannucci\\Documents\\ProjetoAppHoroscopo\\Horospoco\\src\\main\\resources\\assets\\81XnKshePmL._AC_SL1200_.jpg")); // NOI18N
        leao.add(fundoLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, -1, -1));

        areaAbas.addTab("Leão", leao);

        libra.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 51, 255)));
        libra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoesLibra.setBackground(new java.awt.Color(255, 255, 255));

        tfPeriodoLibra.setText("23/09 – 22/10");
        tfPeriodoLibra.addActionListener(this::tfPeriodoLibraActionPerformed);

        tfElementoLibra.setText("💨 Ar");
        tfElementoLibra.addActionListener(this::tfElementoLibraActionPerformed);

        tfPlanetaLibra.setText("Vênus");

        tfCorLibra.setText("Rosa/Azul-claro");
        tfCorLibra.addActionListener(this::tfCorLibraActionPerformed);

        tfNumeroLibra.setText("6");
        tfNumeroLibra.addActionListener(this::tfNumeroLibraActionPerformed);

        imgSignoLibra.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurGiuvannucci\\Documents\\ProjetoAppHoroscopo\\Horospoco\\src\\main\\resources\\assets\\libra.png")); // NOI18N

        periodoLibra.setText("PERIODO:");

        planetaLibra.setText("PLANETA REGENTE:");

        corLibra.setText("COR:");

        numeroLibra.setText("NÚMERO DA SORTE:");

        elementoLibra.setText("ELEMENTO:");

        tituloLibra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloLibra.setText("                  LIBRA");

        javax.swing.GroupLayout areaInformacoesLibraLayout = new javax.swing.GroupLayout(areaInformacoesLibra);
        areaInformacoesLibra.setLayout(areaInformacoesLibraLayout);
        areaInformacoesLibraLayout.setHorizontalGroup(
            areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaInformacoesLibraLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                        .addComponent(numeroLibra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNumeroLibra))
                    .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                        .addComponent(planetaLibra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(tfPlanetaLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                        .addComponent(corLibra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCorLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                        .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(periodoLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesLibraLayout.createSequentialGroup()
                                .addComponent(elementoLibra)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPeriodoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(tfElementoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
            .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                .addComponent(tituloLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(imgSignoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaInformacoesLibraLayout.setVerticalGroup(
            areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaInformacoesLibraLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(imgSignoLibra)
                .addGap(30, 30, 30)
                .addComponent(tituloLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPeriodoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(periodoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfElementoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(elementoLibra))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPlanetaLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(planetaLibra))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCorLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(corLibra))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNumeroLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroLibra))
                .addGap(41, 41, 41))
        );

        libra.add(areaInformacoesLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 240, 550));

        previsaoLibra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        previsaoLibra.setText("Previsão do Dia: ");

        txPrevisoesLibra.setColumns(20);
        txPrevisoesLibra.setRows(5);
        jScrollPane21.setViewportView(txPrevisoesLibra);

        btnAtualizarPrevisaoLibra.setBackground(new java.awt.Color(102, 102, 102));
        btnAtualizarPrevisaoLibra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAtualizarPrevisaoLibra.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoLibra.setText("Atualizar Previsão");
        btnAtualizarPrevisaoLibra.addActionListener(this::btnAtualizarPrevisaoLibraActionPerformed);

        javax.swing.GroupLayout areaPrevisaoLibraLayout = new javax.swing.GroupLayout(areaPrevisaoLibra);
        areaPrevisaoLibra.setLayout(areaPrevisaoLibraLayout);
        areaPrevisaoLibraLayout.setHorizontalGroup(
            areaPrevisaoLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaPrevisaoLibraLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAtualizarPrevisaoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(areaPrevisaoLibraLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(areaPrevisaoLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(previsaoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        areaPrevisaoLibraLayout.setVerticalGroup(
            areaPrevisaoLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoLibraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoLibra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtualizarPrevisaoLibra)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        libra.add(areaPrevisaoLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 380, 240));

        tituloEnergiaLibra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloEnergiaLibra.setText("Energia do Dia");

        amorLibra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        amorLibra.setText("Amor:");

        trabalhoLibra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        trabalhoLibra.setText("Trabalho:");

        saudeLibra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saudeLibra.setText("Saúde:");

        sorteLibra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sorteLibra.setText("Sorte:");

        javax.swing.GroupLayout areaEnergiaLibraLayout = new javax.swing.GroupLayout(areaEnergiaLibra);
        areaEnergiaLibra.setLayout(areaEnergiaLibraLayout);
        areaEnergiaLibraLayout.setHorizontalGroup(
            areaEnergiaLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaLibraLayout.createSequentialGroup()
                .addGroup(areaEnergiaLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaLibraLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(amorLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaEnergiaLibraLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloEnergiaLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaEnergiaLibraLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(areaEnergiaLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sorteLibra)
                            .addComponent(saudeLibra)
                            .addComponent(trabalhoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfAmorLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                            .addComponent(tfTrabalhoLibra)
                            .addComponent(tfSaudeLibra)
                            .addComponent(tfSorteLibra))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        areaEnergiaLibraLayout.setVerticalGroup(
            areaEnergiaLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaLibraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaLibra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amorLibra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(trabalhoLibra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saudeLibra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaudeLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteLibra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        libra.add(areaEnergiaLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 330, 270));

        tituloMensagemLibra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloMensagemLibra.setText("Menagem do Dia:");

        txMensagemLibra.setColumns(20);
        txMensagemLibra.setRows(5);
        jScrollPane22.setViewportView(txMensagemLibra);

        btnCopiarMensagemLibra.setBackground(new java.awt.Color(102, 102, 102));
        btnCopiarMensagemLibra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCopiarMensagemLibra.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMensagemLibra.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemLibraLayout = new javax.swing.GroupLayout(areaMensagemLibra);
        areaMensagemLibra.setLayout(areaMensagemLibraLayout);
        areaMensagemLibraLayout.setHorizontalGroup(
            areaMensagemLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLibraLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(areaMensagemLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloMensagemLibra)
                    .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaMensagemLibraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCopiarMensagemLibra)
                .addGap(61, 61, 61))
        );
        areaMensagemLibraLayout.setVerticalGroup(
            areaMensagemLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLibraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemLibra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCopiarMensagemLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        libra.add(areaMensagemLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 410, 320, 240));

        caracteristicasLibra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        caracteristicasLibra.setText("Características");

        pfortesLibra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pfortesLibra.setText("Pontos Fortes:");

        pmelhoriasLibra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pmelhoriasLibra.setText("Pontos a Melhorar:");

        txFortesLibra.setColumns(20);
        txFortesLibra.setRows(5);
        txFortesLibra.setText("diplomacia, sociabilidade, justiça, charme e capacidade \nde conciliação.");
        jScrollPane23.setViewportView(txFortesLibra);

        txMelhoriasLibra.setColumns(20);
        txMelhoriasLibra.setRows(5);
        txMelhoriasLibra.setText("indecisão, necessidade de aprovação, evitar conflitos \nexcessivamente e dificuldade em tomar decisões.");
        jScrollPane24.setViewportView(txMelhoriasLibra);

        javax.swing.GroupLayout areaCaracteristicasLibraLayout = new javax.swing.GroupLayout(areaCaracteristicasLibra);
        areaCaracteristicasLibra.setLayout(areaCaracteristicasLibraLayout);
        areaCaracteristicasLibraLayout.setHorizontalGroup(
            areaCaracteristicasLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasLibraLayout.createSequentialGroup()
                .addGroup(areaCaracteristicasLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCaracteristicasLibraLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(areaCaracteristicasLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane23, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                            .addComponent(jScrollPane24)
                            .addComponent(pfortesLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pmelhoriasLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaCaracteristicasLibraLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(caracteristicasLibra)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        areaCaracteristicasLibraLayout.setVerticalGroup(
            areaCaracteristicasLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasLibraLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(caracteristicasLibra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfortesLibra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pmelhoriasLibra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        libra.add(areaCaracteristicasLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 380, 330));

        fundoLibra.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurGiuvannucci\\Documents\\ProjetoAppHoroscopo\\Horospoco\\src\\main\\resources\\assets\\81XnKshePmL._AC_SL1200_.jpg")); // NOI18N
        libra.add(fundoLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, -1, -1));

        areaAbas.addTab("Libra", libra);

        peixes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 51, 255)));
        peixes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoesPeixes.setBackground(new java.awt.Color(255, 255, 255));

        tfPeriodoPeixes.setText("19/02 – 20/03");
        tfPeriodoPeixes.addActionListener(this::tfPeriodoPeixesActionPerformed);

        tfElementoPeixes.setText("💧 Água");
        tfElementoPeixes.addActionListener(this::tfElementoPeixesActionPerformed);

        tfPlanetaPeixes.setText("Netuno");

        tfCorPeixes.setText("Lilás/Verde-mar");
        tfCorPeixes.addActionListener(this::tfCorPeixesActionPerformed);

        tfNumeroPeixes.setText("7");
        tfNumeroPeixes.addActionListener(this::tfNumeroPeixesActionPerformed);

        imgSignoPeixes.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurGiuvannucci\\Documents\\ProjetoAppHoroscopo\\Horospoco\\src\\main\\resources\\assets\\peixes.png")); // NOI18N

        periodoPeixes.setText("PERIODO:");

        planetaPeixes.setText("PLANETA REGENTE:");

        corPeixes.setText("COR:");

        numeroPeixes.setText("NÚMERO DA SORTE:");

        elementoPeixes.setText("ELEMENTO:");

        tituloPeixes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloPeixes.setText("                 PEIXES");

        javax.swing.GroupLayout areaInformacoesPeixesLayout = new javax.swing.GroupLayout(areaInformacoesPeixes);
        areaInformacoesPeixes.setLayout(areaInformacoesPeixesLayout);
        areaInformacoesPeixesLayout.setHorizontalGroup(
            areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaInformacoesPeixesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                        .addComponent(numeroPeixes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNumeroPeixes))
                    .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                        .addComponent(planetaPeixes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(tfPlanetaPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                        .addComponent(corPeixes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCorPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                        .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(periodoPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesPeixesLayout.createSequentialGroup()
                                .addComponent(elementoPeixes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPeriodoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(tfElementoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
            .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                .addComponent(tituloPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(imgSignoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaInformacoesPeixesLayout.setVerticalGroup(
            areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaInformacoesPeixesLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(imgSignoPeixes)
                .addGap(30, 30, 30)
                .addComponent(tituloPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPeriodoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(periodoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfElementoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(elementoPeixes))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPlanetaPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(planetaPeixes))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCorPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(corPeixes))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNumeroPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroPeixes))
                .addGap(41, 41, 41))
        );

        peixes.add(areaInformacoesPeixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 240, 550));

        previsaoPeixes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        previsaoPeixes.setText("Previsão do Dia: ");

        txPrevisoesPeixes.setColumns(20);
        txPrevisoesPeixes.setRows(5);
        jScrollPane25.setViewportView(txPrevisoesPeixes);

        btnAtualizarPrevisaoPeixes.setBackground(new java.awt.Color(102, 102, 102));
        btnAtualizarPrevisaoPeixes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAtualizarPrevisaoPeixes.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoPeixes.setText("Atualizar Previsão");
        btnAtualizarPrevisaoPeixes.addActionListener(this::btnAtualizarPrevisaoPeixesActionPerformed);

        javax.swing.GroupLayout areaPrevisaoPeixesLayout = new javax.swing.GroupLayout(areaPrevisaoPeixes);
        areaPrevisaoPeixes.setLayout(areaPrevisaoPeixesLayout);
        areaPrevisaoPeixesLayout.setHorizontalGroup(
            areaPrevisaoPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaPrevisaoPeixesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAtualizarPrevisaoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(areaPrevisaoPeixesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(areaPrevisaoPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(previsaoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        areaPrevisaoPeixesLayout.setVerticalGroup(
            areaPrevisaoPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoPeixesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoPeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtualizarPrevisaoPeixes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        peixes.add(areaPrevisaoPeixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 380, 240));

        tituloEnergiaPeixes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloEnergiaPeixes.setText("Energia do Dia");

        amorPeixes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        amorPeixes.setText("Amor:");

        trabalhoPeixes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        trabalhoPeixes.setText("Trabalho:");

        saudePeixes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saudePeixes.setText("Saúde:");

        sorteAries6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sorteAries6.setText("Sorte:");

        javax.swing.GroupLayout areaEnergiaPeixesLayout = new javax.swing.GroupLayout(areaEnergiaPeixes);
        areaEnergiaPeixes.setLayout(areaEnergiaPeixesLayout);
        areaEnergiaPeixesLayout.setHorizontalGroup(
            areaEnergiaPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaPeixesLayout.createSequentialGroup()
                .addGroup(areaEnergiaPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaPeixesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(amorPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaEnergiaPeixesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloEnergiaPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaEnergiaPeixesLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(areaEnergiaPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sorteAries6)
                            .addComponent(saudePeixes)
                            .addComponent(trabalhoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfAmorPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                            .addComponent(tfTrabalhoPeixes)
                            .addComponent(Aries6)
                            .addComponent(tfSorteAries6))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        areaEnergiaPeixesLayout.setVerticalGroup(
            areaEnergiaPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaPeixesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaPeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amorPeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(trabalhoPeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saudePeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Aries6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteAries6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteAries6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        peixes.add(areaEnergiaPeixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 330, 270));

        tituloMensagemPeixes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloMensagemPeixes.setText("Menagem do Dia:");

        txMensagemPeixes.setColumns(20);
        txMensagemPeixes.setRows(5);
        jScrollPane26.setViewportView(txMensagemPeixes);

        btnCopiarMensagemPeixes.setBackground(new java.awt.Color(102, 102, 102));
        btnCopiarMensagemPeixes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCopiarMensagemPeixes.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMensagemPeixes.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemPeixesLayout = new javax.swing.GroupLayout(areaMensagemPeixes);
        areaMensagemPeixes.setLayout(areaMensagemPeixesLayout);
        areaMensagemPeixesLayout.setHorizontalGroup(
            areaMensagemPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemPeixesLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(areaMensagemPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloMensagemPeixes)
                    .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaMensagemPeixesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCopiarMensagemPeixes)
                .addGap(61, 61, 61))
        );
        areaMensagemPeixesLayout.setVerticalGroup(
            areaMensagemPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemPeixesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemPeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCopiarMensagemPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        peixes.add(areaMensagemPeixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 420, 320, 240));

        caracteristicasPeixes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        caracteristicasPeixes.setText("Características");

        pfortesPeixes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pfortesPeixes.setText("Pontos Fortes:");

        pmelhoriasPeixes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pmelhoriasPeixes.setText("Pontos a Melhorar:");

        txFortesPeixes.setColumns(20);
        txFortesPeixes.setRows(5);
        txFortesPeixes.setText("empatia, imaginação, sensibilidade, criatividade e \ncompaixão.");
        jScrollPane27.setViewportView(txFortesPeixes);

        txMelhoriasPeixes.setColumns(20);
        txMelhoriasPeixes.setRows(5);
        txMelhoriasPeixes.setText("idealização, escapismo, indecisão, excesso de sensibilidade e dificuldade em \nestabelecer limites.");
        jScrollPane28.setViewportView(txMelhoriasPeixes);

        javax.swing.GroupLayout areaCaracteristicasPeixesLayout = new javax.swing.GroupLayout(areaCaracteristicasPeixes);
        areaCaracteristicasPeixes.setLayout(areaCaracteristicasPeixesLayout);
        areaCaracteristicasPeixesLayout.setHorizontalGroup(
            areaCaracteristicasPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasPeixesLayout.createSequentialGroup()
                .addGroup(areaCaracteristicasPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCaracteristicasPeixesLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(areaCaracteristicasPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane27, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                            .addComponent(jScrollPane28)
                            .addComponent(pfortesPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pmelhoriasPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaCaracteristicasPeixesLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(caracteristicasPeixes)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        areaCaracteristicasPeixesLayout.setVerticalGroup(
            areaCaracteristicasPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasPeixesLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(caracteristicasPeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfortesPeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pmelhoriasPeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        peixes.add(areaCaracteristicasPeixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 380, 340));

        fundoPeixes.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurGiuvannucci\\Documents\\ProjetoAppHoroscopo\\Horospoco\\src\\main\\resources\\assets\\81XnKshePmL._AC_SL1200_.jpg")); // NOI18N
        peixes.add(fundoPeixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, -1, -1));

        areaAbas.addTab("Peixes", peixes);

        sargitario.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 51, 255)));
        sargitario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoesSargitario.setBackground(new java.awt.Color(255, 255, 255));

        tfPeriodoSargitario.setText("22/11 – 21/12");
        tfPeriodoSargitario.addActionListener(this::tfPeriodoSargitarioActionPerformed);

        tfElementoSargitario.setText("🔥 Fogo");
        tfElementoSargitario.addActionListener(this::tfElementoSargitarioActionPerformed);

        tfPlanetaSargitario.setText("Júpiter");

        tfCorSargitario.setText("Roxo");
        tfCorSargitario.addActionListener(this::tfCorSargitarioActionPerformed);

        tfNumeroSargitario.setText("3");
        tfNumeroSargitario.addActionListener(this::tfNumeroSargitarioActionPerformed);

        imgSignoSargitario.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurGiuvannucci\\Documents\\ProjetoAppHoroscopo\\Horospoco\\src\\main\\resources\\assets\\sargitario.png")); // NOI18N

        periodoSargitario.setText("PERIODO:");

        planetaSargitario.setText("PLANETA REGENTE:");

        corSargitario.setText("COR:");

        numeroSargitario.setText("NÚMERO DA SORTE:");

        elementoSargitario.setText("ELEMENTO:");

        tituloSargitario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloSargitario.setText("            SARGITÁRIO");

        javax.swing.GroupLayout areaInformacoesSargitarioLayout = new javax.swing.GroupLayout(areaInformacoesSargitario);
        areaInformacoesSargitario.setLayout(areaInformacoesSargitarioLayout);
        areaInformacoesSargitarioLayout.setHorizontalGroup(
            areaInformacoesSargitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaInformacoesSargitarioLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(areaInformacoesSargitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesSargitarioLayout.createSequentialGroup()
                        .addComponent(numeroSargitario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNumeroSargitario))
                    .addGroup(areaInformacoesSargitarioLayout.createSequentialGroup()
                        .addComponent(planetaSargitario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(tfPlanetaSargitario, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesSargitarioLayout.createSequentialGroup()
                        .addComponent(corSargitario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCorSargitario, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesSargitarioLayout.createSequentialGroup()
                        .addGroup(areaInformacoesSargitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(periodoSargitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesSargitarioLayout.createSequentialGroup()
                                .addComponent(elementoSargitario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPeriodoSargitario, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesSargitarioLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(tfElementoSargitario, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
            .addGroup(areaInformacoesSargitarioLayout.createSequentialGroup()
                .addComponent(tituloSargitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoesSargitarioLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(imgSignoSargitario, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaInformacoesSargitarioLayout.setVerticalGroup(
            areaInformacoesSargitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaInformacoesSargitarioLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(imgSignoSargitario)
                .addGap(30, 30, 30)
                .addComponent(tituloSargitario, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesSargitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPeriodoSargitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(periodoSargitario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesSargitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfElementoSargitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(elementoSargitario))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesSargitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPlanetaSargitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(planetaSargitario))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesSargitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCorSargitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(corSargitario))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesSargitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNumeroSargitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroSargitario))
                .addGap(41, 41, 41))
        );

        sargitario.add(areaInformacoesSargitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 240, 550));

        previsaoSargitario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        previsaoSargitario.setText("Previsão do Dia: ");

        txPrevisoesSargitario.setColumns(20);
        txPrevisoesSargitario.setRows(5);
        jScrollPane29.setViewportView(txPrevisoesSargitario);

        btnAtualizarPrevisaoSargitario.setBackground(new java.awt.Color(102, 102, 102));
        btnAtualizarPrevisaoSargitario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAtualizarPrevisaoSargitario.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoSargitario.setText("Atualizar Previsão");
        btnAtualizarPrevisaoSargitario.addActionListener(this::btnAtualizarPrevisaoSargitarioActionPerformed);

        javax.swing.GroupLayout areaPrevisaoSargitarioLayout = new javax.swing.GroupLayout(areaPrevisaoSargitario);
        areaPrevisaoSargitario.setLayout(areaPrevisaoSargitarioLayout);
        areaPrevisaoSargitarioLayout.setHorizontalGroup(
            areaPrevisaoSargitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaPrevisaoSargitarioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAtualizarPrevisaoSargitario, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(areaPrevisaoSargitarioLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(areaPrevisaoSargitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(previsaoSargitario, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        areaPrevisaoSargitarioLayout.setVerticalGroup(
            areaPrevisaoSargitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoSargitarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoSargitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtualizarPrevisaoSargitario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sargitario.add(areaPrevisaoSargitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 380, 240));

        tituloEnergiaSargitario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloEnergiaSargitario.setText("Energia do Dia");

        amorSargitario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        amorSargitario.setText("Amor:");

        trabalhoSargitario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        trabalhoSargitario.setText("Trabalho:");

        saudeSargitario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saudeSargitario.setText("Saúde:");

        sorteSargitario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sorteSargitario.setText("Sorte:");

        javax.swing.GroupLayout areaEnergiaSargitarioLayout = new javax.swing.GroupLayout(areaEnergiaSargitario);
        areaEnergiaSargitario.setLayout(areaEnergiaSargitarioLayout);
        areaEnergiaSargitarioLayout.setHorizontalGroup(
            areaEnergiaSargitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaSargitarioLayout.createSequentialGroup()
                .addGroup(areaEnergiaSargitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaSargitarioLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(amorSargitario, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaEnergiaSargitarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloEnergiaSargitario, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaEnergiaSargitarioLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(areaEnergiaSargitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sorteSargitario)
                            .addComponent(saudeSargitario)
                            .addComponent(trabalhoSargitario, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfAmorSargitario, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                            .addComponent(tfTrabalhoSargitario)
                            .addComponent(tfSaudeSargitario)
                            .addComponent(tfSorteSargitario))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        areaEnergiaSargitarioLayout.setVerticalGroup(
            areaEnergiaSargitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaSargitarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaSargitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amorSargitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorSargitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(trabalhoSargitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoSargitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saudeSargitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaudeSargitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteSargitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteSargitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        sargitario.add(areaEnergiaSargitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 330, 270));

        tituloMensagemSargitario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloMensagemSargitario.setText("Menagem do Dia:");

        txMensagemSargitario.setColumns(20);
        txMensagemSargitario.setRows(5);
        jScrollPane30.setViewportView(txMensagemSargitario);

        btnCopiarMensagemSargitario.setBackground(new java.awt.Color(102, 102, 102));
        btnCopiarMensagemSargitario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCopiarMensagemSargitario.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMensagemSargitario.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemSargitarioLayout = new javax.swing.GroupLayout(areaMensagemSargitario);
        areaMensagemSargitario.setLayout(areaMensagemSargitarioLayout);
        areaMensagemSargitarioLayout.setHorizontalGroup(
            areaMensagemSargitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemSargitarioLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(areaMensagemSargitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloMensagemSargitario)
                    .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaMensagemSargitarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCopiarMensagemSargitario)
                .addGap(61, 61, 61))
        );
        areaMensagemSargitarioLayout.setVerticalGroup(
            areaMensagemSargitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemSargitarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemSargitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCopiarMensagemSargitario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sargitario.add(areaMensagemSargitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 420, 320, 240));

        caracteristicasSargitario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        caracteristicasSargitario.setText("Características");

        pfortesSargitario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pfortesSargitario.setText("Pontos Fortes:");

        pmelhoriasSargitario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pmelhoriasSargitario.setText("Pontos a Melhorar:");

        txFortesSargitariov.setColumns(20);
        txFortesSargitariov.setRows(5);
        txFortesSargitariov.setText("otimismo, liberdade, aventura, sinceridade e entusiasmo.");
        jScrollPane31.setViewportView(txFortesSargitariov);

        txMelhoriasSargitario.setColumns(20);
        txMelhoriasSargitario.setRows(5);
        txMelhoriasSargitario.setText("impulsividade, excesso de sinceridade, impaciência,\nirresponsabilidade e dificuldade com limites.");
        jScrollPane32.setViewportView(txMelhoriasSargitario);

        javax.swing.GroupLayout areaCaracteristicasSargitarioLayout = new javax.swing.GroupLayout(areaCaracteristicasSargitario);
        areaCaracteristicasSargitario.setLayout(areaCaracteristicasSargitarioLayout);
        areaCaracteristicasSargitarioLayout.setHorizontalGroup(
            areaCaracteristicasSargitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasSargitarioLayout.createSequentialGroup()
                .addGroup(areaCaracteristicasSargitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCaracteristicasSargitarioLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(areaCaracteristicasSargitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane31, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                            .addComponent(jScrollPane32)
                            .addComponent(pfortesSargitario, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pmelhoriasSargitario, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaCaracteristicasSargitarioLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(caracteristicasSargitario)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        areaCaracteristicasSargitarioLayout.setVerticalGroup(
            areaCaracteristicasSargitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasSargitarioLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(caracteristicasSargitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfortesSargitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pmelhoriasSargitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sargitario.add(areaCaracteristicasSargitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 380, 330));

        fundoSargitario.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurGiuvannucci\\Documents\\ProjetoAppHoroscopo\\Horospoco\\src\\main\\resources\\assets\\81XnKshePmL._AC_SL1200_.jpg")); // NOI18N
        sargitario.add(fundoSargitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, -1, -1));

        areaAbas.addTab("Sargitário", sargitario);

        touro.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 51, 255)));
        touro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoesTouro.setBackground(new java.awt.Color(255, 255, 255));

        tfPeriodoTouro.setText("20/04 – 20/05");
        tfPeriodoTouro.addActionListener(this::tfPeriodoTouroActionPerformed);

        tfElementoTouro.setText("🌱 Terra");
        tfElementoTouro.addActionListener(this::tfElementoTouroActionPerformed);

        tfPlanetaTouro.setText("Vênus");

        tfCorTouro.setText("Verde");
        tfCorTouro.addActionListener(this::tfCorTouroActionPerformed);

        tfNumeroTouro.setText("6");
        tfNumeroTouro.addActionListener(this::tfNumeroTouroActionPerformed);

        imgSignoTouro.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurGiuvannucci\\Documents\\ProjetoAppHoroscopo\\Horospoco\\src\\main\\resources\\assets\\touro.png")); // NOI18N

        periodoTouro.setText("PERIODO:");

        planetaTouro.setText("PLANETA REGENTE:");

        corTouro.setText("COR:");

        numeroTouro.setText("NÚMERO DA SORTE:");

        elementoTouro.setText("ELEMENTO:");

        tituloTouro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloTouro.setText("                TOURO");

        javax.swing.GroupLayout areaInformacoesTouroLayout = new javax.swing.GroupLayout(areaInformacoesTouro);
        areaInformacoesTouro.setLayout(areaInformacoesTouroLayout);
        areaInformacoesTouroLayout.setHorizontalGroup(
            areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaInformacoesTouroLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesTouroLayout.createSequentialGroup()
                        .addComponent(numeroTouro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNumeroTouro))
                    .addGroup(areaInformacoesTouroLayout.createSequentialGroup()
                        .addComponent(planetaTouro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(tfPlanetaTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesTouroLayout.createSequentialGroup()
                        .addComponent(corTouro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCorTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesTouroLayout.createSequentialGroup()
                        .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(periodoTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesTouroLayout.createSequentialGroup()
                                .addComponent(elementoTouro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPeriodoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesTouroLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(tfElementoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
            .addGroup(areaInformacoesTouroLayout.createSequentialGroup()
                .addComponent(tituloTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoesTouroLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(imgSignoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaInformacoesTouroLayout.setVerticalGroup(
            areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaInformacoesTouroLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(imgSignoTouro)
                .addGap(30, 30, 30)
                .addComponent(tituloTouro, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPeriodoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(periodoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfElementoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(elementoTouro))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPlanetaTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(planetaTouro))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCorTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(corTouro))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNumeroTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroTouro))
                .addGap(41, 41, 41))
        );

        touro.add(areaInformacoesTouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 240, 550));

        previsaoTouro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        previsaoTouro.setText("Previsão do Dia: ");

        txPrevisoesTouro.setColumns(20);
        txPrevisoesTouro.setRows(5);
        jScrollPane49.setViewportView(txPrevisoesTouro);

        btnAtualizarPrevisaoTouro.setBackground(new java.awt.Color(102, 102, 102));
        btnAtualizarPrevisaoTouro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAtualizarPrevisaoTouro.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoTouro.setText("Atualizar Previsão");
        btnAtualizarPrevisaoTouro.addActionListener(this::btnAtualizarPrevisaoTouroActionPerformed);

        javax.swing.GroupLayout areaPrevisaoTouroLayout = new javax.swing.GroupLayout(areaPrevisaoTouro);
        areaPrevisaoTouro.setLayout(areaPrevisaoTouroLayout);
        areaPrevisaoTouroLayout.setHorizontalGroup(
            areaPrevisaoTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaPrevisaoTouroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAtualizarPrevisaoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(areaPrevisaoTouroLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(areaPrevisaoTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(previsaoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane49, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        areaPrevisaoTouroLayout.setVerticalGroup(
            areaPrevisaoTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoTouroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane49, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtualizarPrevisaoTouro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        touro.add(areaPrevisaoTouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 380, 240));

        tituloEnergiaTouro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloEnergiaTouro.setText("Energia do Dia");

        amorTouro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        amorTouro.setText("Amor:");

        trabalhoTouro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        trabalhoTouro.setText("Trabalho:");

        saudeTouro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saudeTouro.setText("Saúde:");

        sorteTouro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sorteTouro.setText("Sorte:");

        javax.swing.GroupLayout areaEnergiaTouroLayout = new javax.swing.GroupLayout(areaEnergiaTouro);
        areaEnergiaTouro.setLayout(areaEnergiaTouroLayout);
        areaEnergiaTouroLayout.setHorizontalGroup(
            areaEnergiaTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaTouroLayout.createSequentialGroup()
                .addGroup(areaEnergiaTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaTouroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloEnergiaTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaEnergiaTouroLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(areaEnergiaTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amorTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(areaEnergiaTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(sorteTouro)
                                .addComponent(saudeTouro)
                                .addComponent(trabalhoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfAmorTouro, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                                .addComponent(tfTrabalhoTouro)
                                .addComponent(tfSaudeTouro)
                                .addComponent(tfSorteTouro)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        areaEnergiaTouroLayout.setVerticalGroup(
            areaEnergiaTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaTouroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amorTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(trabalhoTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saudeTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaudeTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        touro.add(areaEnergiaTouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 330, 270));

        tituloMensagemTouro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloMensagemTouro.setText("Menagem do Dia:");

        txMensagemTouro.setColumns(20);
        txMensagemTouro.setRows(5);
        jScrollPane50.setViewportView(txMensagemTouro);

        btnCopiarMensagemTouro.setBackground(new java.awt.Color(102, 102, 102));
        btnCopiarMensagemTouro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCopiarMensagemTouro.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMensagemTouro.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemTouroLayout = new javax.swing.GroupLayout(areaMensagemTouro);
        areaMensagemTouro.setLayout(areaMensagemTouroLayout);
        areaMensagemTouroLayout.setHorizontalGroup(
            areaMensagemTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemTouroLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(areaMensagemTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloMensagemTouro)
                    .addComponent(jScrollPane50, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaMensagemTouroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCopiarMensagemTouro)
                .addGap(61, 61, 61))
        );
        areaMensagemTouroLayout.setVerticalGroup(
            areaMensagemTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemTouroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane50, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCopiarMensagemTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        touro.add(areaMensagemTouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 420, 320, 240));

        caracteristicasTouro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        caracteristicasTouro.setText("Características");

        pfortesTouro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pfortesTouro.setText("Pontos Fortes:");

        pmelhoriasTouro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pmelhoriasTouro.setText("Pontos a Melhorar:");

        txFortesTouro.setColumns(20);
        txFortesTouro.setRows(5);
        txFortesTouro.setText("lealdade, estabilidade, determinação, paciência e\npraticidade.");
        jScrollPane51.setViewportView(txFortesTouro);

        txMelhoriasTouro.setColumns(20);
        txMelhoriasTouro.setRows(5);
        txMelhoriasTouro.setText("teimosia, possessividade, resistência a mudanças e apego\nexcessivo ao conforto.");
        jScrollPane52.setViewportView(txMelhoriasTouro);

        javax.swing.GroupLayout areaCaracteristicasTouroLayout = new javax.swing.GroupLayout(areaCaracteristicasTouro);
        areaCaracteristicasTouro.setLayout(areaCaracteristicasTouroLayout);
        areaCaracteristicasTouroLayout.setHorizontalGroup(
            areaCaracteristicasTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasTouroLayout.createSequentialGroup()
                .addGroup(areaCaracteristicasTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCaracteristicasTouroLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(areaCaracteristicasTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane51, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                            .addComponent(jScrollPane52)
                            .addComponent(pfortesTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pmelhoriasTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaCaracteristicasTouroLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(caracteristicasTouro)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        areaCaracteristicasTouroLayout.setVerticalGroup(
            areaCaracteristicasTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasTouroLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(caracteristicasTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfortesTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pmelhoriasTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        touro.add(areaCaracteristicasTouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 380, 330));

        fundoTouro.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurGiuvannucci\\Documents\\ProjetoAppHoroscopo\\Horospoco\\src\\main\\resources\\assets\\81XnKshePmL._AC_SL1200_.jpg")); // NOI18N
        touro.add(fundoTouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, -1, -1));

        areaAbas.addTab("Touro", touro);

        virgem.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 51, 255)));
        virgem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoesVirgem.setBackground(new java.awt.Color(255, 255, 255));

        tfPeriodoVirgem.setText("23/08 – 22/09");
        tfPeriodoVirgem.addActionListener(this::tfPeriodoVirgemActionPerformed);

        tfElementoVirgem.setText("🌱 Terra");
        tfElementoVirgem.addActionListener(this::tfElementoVirgemActionPerformed);

        tfPlanetaVirgem.setText("Mercúrio");

        tfCorVirgem.setText("Verde");
        tfCorVirgem.addActionListener(this::tfCorVirgemActionPerformed);

        tfNumeroVirgem.setText("5");
        tfNumeroVirgem.addActionListener(this::tfNumeroVirgemActionPerformed);

        imgSignoVirgem.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurGiuvannucci\\Documents\\ProjetoAppHoroscopo\\Horospoco\\src\\main\\resources\\assets\\virgem.png")); // NOI18N

        periodoVirgem.setText("PERIODO:");

        planetaVirgem.setText("PLANETA REGENTE:");

        corVirgem.setText("COR:");

        numeroVirgem.setText("NÚMERO DA SORTE:");

        elementoVirgem.setText("ELEMENTO:");

        tituloVirgem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloVirgem.setText("                  VIRGEM");

        javax.swing.GroupLayout areaInformacoesVirgemLayout = new javax.swing.GroupLayout(areaInformacoesVirgem);
        areaInformacoesVirgem.setLayout(areaInformacoesVirgemLayout);
        areaInformacoesVirgemLayout.setHorizontalGroup(
            areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaInformacoesVirgemLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                        .addComponent(numeroVirgem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNumeroVirgem))
                    .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                        .addComponent(planetaVirgem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(tfPlanetaVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                        .addComponent(corVirgem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCorVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                        .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(periodoVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesVirgemLayout.createSequentialGroup()
                                .addComponent(elementoVirgem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPeriodoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(tfElementoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
            .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                .addComponent(tituloVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(imgSignoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaInformacoesVirgemLayout.setVerticalGroup(
            areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaInformacoesVirgemLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(imgSignoVirgem)
                .addGap(30, 30, 30)
                .addComponent(tituloVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPeriodoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(periodoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfElementoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(elementoVirgem))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPlanetaVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(planetaVirgem))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCorVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(corVirgem))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNumeroVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroVirgem))
                .addGap(41, 41, 41))
        );

        virgem.add(areaInformacoesVirgem, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 240, 550));

        previsaoVirgem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        previsaoVirgem.setText("Previsão do Dia: ");

        txPrevisoesVirgem.setColumns(20);
        txPrevisoesVirgem.setRows(5);
        jScrollPane37.setViewportView(txPrevisoesVirgem);

        btnAtualizarPrevisaoVirgem.setBackground(new java.awt.Color(102, 102, 102));
        btnAtualizarPrevisaoVirgem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAtualizarPrevisaoVirgem.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoVirgem.setText("Atualizar Previsão");
        btnAtualizarPrevisaoVirgem.addActionListener(this::btnAtualizarPrevisaoVirgemActionPerformed);

        javax.swing.GroupLayout areaPrevisaoVirgemLayout = new javax.swing.GroupLayout(areaPrevisaoVirgem);
        areaPrevisaoVirgem.setLayout(areaPrevisaoVirgemLayout);
        areaPrevisaoVirgemLayout.setHorizontalGroup(
            areaPrevisaoVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaPrevisaoVirgemLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAtualizarPrevisaoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(areaPrevisaoVirgemLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(areaPrevisaoVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(previsaoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        areaPrevisaoVirgemLayout.setVerticalGroup(
            areaPrevisaoVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoVirgemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtualizarPrevisaoVirgem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        virgem.add(areaPrevisaoVirgem, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 380, 240));

        tituloEnergiaVirgem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloEnergiaVirgem.setText("Energia do Dia");

        amorVirgem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        amorVirgem.setText("Amor:");

        trabalhoVirgem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        trabalhoVirgem.setText("Trabalho:");

        saudeVirgem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saudeVirgem.setText("Saúde:");

        sorteVirgem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sorteVirgem.setText("Sorte:");

        javax.swing.GroupLayout areaEnergiaVirgemLayout = new javax.swing.GroupLayout(areaEnergiaVirgem);
        areaEnergiaVirgem.setLayout(areaEnergiaVirgemLayout);
        areaEnergiaVirgemLayout.setHorizontalGroup(
            areaEnergiaVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaVirgemLayout.createSequentialGroup()
                .addGroup(areaEnergiaVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaVirgemLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(amorVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaEnergiaVirgemLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloEnergiaVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaEnergiaVirgemLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(areaEnergiaVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sorteVirgem)
                            .addComponent(saudeVirgem)
                            .addComponent(trabalhoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfAmorVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                            .addComponent(tfTrabalhoVirgem)
                            .addComponent(tfSaudeVirgem)
                            .addComponent(tfSorteVirgem))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        areaEnergiaVirgemLayout.setVerticalGroup(
            areaEnergiaVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaVirgemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amorVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(trabalhoVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saudeVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaudeVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        virgem.add(areaEnergiaVirgem, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 330, 270));

        tituloMensagemVirgem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloMensagemVirgem.setText("Menagem do Dia:");

        txMensagemVirgem.setColumns(20);
        txMensagemVirgem.setRows(5);
        jScrollPane38.setViewportView(txMensagemVirgem);

        btnCopiarMensagemVirgem.setBackground(new java.awt.Color(102, 102, 102));
        btnCopiarMensagemVirgem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCopiarMensagemVirgem.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMensagemVirgem.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemVirgemLayout = new javax.swing.GroupLayout(areaMensagemVirgem);
        areaMensagemVirgem.setLayout(areaMensagemVirgemLayout);
        areaMensagemVirgemLayout.setHorizontalGroup(
            areaMensagemVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemVirgemLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(areaMensagemVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloMensagemVirgem)
                    .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaMensagemVirgemLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCopiarMensagemVirgem)
                .addGap(61, 61, 61))
        );
        areaMensagemVirgemLayout.setVerticalGroup(
            areaMensagemVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemVirgemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCopiarMensagemVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        virgem.add(areaMensagemVirgem, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 420, 320, 240));

        caracteristicasVirgem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        caracteristicasVirgem.setText("Características");

        pfortesVirgem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pfortesVirgem.setText("Pontos Fortes:");

        pmelhoriasVirgem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pmelhoriasVirgem.setText("Pontos a Melhorar:");

        txFortesVirgem.setColumns(20);
        txFortesVirgem.setRows(5);
        txFortesVirgem.setText("organização, inteligência, atenção aos detalhes, \nresponsabilidade e praticidade.");
        jScrollPane39.setViewportView(txFortesVirgem);

        txMelhoriasVirgem.setColumns(20);
        txMelhoriasVirgem.setRows(5);
        txMelhoriasVirgem.setText("perfeccionismo, excesso de crítica, preocupação, rigidez e \ndificuldade em relaxar.");
        jScrollPane40.setViewportView(txMelhoriasVirgem);

        javax.swing.GroupLayout areaCaracteristicasVirgemLayout = new javax.swing.GroupLayout(areaCaracteristicasVirgem);
        areaCaracteristicasVirgem.setLayout(areaCaracteristicasVirgemLayout);
        areaCaracteristicasVirgemLayout.setHorizontalGroup(
            areaCaracteristicasVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasVirgemLayout.createSequentialGroup()
                .addGroup(areaCaracteristicasVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCaracteristicasVirgemLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(areaCaracteristicasVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane39, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                            .addComponent(jScrollPane40)
                            .addComponent(pfortesVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pmelhoriasVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaCaracteristicasVirgemLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(caracteristicasVirgem)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        areaCaracteristicasVirgemLayout.setVerticalGroup(
            areaCaracteristicasVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasVirgemLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(caracteristicasVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfortesVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pmelhoriasVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        virgem.add(areaCaracteristicasVirgem, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 380, 330));

        fundoVirgem.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurGiuvannucci\\Documents\\ProjetoAppHoroscopo\\Horospoco\\src\\main\\resources\\assets\\81XnKshePmL._AC_SL1200_.jpg")); // NOI18N
        virgem.add(fundoVirgem, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, -1, -1));

        areaAbas.addTab("Virgem", virgem);

        capricornio.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 51, 255)));
        capricornio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoesCapricornio.setBackground(new java.awt.Color(255, 255, 255));

        tfPeriodoCapricornio.setText("22/12 – 19/01");
        tfPeriodoCapricornio.addActionListener(this::tfPeriodoCapricornioActionPerformed);

        tfElementoCapricornio.setText("🌱 Terra");
        tfElementoCapricornio.addActionListener(this::tfElementoCapricornioActionPerformed);

        tfPlanetaCapricornio.setText("Saturno");

        tfCorCapricornio.setText("Marrom/Preto");
        tfCorCapricornio.addActionListener(this::tfCorCapricornioActionPerformed);

        tfNumeroCapricornio.setText("8");
        tfNumeroCapricornio.addActionListener(this::tfNumeroCapricornioActionPerformed);

        imgSignoCapricornio.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurGiuvannucci\\Documents\\ProjetoAppHoroscopo\\Horospoco\\src\\main\\resources\\assets\\capricornio.png")); // NOI18N

        periodoCapricornio.setText("PERIODO:");

        planetaAries10.setText("PLANETA REGENTE:");

        corCapricornio.setText("COR:");

        numeroCapricornio.setText("NÚMERO DA SORTE:");

        elementoCapricornio.setText("ELEMENTO:");

        tituloCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloCapricornio.setText("            CAPRICÓRNIO");

        javax.swing.GroupLayout areaInformacoesCapricornioLayout = new javax.swing.GroupLayout(areaInformacoesCapricornio);
        areaInformacoesCapricornio.setLayout(areaInformacoesCapricornioLayout);
        areaInformacoesCapricornioLayout.setHorizontalGroup(
            areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaInformacoesCapricornioLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                        .addComponent(numeroCapricornio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNumeroCapricornio))
                    .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                        .addComponent(planetaAries10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(tfPlanetaCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                        .addComponent(corCapricornio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCorCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                        .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(periodoCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesCapricornioLayout.createSequentialGroup()
                                .addComponent(elementoCapricornio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPeriodoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(tfElementoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
            .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                .addComponent(tituloCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(imgSignoCapricornio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaInformacoesCapricornioLayout.setVerticalGroup(
            areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaInformacoesCapricornioLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(imgSignoCapricornio)
                .addGap(51, 51, 51)
                .addComponent(tituloCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPeriodoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(periodoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfElementoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(elementoCapricornio))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPlanetaCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(planetaAries10))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCorCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(corCapricornio))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNumeroCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroCapricornio))
                .addGap(41, 41, 41))
        );

        capricornio.add(areaInformacoesCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 240, 550));

        previsaoCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        previsaoCapricornio.setText("Previsão do Dia: ");

        txPrevisoesCapricornio.setColumns(20);
        txPrevisoesCapricornio.setRows(5);
        jScrollPane41.setViewportView(txPrevisoesCapricornio);

        btnAtualizarPrevisaoCapricornio.setBackground(new java.awt.Color(102, 102, 102));
        btnAtualizarPrevisaoCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAtualizarPrevisaoCapricornio.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoCapricornio.setText("Atualizar Previsão");
        btnAtualizarPrevisaoCapricornio.addActionListener(this::btnAtualizarPrevisaoCapricornioActionPerformed);

        javax.swing.GroupLayout areaPrevisaoCapricornioLayout = new javax.swing.GroupLayout(areaPrevisaoCapricornio);
        areaPrevisaoCapricornio.setLayout(areaPrevisaoCapricornioLayout);
        areaPrevisaoCapricornioLayout.setHorizontalGroup(
            areaPrevisaoCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaPrevisaoCapricornioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAtualizarPrevisaoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(areaPrevisaoCapricornioLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(areaPrevisaoCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(previsaoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane41, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        areaPrevisaoCapricornioLayout.setVerticalGroup(
            areaPrevisaoCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoCapricornioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane41, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtualizarPrevisaoCapricornio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        capricornio.add(areaPrevisaoCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 380, 240));

        tituloEnergiaCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloEnergiaCapricornio.setText("Energia do Dia");

        amorCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        amorCapricornio.setText("Amor:");

        trabalhoCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        trabalhoCapricornio.setText("Trabalho:");

        saudeCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saudeCapricornio.setText("Saúde:");

        sorteCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sorteCapricornio.setText("Sorte:");

        javax.swing.GroupLayout areaEnergiaCapricornioLayout = new javax.swing.GroupLayout(areaEnergiaCapricornio);
        areaEnergiaCapricornio.setLayout(areaEnergiaCapricornioLayout);
        areaEnergiaCapricornioLayout.setHorizontalGroup(
            areaEnergiaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaCapricornioLayout.createSequentialGroup()
                .addGroup(areaEnergiaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaCapricornioLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(amorCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaEnergiaCapricornioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloEnergiaCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaEnergiaCapricornioLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(areaEnergiaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sorteCapricornio)
                            .addComponent(saudeCapricornio)
                            .addComponent(trabalhoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfAmorCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                            .addComponent(tfTrabalhoCapricornio)
                            .addComponent(tfSaudeCapricornio)
                            .addComponent(tfSorteCapricornio))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        areaEnergiaCapricornioLayout.setVerticalGroup(
            areaEnergiaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaCapricornioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amorCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(trabalhoCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saudeCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaudeCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        capricornio.add(areaEnergiaCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 330, 270));

        tituloMensagemCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloMensagemCapricornio.setText("Menagem do Dia:");

        txMensagemCapricornio.setColumns(20);
        txMensagemCapricornio.setRows(5);
        jScrollPane42.setViewportView(txMensagemCapricornio);

        btnCopiarMensagemCapricornio.setBackground(new java.awt.Color(102, 102, 102));
        btnCopiarMensagemCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCopiarMensagemCapricornio.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMensagemCapricornio.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemCapricornioLayout = new javax.swing.GroupLayout(areaMensagemCapricornio);
        areaMensagemCapricornio.setLayout(areaMensagemCapricornioLayout);
        areaMensagemCapricornioLayout.setHorizontalGroup(
            areaMensagemCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemCapricornioLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(areaMensagemCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloMensagemCapricornio)
                    .addComponent(jScrollPane42, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaMensagemCapricornioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCopiarMensagemCapricornio)
                .addGap(61, 61, 61))
        );
        areaMensagemCapricornioLayout.setVerticalGroup(
            areaMensagemCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemCapricornioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane42, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCopiarMensagemCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        capricornio.add(areaMensagemCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 420, 320, 240));

        caracteristicasCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        caracteristicasCapricornio.setText("Características");

        pfortesCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pfortesCapricornio.setText("Pontos Fortes:");

        pmelhoriasCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pmelhoriasCapricornio.setText("Pontos a Melhorar:");

        txFortesCapricornio.setColumns(20);
        txFortesCapricornio.setRows(5);
        txFortesCapricornio.setText("disciplina, responsabilidade, ambição, persistência e\norganização.");
        jScrollPane43.setViewportView(txFortesCapricornio);

        txMelhoriasCapricornio.setColumns(20);
        txMelhoriasCapricornio.setRows(5);
        txMelhoriasCapricornio.setText("pessimismo, rigidez, excesso de trabalho, frieza aparente e \ndificuldade em demonstrar emoções.");
        jScrollPane44.setViewportView(txMelhoriasCapricornio);

        javax.swing.GroupLayout areaCaracteristicasCapricornioLayout = new javax.swing.GroupLayout(areaCaracteristicasCapricornio);
        areaCaracteristicasCapricornio.setLayout(areaCaracteristicasCapricornioLayout);
        areaCaracteristicasCapricornioLayout.setHorizontalGroup(
            areaCaracteristicasCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasCapricornioLayout.createSequentialGroup()
                .addGroup(areaCaracteristicasCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCaracteristicasCapricornioLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(areaCaracteristicasCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane43, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                            .addComponent(jScrollPane44)
                            .addComponent(pfortesCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pmelhoriasCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaCaracteristicasCapricornioLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(caracteristicasCapricornio)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        areaCaracteristicasCapricornioLayout.setVerticalGroup(
            areaCaracteristicasCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasCapricornioLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(caracteristicasCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfortesCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pmelhoriasCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        capricornio.add(areaCaracteristicasCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 380, 330));

        fundoCapricornio.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurGiuvannucci\\Documents\\ProjetoAppHoroscopo\\Horospoco\\src\\main\\resources\\assets\\81XnKshePmL._AC_SL1200_.jpg")); // NOI18N
        capricornio.add(fundoCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Capricórnio", capricornio);

        getContentPane().add(areaAbas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1282, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeActionPerformed

    private void btnDescobrirSignoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescobrirSignoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDescobrirSignoActionPerformed

    private void tfPeriodoAriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPeriodoAriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPeriodoAriesActionPerformed

    private void tfElementoAriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfElementoAriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfElementoAriesActionPerformed

    private void tfCorAriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorAriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCorAriesActionPerformed

    private void tfNumeroAriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumeroAriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumeroAriesActionPerformed

    private void btnAtualizarPrevisaoAriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarPrevisaoAriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarPrevisaoAriesActionPerformed

    private void tfPeriodoCancerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPeriodoCancerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPeriodoCancerActionPerformed

    private void tfElementoCancerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfElementoCancerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfElementoCancerActionPerformed

    private void tfCorCancerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorCancerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCorCancerActionPerformed

    private void tfNumeroCancerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumeroCancerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumeroCancerActionPerformed

    private void btnAtualizarPrevisaoCancerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarPrevisaoCancerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarPrevisaoCancerActionPerformed

    private void tfPeriodoEscorpiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPeriodoEscorpiaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPeriodoEscorpiaoActionPerformed

    private void tfElementoEscorpiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfElementoEscorpiaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfElementoEscorpiaoActionPerformed

    private void tfCorEscorpiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorEscorpiaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCorEscorpiaoActionPerformed

    private void tfNumeroEscorpiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumeroEscorpiaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumeroEscorpiaoActionPerformed

    private void btnAtualizarPrevisaoEscorpiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarPrevisaoEscorpiaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarPrevisaoEscorpiaoActionPerformed

    private void tfPeriodoGemeosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPeriodoGemeosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPeriodoGemeosActionPerformed

    private void tfElementoGemeosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfElementoGemeosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfElementoGemeosActionPerformed

    private void tfCorGemeosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorGemeosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCorGemeosActionPerformed

    private void tfNumeroGemeosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumeroGemeosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumeroGemeosActionPerformed

    private void btnAtualizarPrevisaoGemeosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarPrevisaoGemeosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarPrevisaoGemeosActionPerformed

    private void tfPeriodoLeaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPeriodoLeaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPeriodoLeaoActionPerformed

    private void tfElementoLeaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfElementoLeaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfElementoLeaoActionPerformed

    private void tfCorLeaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorLeaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCorLeaoActionPerformed

    private void tfNumeroLeaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumeroLeaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumeroLeaoActionPerformed

    private void btnAtualizarPrevisaoLeaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarPrevisaoLeaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarPrevisaoLeaoActionPerformed

    private void tfPeriodoLibraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPeriodoLibraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPeriodoLibraActionPerformed

    private void tfElementoLibraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfElementoLibraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfElementoLibraActionPerformed

    private void tfCorLibraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorLibraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCorLibraActionPerformed

    private void tfNumeroLibraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumeroLibraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumeroLibraActionPerformed

    private void btnAtualizarPrevisaoLibraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarPrevisaoLibraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarPrevisaoLibraActionPerformed

    private void tfPeriodoPeixesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPeriodoPeixesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPeriodoPeixesActionPerformed

    private void tfElementoPeixesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfElementoPeixesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfElementoPeixesActionPerformed

    private void tfCorPeixesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorPeixesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCorPeixesActionPerformed

    private void tfNumeroPeixesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumeroPeixesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumeroPeixesActionPerformed

    private void btnAtualizarPrevisaoPeixesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarPrevisaoPeixesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarPrevisaoPeixesActionPerformed

    private void tfPeriodoSargitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPeriodoSargitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPeriodoSargitarioActionPerformed

    private void tfElementoSargitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfElementoSargitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfElementoSargitarioActionPerformed

    private void tfCorSargitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorSargitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCorSargitarioActionPerformed

    private void tfNumeroSargitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumeroSargitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumeroSargitarioActionPerformed

    private void btnAtualizarPrevisaoSargitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarPrevisaoSargitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarPrevisaoSargitarioActionPerformed

    private void tfPeriodoVirgemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPeriodoVirgemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPeriodoVirgemActionPerformed

    private void tfElementoVirgemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfElementoVirgemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfElementoVirgemActionPerformed

    private void tfCorVirgemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorVirgemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCorVirgemActionPerformed

    private void tfNumeroVirgemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumeroVirgemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumeroVirgemActionPerformed

    private void btnAtualizarPrevisaoVirgemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarPrevisaoVirgemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarPrevisaoVirgemActionPerformed

    private void tfPeriodoCapricornioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPeriodoCapricornioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPeriodoCapricornioActionPerformed

    private void tfElementoCapricornioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfElementoCapricornioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfElementoCapricornioActionPerformed

    private void tfCorCapricornioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorCapricornioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCorCapricornioActionPerformed

    private void tfNumeroCapricornioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumeroCapricornioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumeroCapricornioActionPerformed

    private void btnAtualizarPrevisaoCapricornioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarPrevisaoCapricornioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarPrevisaoCapricornioActionPerformed

    private void tfPeriodoAquarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPeriodoAquarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPeriodoAquarioActionPerformed

    private void tfElementoAquarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfElementoAquarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfElementoAquarioActionPerformed

    private void tfCorAquarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorAquarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCorAquarioActionPerformed

    private void tfNumeroAquarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumeroAquarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumeroAquarioActionPerformed

    private void btnAtualizarPrevisaoAquarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarPrevisaoAquarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarPrevisaoAquarioActionPerformed

    private void tfPeriodoTouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPeriodoTouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPeriodoTouroActionPerformed

    private void tfElementoTouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfElementoTouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfElementoTouroActionPerformed

    private void tfCorTouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorTouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCorTouroActionPerformed

    private void tfNumeroTouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumeroTouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumeroTouroActionPerformed

    private void btnAtualizarPrevisaoTouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarPrevisaoTouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarPrevisaoTouroActionPerformed

    private void tfPlanetaAriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPlanetaAriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPlanetaAriesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Signos().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Aries6;
    private javax.swing.JLabel GemeosGemeos;
    private javax.swing.JLabel amorAquario;
    private javax.swing.JLabel amorAries;
    private javax.swing.JLabel amorCancer;
    private javax.swing.JLabel amorCapricornio;
    private javax.swing.JLabel amorEscorpiao;
    private javax.swing.JLabel amorGemeos;
    private javax.swing.JLabel amorLeao;
    private javax.swing.JLabel amorLibra;
    private javax.swing.JLabel amorPeixes;
    private javax.swing.JLabel amorSargitario;
    private javax.swing.JLabel amorTouro;
    private javax.swing.JLabel amorVirgem;
    private javax.swing.JPanel aquario;
    private javax.swing.JTabbedPane areaAbas;
    private javax.swing.JPanel areaCaracteristicasAquario;
    private javax.swing.JPanel areaCaracteristicasAries;
    private javax.swing.JPanel areaCaracteristicasCancer;
    private javax.swing.JPanel areaCaracteristicasCapricornio;
    private javax.swing.JPanel areaCaracteristicasEscorpiao;
    private javax.swing.JPanel areaCaracteristicasGemeos;
    private javax.swing.JPanel areaCaracteristicasLeao;
    private javax.swing.JPanel areaCaracteristicasLibra;
    private javax.swing.JPanel areaCaracteristicasPeixes;
    private javax.swing.JPanel areaCaracteristicasSargitario;
    private javax.swing.JPanel areaCaracteristicasTouro;
    private javax.swing.JPanel areaCaracteristicasVirgem;
    private javax.swing.JPanel areaCompatibilidade;
    private javax.swing.JPanel areaDescobrirSigno;
    private javax.swing.JPanel areaEnergiaAquario;
    private javax.swing.JPanel areaEnergiaAries;
    private javax.swing.JPanel areaEnergiaCancer;
    private javax.swing.JPanel areaEnergiaCapricornio;
    private javax.swing.JPanel areaEnergiaEscorpiao;
    private javax.swing.JPanel areaEnergiaGemeos;
    private javax.swing.JPanel areaEnergiaLeao;
    private javax.swing.JPanel areaEnergiaLibra;
    private javax.swing.JPanel areaEnergiaPeixes;
    private javax.swing.JPanel areaEnergiaSargitario;
    private javax.swing.JPanel areaEnergiaTouro;
    private javax.swing.JPanel areaEnergiaVirgem;
    private javax.swing.JPanel areaInformacoesAquario;
    private javax.swing.JPanel areaInformacoesAries;
    private javax.swing.JPanel areaInformacoesCancer;
    private javax.swing.JPanel areaInformacoesCapricornio;
    private javax.swing.JPanel areaInformacoesEscorpiao;
    private javax.swing.JPanel areaInformacoesGemeos;
    private javax.swing.JPanel areaInformacoesLeao;
    private javax.swing.JPanel areaInformacoesLibra;
    private javax.swing.JPanel areaInformacoesPeixes;
    private javax.swing.JPanel areaInformacoesSargitario;
    private javax.swing.JPanel areaInformacoesTouro;
    private javax.swing.JPanel areaInformacoesVirgem;
    private javax.swing.JPanel areaMensagemAquario;
    private javax.swing.JPanel areaMensagemAries;
    private javax.swing.JPanel areaMensagemCancer;
    private javax.swing.JPanel areaMensagemCapricornio;
    private javax.swing.JPanel areaMensagemEscorpiao;
    private javax.swing.JPanel areaMensagemGemeos;
    private javax.swing.JPanel areaMensagemLeao;
    private javax.swing.JPanel areaMensagemLibra;
    private javax.swing.JPanel areaMensagemPeixes;
    private javax.swing.JPanel areaMensagemSargitario;
    private javax.swing.JPanel areaMensagemTouro;
    private javax.swing.JPanel areaMensagemVirgem;
    private javax.swing.JPanel areaPrevisaoAquario;
    private javax.swing.JPanel areaPrevisaoAries;
    private javax.swing.JPanel areaPrevisaoCancer;
    private javax.swing.JPanel areaPrevisaoCapricornio;
    private javax.swing.JPanel areaPrevisaoEscorpiao;
    private javax.swing.JPanel areaPrevisaoGemeos;
    private javax.swing.JPanel areaPrevisaoLeao;
    private javax.swing.JPanel areaPrevisaoLibra;
    private javax.swing.JPanel areaPrevisaoPeixes;
    private javax.swing.JPanel areaPrevisaoSargitario;
    private javax.swing.JPanel areaPrevisaoTouro;
    private javax.swing.JPanel areaPrevisaoVirgem;
    private javax.swing.JPanel areaResultado;
    private javax.swing.JPanel aries;
    private javax.swing.JButton btnAtualizarPrevisaoAquario;
    private javax.swing.JButton btnAtualizarPrevisaoAries;
    private javax.swing.JButton btnAtualizarPrevisaoCancer;
    private javax.swing.JButton btnAtualizarPrevisaoCapricornio;
    private javax.swing.JButton btnAtualizarPrevisaoEscorpiao;
    private javax.swing.JButton btnAtualizarPrevisaoGemeos;
    private javax.swing.JButton btnAtualizarPrevisaoLeao;
    private javax.swing.JButton btnAtualizarPrevisaoLibra;
    private javax.swing.JButton btnAtualizarPrevisaoPeixes;
    private javax.swing.JButton btnAtualizarPrevisaoSargitario;
    private javax.swing.JButton btnAtualizarPrevisaoTouro;
    private javax.swing.JButton btnAtualizarPrevisaoVirgem;
    private javax.swing.JButton btnCalular;
    private javax.swing.JButton btnCopiarMensagemAquario;
    private javax.swing.JButton btnCopiarMensagemAries;
    private javax.swing.JButton btnCopiarMensagemCancer;
    private javax.swing.JButton btnCopiarMensagemCapricornio;
    private javax.swing.JButton btnCopiarMensagemEscorpiao;
    private javax.swing.JButton btnCopiarMensagemGemeos;
    private javax.swing.JButton btnCopiarMensagemLeao;
    private javax.swing.JButton btnCopiarMensagemLibra;
    private javax.swing.JButton btnCopiarMensagemPeixes;
    private javax.swing.JButton btnCopiarMensagemSargitario;
    private javax.swing.JButton btnCopiarMensagemTouro;
    private javax.swing.JButton btnCopiarMensagemVirgem;
    private javax.swing.JButton btnDescobrirSigno;
    private javax.swing.JButton btnSigno;
    private javax.swing.JPanel cancer;
    private javax.swing.JPanel capricornio;
    private javax.swing.JLabel caracteristicasAquario;
    private javax.swing.JLabel caracteristicasAries;
    private javax.swing.JLabel caracteristicasCancer;
    private javax.swing.JLabel caracteristicasCapricornio;
    private javax.swing.JLabel caracteristicasEscorpiao;
    private javax.swing.JLabel caracteristicasGemeos;
    private javax.swing.JLabel caracteristicasLeao;
    private javax.swing.JLabel caracteristicasLibra;
    private javax.swing.JLabel caracteristicasPeixes;
    private javax.swing.JLabel caracteristicasSargitario;
    private javax.swing.JLabel caracteristicasTouro;
    private javax.swing.JLabel caracteristicasVirgem;
    private javax.swing.JComboBox<String> cbDia;
    private javax.swing.JComboBox<String> cbMes;
    private javax.swing.JComboBox<String> cbSigno1;
    private javax.swing.JComboBox<String> cbSigno2;
    private javax.swing.JLabel compatibilidade;
    private javax.swing.JLabel corAquario;
    private javax.swing.JLabel corAries;
    private javax.swing.JLabel corCancer;
    private javax.swing.JLabel corCapricornio;
    private javax.swing.JLabel corEscorpiao;
    private javax.swing.JLabel corGemeos;
    private javax.swing.JLabel corLeao;
    private javax.swing.JLabel corLibra;
    private javax.swing.JLabel corPeixes;
    private javax.swing.JLabel corSargitario;
    private javax.swing.JLabel corTouro;
    private javax.swing.JLabel corVirgem;
    private javax.swing.JLabel diaNascimento;
    private javax.swing.JLabel elementoAquario;
    private javax.swing.JLabel elementoAries;
    private javax.swing.JLabel elementoCancer;
    private javax.swing.JLabel elementoCapricornio;
    private javax.swing.JLabel elementoEscorpiao;
    private javax.swing.JLabel elementoGemeos;
    private javax.swing.JLabel elementoLeao;
    private javax.swing.JLabel elementoLibra;
    private javax.swing.JLabel elementoPeixes;
    private javax.swing.JLabel elementoSargitario;
    private javax.swing.JLabel elementoTouro;
    private javax.swing.JLabel elementoVirgem;
    private javax.swing.JPanel escorpiao;
    private javax.swing.JLabel fundoAquario;
    private javax.swing.JLabel fundoAries;
    private javax.swing.JLabel fundoCancer;
    private javax.swing.JLabel fundoCapricornio;
    private javax.swing.JLabel fundoEscorpiao;
    private javax.swing.JLabel fundoGemeos;
    private javax.swing.JLabel fundoInicio;
    private javax.swing.JLabel fundoLeao;
    private javax.swing.JLabel fundoLibra;
    private javax.swing.JLabel fundoPeixes;
    private javax.swing.JLabel fundoSargitario;
    private javax.swing.JLabel fundoTouro;
    private javax.swing.JLabel fundoVirgem;
    private javax.swing.JPanel gemeos;
    private javax.swing.JLabel imgSignoAquario;
    private javax.swing.JLabel imgSignoAries;
    private javax.swing.JLabel imgSignoCancer;
    private javax.swing.JLabel imgSignoCapricornio;
    private javax.swing.JLabel imgSignoEscorpiao;
    private javax.swing.JLabel imgSignoGemeos;
    private javax.swing.JLabel imgSignoLeao;
    private javax.swing.JLabel imgSignoLibra;
    private javax.swing.JLabel imgSignoPeixes;
    private javax.swing.JLabel imgSignoSargitario;
    private javax.swing.JLabel imgSignoTouro;
    private javax.swing.JLabel imgSignoVirgem;
    private javax.swing.JPanel inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane37;
    private javax.swing.JScrollPane jScrollPane38;
    private javax.swing.JScrollPane jScrollPane39;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane40;
    private javax.swing.JScrollPane jScrollPane41;
    private javax.swing.JScrollPane jScrollPane42;
    private javax.swing.JScrollPane jScrollPane43;
    private javax.swing.JScrollPane jScrollPane44;
    private javax.swing.JScrollPane jScrollPane45;
    private javax.swing.JScrollPane jScrollPane46;
    private javax.swing.JScrollPane jScrollPane47;
    private javax.swing.JScrollPane jScrollPane48;
    private javax.swing.JScrollPane jScrollPane49;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane50;
    private javax.swing.JScrollPane jScrollPane51;
    private javax.swing.JScrollPane jScrollPane52;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPanel leao;
    private javax.swing.JPanel libra;
    private javax.swing.JLabel mesNascimento;
    private javax.swing.JLabel numeroAquario;
    private javax.swing.JLabel numeroAreis;
    private javax.swing.JLabel numeroCancer;
    private javax.swing.JLabel numeroCapricornio;
    private javax.swing.JLabel numeroEscorpiao;
    private javax.swing.JLabel numeroGemeos;
    private javax.swing.JLabel numeroLeao;
    private javax.swing.JLabel numeroLibra;
    private javax.swing.JLabel numeroPeixes;
    private javax.swing.JLabel numeroSargitario;
    private javax.swing.JLabel numeroTouro;
    private javax.swing.JLabel numeroVirgem;
    private javax.swing.JPanel peixes;
    private javax.swing.JLabel periodoAquario;
    private javax.swing.JLabel periodoAries;
    private javax.swing.JLabel periodoCancer;
    private javax.swing.JLabel periodoCapricornio;
    private javax.swing.JLabel periodoEscorpiao;
    private javax.swing.JLabel periodoGemeos;
    private javax.swing.JLabel periodoLeao;
    private javax.swing.JLabel periodoLibra;
    private javax.swing.JLabel periodoPeixes;
    private javax.swing.JLabel periodoSargitario;
    private javax.swing.JLabel periodoTouro;
    private javax.swing.JLabel periodoVirgem;
    private javax.swing.JLabel pfortesAquario;
    private javax.swing.JLabel pfortesAries;
    private javax.swing.JLabel pfortesCancer;
    private javax.swing.JLabel pfortesCapricornio;
    private javax.swing.JLabel pfortesEscorpiao;
    private javax.swing.JLabel pfortesGemeos;
    private javax.swing.JLabel pfortesLeao;
    private javax.swing.JLabel pfortesLibra;
    private javax.swing.JLabel pfortesPeixes;
    private javax.swing.JLabel pfortesSargitario;
    private javax.swing.JLabel pfortesTouro;
    private javax.swing.JLabel pfortesVirgem;
    private javax.swing.JLabel planetaAquario;
    private javax.swing.JLabel planetaAries;
    private javax.swing.JLabel planetaAries10;
    private javax.swing.JLabel planetaCancer;
    private javax.swing.JLabel planetaEscorpiao;
    private javax.swing.JLabel planetaGemeos;
    private javax.swing.JLabel planetaLeao;
    private javax.swing.JLabel planetaLibra;
    private javax.swing.JLabel planetaPeixes;
    private javax.swing.JLabel planetaSargitario;
    private javax.swing.JLabel planetaTouro;
    private javax.swing.JLabel planetaVirgem;
    private javax.swing.JLabel pmelhoriasAquario;
    private javax.swing.JLabel pmelhoriasAries;
    private javax.swing.JLabel pmelhoriasCancer;
    private javax.swing.JLabel pmelhoriasCapricornio;
    private javax.swing.JLabel pmelhoriasEscorpiao;
    private javax.swing.JLabel pmelhoriasGemeos;
    private javax.swing.JLabel pmelhoriasLeao;
    private javax.swing.JLabel pmelhoriasLibra;
    private javax.swing.JLabel pmelhoriasPeixes;
    private javax.swing.JLabel pmelhoriasSargitario;
    private javax.swing.JLabel pmelhoriasTouro;
    private javax.swing.JLabel pmelhoriasVirgem;
    private javax.swing.JLabel previsaoAquario;
    private javax.swing.JLabel previsaoAries;
    private javax.swing.JLabel previsaoCancer;
    private javax.swing.JLabel previsaoCapricornio;
    private javax.swing.JLabel previsaoEscorpiao;
    private javax.swing.JLabel previsaoLeao;
    private javax.swing.JLabel previsaoLibra;
    private javax.swing.JLabel previsaoPeixes;
    private javax.swing.JLabel previsaoSargitario;
    private javax.swing.JLabel previsaoTouro;
    private javax.swing.JLabel previsaoVirgem;
    private javax.swing.JPanel sargitario;
    private javax.swing.JLabel saudeAquario;
    private javax.swing.JLabel saudeAries;
    private javax.swing.JLabel saudeCancer;
    private javax.swing.JLabel saudeCapricornio;
    private javax.swing.JLabel saudeEscorpiao;
    private javax.swing.JLabel saudeGemeos;
    private javax.swing.JLabel saudeLeao;
    private javax.swing.JLabel saudeLibra;
    private javax.swing.JLabel saudePeixes;
    private javax.swing.JLabel saudeSargitario;
    private javax.swing.JLabel saudeTouro;
    private javax.swing.JLabel saudeVirgem;
    private javax.swing.JLabel signo;
    private javax.swing.JLabel signo1;
    private javax.swing.JLabel signo2;
    private javax.swing.JLabel sorteAquario;
    private javax.swing.JLabel sorteAries;
    private javax.swing.JLabel sorteAries6;
    private javax.swing.JLabel sorteCancer;
    private javax.swing.JLabel sorteCapricornio;
    private javax.swing.JLabel sorteEscorpiao;
    private javax.swing.JLabel sorteGemeos;
    private javax.swing.JLabel sorteLeao;
    private javax.swing.JLabel sorteLibra;
    private javax.swing.JLabel sorteSargitario;
    private javax.swing.JLabel sorteTouro;
    private javax.swing.JLabel sorteVirgem;
    private javax.swing.JTextField tfAmorAquario;
    private javax.swing.JTextField tfAmorAries;
    private javax.swing.JTextField tfAmorCancer;
    private javax.swing.JTextField tfAmorCapricornio;
    private javax.swing.JTextField tfAmorEscorpiao;
    private javax.swing.JTextField tfAmorGemeos;
    private javax.swing.JTextField tfAmorLeao;
    private javax.swing.JTextField tfAmorLibra;
    private javax.swing.JTextField tfAmorPeixes;
    private javax.swing.JTextField tfAmorSargitario;
    private javax.swing.JTextField tfAmorTouro;
    private javax.swing.JTextField tfAmorVirgem;
    private javax.swing.JTextField tfCompatibilidade;
    private javax.swing.JTextField tfCorAquario;
    private javax.swing.JTextField tfCorAries;
    private javax.swing.JTextField tfCorCancer;
    private javax.swing.JTextField tfCorCapricornio;
    private javax.swing.JTextField tfCorEscorpiao;
    private javax.swing.JTextField tfCorGemeos;
    private javax.swing.JTextField tfCorLeao;
    private javax.swing.JTextField tfCorLibra;
    private javax.swing.JTextField tfCorPeixes;
    private javax.swing.JTextField tfCorSargitario;
    private javax.swing.JTextField tfCorTouro;
    private javax.swing.JTextField tfCorVirgem;
    private javax.swing.JTextField tfElementoAquario;
    private javax.swing.JTextField tfElementoAries;
    private javax.swing.JTextField tfElementoCancer;
    private javax.swing.JTextField tfElementoCapricornio;
    private javax.swing.JTextField tfElementoEscorpiao;
    private javax.swing.JTextField tfElementoGemeos;
    private javax.swing.JTextField tfElementoLeao;
    private javax.swing.JTextField tfElementoLibra;
    private javax.swing.JTextField tfElementoPeixes;
    private javax.swing.JTextField tfElementoSargitario;
    private javax.swing.JTextField tfElementoTouro;
    private javax.swing.JTextField tfElementoVirgem;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNumeroAquario;
    private javax.swing.JTextField tfNumeroAries;
    private javax.swing.JTextField tfNumeroCancer;
    private javax.swing.JTextField tfNumeroCapricornio;
    private javax.swing.JTextField tfNumeroEscorpiao;
    private javax.swing.JTextField tfNumeroGemeos;
    private javax.swing.JTextField tfNumeroLeao;
    private javax.swing.JTextField tfNumeroLibra;
    private javax.swing.JTextField tfNumeroPeixes;
    private javax.swing.JTextField tfNumeroSargitario;
    private javax.swing.JTextField tfNumeroTouro;
    private javax.swing.JTextField tfNumeroVirgem;
    private javax.swing.JTextField tfPeriodoAquario;
    private javax.swing.JTextField tfPeriodoAries;
    private javax.swing.JTextField tfPeriodoCancer;
    private javax.swing.JTextField tfPeriodoCapricornio;
    private javax.swing.JTextField tfPeriodoEscorpiao;
    private javax.swing.JTextField tfPeriodoGemeos;
    private javax.swing.JTextField tfPeriodoLeao;
    private javax.swing.JTextField tfPeriodoLibra;
    private javax.swing.JTextField tfPeriodoPeixes;
    private javax.swing.JTextField tfPeriodoSargitario;
    private javax.swing.JTextField tfPeriodoTouro;
    private javax.swing.JTextField tfPeriodoVirgem;
    private javax.swing.JTextField tfPlanetaAquario;
    private javax.swing.JTextField tfPlanetaAries;
    private javax.swing.JTextField tfPlanetaCancer;
    private javax.swing.JTextField tfPlanetaCapricornio;
    private javax.swing.JTextField tfPlanetaEscorpiao;
    private javax.swing.JTextField tfPlanetaGemeos;
    private javax.swing.JTextField tfPlanetaLeao;
    private javax.swing.JTextField tfPlanetaLibra;
    private javax.swing.JTextField tfPlanetaPeixes;
    private javax.swing.JTextField tfPlanetaSargitario;
    private javax.swing.JTextField tfPlanetaTouro;
    private javax.swing.JTextField tfPlanetaVirgem;
    private javax.swing.JTextField tfSaudeAquario;
    private javax.swing.JTextField tfSaudeAries;
    private javax.swing.JTextField tfSaudeCancer;
    private javax.swing.JTextField tfSaudeCapricornio;
    private javax.swing.JTextField tfSaudeEscorpiao;
    private javax.swing.JTextField tfSaudeGemeos;
    private javax.swing.JTextField tfSaudeLeao;
    private javax.swing.JTextField tfSaudeLibra;
    private javax.swing.JTextField tfSaudeSargitario;
    private javax.swing.JTextField tfSaudeTouro;
    private javax.swing.JTextField tfSaudeVirgem;
    private javax.swing.JTextField tfSorteAquario;
    private javax.swing.JTextField tfSorteAries;
    private javax.swing.JTextField tfSorteAries6;
    private javax.swing.JTextField tfSorteCancer;
    private javax.swing.JTextField tfSorteCapricornio;
    private javax.swing.JTextField tfSorteEscorpiao;
    private javax.swing.JTextField tfSorteGemeos;
    private javax.swing.JTextField tfSorteLeao;
    private javax.swing.JTextField tfSorteLibra;
    private javax.swing.JTextField tfSorteSargitario;
    private javax.swing.JTextField tfSorteTouro;
    private javax.swing.JTextField tfSorteVirgem;
    private javax.swing.JTextField tfTrabalhoAquario;
    private javax.swing.JTextField tfTrabalhoAries;
    private javax.swing.JTextField tfTrabalhoCancer;
    private javax.swing.JTextField tfTrabalhoCapricornio;
    private javax.swing.JTextField tfTrabalhoEscorpiao;
    private javax.swing.JTextField tfTrabalhoGemeos;
    private javax.swing.JTextField tfTrabalhoLeao;
    private javax.swing.JTextField tfTrabalhoLibra;
    private javax.swing.JTextField tfTrabalhoPeixes;
    private javax.swing.JTextField tfTrabalhoSargitario;
    private javax.swing.JTextField tfTrabalhoTouro;
    private javax.swing.JTextField tfTrabalhoVirgem;
    private javax.swing.JLabel tituloAquario;
    private javax.swing.JLabel tituloAries;
    private javax.swing.JLabel tituloCancer;
    private javax.swing.JLabel tituloCapricornio;
    private javax.swing.JLabel tituloCompatibilidade;
    private javax.swing.JLabel tituloDescobrirSigno;
    private javax.swing.JLabel tituloEnergiaAquario;
    private javax.swing.JLabel tituloEnergiaAries;
    private javax.swing.JLabel tituloEnergiaCancer;
    private javax.swing.JLabel tituloEnergiaCapricornio;
    private javax.swing.JLabel tituloEnergiaEscorpiao;
    private javax.swing.JLabel tituloEnergiaGemeos;
    private javax.swing.JLabel tituloEnergiaLeao;
    private javax.swing.JLabel tituloEnergiaLibra;
    private javax.swing.JLabel tituloEnergiaPeixes;
    private javax.swing.JLabel tituloEnergiaSargitario;
    private javax.swing.JLabel tituloEnergiaTouro;
    private javax.swing.JLabel tituloEnergiaVirgem;
    private javax.swing.JLabel tituloEscorpiao;
    private javax.swing.JLabel tituloGemeos;
    private javax.swing.JLabel tituloLeao;
    private javax.swing.JLabel tituloLibra;
    private javax.swing.JLabel tituloMensagemAquario;
    private javax.swing.JLabel tituloMensagemAries;
    private javax.swing.JLabel tituloMensagemCancer;
    private javax.swing.JLabel tituloMensagemCapricornio;
    private javax.swing.JLabel tituloMensagemEscorpiao;
    private javax.swing.JLabel tituloMensagemGemeos;
    private javax.swing.JLabel tituloMensagemLeao;
    private javax.swing.JLabel tituloMensagemLibra;
    private javax.swing.JLabel tituloMensagemPeixes;
    private javax.swing.JLabel tituloMensagemSargitario;
    private javax.swing.JLabel tituloMensagemTouro;
    private javax.swing.JLabel tituloMensagemVirgem;
    private javax.swing.JLabel tituloPeixes;
    private javax.swing.JLabel tituloSargitario;
    private javax.swing.JLabel tituloTouro;
    private javax.swing.JLabel tituloVirgem;
    private javax.swing.JPanel touro;
    private javax.swing.JLabel trabalhoAquario;
    private javax.swing.JLabel trabalhoAries;
    private javax.swing.JLabel trabalhoCancer;
    private javax.swing.JLabel trabalhoCapricornio;
    private javax.swing.JLabel trabalhoEscorpiao;
    private javax.swing.JLabel trabalhoGemeos;
    private javax.swing.JLabel trabalhoLeao;
    private javax.swing.JLabel trabalhoLibra;
    private javax.swing.JLabel trabalhoPeixes;
    private javax.swing.JLabel trabalhoSargitario;
    private javax.swing.JLabel trabalhoTouro;
    private javax.swing.JLabel trabalhoVirgem;
    private javax.swing.JTextArea txFortesAquario;
    private javax.swing.JTextArea txFortesAries;
    private javax.swing.JTextArea txFortesCancer;
    private javax.swing.JTextArea txFortesCapricornio;
    private javax.swing.JTextArea txFortesEscorpiao;
    private javax.swing.JTextArea txFortesGemeos;
    private javax.swing.JTextArea txFortesLeao;
    private javax.swing.JTextArea txFortesLibra;
    private javax.swing.JTextArea txFortesPeixes;
    private javax.swing.JTextArea txFortesSargitariov;
    private javax.swing.JTextArea txFortesTouro;
    private javax.swing.JTextArea txFortesVirgem;
    private javax.swing.JTextArea txMelhoriasAquario;
    private javax.swing.JTextArea txMelhoriasAries;
    private javax.swing.JTextArea txMelhoriasCancer;
    private javax.swing.JTextArea txMelhoriasCapricornio;
    private javax.swing.JTextArea txMelhoriasEscorpiao;
    private javax.swing.JTextArea txMelhoriasGemeos;
    private javax.swing.JTextArea txMelhoriasLeao;
    private javax.swing.JTextArea txMelhoriasLibra;
    private javax.swing.JTextArea txMelhoriasPeixes;
    private javax.swing.JTextArea txMelhoriasSargitario;
    private javax.swing.JTextArea txMelhoriasTouro;
    private javax.swing.JTextArea txMelhoriasVirgem;
    private javax.swing.JTextArea txMensagemAquario;
    private javax.swing.JTextArea txMensagemAries;
    private javax.swing.JTextArea txMensagemCancer;
    private javax.swing.JTextArea txMensagemCapricornio;
    private javax.swing.JTextArea txMensagemEscorpiao;
    private javax.swing.JTextArea txMensagemGemeos;
    private javax.swing.JTextArea txMensagemLeao;
    private javax.swing.JTextArea txMensagemLibra;
    private javax.swing.JTextArea txMensagemPeixes;
    private javax.swing.JTextArea txMensagemSargitario;
    private javax.swing.JTextArea txMensagemTouro;
    private javax.swing.JTextArea txMensagemVirgem;
    private javax.swing.JTextArea txPrevisoesAquario;
    private javax.swing.JTextArea txPrevisoesAries;
    private javax.swing.JTextArea txPrevisoesCancer;
    private javax.swing.JTextArea txPrevisoesCapricornio;
    private javax.swing.JTextArea txPrevisoesEscorpiao;
    private javax.swing.JTextArea txPrevisoesGemeos;
    private javax.swing.JTextArea txPrevisoesLeao;
    private javax.swing.JTextArea txPrevisoesLibra;
    private javax.swing.JTextArea txPrevisoesPeixes;
    private javax.swing.JTextArea txPrevisoesSargitario;
    private javax.swing.JTextArea txPrevisoesTouro;
    private javax.swing.JTextArea txPrevisoesVirgem;
    private javax.swing.JPanel virgem;
    // End of variables declaration//GEN-END:variables
}
