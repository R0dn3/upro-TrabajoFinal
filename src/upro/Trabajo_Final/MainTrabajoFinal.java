package upro.Trabajo_Final;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class MainTrabajoFinal {

		public void metodo1() {

			String ventana = JOptionPane.showInputDialog(null, "Desea Ingresar a la Ventana de Windows ?");
			int conf = JOptionPane.showConfirmDialog(null, "¿Esta seguro?");
			JFileChooser jfile = new JFileChooser();
			int retorno = jfile.showOpenDialog(null);
			System.out.println(retorno);
			if (retorno == JFileChooser.APPROVE_OPTION) {
				File f = jfile.getSelectedFile();
				System.out.println(f.getAbsolutePath());
			}
			Path path = Path.of("C:\\CSV-1\\renewable-energy-stock-account-2007-18.csv");
			try {
				String s = Files.readString(path);
				System.out.println(s);
			} catch (IOException e) {
				e.printStackTrace();

			}
			JOptionPane.showMessageDialog(null, "Realizado");
			JOptionPane.showMessageDialog(null, path);
		}

		public void metodo2() {
			Path path = Path.of("C:\\CSV-1\\renewable-energy-stock-account-2007-18.csv");
			ExceptionEnergia[] array = null;
			try {
				String str = Files.readString(path);
				StringTokenizer st0 = new StringTokenizer(str, "\n");
				int contador = 0;
				while (st0.hasMoreTokens()) {
					st0.nextToken();
					contador++;
				}
				System.out.println("numero de lineas " + contador);
				array = new ExceptionEnergia[contador - 1];
				StringTokenizer st1 = new StringTokenizer(str, "\n");
				st1.nextToken();
				contador = 0;
				while (st1.hasMoreTokens()) {
					try {
						String token1 = st1.nextToken();
						System.out.println("TOKEN1: " + token1);
						StringTokenizer st2 = new StringTokenizer(token1, ",");
						int year = Integer.parseInt(st2.nextToken().trim());
						String resource = st2.nextToken();
						String variable = st2.nextToken();
						String units = st2.nextToken();
						String magnitude = st2.nextToken();
						String source = st2.nextToken();
						double data_value = Double.parseDouble(st2.nextToken().trim());
						String flag = st2.nextToken();
						ExceptionEnergia p = new ExceptionEnergia(year, resource, variable, units, magnitude, source,
								data_value, flag);
					} catch (NumberFormatException e) {
						System.out.println("Ha ocurrido el error: " + e.getMessage());

					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			JOptionPane.showMessageDialog(null, "Realizado");

		}
		public void metodo3() {
			Path path = Path.of("C:\\temporal\\nueva\\renewable-energy-stock-account-2007-18.csv");
			try {
				Files.writeString(path, "hola desde mi aplicacion Java");
			} catch (IOException e) {
				e.printStackTrace();
			}
			JOptionPane.showMessageDialog(null,"Realizado");
			
			
			
		}
		public void metodo4() {

			int fila = Integer.parseInt(JOptionPane.showInputDialog(null, "Escoja la fila que desea ver", 0));

			int resultado = fila;
			String NumeroFila = null;

			switch (resultado) {

			case 1:
				NumeroFila = "2007	Biogas	Closing stock	Dollars	Thousands	Environmental Accounts	86690	R";
				break;
			case 2:
				NumeroFila = "2007	Biogas	Generation	Gigawatt hours	Actual	MBIE	224	F";
				break;
			case 3:
				NumeroFila = "2007	Biogas	Gigawatt hours	Number	Proportion	MBIE	0.01	F";
				break;
			case 4:
				NumeroFila = "2007	Biogas	Opening stock	Dollars	Thousands	Environmental Accounts		F";
				break;
			case 5:
				NumeroFila = "2007	Biogas	Other changes	Dollars	Thousands	Environmental Accounts		F";
				break;
			case 6:
				NumeroFila = "2007	Biogas	Resource rent	Dollars	Thousands	Environmental Accounts	5201	R";
				break;
			case 7:
				NumeroFila = "2007	Coal	Generation	Gigawatt hours	Actual	MBIE	4786	F";
				break;
			case 8:
				NumeroFila = "2007	Gas	Generation	Gigawatt hours	Actual	MBIE	8634	F";
				break;
			case 9:
				NumeroFila = "2007	Geothermal	Closing stock	Dollars	Thousands	Environmental Accounts	1242291	R";
				break;
			case 10:
				NumeroFila = "2007	Geothermal	Generation	Gigawatt hours	Actual	MBIE	3210	F";
				break;
			case 11:
				NumeroFila = "2007	Geothermal	Gigawatt hours	Number	Proportion	MBIE	0.08	F";
				break;
			case 12:
				NumeroFila = "2007	Geothermal	Opening stock	Dollars	Thousands	Environmental Accounts		F";
				break;
			case 13:
				NumeroFila = "2007	Geothermal	Other changes	Dollars	Thousands	Environmental Accounts		F";
				break;
			case 14:
				NumeroFila = "2007	Geothermal	Resource rent	Dollars	Thousands	Environmental Accounts	74537	R";
				break;
			case 15:
				NumeroFila = "2007	Hydro	Closing stock	Dollars	Thousands	Environmental Accounts	9383706	R";
				break;
			case 16:
				NumeroFila = "2007	Hydro	Generation	Gigawatt hours	Actual	MBIE	24249	F";
				break;
			case 17:
				NumeroFila = "2007	Hydro	Gigawatt hours	Number	Proportion	MBIE	0.58	F";
				break;
			case 18:
				NumeroFila = "2007	Hydro	Opening stock	Dollars	Thousands	Environmental Accounts		F";
				break;
			case 19:
				NumeroFila = "2007	Hydro	Other changes	Dollars	Thousands	Environmental Accounts		F";
				break;
			case 20:
				NumeroFila = "2007	Hydro	Resource rent	Dollars	Thousands	Environmental Accounts	563022	R";
				break;
			case 21:
				NumeroFila = "2007	Oil	Generation	Gigawatt hours	Actual	MBIE	3	F";
				break;
			case 22:
				NumeroFila = "2007	Renewable	Closing stock	Dollars	Thousands	Environmental Accounts	11063169	R";
				break;
			case 23:
				NumeroFila = "2007	Renewable	Generation	Gigawatt hours	Actual	MBIE	28589	F";
				break;
			case 24:
				NumeroFila = "2007	Renewable	Gigawatt hours	Number	Proportion	MBIE	0.68	F";
				break;
			case 25:
				NumeroFila = "2007	Renewable	Opening stock	Dollars	Thousands	Environmental Accounts		F";
				break;
			case 26:
				NumeroFila = "2007	Renewable	Other changes	Dollars	Thousands	Environmental Accounts		F";
				break;
			case 27:
				NumeroFila = "2007	Renewable	Resource rent	Dollars	Thousands	Environmental Accounts	663790	R";
				break;
			case 28:
				NumeroFila = "2007	Renewable	Resource rent	Number	Proportion	Environmental Accounts	0.68	F";
				break;
			case 29:
				NumeroFila = "2007	Solar	Closing stock	Dollars	Thousands	Environmental Accounts	326	F";
				break;
			case 30:
				NumeroFila = "2007	Solar	Generation	Gigawatt hours	Actual	MBIE	1	F";
				break;
			case 31:
				NumeroFila = "2007	Solar	Gigawatt hours	Number	Proportion	MBIE	0	F";
				break;
			case 32:
				NumeroFila = "2007	Solar	Opening stock	Dollars	Thousands	Environmental Accounts		F";
				break;
			case 33:
				NumeroFila = "2007	Solar	Other changes	Dollars	Thousands	Environmental Accounts		F";
				break;
			case 34:
				NumeroFila = "2007	Solar	Resource rent	Dollars	Thousands	Environmental Accounts	20	F";
				break;
			case 35:
				NumeroFila = "2007	Total generation	Generation	Gigawatt hours	Actual	MBIE	42083	F";
				break;
			case 36:
				NumeroFila = "2007	Total generation	Prices	Number	Average	Electricity Authority	60	F";
				break;
			case 37:
				NumeroFila = "2007	Total generation	Resource rent	Dollars	Thousands	Environmental Accounts	977086	R";
				break;
			case 38:
				NumeroFila = "2007	Waste heat	Generation	Gigawatt hours	Actual	MBIE	71	F";
				break;
			case 39:
				NumeroFila = "2007	Wind	Closing stock	Dollars	Thousands	Environmental Accounts	233652	R";
				break;
			case 40:
				NumeroFila = "2007	Wind	Generation	Gigawatt hours	Actual	MBIE	604	F";
				break;
			case 41:
				NumeroFila = "2007	Wind	Gigawatt hours	Number	Proportion	MBIE	0.01	F";
				break;
			case 42:
				NumeroFila = "2007	Wind	Opening stock	Dollars	Thousands	Environmental Accounts		F";
				break;
			case 43:
				NumeroFila = "2007	Wind	Other changes	Dollars	Thousands	Environmental Accounts		F";
				break;
			case 44:
				NumeroFila = "2007	Wind	Resource rent	Dollars	Thousands	Environmental Accounts	14019	R";
				break;
			case 45:
				NumeroFila = "2007	Wood	Closing stock	Dollars	Thousands	Environmental Accounts	116505	R";
				break;
			case 46:
				NumeroFila = "2007	Wood	Generation	Gigawatt hours	Actual	MBIE	301	F";
				break;
			case 47:
				NumeroFila = "2007	Wood	Gigawatt hours	Number	Proportion	MBIE	0.01	F";
				break;
			case 48:
				NumeroFila = "2007	Wood	Opening stock	Dollars	Thousands	Environmental Accounts		F";
				break;
			case 49:
				NumeroFila = "2007	Wood	Other changes	Dollars	Thousands	Environmental Accounts		F";
				break;
			case 50:
				NumeroFila = "2007	Wood	Resource rent	Dollars	Thousands	Environmental Accounts	6990	R";
				break;
			case 51:
				NumeroFila = "2008	Biogas	Closing stock	Dollars	Thousands	Environmental Accounts	83934	R";
				break;
			case 52:
				NumeroFila = "2008	Biogas	Generation	Gigawatt hours	Actual	MBIE	205	F";
				break;
			case 53:
				NumeroFila = "2008	Biogas	Gigawatt hours	Number	Proportion	MBIE	0	F";
				break;
			case 54:
				NumeroFila = "2008	Biogas	Opening stock	Dollars	Thousands	Environmental Accounts	86690	R";
				break;
			case 55:
				NumeroFila = "2008	Biogas	Other changes	Dollars	Thousands	Environmental Accounts	-2756	R";
				break;
			case 56:
				NumeroFila = "2008	Biogas	Resource rent	Dollars	Thousands	Environmental Accounts	5036	R";
				break;
			case 57:
				NumeroFila = "2008	Coal	Generation	Gigawatt hours	Actual	MBIE	3245	F";
				break;
			case 58:
				NumeroFila = "2008	Gas	Generation	Gigawatt hours	Actual	MBIE	11551	F";
				break;
			case 59:
				NumeroFila = "2008	Geothermal	Closing stock	Dollars	Thousands	Environmental Accounts	1398360	R";
				break;
			case 60:
				NumeroFila = "2008	Geothermal	Generation	Gigawatt hours	Actual	MBIE	3417	F";
				break;
			case 61:
				NumeroFila = "2008	Geothermal	Gigawatt hours	Number	Proportion	MBIE	0.08	F";
				break;
			case 62:
				NumeroFila = "2008	Geothermal	Opening stock	Dollars	Thousands	Environmental Accounts	1242291	R";
				break;
			case 63:
				NumeroFila = "2008	Geothermal	Other changes	Dollars	Thousands	Environmental Accounts	156069	R";
				break;
			case 64:
				NumeroFila = "2008	Geothermal	Resource rent	Dollars	Thousands	Environmental Accounts	83902	R";
				break;
			case 65:
				NumeroFila = "2008	Hydro	Closing stock	Dollars	Thousands	Environmental Accounts	9255132	R";
				break;
			case 66:
				NumeroFila = "2008	Hydro	Generation	Gigawatt hours	Actual	MBIE	22616	F";
				break;
			case 67:
				NumeroFila = "2008	Hydro	Gigawatt hours	Number	Proportion	MBIE	0.53	F";
				break;
			case 68:
				NumeroFila = "2008	Hydro	Opening stock	Dollars	Thousands	Environmental Accounts	9383706	R";
				break;
			case 69:
				NumeroFila = "2008	Hydro	Other changes	Dollars	Thousands	Environmental Accounts	-128574	R";
				break;
			case 70:
				NumeroFila = "2008	Hydro	Resource rent	Dollars	Thousands	Environmental Accounts	555308	R";
				break;
			case 71:
				NumeroFila = "2008	Oil	Generation	Gigawatt hours	Actual	MBIE	27	F";
				break;
			case 72:
				NumeroFila = "2008	Renewable	Closing stock	Dollars	Thousands	Environmental Accounts	11292208	R";
				break;
			case 73:
				NumeroFila = "2008	Renewable	Generation	Gigawatt hours	Actual	MBIE	27594	F";
				break;
			case 74:
				NumeroFila = "2008	Renewable	Gigawatt hours	Number	Proportion	MBIE	0.65	F";
				break;
			case 75:
				NumeroFila = "2008	Renewable	Opening stock	Dollars	Thousands	Environmental Accounts	11063169	R";
				break;
			case 76:
				NumeroFila = "2008	Renewable	Other changes	Dollars	Thousands	Environmental Accounts	229039	R";
				break;
			case 77:
				NumeroFila = "2008	Renewable	Resource rent	Dollars	Thousands	Environmental Accounts	677532	R";
				break;
			case 78:
				NumeroFila = "2008	Renewable	Resource rent	Number	Proportion	Environmental Accounts	0.65	F";
				break;
			case 79:
				NumeroFila = "2008	Solar	Closing stock	Dollars	Thousands	Environmental Accounts	1385	R";
				break;
			case 80:
				NumeroFila = "2008	Solar	Generation	Gigawatt hours	Actual	MBIE	3	F";
				break;
			case 81:
				NumeroFila = "2008	Solar	Gigawatt hours	Number	Proportion	MBIE	0	F";
				break;
			case 82:
				NumeroFila = "2008	Solar	Opening stock	Dollars	Thousands	Environmental Accounts	326	F";
				break;
			case 83:
				NumeroFila = "2008	Solar	Other changes	Dollars	Thousands	Environmental Accounts	1059	R";
				break;
			case 84:
				NumeroFila = "2008	Solar	Resource rent	Dollars	Thousands	Environmental Accounts	83	F";
				break;
			case 85:
				NumeroFila = "2008	Total generation	Generation	Gigawatt hours	Actual	MBIE	42464	F";
				break;
			case 86:
				NumeroFila = "2008	Total generation	Prices	Number	Average	Electricity Authority	70	F";
				break;
			case 87:
				NumeroFila = "2008	Total generation	Resource rent	Dollars	Thousands	Environmental Accounts	1042654	R";
				break;
			case 88:
				NumeroFila = "2008	Waste heat	Generation	Gigawatt hours	Actual	MBIE	47	F";
				break;
			case 89:
				NumeroFila = "2008	Wind	Closing stock	Dollars	Thousands	Environmental Accounts	422457	R";
				break;
			case 90:
				NumeroFila = "2008	Wind	Generation	Gigawatt hours	Actual	MBIE	1032	F";
				break;
			case 91:
				NumeroFila = "2008	Wind	Gigawatt hours	Number	Proportion	MBIE	0.02	F";
				break;
			case 92:
				NumeroFila = "2008	Wind	Opening stock	Dollars	Thousands	Environmental Accounts	233652	R";
				break;
			case 93:
				NumeroFila = "2008	Wind	Other changes	Dollars	Thousands	Environmental Accounts	188805	R";
				break;
			case 94:
				NumeroFila = "2008	Wind	Resource rent	Dollars	Thousands	Environmental Accounts	25347	R";
				break;
			case 95:
				NumeroFila = "2008	Wood	Closing stock	Dollars	Thousands	Environmental Accounts	130941	R";
				break;
			case 96:
				NumeroFila = "2008	Wood	Generation	Gigawatt hours	Actual	MBIE	320	F";
				break;
			case 97:
				NumeroFila = "2008	Wood	Gigawatt hours	Number	Proportion	MBIE	0.01	F";
				break;
			case 98:
				NumeroFila = "2008	Wood	Opening stock	Dollars	Thousands	Environmental Accounts	116505	R";
				break;
			case 99:
				NumeroFila = "2008	Wood	Other changes	Dollars	Thousands	Environmental Accounts	14436	R";
				break;
			case 100:
				NumeroFila = "2008	Wood	Resource rent	Dollars	Thousands	Environmental Accounts	7856	R";
				break;
			case 101:
				NumeroFila = "2009	Biogas	Closing stock	Dollars	Thousands	Environmental Accounts	85598	R";
				break;
			case 102:
				NumeroFila = "2009	Biogas	Generation	Gigawatt hours	Actual	MBIE	205	F";
				break;
			case 103:
				NumeroFila = "2009	Biogas	Gigawatt hours	Number	Proportion	MBIE	0	F";
				break;
			case 104:
				NumeroFila = "2009	Biogas	Opening stock	Dollars	Thousands	Environmental Accounts	83934	R";
				break;
			case 105:
				NumeroFila = "2009	Biogas	Other changes	Dollars	Thousands	Environmental Accounts	1664	R";
				break;
			case 106:
				NumeroFila = "2009	Biogas	Resource rent	Dollars	Thousands	Environmental Accounts	5136	R";
				break;
			case 107:
				NumeroFila = "2009	Coal	Generation	Gigawatt hours	Actual	MBIE	4088	F";
				break;
			case 108:
				NumeroFila = "2009	Gas	Generation	Gigawatt hours	Actual	MBIE	9471	R";
				break;
			case 109:
				NumeroFila = "2009	Geothermal	Closing stock	Dollars	Thousands	Environmental Accounts	1749010	R";
				break;
			case 110:
				NumeroFila = "2009	Geothermal	Generation	Gigawatt hours	Actual	MBIE	4197	F";
				break;
			case 111:
				NumeroFila = "2009	Geothermal	Gigawatt hours	Number	Proportion	MBIE	0.1	F";
				break;
			case 112:
				NumeroFila = "2009	Geothermal	Opening stock	Dollars	Thousands	Environmental Accounts	1398360	R";
				break;
			case 113:
				NumeroFila = "2009	Geothermal	Other changes	Dollars	Thousands	Environmental Accounts	350650	R";
				break;
			case 114:
				NumeroFila = "2009	Geothermal	Resource rent	Dollars	Thousands	Environmental Accounts	104941	R";
				break;
			case 115:
				NumeroFila = "2009	Hydro	Closing stock	Dollars	Thousands	Environmental Accounts	9310094	R";
				break;
			case 116:
				NumeroFila = "2009	Hydro	Generation	Gigawatt hours	Actual	MBIE	22340	F";
				break;
			case 117:
				NumeroFila = "2009	Hydro	Gigawatt hours	Number	Proportion	MBIE	0.53	F";
				break;
			case 118:
				NumeroFila = "2009	Hydro	Opening stock	Dollars	Thousands	Environmental Accounts	9255132	R";
				break;
			case 119:
				NumeroFila = "2009	Hydro	Other changes	Dollars	Thousands	Environmental Accounts	54962	R";
				break;
			case 120:
				NumeroFila = "2009	Hydro	Resource rent	Dollars	Thousands	Environmental Accounts	558606	R";
				break;
			case 121:
				NumeroFila = "2009	Oil	Generation	Gigawatt hours	Actual	MBIE	98	F";
				break;
			case 122:
				NumeroFila = "2009	Renewable	Closing stock	Dollars	Thousands	Environmental Accounts	11733864	R";
				break;
			case 123:
				NumeroFila = "2009	Renewable	Generation	Gigawatt hours	Actual	MBIE	28156	F";
				break;
			case 124:
				NumeroFila = "2009	Renewable	Gigawatt hours	Number	Proportion	MBIE	0.67	F";
				break;
			case 125:
				NumeroFila = "2009	Renewable	Opening stock	Dollars	Thousands	Environmental Accounts	11292208	R";
				break;
			case 126:
				NumeroFila = "2009	Renewable	Other changes	Dollars	Thousands	Environmental Accounts	441656	R";
				break;
			case 127:
				NumeroFila = "2009	Renewable	Resource rent	Dollars	Thousands	Environmental Accounts	704032	R";
				break;
			case 128:
				NumeroFila = "2009	Renewable	Resource rent	Number	Proportion	Environmental Accounts	0.67	F";
				break;
			case 129:
				NumeroFila = "2009	Solar	Closing stock	Dollars	Thousands	Environmental Accounts	1440	R";
				break;
			case 130:
				NumeroFila = "2009	Solar	Generation	Gigawatt hours	Actual	MBIE	3	F";
				break;
			case 131:
				NumeroFila = "2009	Solar	Gigawatt hours	Number	Proportion	MBIE	0	F";
				break;
			case 132:
				NumeroFila = "2009	Solar	Opening stock	Dollars	Thousands	Environmental Accounts	1385	R";
				break;
			case 133:
				NumeroFila = "2009	Solar	Other changes	Dollars	Thousands	Environmental Accounts	55	R";
				break;
			case 134:
				NumeroFila = "2009	Solar	Resource rent	Dollars	Thousands	Environmental Accounts	86	F";
				break;
			case 135:
				NumeroFila = "2009	Total generation	Generation	Gigawatt hours	Actual	MBIE	41873	R";
				break;
			case 136:
				NumeroFila = "2009	Total generation	Prices	Number	Average	Electricity Authority	105	F";
				break;
			case 137:
				NumeroFila = "2009	Total generation	Resource rent	Dollars	Thousands	Environmental Accounts	1047010	R";
				break;
			case 138:
				NumeroFila = "2009	Waste heat	Generation	Gigawatt hours	Actual	MBIE	59	F";
				break;
			case 139:
				NumeroFila = "2009	Wind	Closing stock	Dollars	Thousands	Environmental Accounts	454009	R";
				break;
			case 140:
				NumeroFila = "2009	Wind	Generation	Gigawatt hours	Actual	MBIE	1089	F";
				break;
			case 141:
				NumeroFila = "2009	Wind	Gigawatt hours	Number	Proportion	MBIE	0.03	F";
				break;
			case 142:
				NumeroFila = "2009	Wind	Opening stock	Dollars	Thousands	Environmental Accounts	422457	R";
				break;
			case 143:
				NumeroFila = "2009	Wind	Other changes	Dollars	Thousands	Environmental Accounts	31552	R";
				break;
			case 144:
				NumeroFila = "2009	Wind	Resource rent	Dollars	Thousands	Environmental Accounts	27241	R";
				break;
			case 145:
				NumeroFila = "2009	Wood	Closing stock	Dollars	Thousands	Environmental Accounts	133713	R";
				break;
			case 146:
				NumeroFila = "2009	Wood	Generation	Gigawatt hours	Actual	MBIE	321	F";
				break;
			case 147:
				NumeroFila = "2009	Wood	Gigawatt hours	Number	Proportion	MBIE	0.01	F";
				break;
			case 148:
				NumeroFila = "2009	Wood	Opening stock	Dollars	Thousands	Environmental Accounts	130941	R";
				break;
			case 149:
				NumeroFila = "2009	Wood	Other changes	Dollars	Thousands	Environmental Accounts	2773";
				break;
			case 150:
				NumeroFila = "2009	Wood	Resource rent	Dollars	Thousands	Environmental Accounts	8023	R";
				break;
			case 151:
				NumeroFila = "2010	Biogas	Closing stock	Dollars	Thousands	Environmental Accounts	91103	R";
				break;
			case 152:
				NumeroFila = "2010	Biogas	Generation	Gigawatt hours	Actual	MBIE	221	F";
				break;
			case 153:
				NumeroFila = "2010	Biogas	Gigawatt hours	Number	Proportion	MBIE	0.01	F";
				break;
			case 154:
				NumeroFila = "2010	Biogas	Opening stock	Dollars	Thousands	Environmental Accounts	85598	R";
				break;
			case 155:
				NumeroFila = "2010	Biogas	Other changes	Dollars	Thousands	Environmental Accounts	5504	R";
				break;
			case 156:
				NumeroFila = "2010	Biogas	Resource rent	Dollars	Thousands	Environmental Accounts	5466	R";
				break;
			case 157:
				NumeroFila = "2010	Coal	Generation	Gigawatt hours	Actual	MBIE	3109	F";
				break;
			case 158:
				NumeroFila = "2010	Gas	Generation	Gigawatt hours	Actual	MBIE	8449	F";
				break;
			case 159:
				NumeroFila = "2010	Geothermal	Closing stock	Dollars	Thousands	Environmental Accounts	1929148	R";
				break;
			case 160:
				NumeroFila = "2010	Geothermal	Generation	Gigawatt hours	Actual	MBIE	4671	F";
				break;
			case 161:
				NumeroFila = "2010	Geothermal	Gigawatt hours	Number	Proportion	MBIE	0.11	F";
				break;
			case 162:
				NumeroFila = "2010	Geothermal	Opening stock	Dollars	Thousands	Environmental Accounts	1749010	R";
				break;
			case 163:
				NumeroFila = "2010	Geothermal	Other changes	Dollars	Thousands	Environmental Accounts	180138	R";
				break;
			case 164:
				NumeroFila = "2010	Geothermal	Resource rent	Dollars	Thousands	Environmental Accounts	115749	R";
				break;
			case 165:
				NumeroFila = "2010	Hydro	Closing stock	Dollars	Thousands	Environmental Accounts	9991724	R";
				break;
			case 166:
				NumeroFila = "2010	Hydro	Generation	Gigawatt hours	Actual	MBIE	24194	F";
				break;
			case 167:
				NumeroFila = "2010	Hydro	Gigawatt hours	Number	Proportion	MBIE	0.57	F";
				break;
			case 168:
				NumeroFila = "2010	Hydro	Opening stock	Dollars	Thousands	Environmental Accounts	9310094	R";
				break;
			case 169:
				NumeroFila = "2010	Hydro	Other changes	Dollars	Thousands	Environmental Accounts	681631	R";
				break;
			case 170:
				NumeroFila = "2010	Hydro	Resource rent	Dollars	Thousands	Environmental Accounts	599503	R";
				break;
			case 171:
				NumeroFila = "2010	Oil	Generation	Gigawatt hours	Actual	MBIE	9	F";
				break;
			case 172:
				NumeroFila = "2010	Renewable	Closing stock	Dollars	Thousands	Environmental Accounts	12811765	R";
				break;
			case 173:
				NumeroFila = "2010	Renewable	Generation	Gigawatt hours	Actual	MBIE	31022	F";
				break;
			case 174:
				NumeroFila = "2010	Renewable	Gigawatt hours	Number	Proportion	MBIE	0.73	F";
				break;
			case 175:
				NumeroFila = "2010	Renewable	Opening stock	Dollars	Thousands	Environmental Accounts	11733864	R";
				break;
			case 176:
				NumeroFila = "2010	Renewable	Other changes	Dollars	Thousands	Environmental Accounts	1077901	R";
				break;
			case 177:
				NumeroFila = "2010	Renewable	Resource rent	Dollars	Thousands	Environmental Accounts	768706	R";
				break;
			case 178:
				NumeroFila = "2010	Renewable	Resource rent	Number	Proportion	Environmental Accounts	0.73	F";
				break;
			case 179:
				NumeroFila = "2010	Solar	Closing stock	Dollars	Thousands	Environmental Accounts	1492	R";
				break;
			case 180:
				NumeroFila = "2010	Solar	Generation	Gigawatt hours	Actual	MBIE	4	F";
				break;
			case 181:
				NumeroFila = "2010	Solar	Gigawatt hours	Number	Proportion	MBIE	0	F";
				break;
			case 182:
				NumeroFila = "2010	Solar	Opening stock	Dollars	Thousands	Environmental Accounts	1440	R";
				break;
			case 183:
				NumeroFila = "2010	Solar	Other changes	Dollars	Thousands	Environmental Accounts	53	R";
				break;
			case 184:
				NumeroFila = "2010	Solar	Resource rent	Dollars	Thousands	Environmental Accounts	90	R";
				break;
			case 185:
				NumeroFila = "2010	Total generation	Generation	Gigawatt hours	Actual	MBIE	42641	F";
				break;
			case 186:
				NumeroFila = "2010	Total generation	Prices	Number	Average	Electricity Authority	52	F";
				break;
			case 187:
				NumeroFila = "2010	Total generation	Resource rent	Dollars	Thousands	Environmental Accounts	1056625	R";
				break;
			case 188:
				NumeroFila = "2010	Waste heat	Generation	Gigawatt hours	Actual	MBIE	51	F";
				break;
			case 189:
				NumeroFila = "2010	Wind	Closing stock	Dollars	Thousands	Environmental Accounts	650783	R";
				break;
			case 190:
				NumeroFila = "2010	Wind	Generation	Gigawatt hours	Actual	MBIE	1576	F";
				break;
			case 191:
				NumeroFila = "2010	Wind	Gigawatt hours	Number	Proportion	MBIE	0.04	F";
				break;
			case 192:
				NumeroFila = "2010	Wind	Opening stock	Dollars	Thousands	Environmental Accounts	454009	R";
				break;
			case 193:
				NumeroFila = "2010	Wind	Other changes	Dollars	Thousands	Environmental Accounts	196774	R";
				break;
			case 194:
				NumeroFila = "2010	Wind	Resource rent	Dollars	Thousands	Environmental Accounts	39047	R";
				break;
			case 195:
				NumeroFila = "2010	Wood	Closing stock	Dollars	Thousands	Environmental Accounts	147515	R";
				break;
			case 196:
				NumeroFila = "2010	Wood	Generation	Gigawatt hours	Actual	MBIE	357	F";
				break;
			case 197:
				NumeroFila = "2010	Wood	Gigawatt hours	Number	Proportion	MBIE	0.01	F";
				break;
			case 198:
				NumeroFila = "2010	Wood	Opening stock	Dollars	Thousands	Environmental Accounts	133713	R";
				break;
			case 199:
				NumeroFila = "2010	Wood	Other changes	Dollars	Thousands	Environmental Accounts	13801	R";
				break;
			case 200:
				NumeroFila = "2010	Wood	Resource rent	Dollars	Thousands	Environmental Accounts	8851	R";
				break;
			case 201:
				NumeroFila = "2011	Biogas	Closing stock	Dollars	Thousands	Environmental Accounts	82598	R";
				break;
			case 202:
				NumeroFila = "2011	Biogas	Generation	Gigawatt hours	Actual	MBIE	215	F";
				break;
			case 203:
				NumeroFila = "2011	Biogas	Gigawatt hours	Number	Proportion	MBIE	0	F";
				break;
			case 204:
				NumeroFila = "2011	Biogas	Opening stock	Dollars	Thousands	Environmental Accounts	91103	R";
				break;
			case 205:
				NumeroFila = "2011	Biogas	Other changes	Dollars	Thousands	Environmental Accounts	-8505	R";
				break;
			case 206:
				NumeroFila = "2011	Biogas	Resource rent	Dollars	Thousands	Environmental Accounts	4956	R";
				break;
			case 207:
				NumeroFila = "2011	Coal	Generation	Gigawatt hours	Actual	MBIE	1635	F";
				break;
			case 208:
				NumeroFila = "2011	Gas	Generation	Gigawatt hours	Actual	MBIE	8853	R";
				break;
			case 209:
				NumeroFila = "2011	Geothermal	Closing stock	Dollars	Thousands	Environmental Accounts	2215070	R";
				break;
			case 210:
				NumeroFila = "2011	Geothermal	Generation	Gigawatt hours	Actual	MBIE	5772	R";
				break;
			case 211:
				NumeroFila = "2011	Geothermal	Gigawatt hours	Number	Proportion	MBIE	0.13	F";
				break;
			case 212:
				NumeroFila = "2011	Geothermal	Opening stock	Dollars	Thousands	Environmental Accounts	1929148	R";
				break;
			case 213:
				NumeroFila = "2011	Geothermal	Other changes	Dollars	Thousands	Environmental Accounts	285922	R";
				break;
			case 214:
				NumeroFila = "2011	Geothermal	Resource rent	Dollars	Thousands	Environmental Accounts	132904	R";
				break;
			case 215:
				NumeroFila = "2011	Hydro	Closing stock	Dollars	Thousands	Environmental Accounts	9568100	R";
				break;
			case 216:
				NumeroFila = "2011	Hydro	Generation	Gigawatt hours	Actual	MBIE	24931	R";
				break;
			case 217:
				NumeroFila = "2011	Hydro	Gigawatt hours	Number	Proportion	MBIE	0.57	F";
				break;
			case 218:
				NumeroFila = "2011	Hydro	Opening stock	Dollars	Thousands	Environmental Accounts	9991724	R";
				break;
			case 219:
				NumeroFila = "2011	Hydro	Other changes	Dollars	Thousands	Environmental Accounts	-423625	R";
				break;
			case 220:
				NumeroFila = "2011	Hydro	Resource rent	Dollars	Thousands	Environmental Accounts	574086	R";
				break;
			case 221:
				NumeroFila = "2011	Oil	Generation	Gigawatt hours	Actual	MBIE	1	F";
				break;
			case 222:
				NumeroFila = "2011	Renewable	Closing stock	Dollars	Thousands	Environmental Accounts	12624306	R";
				break;
			case 223:
				NumeroFila = "2011	Renewable	Generation	Gigawatt hours	Actual	MBIE	32895	R";
				break;
			case 224:
				NumeroFila = "2011	Renewable	Gigawatt hours	Number	Proportion	MBIE	0.76	F";
				break;
			case 225:
				NumeroFila = "2011	Renewable	Opening stock	Dollars	Thousands	Environmental Accounts	12811765	R";
				break;
			case 226:
				NumeroFila = "2011	Renewable	Other changes	Dollars	Thousands	Environmental Accounts	-187459	R";
				break;
			case 227:
				NumeroFila = "2011	Renewable	Resource rent	Dollars	Thousands	Environmental Accounts	757458	R";
				break;
			case 228:
				NumeroFila = "2011	Renewable	Resource rent	Number	Proportion	Environmental Accounts	0.76	F";
				break;
			case 229:
				NumeroFila = "2011	Solar	Closing stock	Dollars	Thousands	Environmental Accounts	1483	R";
				break;
			case 230:
				NumeroFila = "2011	Solar	Generation	Gigawatt hours	Actual	MBIE	4	F";
				break;
			case 231:
				NumeroFila = "2011	Solar	Gigawatt hours	Number	Proportion	MBIE	0	F";
				break;
			case 232:
				NumeroFila = "2011	Solar	Opening stock	Dollars	Thousands	Environmental Accounts	1492	R";
				break;
			case 233:
				NumeroFila = "2011	Solar	Other changes	Dollars	Thousands	Environmental Accounts	-9	R";
				break;
			case 234:
				NumeroFila = "2011	Solar	Resource rent	Dollars	Thousands	Environmental Accounts	89	R";
				break;
			case 235:
				NumeroFila = "2011	Total generation	Generation	Gigawatt hours	Actual	MBIE	43443	R";
				break;
			case 236:
				NumeroFila = "2011	Total generation	Prices	Number	Average	Electricity Authority	52	F";
				break;
			case 237:
				NumeroFila = "2011	Total generation	Resource rent	Dollars	Thousands	Environmental Accounts	1000346	R";
				break;
			case 238:
				NumeroFila = "2011	Waste heat	Generation	Gigawatt hours	Actual	MBIE	59	F";
				break;
			case 239:
				NumeroFila = "2011	Wind	Closing stock	Dollars	Thousands	Environmental Accounts	629174	R";
				break;
			case 240:
				NumeroFila = "2011	Wind	Generation	Gigawatt hours	Actual	MBIE	1639	F";
				break;
			case 241:
				NumeroFila = "2011	Wind	Gigawatt hours	Number	Proportion	MBIE	0.04	F";
				break;
			case 242:
				NumeroFila = "2011	Wind	Opening stock	Dollars	Thousands	Environmental Accounts	650783	R";
				break;
			case 243:
				NumeroFila = "2011	Wind	Other changes	Dollars	Thousands	Environmental Accounts	-21610	R";
				break;
			case 244:
				NumeroFila = "2011	Wind	Resource rent	Dollars	Thousands	Environmental Accounts	37750	R";
				break;
			case 245:
				NumeroFila = "2011	Wood	Closing stock	Dollars	Thousands	Environmental Accounts	127882	R";
				break;
			case 246:
				NumeroFila = "2011	Wood	Generation	Gigawatt hours	Actual	MBIE	333	F";
				break;
			case 247:
				NumeroFila = "2011	Wood	Gigawatt hours	Number	Proportion	MBIE	0.01	F";
				break;
			case 248:
				NumeroFila = "2011	Wood	Opening stock	Dollars	Thousands	Environmental Accounts	147515	R";
				break;
			case 249:
				NumeroFila = "2011	Wood	Other changes	Dollars	Thousands	Environmental Accounts	-19633	R";
				break;
			case 250:
				NumeroFila = "2011	Wood	Resource rent	Dollars	Thousands	Environmental Accounts	7673	R";
				break;
			case 251:
				NumeroFila = "2012	Biogas	Closing stock	Dollars	Thousands	Environmental Accounts	91659	R";
				break;
			case 252:
				NumeroFila = "2012	Biogas	Generation	Gigawatt hours	Actual	MBIE	219	F";
				break;
			case 253:
				NumeroFila = "2012	Biogas	Gigawatt hours	Number	Proportion	MBIE	0.01	F";
				break;
			case 254:
				NumeroFila = "2012	Biogas	Opening stock	Dollars	Thousands	Environmental Accounts	82598	R";
				break;
			case 255:
				NumeroFila = "2012	Biogas	Other changes	Dollars	Thousands	Environmental Accounts	9061	R";
				break;
			case 256:
				NumeroFila = "2012	Biogas	Resource rent	Dollars	Thousands	Environmental Accounts	5500	R";
				break;
			case 257:
				NumeroFila = "2012	Coal	Generation	Gigawatt hours	Actual	MBIE	2327	F";
				break;
			case 258:
				NumeroFila = "2012	Gas	Generation	Gigawatt hours	Actual	MBIE	8316	R";
				break;
			case 259:
				NumeroFila = "2012	Geothermal	Closing stock	Dollars	Thousands	Environmental Accounts	2437685	R";
				break;
			case 260:
				NumeroFila = "2012	Geothermal	Generation	Gigawatt hours	Actual	MBIE	5832	F";
				break;
			case 261:
				NumeroFila = "2012	Geothermal	Gigawatt hours	Number	Proportion	MBIE	0.14	F";
				break;
			case 262:
				NumeroFila = "2012	Geothermal	Opening stock	Dollars	Thousands	Environmental Accounts	2215070	R";
				break;
			case 263:
				NumeroFila = "2012	Geothermal	Other changes	Dollars	Thousands	Environmental Accounts	222616	R";
				break;
			case 264:
				NumeroFila = "2012	Geothermal	Resource rent	Dollars	Thousands	Environmental Accounts	146261	R";
				break;
			case 265:
				NumeroFila = "2012	Hydro	Closing stock	Dollars	Thousands	Environmental Accounts	9994753	R";
				break;
			case 266:
				NumeroFila = "2012	Hydro	Generation	Gigawatt hours	Actual	MBIE	23913	R";
				break;
			case 267:
				NumeroFila = "2012	Hydro	Gigawatt hours	Number	Proportion	MBIE	0.56	F";
				break;
			case 268:
				NumeroFila = "2012	Hydro	Opening stock	Dollars	Thousands	Environmental Accounts	9568100	R";
				break;
			case 269:
				NumeroFila = "2012	Hydro	Other changes	Dollars	Thousands	Environmental Accounts	426654	R";
				break;
			case 270:
				NumeroFila = "2012	Hydro	Resource rent	Dollars	Thousands	Environmental Accounts	599685	R";
				break;
			case 271:
				NumeroFila = "2012	Oil	Generation	Gigawatt hours	Actual	MBIE	2	F";
				break;
			case 272:
				NumeroFila = "2012	Renewable	Closing stock	Dollars	Thousands	Environmental Accounts	13511024	R";
				break;
			case 273:
				NumeroFila = "2012	Renewable	Generation	Gigawatt hours	Actual	MBIE	32326	R";
				break;
			case 274:
				NumeroFila = "2012	Renewable	Gigawatt hours	Number	Proportion	MBIE	0.75	F";
				break;
			case 275:
				NumeroFila = "2012	Renewable	Opening stock	Dollars	Thousands	Environmental Accounts	12624306	R";
				break;
			case 276:
				NumeroFila = "2012	Renewable	Other changes	Dollars	Thousands	Environmental Accounts	886717	R";
				break;
			case 277:
				NumeroFila = "2012	Renewable	Resource rent	Dollars	Thousands	Environmental Accounts	810661	R";
				break;
			case 278:
				NumeroFila = "2012	Renewable	Resource rent	Number	Proportion	Environmental Accounts	0.75	F";
				break;
			case 279:
				NumeroFila = "2012	Solar	Closing stock	Dollars	Thousands	Environmental Accounts	1780	R";
				break;
			case 280:
				NumeroFila = "2012	Solar	Generation	Gigawatt hours	Actual	MBIE	4	F";
				break;
			case 281:
				NumeroFila = "2012	Solar	Gigawatt hours	Number	Proportion	MBIE	0	F";
				break;
			case 282:
				NumeroFila = "2012	Solar	Opening stock	Dollars	Thousands	Environmental Accounts	1483	R";
				break;
			case 283:
				NumeroFila = "2012	Solar	Other changes	Dollars	Thousands	Environmental Accounts	297	R";
				break;
			case 284:
				NumeroFila = "2012	Solar	Resource rent	Dollars	Thousands	Environmental Accounts	107	R";
				break;
			case 285:
				NumeroFila = "2012	Total generation	Generation	Gigawatt hours	Actual	MBIE	43014	R";
				break;
			case 286:
				NumeroFila = "2012	Total generation	Prices	Number	Average	Electricity Authority	75	F";
				break;
			case 287:
				NumeroFila = "2012	Total generation	Resource rent	Dollars	Thousands	Environmental Accounts	1078676	R";
				break;
			case 288:
				NumeroFila = "2012	Waste heat	Generation	Gigawatt hours	Actual	MBIE	42	F";
				break;
			case 289:
				NumeroFila = "2012	Wind	Closing stock	Dollars	Thousands	Environmental Accounts	837255	R";
				break;
			case 290:
				NumeroFila = "2012	Wind	Generation	Gigawatt hours	Actual	MBIE	2003	F";
				break;
			case 291:
				NumeroFila = "2012	Wind	Gigawatt hours	Number	Proportion	MBIE	0.05	F";
				break;
			case 292:
				NumeroFila = "2012	Wind	Opening stock	Dollars	Thousands	Environmental Accounts	629174	R";
				break;
			case 293:
				NumeroFila = "2012	Wind	Other changes	Dollars	Thousands	Environmental Accounts	208081	R";
				break;
			case 294:
				NumeroFila = "2012	Wind	Resource rent	Dollars	Thousands	Environmental Accounts	50235	R";
				break;
			case 295:
				NumeroFila = "2012	Wood	Closing stock	Dollars	Thousands	Environmental Accounts	147892	R";
				break;
			case 296:
				NumeroFila = "2012	Wood	Generation	Gigawatt hours	Actual	MBIE	354	F";
				break;
			case 297:
				NumeroFila = "2012	Wood	Gigawatt hours	Number	Proportion	MBIE	0.01	F";
				break;
			case 298:
				NumeroFila = "2012	Wood	Opening stock	Dollars	Thousands	Environmental Accounts	127882	R";
				break;
			case 299:
				NumeroFila = "2012	Wood	Other changes	Dollars	Thousands	Environmental Accounts	20010	R";
				break;
			case 300:
				NumeroFila = "2012	Wood	Resource rent	Dollars	Thousands	Environmental Accounts	8874	R";
				break;
			case 301:
				NumeroFila = "2013	Biogas	Closing stock	Dollars	Thousands	Environmental Accounts	89692	R";
				break;
			case 302:
				NumeroFila = "2013	Biogas	Generation	Gigawatt hours	Actual	MBIE	208	F";
				break;
			case 303:
				NumeroFila = "2013	Biogas	Gigawatt hours	Number	Proportion	MBIE	0	F";
				break;
			case 304:
				NumeroFila = "2013	Biogas	Opening stock	Dollars	Thousands	Environmental Accounts	91659	R";
				break;
			case 305:
				NumeroFila = "2013	Biogas	Other changes	Dollars	Thousands	Environmental Accounts	-1967	R";
				break;
			case 306:
				NumeroFila = "2013	Biogas	Resource rent	Dollars	Thousands	Environmental Accounts	5382	R";
				break;
			case 307:
				NumeroFila = "2013	Coal	Generation	Gigawatt hours	Actual	MBIE	3248	F";
				break;
			case 308:
				NumeroFila = "2013	Gas	Generation	Gigawatt hours	Actual	MBIE	8335	R";
				break;
			case 309:
				NumeroFila = "2013	Geothermal	Closing stock	Dollars	Thousands	Environmental Accounts	2501124	R";
				break;
			case 310:
				NumeroFila = "2013	Geothermal	Generation	Gigawatt hours	Actual	MBIE	5797	R";
				break;
			case 311:
				NumeroFila = "2013	Geothermal	Gigawatt hours	Number	Proportion	MBIE	0.14	F";
				break;
			case 312:
				NumeroFila = "2013	Geothermal	Opening stock	Dollars	Thousands	Environmental Accounts	2437685	R";
				break;
			case 313:
				NumeroFila = "2013	Geothermal	Other changes	Dollars	Thousands	Environmental Accounts	63439	R";
				break;
			case 314:
				NumeroFila = "2013	Geothermal	Resource rent	Dollars	Thousands	Environmental Accounts	150067	R";
				break;
			case 315:
				NumeroFila = "2013	Hydro	Closing stock	Dollars	Thousands	Environmental Accounts	9798124	R";
				break;
			case 316:
				NumeroFila = "2013	Hydro	Generation	Gigawatt hours	Actual	MBIE	22710	R";
				break;
			case 317:
				NumeroFila = "2013	Hydro	Gigawatt hours	Number	Proportion	MBIE	0.53	F";
				break;
			case 318:
				NumeroFila = "2013	Hydro	Opening stock	Dollars	Thousands	Environmental Accounts	9994753	R";
				break;
			case 319:
				NumeroFila = "2013	Hydro	Other changes	Dollars	Thousands	Environmental Accounts	-196630	R";
				break;
			case 320:
				NumeroFila = "2013	Hydro	Resource rent	Dollars	Thousands	Environmental Accounts	587887	R";
				break;
			case 321:
				NumeroFila = "2013	Oil	Generation	Gigawatt hours	Actual	MBIE	5";
				break;
			case 322:
				NumeroFila = "2013	Renewable	Closing stock	Dollars	Thousands	Environmental Accounts	13410148";
				break;
			case 323:
				NumeroFila = "2013	Renewable	Generation	Gigawatt hours	Actual	MBIE	31082";
				break;
			case 324:
				NumeroFila = "2013	Renewable	Gigawatt hours	Number	Proportion	MBIE	0.73";
				break;
			case 325:
				NumeroFila = "2013	Renewable	Opening stock	Dollars	Thousands	Environmental Accounts	13511024";
				break;
			case 326:
				NumeroFila = "2013	Renewable	Other changes	Dollars	Thousands	Environmental Accounts	-100876";
				break;
			case 327:
				NumeroFila = "2013	Renewable	Resource rent	Dollars	Thousands	Environmental Accounts	804609";
				break;
			case 328:
				NumeroFila = "2013	Renewable	Resource rent	Number	Proportion	Environmental Accounts	0.73";
				break;
			case 329:
				NumeroFila = "2013	Solar	Closing stock	Dollars	Thousands	Environmental Accounts	2153";
				break;
			case 330:
				NumeroFila = "2013	Solar	Generation	Gigawatt hours	Actual	MBIE	5";
				break;
			case 331:
				NumeroFila = "2013	Solar	Gigawatt hours	Number	Proportion	MBIE	0";
				break;
			case 332:
				NumeroFila = "2013	Solar	Opening stock	Dollars	Thousands	Environmental Accounts	1780";
				break;
			case 333:
				NumeroFila = "2013	Solar	Other changes	Dollars	Thousands	Environmental Accounts	374";
				break;
			case 334:
				NumeroFila = "2013	Solar	Resource rent	Dollars	Thousands	Environmental Accounts	129";
				break;
			case 335:
				NumeroFila = "2013	Total generation	Generation	Gigawatt hours	Actual	MBIE	42703";
				break;
			case 336:
				NumeroFila = "2013	Total generation	Prices	Number	Average	Electricity Authority	81";
				break;
			case 337:
				NumeroFila = "2013	Total generation	Resource rent	Dollars	Thousands	Environmental Accounts	1105427";
				break;
			case 338:
				NumeroFila = "2013	Waste heat	Generation	Gigawatt hours	Actual	MBIE	33";
				break;
			case 339:
				NumeroFila = "2013	Wind	Closing stock	Dollars	Thousands	Environmental Accounts	861885";
				break;
			case 340:
				NumeroFila = "2013	Wind	Generation	Gigawatt hours	Actual	MBIE	1998";
				break;
			case 341:
				NumeroFila = "2013	Wind	Gigawatt hours	Number	Proportion	MBIE	0.05";
				break;
			case 342:
				NumeroFila = "2013	Wind	Opening stock	Dollars	Thousands	Environmental Accounts	837255";
				break;
			case 343:
				NumeroFila = "2013	Wind	Other changes	Dollars	Thousands	Environmental Accounts	24630";
				break;
			case 344:
				NumeroFila = "2013	Wind	Resource rent	Dollars	Thousands	Environmental Accounts	51713";
				break;
			case 345:
				NumeroFila = "2013	Wood	Closing stock	Dollars	Thousands	Environmental Accounts	157169";
				break;
			case 346:
				NumeroFila = "2013	Wood	Generation	Gigawatt hours	Actual	MBIE	364";
				break;
			case 347:
				NumeroFila = "2013	Wood	Gigawatt hours	Number	Proportion	MBIE	0.01";
				break;
			case 348:
				NumeroFila = "2013	Wood	Opening stock	Dollars	Thousands	Environmental Accounts	147892";
				break;
			case 349:
				NumeroFila = "2013	Wood	Other changes	Dollars	Thousands	Environmental Accounts	9277";
				break;
			case 350:
				NumeroFila = "2013	Wood	Resource rent	Dollars	Thousands	Environmental Accounts	9430	R";
				break;
			case 351:
				NumeroFila = "2014	Biogas	Closing stock	Dollars	Thousands	Environmental Accounts	94161	R";
				break;
			case 352:
				NumeroFila = "2014	Biogas	Gigawatt hours	Number	Proportion	MBIE	0	F";
				break;
			case 353:
				NumeroFila = "2014	Biogas	Opening stock	Dollars	Thousands	Environmental Accounts	89692	R";
				break;
			case 354:
				NumeroFila = "2014	Biogas	Other changes	Dollars	Thousands	Environmental Accounts	4469	R";
				break;
			case 355:
				NumeroFila = "2014	Biogas	Resource rent	Dollars	Thousands	Environmental Accounts	5650	R";
				break;
			case 356:
				NumeroFila = "2014	Coal	Generation	Gigawatt hours	Actual	MBIE	2012	F";
				break;
			case 357:
				NumeroFila = "2014	Gas	Generation	Gigawatt hours	Actual	MBIE	7661	R";
				break;
			case 358:
				NumeroFila = "2014	Geothermal	Closing stock	Dollars	Thousands	Environmental Accounts	2884112	R";
				break;
			case 359:
				NumeroFila = "2014	Geothermal	Generation	Gigawatt hours	Actual	MBIE	6264	R";
				break;
			case 360:
				NumeroFila = "2014	Geothermal	Gigawatt hours	Number	Proportion	MBIE	0.15	F";
				break;
			case 361:
				NumeroFila = "2014	Geothermal	Opening stock	Dollars	Thousands	Environmental Accounts	2501124	R";
				break;
			case 362:
				NumeroFila = "2014	Geothermal	Other changes	Dollars	Thousands	Environmental Accounts	382988	R";
				break;
			case 363:
				NumeroFila = "2014	Geothermal	Resource rent	Dollars	Thousands	Environmental Accounts	173047	R";
				break;
			case 364:
				NumeroFila = "2014	Hydro	Closing stock	Dollars	Thousands	Environmental Accounts	10678575	R";
				break;
			case 365:
				NumeroFila = "2014	Hydro	Generation	Gigawatt hours	Actual	MBIE	23194	R";
				break;
			case 366:
				NumeroFila = "2014	Hydro	Gigawatt hours	Number	Proportion	MBIE	0.55	R";
				break;
			case 367:
				NumeroFila = "2014	Hydro	Opening stock	Dollars	Thousands	Environmental Accounts	9798124	R";
				break;
			case 368:
				NumeroFila = "2014	Hydro	Other changes	Dollars	Thousands	Environmental Accounts	880452	R";
				break;
			case 369:
				NumeroFila = "2014	Hydro	Resource rent	Dollars	Thousands	Environmental Accounts	640715	R";
				break;
			case 370:
				NumeroFila = "2014	Oil	Generation	Gigawatt hours	Actual	MBIE	3	F";
				break;
			case 371:
				NumeroFila = "2014	Renewable	Closing stock	Dollars	Thousands	Environmental Accounts	14780283	R";
				break;
			case 372:
				NumeroFila = "2014	Renewable	Generation	Gigawatt hours	Actual	MBIE	32103	R";
				break;
			case 373:
				NumeroFila = "2014	Renewable	Gigawatt hours	Number	Proportion	MBIE	0.77	F";
				break;
			case 374:
				NumeroFila = "2014	Renewable	Opening stock	Dollars	Thousands	Environmental Accounts	13410148	R";
				break;
			case 375:
				NumeroFila = "2014	Renewable	Other changes	Dollars	Thousands	Environmental Accounts	1370135	R";
				break;
			case 376:
				NumeroFila = "2014	Renewable	Other changes	Dollars	Thousands	Environmental Accounts	1370135";
			case 377:
				NumeroFila = "2014	Renewable	Resource rent	Dollars	Thousands	Environmental Accounts	886817";
				break;
			case 378:
				NumeroFila = "2014	Renewable	Resource rent	Number	Proportion	Environmental Accounts	0.77";
				break;
			case 379:
				NumeroFila = "2014	Solar	Closing stock	Dollars	Thousands	Environmental Accounts	3887	R";
				break;
			case 380:
				NumeroFila = "2014	Solar	Generation	Gigawatt hours	Actual	MBIE	8	R";
				break;
			case 381:
				NumeroFila = "2014	Solar	Gigawatt hours	Number	Proportion	MBIE	0	F";
				break;
			case 382:
				NumeroFila = "2014	Solar	Opening stock	Dollars	Thousands	Environmental Accounts	2153	R";
				break;
			case 383:
				NumeroFila = "2014	Solar	Other changes	Dollars	Thousands	Environmental Accounts	1734	R";
				break;
			case 384:
				NumeroFila = "2014	Solar	Resource rent	Dollars	Thousands	Environmental Accounts	233	F";
				break;
			case 385:
				NumeroFila = "2014	Total generation	Generation	Gigawatt hours	Actual	MBIE	41827	R";
				break;
			case 386:
				NumeroFila = "2014	Total generation	Prices	Number	Average	Electricity Authority	69	F";
				break;
			case 387:
				NumeroFila = "2014	Total generation	Resource rent	Dollars	Thousands	Environmental Accounts	1155431	R";
				break;
			case 388:
				NumeroFila = "2014	Waste heat	Generation	Gigawatt hours	Actual	MBIE	48	F";
				break;
			case 389:
				NumeroFila = "2014	Wind	Closing stock	Dollars	Thousands	Environmental Accounts	951681	R";
				break;
			case 390:
				NumeroFila = "2014	Wind	Generation	Gigawatt hours	Actual	MBIE	2067	F";
				break;
			case 391:
				NumeroFila = "2014	Wind	Gigawatt hours	Number	Proportion	MBIE	0.05	F";
				break;
			case 392:
				NumeroFila = "2014	Wind	Opening stock	Dollars	Thousands	Environmental Accounts	861885	R";
				break;
			case 393:
				NumeroFila = "2014	Wind	Other changes	Dollars	Thousands	Environmental Accounts	89796	R";
				break;
			case 394:
				NumeroFila = "2014	Wind	Resource rent	Dollars	Thousands	Environmental Accounts	57101	R";
				break;
			case 395:
				NumeroFila = "2014	Wood	Closing stock	Dollars	Thousands	Environmental Accounts	167865	R";
				break;
			case 396:
				NumeroFila = "2014	Wood	Generation	Gigawatt hours	Actual	MBIE	365	F";
				break;
			case 397:
				NumeroFila = "2014	Wood	Gigawatt hours	Number	Proportion	MBIE	0.01	F";
				break;
			case 398:
				NumeroFila = "2014	Wood	Opening stock	Dollars	Thousands	Environmental Accounts	157169	R";
				break;
			case 399:
				NumeroFila = "2014	Wood	Other changes	Dollars	Thousands	Environmental Accounts	10696	R";
				break;
			case 400:
				NumeroFila = "2014	Wood	Resource rent	Dollars	Thousands	Environmental Accounts	10072	R";
				break;
			case 401:
				NumeroFila = "2015	Biogas	Closing stock	Dollars	Thousands	Environmental Accounts	103355	R";
				break;
			case 402:
				NumeroFila = "2015	Biogas	Generation	Gigawatt hours	Actual	MBIE	232	R";
				break;
			case 403:
				NumeroFila = "2015	Biogas	Gigawatt hours	Number	Proportion	MBIE	0.01	F";
				break;
			case 404:
				NumeroFila = "2015	Biogas	Opening stock	Dollars	Thousands	Environmental Accounts	94161	R";
				break;
			case 405:
				NumeroFila = "2015	Biogas	Other changes	Dollars	Thousands	Environmental Accounts	9194	R";
				break;
			case 406:
				NumeroFila = "2015	Biogas	Resource rent	Dollars	Thousands	Environmental Accounts	6201	R";
				break;
			case 407:
				NumeroFila = "2015	Coal	Generation	Gigawatt hours	Actual	MBIE	2152	F";
				break;
			case 408:
				NumeroFila = "2015	Gas	Generation	Gigawatt hours	Actual	MBIE	6624	R";
				break;
			case 409:
				NumeroFila = "2015	Geothermal	Closing stock	Dollars	Thousands	Environmental Accounts	3164219	R";
				break;
			case 410:
				NumeroFila = "2015	Geothermal	Generation	Gigawatt hours	Actual	MBIE	7090	R";
				break;
			case 411:
				NumeroFila = "2015	Geothermal	Gigawatt hours	Number	Proportion	MBIE	0.17	F";
				break;
			case 412:
				NumeroFila = "2015	Geothermal	Opening stock	Dollars	Thousands	Environmental Accounts	2884112	R";
				break;
			case 413:
				NumeroFila = "2015	Geothermal	Other changes	Dollars	Thousands	Environmental Accounts	280107	R";
				break;
			case 414:
				NumeroFila = "2015	Geothermal	Resource rent	Dollars	Thousands	Environmental Accounts	189853	R";
				break;
			case 415:
				NumeroFila = "2015	Hydro	Closing stock	Dollars	Thousands	Environmental Accounts	10591203	R";
				break;
			case 416:
				NumeroFila = "2015	Hydro	Generation	Gigawatt hours	Actual	MBIE	23732	R";
				break;
			case 417:
				NumeroFila = "2015	Hydro	Gigawatt hours	Number	Proportion	MBIE	0.56	F";
				break;
			case 418:
				NumeroFila = "2015	Hydro	Opening stock	Dollars	Thousands	Environmental Accounts	10678575	R";
				break;
			case 419:
				NumeroFila = "2015	Hydro	Other changes	Dollars	Thousands	Environmental Accounts	-87373	R";
				break;
			case 420:
				NumeroFila = "2015	Hydro	Resource rent	Dollars	Thousands	Environmental Accounts	635472	R";
				break;
			case 421:
				NumeroFila = "2015	Oil	Generation	Gigawatt hours	Actual	MBIE	3	F";
				break;
			case 422:
				NumeroFila = "2015	Renewable	Closing stock	Dollars	Thousands	Environmental Accounts	14982253	R";
				break;
			case 423:
				NumeroFila = "2015	Renewable	Generation	Gigawatt hours	Actual	MBIE	33572	R";
				break;
			case 424:
				NumeroFila = "2015	Renewable	Gigawatt hours	Number	Proportion	MBIE	0.79	F";
				break;
			case 425:
				NumeroFila = "2015	Renewable	Opening stock	Dollars	Thousands	Environmental Accounts	14780283	R";
				break;
			case 426:
				NumeroFila = "2015	Renewable	Other changes	Dollars	Thousands	Environmental Accounts	201970	R";
				break;
			case 427:
				NumeroFila = "2015	Renewable	Resource rent	Dollars	Thousands	Environmental Accounts	898935	R";
				break;
			case 428:
				NumeroFila = "2015	Renewable	Resource rent	Number	Proportion	Environmental Accounts	0.79	F";
				break;
			case 429:
				NumeroFila = "2015	Solar	Closing stock	Dollars	Thousands	Environmental Accounts	9960	R";
				break;
			case 430:
				NumeroFila = "2015	Solar	Generation	Gigawatt hours	Actual	MBIE	22	F";
				break;
			case 431:
				NumeroFila = "2015	Solar	Gigawatt hours	Number	Proportion	MBIE	0	F";
				break;
			case 432:
				NumeroFila = "2015	Solar	Opening stock	Dollars	Thousands	Environmental Accounts	3887	R";
				break;
			case 433:
				NumeroFila = "2015	Solar	Other changes	Dollars	Thousands	Environmental Accounts	6073	R";
				break;
			case 434:
				NumeroFila = "2015	Solar	Resource rent	Dollars	Thousands	Environmental Accounts	598	R";
				break;
			case 435:
				NumeroFila = "2015	Total generation	Generation	Gigawatt hours	Actual	MBIE	42398	R";
				break;
			case 436:
				NumeroFila = "2015	Total generation	Prices	Number	Average	Electricity Authority	74	F";
				break;
			case 437:
				NumeroFila = "2015	Total generation	Resource rent	Dollars	Thousands	Environmental Accounts	1135271	R";
				break;
			case 438:
				NumeroFila = "2015	Waste heat	Generation	Gigawatt hours	Actual	MBIE	47	F";
				break;
			case 439:
				NumeroFila = "2015	Wind	Closing stock	Dollars	Thousands	Environmental Accounts	957659	R";
				break;
			case 440:
				NumeroFila = "2015	Wind	Generation	Gigawatt hours	Actual	MBIE	2146	F";
				break;
			case 441:
				NumeroFila = "2015	Wind	Gigawatt hours	Number	Proportion	MBIE	0.05	F";
				break;

			case 442:
				NumeroFila = "2015	Wind	Opening stock	Dollars	Thousands	Environmental Accounts	951681	R";
				break;
			case 443:
				NumeroFila = "2015	Wind	Other changes	Dollars	Thousands	Environmental Accounts	5978	R";
				break;
			case 444:
				NumeroFila = "2015	Wind	Resource rent	Dollars	Thousands	Environmental Accounts	57460	R";
				break;
			case 445:
				NumeroFila = "2015	Wood	Closing stock	Dollars	Thousands	Environmental Accounts	155856	R";
				break;
			case 446:
				NumeroFila = "2015	Wood	Generation	Gigawatt hours	Actual	MBIE	349	F";
				break;
			case 447:
				NumeroFila = "2015	Wood	Gigawatt hours	Number	Proportion	MBIE	0.01	F";
				break;
			case 448:
				NumeroFila = "2015	Wood	Opening stock	Dollars	Thousands	Environmental Accounts	167865	R";
				break;
			case 449:
				NumeroFila = "2015	Wood	Other changes	Dollars	Thousands	Environmental Accounts	-12009	R";
				break;
			case 450:
				NumeroFila = "2015	Wood	Resource rent	Dollars	Thousands	Environmental Accounts	9351	R";
				break;
			case 451:
				NumeroFila = "2016	Biogas	Closing stock	Dollars	Thousands	Environmental Accounts	97830	R";
				break;
			case 452:
				NumeroFila = "2016	Biogas	Generation	Gigawatt hours	Actual	MBIE	248	R";
				break;
			case 453:
				NumeroFila = "2016	Biogas	Gigawatt hours	Number	Proportion	MBIE	0.01	F";
				break;
			case 454:
				NumeroFila = "2016	Biogas	Opening stock	Dollars	Thousands	Environmental Accounts	103355	R";
				break;
			case 455:
				NumeroFila = "2016	Biogas	Other changes	Dollars	Thousands	Environmental Accounts	-5525	R";
				break;
			case 456:
				NumeroFila = "2016	Biogas	Resource rent	Dollars	Thousands	Environmental Accounts	5870	R";
				break;
			case 457:
				NumeroFila = "2016	Coal	Generation	Gigawatt hours	Actual	MBIE	1389	F";
				break;
			case 458:
				NumeroFila = "2016	Gas	Generation	Gigawatt hours	Actual	MBIE	6209	R";
				break;
			case 459:
				NumeroFila = "2016	Geothermal	Closing stock	Dollars	Thousands	Environmental Accounts	2952315	R";
				break;
			case 460:
				NumeroFila = "2016	Geothermal	Generation	Gigawatt hours	Actual	MBIE	7484	F";
				break;
			case 461:
				NumeroFila = "2016	Geothermal	Gigawatt hours	Number	Proportion	MBIE	0.17	F";
				break;
			case 462:
				NumeroFila = "2016	Geothermal	Opening stock	Dollars	Thousands	Environmental Accounts	3164219	R";
				break;
			case 463:
				NumeroFila = "2016	Geothermal	Other changes	Dollars	Thousands	Environmental Accounts	-211904	R";
				break;
			case 464:
				NumeroFila = "2016	Geothermal	Resource rent	Dollars	Thousands	Environmental Accounts	177139	R";
				break;
			case 465:
				NumeroFila = "2016	Hydro	Closing stock	Dollars	Thousands	Environmental Accounts	9773373	R";
				break;
			case 466:
				NumeroFila = "2016	Hydro	Generation	Gigawatt hours	Actual	MBIE	24775	R";
				break;
			case 467:
				NumeroFila = "2016	Hydro	Gigawatt hours	Number	Proportion	MBIE	0.58	F";
				break;
			case 468:
				NumeroFila = "2016	Hydro	Opening stock	Dollars	Thousands	Environmental Accounts	10591203	R";
				break;
			case 469:
				NumeroFila = "2016	Hydro	Other changes	Dollars	Thousands	Environmental Accounts	-817830	R";
				break;
			case 470:
				NumeroFila = "2016	Hydro	Resource rent	Dollars	Thousands	Environmental Accounts	586402	R";
				break;
			case 471:
				NumeroFila = "2016	Oil	Generation	Gigawatt hours	Actual	MBIE	1	F";
				break;
			case 472:
				NumeroFila = "2016	Renewable	Closing stock	Dollars	Thousands	Environmental Accounts	13925378	R";
				break;
			case 473:
				NumeroFila = "2016	Renewable	Generation	Gigawatt hours	Actual	MBIE	35300	R";
				break;
			case 474:
				NumeroFila = "2016	Renewable	Gigawatt hours	Number	Proportion	MBIE	0.82	F";
				break;
			case 475:
				NumeroFila = "2016	Renewable	Opening stock	Dollars	Thousands	Environmental Accounts	14982253	R";
				break;
			case 476:
				NumeroFila = "2016	Renewable	Other changes	Dollars	Thousands	Environmental Accounts	-1056875	R";
				break;
			case 477:
				NumeroFila = "2016	Renewable	Resource rent	Dollars	Thousands	Environmental Accounts	835523	R";
				break;
			case 478:
				NumeroFila = "2016	Renewable	Resource rent	Number	Proportion	Environmental Accounts	0.82	F";
				break;
			case 479:
				NumeroFila = "2016	Solar	Closing stock	Dollars	Thousands	Environmental Accounts	16090	R";
				break;
			case 480:
				NumeroFila = "2016	Solar	Generation	Gigawatt hours	Actual	MBIE	41	R";
				break;
			case 481:
				NumeroFila = "2016	Solar	Gigawatt hours	Number	Proportion	MBIE	0	F";
				break;
			case 482:
				NumeroFila = "2016	Solar	Opening stock	Dollars	Thousands	Environmental Accounts	9960	R";
				break;
			case 483:
				NumeroFila = "2016	Solar	Other changes	Dollars	Thousands	Environmental Accounts	6129	R";
				break;
			case 484:
				NumeroFila = "2016	Solar	Resource rent	Dollars	Thousands	Environmental Accounts	965	R";
				break;
			case 485:
				NumeroFila = "2016	Total generation	Generation	Gigawatt hours	Actual	MBIE	42949	R";
				break;
			case 486:
				NumeroFila = "2016	Total generation	Prices	Number	Average	Electricity Authority	62	F";
				break;
			case 487:
				NumeroFila = "2016	Total generation	Resource rent	Dollars	Thousands	Environmental Accounts	1016558	R";
				break;
			case 488:
				NumeroFila = "2016	Waste heat	Generation	Gigawatt hours	Actual	MBIE	50	F";
				break;
			case 489:
				NumeroFila = "2016	Wind	Closing stock	Dollars	Thousands	Environmental Accounts	948803	R";
				break;
			case 490:
				NumeroFila = "2016	Wind	Generation	Gigawatt hours	Actual	MBIE	2405	R";
				break;
			case 491:
				NumeroFila = "2016	Wind	Gigawatt hours	Number	Proportion	MBIE	0.06	F";
				break;
			case 492:
				NumeroFila = "2016	Wind	Opening stock	Dollars	Thousands	Environmental Accounts	957659	R";
				break;
			case 493:
				NumeroFila = "2016	Wind	Other changes	Dollars	Thousands	Environmental Accounts	-8856	R";
				break;
			case 494:
				NumeroFila = "2016	Wind	Resource rent	Dollars	Thousands	Environmental Accounts	56928	R";
				break;
			case 495:
				NumeroFila = "2016	Wood	Closing stock	Dollars	Thousands	Environmental Accounts	136967	R";
				break;
			case 496:
				NumeroFila = "2016	Wood	Generation	Gigawatt hours	Actual	MBIE	347	F";
				break;
			case 497:
				NumeroFila = "2016	Wood	Gigawatt hours	Number	Proportion	MBIE	0.01	F";
				break;
			case 498:
				NumeroFila = "2016	Wood	Opening stock	Dollars	Thousands	Environmental Accounts	155856	R";
				break;
			case 499:
				NumeroFila = "2016	Wood	Other changes	Dollars	Thousands	Environmental Accounts	-18889	R";
				break;
			case 500:
				NumeroFila = "2016	Wood	Resource rent	Dollars	Thousands	Environmental Accounts	8218	R";
				break;
			case 501:
				NumeroFila = "2017	Biogas	Closing stock	Dollars	Thousands	Environmental Accounts	95536	R";
				break;
			case 502:
				NumeroFila = "2017	Biogas	Generation	Gigawatt hours	Actual	MBIE	265	R";
				break;
			case 503:
				NumeroFila = "2017	Biogas	Gigawatt hours	Number	Proportion	MBIE	0.01	F";
				break;
			case 504:
				NumeroFila = "2017	Biogas	Opening stock	Dollars	Thousands	Environmental Accounts	97830	R";
				break;
			case 505:
				NumeroFila = "2017	Biogas	Other changes	Dollars	Thousands	Environmental Accounts	-2294	R";
				break;
			case 506:
				NumeroFila = "2017	Biogas	Resource rent	Dollars	Thousands	Environmental Accounts	5732	R";
				break;
			case 507:
				NumeroFila = "2017	Coal	Generation	Gigawatt hours	Actual	MBIE	819	F";
				break;
			case 508:
				NumeroFila = "2017	Gas	Generation	Gigawatt hours	Actual	MBIE	5149	R";
				break;
			case 509:
				NumeroFila = "2017	Geothermal	Closing stock	Dollars	Thousands	Environmental Accounts	2653292	R";
				break;
			case 510:
				NumeroFila = "2017	Geothermal	Generation	Gigawatt hours	Actual	MBIE	7351	F";
				break;
			case 511:
				NumeroFila = "2017	Geothermal	Gigawatt hours	Number	Proportion	MBIE	0.17	F";
				break;
			case 512:
				NumeroFila = "2017	Geothermal	Opening stock	Dollars	Thousands	Environmental Accounts	2952315	R";
				break;
			case 513:
				NumeroFila = "2017	Geothermal	Other changes	Dollars	Thousands	Environmental Accounts	-299024	R";
				break;
			case 514:
				NumeroFila = "2017	Geothermal	Resource rent	Dollars	Thousands	Environmental Accounts	159198	R";
				break;
			case 515:
				NumeroFila = "2017	Hydro	Closing stock	Dollars	Thousands	Environmental Accounts	9388348	R";
				break;
			case 516:
				NumeroFila = "2017	Hydro	Generation	Gigawatt hours	Actual	MBIE	26010	R";
				break;
			case 517:
				NumeroFila = "2017	Hydro	Gigawatt hours	Number	Proportion	MBIE	0.61	F";
				break;
			case 518:
				NumeroFila = "2017	Hydro	Opening stock	Dollars	Thousands	Environmental Accounts	9773373	R";
				break;
			case 519:
				NumeroFila = "2017	Hydro	Other changes	Dollars	Thousands	Environmental Accounts	-385024	R";
				break;
			case 520:
				NumeroFila = "2017	Hydro	Resource rent	Dollars	Thousands	Environmental Accounts	563301	R";
				break;
			case 521:
				NumeroFila = "2017	Oil	Generation	Gigawatt hours	Actual	MBIE	3	F";
				break;
			case 522:
				NumeroFila = "2017	Renewable	Closing stock	Dollars	Thousands	Environmental Accounts	13133861	R";
				break;
			case 523:
				NumeroFila = "2017	Renewable	Generation	Gigawatt hours	Actual	MBIE	36387	R";
				break;
			case 524:
				NumeroFila = "2017	Renewable	Gigawatt hours	Number	Proportion	MBIE	0.86	F";
				break;
			case 525:
				NumeroFila = "2017	Renewable	Opening stock	Dollars	Thousands	Environmental Accounts	13925378	R";
				break;
			case 526:
				NumeroFila = "2017	Renewable	Other changes	Dollars	Thousands	Environmental Accounts	-791517	R";
				break;
			case 527:
				NumeroFila = "2017	Renewable	Resource rent	Dollars	Thousands	Environmental Accounts	788032	R";
				break;
			case 528:
				NumeroFila = "2017	Renewable	Resource rent	Number	Proportion	Environmental Accounts	0.86	F";
				break;
			case 529:
				NumeroFila = "2017	Solar	Closing stock	Dollars	Thousands	Environmental Accounts	21798	R";
				break;
			case 530:
				NumeroFila = "2017	Solar	Generation	Gigawatt hours	Actual	MBIE	60	R";
				break;
			case 531:
				NumeroFila = "2017	Solar	Gigawatt hours	Number	Proportion	MBIE	0	F";
				break;
			case 532:
				NumeroFila = "2017	Solar	Opening stock	Dollars	Thousands	Environmental Accounts	16090	R";
				break;
			case 533:
				NumeroFila = "2017	Solar	Other changes	Dollars	Thousands	Environmental Accounts	5708	R";
				break;
			case 534:
				NumeroFila = "2017	Solar	Resource rent	Dollars	Thousands	Environmental Accounts	1308	R";
				break;
			case 535:
				NumeroFila = "2017	Total generation	Generation	Gigawatt hours	Actual	MBIE	42410	R";
				break;
			case 536:
				NumeroFila = "2017	Total generation	Prices	Number	Average	Electricity Authority	52	F";
				break;
			case 537:
				NumeroFila = "2017	Total generation	Resource rent	Dollars	Thousands	Environmental Accounts	918474	R";
				break;
			case 538:
				NumeroFila = "2017	Waste heat	Generation	Gigawatt hours	Actual	MBIE	51	F";
				break;
			case 539:
				NumeroFila = "2017	Wind	Closing stock	Dollars	Thousands	Environmental Accounts	856321	R";
				break;
			case 540:
				NumeroFila = "2017	Wind	Generation	Gigawatt hours	Actual	MBIE	2372	R";
				break;
			case 541:
				NumeroFila = "2017	Wind	Gigawatt hours	Number	Proportion	MBIE	0.06	F";
				break;
			case 542:
				NumeroFila = "2017	Wind	Opening stock	Dollars	Thousands	Environmental Accounts	948803	R";
				break;
			case 543:
				NumeroFila = "2017	Wind	Other changes	Dollars	Thousands	Environmental Accounts	-92483	R";
				break;
			case 544:
				NumeroFila = "2017	Wind	Resource rent	Dollars	Thousands	Environmental Accounts	51379	R";
				break;
			case 545:
				NumeroFila = "2017	Wood	Closing stock	Dollars	Thousands	Environmental Accounts	118567	R";
				break;
			case 546:
				NumeroFila = "2017	Wood	Generation	Gigawatt hours	Actual	MBIE	328	F";
				break;
			case 547:
				NumeroFila = "2017	Wood	Gigawatt hours	Number	Proportion	MBIE	0.01	F";
				break;
			case 548:
				NumeroFila = "2017	Wood	Opening stock	Dollars	Thousands	Environmental Accounts	136967	R";
				break;
			case 549:
				NumeroFila = "2017	Wood	Other changes	Dollars	Thousands	Environmental Accounts	-18400	R";
				break;
			case 550:
				NumeroFila = "2017	Wood	Resource rent	Dollars	Thousands	Environmental Accounts	7114	R";
				break;
			case 551:
				NumeroFila = "2018	Biogas	Closing stock	Dollars	Thousands	Environmental Accounts	79123	P";
				break;
			case 552:
				NumeroFila = "2018	Biogas	Generation	Gigawatt hours	Actual	MBIE	257	P";
				break;
			case 553:
				NumeroFila = "2018	Biogas	Gigawatt hours	Number	Proportion	MBIE	0.01	P";
				break;
			case 554:
				NumeroFila = "2018	Biogas	Opening stock	Dollars	Thousands	Environmental Accounts	95536	P";
				break;
			case 555:
				NumeroFila = "2018	Biogas	Other changes	Dollars	Thousands	Environmental Accounts	-16414	P";
				break;
			case 556:
				NumeroFila = "2018	Biogas	Resource rent	Dollars	Thousands	Environmental Accounts	4747	P";
				break;
			case 557:
				NumeroFila = "2016	Gas	Generation	Gigawatt hours	Actual	MBIE	6209	R";
				break;
			case 558:
				NumeroFila = "2018	Gas	Generation	Gigawatt hours	Actual	MBIE	6962	P";
				break;
			case 559:
				NumeroFila = "2018	Geothermal	Closing stock	Dollars	Thousands	Environmental Accounts	2258252	P";
				break;
			case 560:
				NumeroFila = "2018	Geothermal	Generation	Gigawatt hours	Actual	MBIE	7342	P";
				break;
			case 561:
				NumeroFila = "2018	Geothermal	Gigawatt hours	Number	Proportion	MBIE	0.17	P";
				break;
			case 562:
				NumeroFila = "2018	Geothermal	Opening stock	Dollars	Thousands	Environmental Accounts	2653292	P";
				break;
			case 563:
				NumeroFila = "2018	Geothermal	Other changes	Dollars	Thousands	Environmental Accounts	-395039	P";
				break;
			case 564:
				NumeroFila = "2018	Geothermal	Resource rent	Dollars	Thousands	Environmental Accounts	135495	P";
				break;
			case 565:
				NumeroFila = "2018	Hydro	Closing stock	Dollars	Thousands	Environmental Accounts	7554059	P";
				break;
			case 566:
				NumeroFila = "2018	Hydro	Generation	Gigawatt hours	Actual	MBIE	24558	P";
				break;
			case 567:
				NumeroFila = "2018	Hydro	Gigawatt hours	Number	Proportion	MBIE	0.57	P";
				break;
			case 568:
				NumeroFila = "2018	Hydro	Opening stock	Dollars	Thousands	Environmental Accounts	9388348	P";
				break;
			case 569:
				NumeroFila = "2018	Hydro	Other changes	Dollars	Thousands	Environmental Accounts	-1834289	P";
				break;
			case 570:
				NumeroFila = "2018	Hydro	Resource rent	Dollars	Thousands	Environmental Accounts	453244	P";
				break;
			case 571:
				NumeroFila = "2018	Oil	Generation	Gigawatt hours	Actual	MBIE	6	P";
				break;
			case 572:
				NumeroFila = "2018	Renewable	Closing stock	Dollars	Thousands	Environmental Accounts	10602699	P";
				break;
			case 573:
				NumeroFila = "2018	Renewable	Generation	Gigawatt hours	Actual	MBIE	34469	P";
				break;
			case 574:
				NumeroFila = "2018	Renewable	Gigawatt hours	Number	Proportion	MBIE	0.81	P";
				break;
			case 575:
				NumeroFila = "2018	Renewable	Opening stock	Dollars	Thousands	Environmental Accounts	13133861	P";
				break;
			case 576:
				NumeroFila = "2018	Renewable	Other changes	Dollars	Thousands	Environmental Accounts	-2531163	P";
				break;
			case 577:
				NumeroFila = "2018	Renewable	Resource rent	Dollars	Thousands	Environmental Accounts	636162	P";
				break;
			case 578:
				NumeroFila = "2018	Renewable	Resource rent	Number	Proportion	Environmental Accounts	0.81	P";
				break;
			case 579:
				NumeroFila = "2018	Solar	Closing stock	Dollars	Thousands	Environmental Accounts	24798	P";
				break;
			case 580:
				NumeroFila = "2018	Solar	Generation	Gigawatt hours	Actual	MBIE	81	P";
				break;
			case 581:
				NumeroFila = "2016	Solar	Opening stock	Dollars	Thousands	Environmental Accounts	9960	R";
				break;
			case 582:
				NumeroFila = "2018	Solar	Opening stock	Dollars	Thousands	Environmental Accounts	21798	P";
				break;
			case 583:
				NumeroFila = "2018	Solar	Other changes	Dollars	Thousands	Environmental Accounts	3000	P";
				break;
			case 584:
				NumeroFila = "2018	Solar	Resource rent	Dollars	Thousands	Environmental Accounts	1488	P";
				break;
			case 585:
				NumeroFila = "2018	Total generation	Generation	Gigawatt hours	Actual	MBIE	42755	P";
				break;
			case 586:
				NumeroFila = "2018	Total generation	Prices	Number	Average	Electricity Authority	86	P";
				break;
			case 587:
				NumeroFila = "2018	Total generation	Resource rent	Dollars	Thousands	Environmental Accounts	789087	P";
				break;
			case 588:
				NumeroFila = "2018	Waste heat	Generation	Gigawatt hours	Actual	MBIE	45	P";
				break;
			case 589:
				NumeroFila = "2018	Wind	Closing stock	Dollars	Thousands	Environmental Accounts	593961	P";
				break;
			case 590:
				NumeroFila = "2018	Wind	Generation	Gigawatt hours	Actual	MBIE	1931	P";
				break;
			case 591:
				NumeroFila = "2018	Wind	Gigawatt hours	Number	Proportion	MBIE	0.05	P";
				break;
			case 592:
				NumeroFila = "2018	Wind	Opening stock	Dollars	Thousands	Environmental Accounts	856321	P";
				break;
			case 593:
				NumeroFila = "2018	Wind	Other changes	Dollars	Thousands	Environmental Accounts	-262360	P";
				break;
			case 594:
				NumeroFila = "2018	Wind	Resource rent	Dollars	Thousands	Environmental Accounts	35638	P";
				break;
			case 595:
				NumeroFila = "2018	Wood	Closing stock	Dollars	Thousands	Environmental Accounts	92506	P";
				break;
			case 596:
				NumeroFila = "2018	Wood	Generation	Gigawatt hours	Actual	MBIE	301	P";
				break;
			case 597:
				NumeroFila = "2018	Wood	Gigawatt hours	Number	Proportion	MBIE	0.01	P";
				break;
			case 598:
				NumeroFila = "2018	Wood	Opening stock	Dollars	Thousands	Environmental Accounts	118567	P";
				break;
			case 599:
				NumeroFila = "2018	Wood	Other changes	Dollars	Thousands	Environmental Accounts	-26061	P";
				break;
			case 600:
				NumeroFila = "2018	Wood	Resource rent	Dollars	Thousands	Environmental Accounts	5550	P";
				break;

			default:
				break;
			}

			JOptionPane.showMessageDialog(null, NumeroFila);

		}

		public void metodo5() {
			String ventana = JOptionPane.showInputDialog(null,"Desea abrir una Ventana de Windows ?");
			JFileChooser jfile = new JFileChooser();
	        int retorno = jfile.showOpenDialog(null);
	        System.out.println(retorno);
	        if (retorno == JFileChooser.APPROVE_OPTION) {
	        	File f = jfile.getSelectedFile();
	        	System.out.println(f.getAbsolutePath());
	        }
			 Scanner scan = new Scanner(System.in);
			 Path path = Path.of("C:\\CSV-1\\renewable-energy-stock-account-2007-18.csv");
				try {
					String s = Files.readString(path);
					System.out.println(s);
				} catch (IOException e) {
					e.printStackTrace();
				}
			 System.out.println("Ingrese la cantidad datos de valores:");
		        double n = scan.nextDouble();
		        double[] arrEnteros = new double[(int) n];
		        for (int i = 0; i < n; i++) {
		            System.out.println("Ingrese Datos de Valor " + (i+1));
		            arrEnteros[i] = scan.nextDouble();
		            double mayor = -2531163;
		            double menor = 14982253;
		            for (double j = 0; j <= i; j++) {
		                if (arrEnteros[(int) j] > mayor) {
		                    mayor = arrEnteros[(int) j];
		                }
		                if (arrEnteros[(int) j] < menor) {
		                    menor = arrEnteros[(int) j];
		                }
		            }
		            Path path2 = Path.of("C:\\temporal\\archivonuevo.txt");
					try {
						Files.writeString(path2, "El mayor es " + mayor);
					} catch (IOException e) {
						e.printStackTrace();
					}
					Path path3 = Path.of("C:\\temporal\\archivonuevo2.txt");
					try {
						Files.writeString(path3, "El menor es " + menor);
					} catch (IOException e) {
						e.printStackTrace();
					}
					JOptionPane.showMessageDialog(null,"Realizado");
		        }
		}

		public void metodo6() {
			String ventana = JOptionPane.showInputDialog(null,"Desea abrir una Ventana de Windows ?");
			JFileChooser jfile = new JFileChooser();
	        int retorno = jfile.showOpenDialog(null);
	        System.out.println(retorno);
	        if (retorno == JFileChooser.APPROVE_OPTION) {
	        	File f = jfile.getSelectedFile();
	        	System.out.println(f.getAbsolutePath());
	        }
			 Scanner scan = new Scanner(System.in);
			 Path path = Path.of("C:\\CSV-1\\renewable-energy-stock-account-2007-18.csv");
				try {
					String s = Files.readString(path);
					System.out.println(s);
				} catch (IOException e) {
					e.printStackTrace();
				}
			 System.out.println("Ingrese la cantidad datos de valores:");
		        double n = scan.nextDouble();
		        double[] arrEnteros = new double[(int) n];
		        for (int i = 0; i < n; i++) {
		            System.out.println("Ingrese Datos de Valor " + (i+1));
		            arrEnteros[i] = scan.nextDouble();
		            double mayor = -2531163;
		            double menor = 14982253;
		            for (double j = 0; j <= i; j++) {
		                if (arrEnteros[(int) j] > mayor) {
		                    mayor = arrEnteros[(int) j];
		                }
		                if (arrEnteros[(int) j] < menor) {
		                    menor = arrEnteros[(int) j];
		                }
		            }
		            Path path2 = Path.of("C:\\temporal\\archivonuevo.txt");
					try {
						Files.writeString(path2, "El mayor es " + mayor);
					} catch (IOException e) {
						e.printStackTrace();
					}
					Path path3 = Path.of("C:\\temporal\\archivonuevo2.txt");
					try {
						Files.writeString(path3, "El menor es " + menor);
					} catch (IOException e) {
						e.printStackTrace();
					}
					JOptionPane.showMessageDialog(null,"Realizado");
		        }
		}

		public void metodo7() {
			LocalDate fecha = LocalDate.now();
	        System.out.println("fecha: " + fecha);
	        LocalDateTime hora = LocalDateTime.now();
	        System.out.println("hora: " + hora);
	        Path path = Path.of("C:\\temporal\\renewable-energy-stock-account-2007-18.csv");
			System.out.println(path);
			JOptionPane.showMessageDialog(null, fecha);
			JOptionPane.showMessageDialog(null, hora);
			JOptionPane.showMessageDialog(null, path);
			Path path1 = Path.of("C:\\temporal\\renewable-energy-stock-account-2007-18.csv");
			try {
				String s = Files.readString(path);
				System.out.println(s);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JOptionPane.showMessageDialog(null,"Realizado");
		}

	}
		
		


